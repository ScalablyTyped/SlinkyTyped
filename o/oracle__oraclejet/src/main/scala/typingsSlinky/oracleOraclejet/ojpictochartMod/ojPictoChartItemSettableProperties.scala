package typingsSlinky.oracleOraclejet.ojpictochartMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPictoChartItemSettableProperties extends JetSettableProperties {
  var borderColor: String
  var borderWidth: Double
  var categories: js.Array[String]
  var color: String
  var columnSpan: Double
  var count: Double
  var drilling: inherit | off | on
  var name: String
  var rowSpan: Double
  var shape: js.UndefOr[
    circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | none | String
  ] = js.undefined
  var shortDesc: String
  var source: String
  var sourceHover: String
  var sourceHoverSelected: String
  var sourceSelected: String
  var svgClassName: String
  var svgStyle: js.Object
}

object ojPictoChartItemSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    categories: js.Array[String],
    color: String,
    columnSpan: Double,
    count: Double,
    drilling: inherit | off | on,
    name: String,
    rowSpan: Double,
    shortDesc: String,
    source: String,
    sourceHover: String,
    sourceHoverSelected: String,
    sourceSelected: String,
    svgClassName: String,
    svgStyle: js.Object,
    shape: circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | none | String = null
  ): ojPictoChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceHover = sourceHover.asInstanceOf[js.Any], sourceHoverSelected = sourceHoverSelected.asInstanceOf[js.Any], sourceSelected = sourceSelected.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPictoChartItemSettableProperties]
  }
}

