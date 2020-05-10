package typingsSlinky.glidejs.JQueryGlide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlideApi extends js.Object {
  /**
    * Append arrows to specifed target (eq. 'body', '.class', '#id')
    */
  def arrows(target: String): Unit = js.native
  /**
    * Returning current slide number
    */
  def current(): Double = js.native
  /**
    * Destroy and cleanup slider
    */
  def destroy(): Unit = js.native
  /**
    * Jump to current slide
    */
  def jump(distance: Double, callback: js.Function): Unit = js.native
  /**
    * Append navigation to specifed target (eq. 'body', '.class', '#id')
    */
  def nav(target: String): Unit = js.native
  /**
    * Slide one forward
    */
  def next(callback: js.Function): Unit = js.native
  /**
    * Stopping autoplay
    */
  def pause(): Unit = js.native
  /**
    * Starting autoplay
    */
  def play(): Unit = js.native
  /**
    * Slide one backward
    */
  def prev(callback: js.Function): Unit = js.native
  /**
    * Rebuild and recalculate dimensions of slider elements
    */
  def reinit(): Unit = js.native
}

object IGlideApi {
  @scala.inline
  def apply(
    arrows: String => Unit,
    current: () => Double,
    destroy: () => Unit,
    jump: (Double, js.Function) => Unit,
    nav: String => Unit,
    next: js.Function => Unit,
    pause: () => Unit,
    play: () => Unit,
    prev: js.Function => Unit,
    reinit: () => Unit
  ): IGlideApi = {
    val __obj = js.Dynamic.literal(arrows = js.Any.fromFunction1(arrows), current = js.Any.fromFunction0(current), destroy = js.Any.fromFunction0(destroy), jump = js.Any.fromFunction2(jump), nav = js.Any.fromFunction1(nav), next = js.Any.fromFunction1(next), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), prev = js.Any.fromFunction1(prev), reinit = js.Any.fromFunction0(reinit))
    __obj.asInstanceOf[IGlideApi]
  }
  @scala.inline
  implicit class IGlideApiOps[Self <: IGlideApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrows(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrent(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJump(value: (Double, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jump")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNav(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNext(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction1(value))
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
    def withPrev(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReinit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reinit")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

