package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.area
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.back
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.centeredSegmented
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.centeredStepped
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.curved
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.front
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.line
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.segmented
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.solid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.stepped
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.straight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AreaBack extends js.Object {
  var categories: js.Array[String]
  var color: String
  var displayInLegend: on | off
  var high: Double
  var id: String
  var items: js.Array[Anon_High]
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

object Anon_AreaBack {
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    displayInLegend: on | off,
    high: Double,
    id: String,
    items: js.Array[Anon_High],
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
  ): Anon_AreaBack = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], displayInLegend = displayInLegend.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AreaBack]
  }
}

