package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.billion
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.million
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.quadrillion
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.thousand
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.trillion
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.PieCenterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var converter: js.Object
  var label: String
  var labelStyle: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  def renderer(context: PieCenterContext): Anon_Insert | Anon_PreventDefault
}

object Anon_Auto {
  @scala.inline
  def apply(
    converter: js.Object,
    label: String,
    labelStyle: js.Object,
    renderer: PieCenterContext => Anon_Insert | Anon_PreventDefault,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), scaling = scaling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Auto]
  }
}

