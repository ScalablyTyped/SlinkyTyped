package typingsSlinky.leafletDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTooltipAnonEnd extends js.Object {
  var tooltip: AnonEnd = js.native
}

object AnonTooltipAnonEnd {
  @scala.inline
  def apply(tooltip: AnonEnd): AnonTooltipAnonEnd = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTooltipAnonEnd]
  }
  @scala.inline
  implicit class AnonTooltipAnonEndOps[Self <: AnonTooltipAnonEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooltip(value: AnonEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

