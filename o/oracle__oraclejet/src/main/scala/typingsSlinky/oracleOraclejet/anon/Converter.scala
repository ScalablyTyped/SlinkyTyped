package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.PieCenterContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter extends js.Object {
  var converter: js.Object
  var label: String
  var labelStyle: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  def renderer(context: PieCenterContext): Insert | PreventDefault
}

object Converter {
  @scala.inline
  def apply(
    converter: js.Object,
    label: String,
    labelStyle: js.Object,
    renderer: PieCenterContext => Insert | PreventDefault,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto
  ): Converter = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), scaling = scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Converter]
  }
}

