package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipDisplay extends js.Object {
  var tooltipDisplay: off | auto
  var tooltipLabel: String | js.Array[String]
}

object TooltipDisplay {
  @scala.inline
  def apply(tooltipDisplay: off | auto, tooltipLabel: String | js.Array[String]): TooltipDisplay = {
    val __obj = js.Dynamic.literal(tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipDisplay]
  }
}

