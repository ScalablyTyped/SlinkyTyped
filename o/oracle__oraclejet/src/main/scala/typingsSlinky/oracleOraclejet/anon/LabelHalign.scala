package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelHalign extends js.Object {
  var labelHalign: center | end | start
  var labelStyle: js.Object
  var maximizedSvgStyle: js.Object
  var minimizedSvgStyle: js.Object
  var showCount: on | off | auto
  var svgStyle: js.Object
}

object LabelHalign {
  @scala.inline
  def apply(
    labelHalign: center | end | start,
    labelStyle: js.Object,
    maximizedSvgStyle: js.Object,
    minimizedSvgStyle: js.Object,
    showCount: on | off | auto,
    svgStyle: js.Object
  ): LabelHalign = {
    val __obj = js.Dynamic.literal(labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], maximizedSvgStyle = maximizedSvgStyle.asInstanceOf[js.Any], minimizedSvgStyle = minimizedSvgStyle.asInstanceOf[js.Any], showCount = showCount.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelHalign]
  }
}

