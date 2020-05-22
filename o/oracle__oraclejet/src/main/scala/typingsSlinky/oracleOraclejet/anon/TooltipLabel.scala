package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipLabel extends js.Object {
  var tooltipDisplay: off | auto
  var tooltipLabel: String
}

object TooltipLabel {
  @scala.inline
  def apply(tooltipDisplay: off | auto, tooltipLabel: String): TooltipLabel = {
    val __obj = js.Dynamic.literal(tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipLabel]
  }
}

