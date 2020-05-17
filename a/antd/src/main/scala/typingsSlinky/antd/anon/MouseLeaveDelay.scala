package typingsSlinky.antd.anon

import typingsSlinky.antd.tooltipMod.TooltipPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseLeaveDelay extends js.Object {
  var mouseEnterDelay: Double = js.native
  var mouseLeaveDelay: Double = js.native
  var placement: TooltipPlacement = js.native
  var transitionName: String = js.native
  var trigger: String = js.native
}

object MouseLeaveDelay {
  @scala.inline
  def apply(
    mouseEnterDelay: Double,
    mouseLeaveDelay: Double,
    placement: TooltipPlacement,
    transitionName: String,
    trigger: String
  ): MouseLeaveDelay = {
    val __obj = js.Dynamic.literal(mouseEnterDelay = mouseEnterDelay.asInstanceOf[js.Any], mouseLeaveDelay = mouseLeaveDelay.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseLeaveDelay]
  }
  @scala.inline
  implicit class MouseLeaveDelayOps[Self <: MouseLeaveDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

