package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTooltipLabel extends js.Object {
  var tooltipDisplay: off | auto = js.native
  var tooltipLabel: String = js.native
}

object AnonTooltipLabel {
  @scala.inline
  def apply(tooltipDisplay: off | auto, tooltipLabel: String): AnonTooltipLabel = {
    val __obj = js.Dynamic.literal(tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTooltipLabel]
  }
  @scala.inline
  implicit class AnonTooltipLabelOps[Self <: AnonTooltipLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooltipDisplay(value: off | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

