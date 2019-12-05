package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.billion
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.million
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.quadrillion
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.thousand
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBillion extends js.Object {
  var converter: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  var tooltipDisplay: off | auto
  var tooltipLabel: String
}

object Anon_AutoBillion {
  @scala.inline
  def apply(
    converter: js.Object,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto,
    tooltipDisplay: off | auto,
    tooltipLabel: String
  ): Anon_AutoBillion = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoBillion]
  }
}

