package typingsSlinky.materialUiCore.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps, @material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerKeys> */
@js.native
trait TransitionHandlerProps extends js.Object {
  var onEnter: js.Any = js.native
  var onEntered: js.Any = js.native
  var onEntering: js.Any = js.native
  var onExit: js.Any = js.native
  var onExited: js.Any = js.native
  var onExiting: js.Any = js.native
}

object TransitionHandlerProps {
  @scala.inline
  def apply(
    onEnter: js.Any,
    onEntered: js.Any,
    onEntering: js.Any,
    onExit: js.Any,
    onExited: js.Any,
    onExiting: js.Any
  ): TransitionHandlerProps = {
    val __obj = js.Dynamic.literal(onEnter = onEnter.asInstanceOf[js.Any], onEntered = onEntered.asInstanceOf[js.Any], onEntering = onEntering.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any], onExited = onExited.asInstanceOf[js.Any], onExiting = onExiting.asInstanceOf[js.Any])
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
    def withOnEntered(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEntering(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExited(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExiting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

