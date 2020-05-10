package typingsSlinky.antd

import typingsSlinky.antd.tooltipMod.TooltipPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArrowPointAtCenter extends js.Object {
  var arrowPointAtCenter: Boolean = js.native
  var autoAdjustOverflow: Boolean = js.native
  var mouseEnterDelay: Double = js.native
  var mouseLeaveDelay: Double = js.native
  var placement: TooltipPlacement = js.native
  var transitionName: String = js.native
}

object AnonArrowPointAtCenter {
  @scala.inline
  def apply(
    arrowPointAtCenter: Boolean,
    autoAdjustOverflow: Boolean,
    mouseEnterDelay: Double,
    mouseLeaveDelay: Double,
    placement: TooltipPlacement,
    transitionName: String
  ): AnonArrowPointAtCenter = {
    val __obj = js.Dynamic.literal(arrowPointAtCenter = arrowPointAtCenter.asInstanceOf[js.Any], autoAdjustOverflow = autoAdjustOverflow.asInstanceOf[js.Any], mouseEnterDelay = mouseEnterDelay.asInstanceOf[js.Any], mouseLeaveDelay = mouseLeaveDelay.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrowPointAtCenter]
  }
  @scala.inline
  implicit class AnonArrowPointAtCenterOps[Self <: AnonArrowPointAtCenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowPointAtCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowPointAtCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoAdjustOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseEnterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseLeaveDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: TooltipPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

