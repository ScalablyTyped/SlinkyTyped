package typingsSlinky.animejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimeInstance extends AnimeCallBack {
  var animatables: js.Array[js.Object] = js.native
  var animations: js.Array[js.Object] = js.native
  var autoplay: Boolean = js.native
  var began: Boolean = js.native
  var completed: Boolean = js.native
  var currentTime: Double = js.native
  var delay: Double = js.native
  var direction: String = js.native
  var duration: Double = js.native
  var finished: js.Promise[Unit] = js.native
  var loop: Double | Boolean = js.native
  var paused: Boolean = js.native
  var progress: Double = js.native
  var remaining: Double = js.native
  var reversed: Boolean = js.native
  var timelineOffset: Double = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def restart(): Unit = js.native
  def reverse(): Unit = js.native
  def seek(time: Double): Unit = js.native
}

object AnimeInstance {
  @scala.inline
  def apply(
    animatables: js.Array[js.Object],
    animations: js.Array[js.Object],
    autoplay: Boolean,
    began: Boolean,
    completed: Boolean,
    currentTime: Double,
    delay: Double,
    direction: String,
    duration: Double,
    finished: js.Promise[Unit],
    loop: Double | Boolean,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    progress: Double,
    remaining: Double,
    restart: () => Unit,
    reverse: () => Unit,
    reversed: Boolean,
    seek: Double => Unit,
    timelineOffset: Double
  ): AnimeInstance = {
    val __obj = js.Dynamic.literal(animatables = animatables.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], began = began.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], restart = js.Any.fromFunction0(restart), reverse = js.Any.fromFunction0(reverse), reversed = reversed.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), timelineOffset = timelineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimeInstance]
  }
  @scala.inline
  implicit class AnimeInstanceOps[Self <: AnimeInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimatables(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimations(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBegan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("began")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinished(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoop(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReverse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeek(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimelineOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

