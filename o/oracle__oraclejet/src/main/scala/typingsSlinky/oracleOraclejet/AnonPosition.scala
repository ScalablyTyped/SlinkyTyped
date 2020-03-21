package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inside
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outside
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var converter: js.Object
  var position: inside | outside
  var rendered: off | on
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  var style: js.Object
}

object AnonPosition {
  @scala.inline
  def apply(
    converter: js.Object,
    position: inside | outside,
    rendered: off | on,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto,
    style: js.Object
  ): AnonPosition = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPosition]
  }
}

