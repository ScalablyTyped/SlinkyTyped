package typingsSlinky.atOracleOraclejet.ojchartMod.ojSparkChart

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.area
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.back
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.front
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.line
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ReferenceObject extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var lineStyle: dotted | dashed | solid
  var lineWidth: js.UndefOr[Double] = js.undefined
  var location: front | back
  var low: js.UndefOr[Double] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: area | line
  var value: js.UndefOr[Double] = js.undefined
}

object ReferenceObject {
  @scala.inline
  def apply(
    lineStyle: dotted | dashed | solid,
    location: front | back,
    `type`: area | line,
    color: String = null,
    high: Int | Double = null,
    lineWidth: Int | Double = null,
    low: Int | Double = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    value: Int | Double = null
  ): ReferenceObject = {
    val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
}

