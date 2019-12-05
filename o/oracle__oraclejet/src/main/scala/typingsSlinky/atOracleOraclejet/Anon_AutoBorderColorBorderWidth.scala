package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.center
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.inner
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.outer
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rotated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBorderColorBorderWidth extends js.Object {
  var borderColor: String
  var borderWidth: Double
  var hoverColor: String
  var labelDisplay: horizontal | rotated | off | auto
  var labelHalign: inner | outer | center
  var labelMinLength: Double
  var labelStyle: js.Object
  var selectedInnerColor: String
  var selectedOuterColor: String
  var showDisclosure: on | off
}

object Anon_AutoBorderColorBorderWidth {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    hoverColor: String,
    labelDisplay: horizontal | rotated | off | auto,
    labelHalign: inner | outer | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    selectedInnerColor: String,
    selectedOuterColor: String,
    showDisclosure: on | off
  ): Anon_AutoBorderColorBorderWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoBorderColorBorderWidth]
  }
}

