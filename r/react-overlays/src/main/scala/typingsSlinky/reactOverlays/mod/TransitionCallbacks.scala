package typingsSlinky.reactOverlays.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionCallbacks extends js.Object {
  /**
    * Callback fired before the Overlay transitions in
    */
  var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired after the Overlay finishes transitioning in
    */
  var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired as the Overlay begins to transition in
    */
  var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired right before the Overlay transitions out
    */
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired after the Overlay finishes transitioning out
    */
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired as the Overlay begins to transition out
    */
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
}

object TransitionCallbacks {
  @scala.inline
  def apply(): TransitionCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionCallbacks]
  }
  @scala.inline
  implicit class TransitionCallbacksOps[Self <: TransitionCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnEnter(value: /* node */ HTMLElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEntered(value: /* node */ HTMLElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEntered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEntering(value: /* node */ HTMLElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEntering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: /* node */ HTMLElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExited(value: /* node */ HTMLElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExiting(value: /* node */ HTMLElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(js.undefined)
        ret
    }
  }
  
}

