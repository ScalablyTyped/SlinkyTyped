package typingsSlinky.materialUiCore.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps, @material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerKeys> */
@js.native
trait TransitionHandlerProps extends js.Object {
  var onEnter: js.UndefOr[js.Any] = js.native
  var onEntered: js.UndefOr[js.Any] = js.native
  var onEntering: js.UndefOr[js.Any] = js.native
  var onExit: js.UndefOr[js.Any] = js.native
  var onExited: js.UndefOr[js.Any] = js.native
  var onExiting: js.UndefOr[js.Any] = js.native
}

object TransitionHandlerProps {
  @scala.inline
  def apply(): TransitionHandlerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionHandlerProps]
  }
  @scala.inline
  implicit class TransitionHandlerPropsOps[Self <: TransitionHandlerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnEnter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEntered(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEntered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEntering(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEntering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExited(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExiting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(value.asInstanceOf[js.Any])
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

