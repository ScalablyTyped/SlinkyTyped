package typingsSlinky.reactPopperTooltip.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipTriggerState extends js.Object {
  var pageX: js.UndefOr[Double] = js.native
  var pageY: js.UndefOr[Double] = js.native
  var tooltipShown: Boolean = js.native
}

object TooltipTriggerState {
  @scala.inline
  def apply(tooltipShown: Boolean): TooltipTriggerState = {
    val __obj = js.Dynamic.literal(tooltipShown = tooltipShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTriggerState]
  }
  @scala.inline
  implicit class TooltipTriggerStateOps[Self <: TooltipTriggerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooltipShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(js.undefined)
        ret
    }
    @scala.inline
    def withPageY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(js.undefined)
        ret
    }
  }
  
}

