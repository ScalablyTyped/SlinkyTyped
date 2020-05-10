package typingsSlinky.angularAnimations.browserBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DOMAnimation represents the Animation Web API.
  *
  * It is an external API by the browser, and must thus use "declare interface",
  * to prevent renaming by Closure Compiler.
  *
  * @see https://developer.mozilla.org/de/docs/Web/API/Animation
  */
@js.native
trait DOMAnimation extends js.Object {
  var currentTime: Double = js.native
  var onfinish: js.Function = js.native
  var position: Double = js.native
  def addEventListener(eventName: String, handler: js.Function1[/* event */ js.Any, _]): js.Any = js.native
  def cancel(): Unit = js.native
  def dispatchEvent(eventName: String): js.Any = js.native
  def finish(): Unit = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
}

object DOMAnimation {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ js.Any, _]) => js.Any,
    cancel: () => Unit,
    currentTime: Double,
    dispatchEvent: String => js.Any,
    finish: () => Unit,
    onfinish: js.Function,
    pause: () => Unit,
    play: () => Unit,
    position: Double
  ): DOMAnimation = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), cancel = js.Any.fromFunction0(cancel), currentTime = currentTime.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), finish = js.Any.fromFunction0(finish), onfinish = onfinish.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMAnimation]
  }
  @scala.inline
  implicit class DOMAnimationOps[Self <: DOMAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (String, js.Function1[/* event */ js.Any, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatchEvent(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFinish(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnfinish(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfinish")(value.asInstanceOf[js.Any])
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
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

