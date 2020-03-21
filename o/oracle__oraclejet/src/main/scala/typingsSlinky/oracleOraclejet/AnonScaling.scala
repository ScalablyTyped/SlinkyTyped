package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScaling extends js.Object {
  var converter: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  var tooltipDisplay: off | auto
  var tooltipLabel: String
}

object AnonScaling {
  @scala.inline
  def apply(
    converter: js.Object,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto,
    tooltipDisplay: off | auto,
    tooltipLabel: String
  ): AnonScaling = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScaling]
  }
}

