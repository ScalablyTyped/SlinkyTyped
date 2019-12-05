package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.center
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.end
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.header
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.node
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.start
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenter extends js.Object {
  var groupLabelDisplay: node | off | header
  var header: Anon_BackgroundColorBorderColor
  var hoverColor: String
  var labelDisplay: off | node
  var labelHalign: start | end | center
  var labelMinLength: Double
  var labelStyle: js.Object
  var labelValign: top | bottom | center
  var selectedInnerColor: String
  var selectedOuterColor: String
}

object Anon_BottomCenter {
  @scala.inline
  def apply(
    groupLabelDisplay: node | off | header,
    header: Anon_BackgroundColorBorderColor,
    hoverColor: String,
    labelDisplay: off | node,
    labelHalign: start | end | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    labelValign: top | bottom | center,
    selectedInnerColor: String,
    selectedOuterColor: String
  ): Anon_BottomCenter = {
    val __obj = js.Dynamic.literal(groupLabelDisplay = groupLabelDisplay.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], labelValign = labelValign.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BottomCenter]
  }
}

