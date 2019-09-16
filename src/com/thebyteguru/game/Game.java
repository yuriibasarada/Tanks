package com.thebyteguru.game;

import com.thebyteguru.display.Display;
import com.thebyteguru.utils.Time;

public class Game implements Runnable{

    public static final int     WIDTH = 800;
    public static final int     HEIGHT = 800;
    public static final String  TITLE = "Tanks";
    public static final int     CLEAR_COLOR = 0xff000000;
    public static final int     NUM_BUFFERS = 3;


    public static final float  UPDATE_RATE = 60.0f;
    public static final float  UPDATE_INTERVAL = Time.SECOND / UPDATE_RATE;
    public static final long   IDLE_TIME = 1;

    private boolean            running;
    private Thread             gameThread;

    public Game() {
        running = false;
        Display.create(WIDTH, HEIGHT, TITLE, CLEAR_COLOR, NUM_BUFFERS);
    }

    public synchronized void start() {
        if(running)
            return;
        running = true;
        gameThread = new Thread(this);
    }

    public synchronized void stop() {

    }

    private void update() {

    }

    private void render() {

    }

    @Override
    public void run() {

    }

    private void cleanUp() {
        Display.destroy();
    }
}

