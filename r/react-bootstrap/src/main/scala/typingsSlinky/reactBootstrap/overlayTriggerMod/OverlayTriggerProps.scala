package typingsSlinky.reactBootstrap.overlayTriggerMod

import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayTriggerProps extends Props[OverlayTrigger] {
   // TODO: Add more specific type
  // Optional
  var animation: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var container: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var containerPadding: js.UndefOr[Double] = js.native
  var defaultOverlayShown: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Double] = js.native
  var delayHide: js.UndefOr[Double] = js.native
  var delayShow: js.UndefOr[Double] = js.native
  var onEnter: js.UndefOr[js.Function] = js.native
  var onEntered: js.UndefOr[js.Function] = js.native
  var onEntering: js.UndefOr[js.Function] = js.native
  var onExit: js.UndefOr[js.Function] = js.native
  var onExited: js.UndefOr[js.Function] = js.native
  var onExiting: js.UndefOr[js.Function] = js.native
  // Required
  var overlay: js.Any = js.native
  var placement: js.UndefOr[String] = js.native
  var rootClose: js.UndefOr[Boolean] = js.native
  var trigger: js.UndefOr[String | js.Array[String]] = js.native
}

object OverlayTriggerProps {
  @scala.inline
  def apply(overlay: js.Any): OverlayTriggerProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayTriggerProps]
  }
  @scala.inline
  implicit class OverlayTriggerPropsOps[Self <: OverlayTriggerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverlay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOverlayShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOverlayShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOverlayShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOverlayShown")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayHide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayHide")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: js.Function): Self = {
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
    def withOnEntered(value: js.Function): Self = {
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
    def withOnEntering(value: js.Function): Self = {
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
    def withOnExit(value: js.Function): Self = {
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
    def withOnExited(value: js.Function): Self = {
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
    def withOnExiting(value: js.Function): Self = {
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
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withRootClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootClose")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

