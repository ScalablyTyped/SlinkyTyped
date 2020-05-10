package typingsSlinky.popmotion.tweenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenInterface extends js.Object {
  def getElapsed(): Double = js.native
  def getProgress(): Double = js.native
  def isActive(): Boolean = js.native
  def pause(): TweenInterface = js.native
  def resume(): TweenInterface = js.native
  def reverse(): TweenInterface = js.native
  def seek(progress: Double): TweenInterface = js.native
  def stop(): Unit = js.native
}

object TweenInterface {
  @scala.inline
  def apply(
    getElapsed: () => Double,
    getProgress: () => Double,
    isActive: () => Boolean,
    pause: () => TweenInterface,
    resume: () => TweenInterface,
    reverse: () => TweenInterface,
    seek: Double => TweenInterface,
    stop: () => Unit
  ): TweenInterface = {
    val __obj = js.Dynamic.literal(getElapsed = js.Any.fromFunction0(getElapsed), getProgress = js.Any.fromFunction0(getProgress), isActive = js.Any.fromFunction0(isActive), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), reverse = js.Any.fromFunction0(reverse), seek = js.Any.fromFunction1(seek), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[TweenInterface]
  }
  @scala.inline
  implicit class TweenInterfaceOps[Self <: TweenInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetElapsed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElapsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProgress(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProgress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPause(value: () => TweenInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResume(value: () => TweenInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReverse(value: () => TweenInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeek(value: Double => TweenInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

