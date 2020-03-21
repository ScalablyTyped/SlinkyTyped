package typingsSlinky.oracleOraclejet

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

trait AnonConverter extends js.Object {
  var converter: js.Object
  var label: String
  var labelStyle: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  def renderer(context: PieCenterContext): AnonInsert | AnonPreventDefault
}

object AnonConverter {
  @scala.inline
  def apply(
    converter: js.Object,
    label: String,
    labelStyle: js.Object,
    renderer: PieCenterContext => AnonInsert | AnonPreventDefault,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto
  ): AnonConverter = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), scaling = scaling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConverter]
  }
}

