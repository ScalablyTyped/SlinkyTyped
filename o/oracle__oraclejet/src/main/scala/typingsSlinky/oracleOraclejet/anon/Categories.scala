package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.area
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.back
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.curved
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.front
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.line
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.segmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.solid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.straight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Categories extends js.Object {
  var categories: js.Array[String]
  var color: String
  var displayInLegend: on | off
  var high: Double
  var id: String
  var lineStyle: dotted | dashed | solid
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | straight
  var lineWidth: Double
  var location: front | back
  var low: Double
  var shortDesc: String
  var svgClassName: String
  var svgStyle: js.Object
  var text: String
  var `type`: area | line
  var value: Double
}

object Categories {
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    displayInLegend: on | off,
    high: Double,
    id: String,
    lineStyle: dotted | dashed | solid,
    lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | straight,
    lineWidth: Double,
    location: front | back,
    low: Double,
    shortDesc: String,
    svgClassName: String,
    svgStyle: js.Object,
    text: String,
    `type`: area | line,
    value: Double
  ): Categories = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], displayInLegend = displayInLegend.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Categories]
  }
}

