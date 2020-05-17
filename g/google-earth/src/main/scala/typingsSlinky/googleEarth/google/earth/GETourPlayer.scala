package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GETourPlayer extends js.Object {
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  def getCurrentTime(): Double = js.native
  /**
    * The total duration of the active tour, in seconds. If no tour is loaded, the behavior of this method is undefined.
    */
  def getDuration(): Double = js.native
  /**
    * Pauses the currently active tour.
    */
  def pause(): Unit = js.native
  /**
    * Plays the currently active tour.
    */
  def play(): Unit = js.native
  /**
    * Resets the currently active tour, stopping playback and rewinding to the start of the tour.
    */
  def reset(): Unit = js.native
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  def setCurrentTime(currentTime: Double): Unit = js.native
  /**
    * Enters the given tour object, exiting any other currently active tour.
    * This method does not automatically begin playing the tour. 
    * If the argument is null, then any currently active tour is exited and normal globe navigation is enabled.
    */
  def setTour(tour: KmlTour): Unit = js.native
}

object GETourPlayer {
  @scala.inline
  def apply(
    getCurrentTime: () => Double,
    getDuration: () => Double,
    pause: () => Unit,
    play: () => Unit,
    reset: () => Unit,
    setCurrentTime: Double => Unit,
    setTour: KmlTour => Unit
  ): GETourPlayer = {
    val __obj = js.Dynamic.literal(getCurrentTime = js.Any.fromFunction0(getCurrentTime), getDuration = js.Any.fromFunction0(getDuration), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), reset = js.Any.fromFunction0(reset), setCurrentTime = js.Any.fromFunction1(setCurrentTime), setTour = js.Any.fromFunction1(setTour))
    __obj.asInstanceOf[GETourPlayer]
  }
  @scala.inline
  implicit class GETourPlayerOps[Self <: GETourPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCurrentTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCurrentTime(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTour(value: KmlTour => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTour")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

