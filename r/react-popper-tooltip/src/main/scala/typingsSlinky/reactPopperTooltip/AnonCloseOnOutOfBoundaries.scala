package typingsSlinky.reactPopperTooltip

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloseOnOutOfBoundaries extends js.Object {
  var closeOnOutOfBoundaries: Boolean = js.native
  var defaultTooltipShown: Boolean = js.native
  var delayHide: Double = js.native
  var delayShow: Double = js.native
  var followCursor: Boolean = js.native
  var placement: String = js.native
  var portalContainer: HTMLElement | Null = js.native
  var trigger: String = js.native
  var usePortal: Boolean = js.native
  def onVisibilityChange(): Unit = js.native
}

object AnonCloseOnOutOfBoundaries {
  @scala.inline
  def apply(
    closeOnOutOfBoundaries: Boolean,
    defaultTooltipShown: Boolean,
    delayHide: Double,
    delayShow: Double,
    followCursor: Boolean,
    onVisibilityChange: () => Unit,
    placement: String,
    trigger: String,
    usePortal: Boolean
  ): AnonCloseOnOutOfBoundaries = {
    val __obj = js.Dynamic.literal(closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction0(onVisibilityChange), placement = placement.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseOnOutOfBoundaries]
  }
  @scala.inline
  implicit class AnonCloseOnOutOfBoundariesOps[Self <: AnonCloseOnOutOfBoundaries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseOnOutOfBoundaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutOfBoundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTooltipShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTooltipShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayHide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnVisibilityChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibilityChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsePortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(null)
        ret
    }
  }
  
}

