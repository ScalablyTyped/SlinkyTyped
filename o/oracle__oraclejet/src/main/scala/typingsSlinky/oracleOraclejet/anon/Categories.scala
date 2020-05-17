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

@js.native
trait Categories extends js.Object {
  var categories: js.Array[String] = js.native
  var color: String = js.native
  var displayInLegend: on | off = js.native
  var high: Double = js.native
  var id: String = js.native
  var lineStyle: dotted | dashed | solid = js.native
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | straight = js.native
  var lineWidth: Double = js.native
  var location: front | back = js.native
  var low: Double = js.native
  var shortDesc: String = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var text: String = js.native
  var `type`: area | line = js.native
  var value: Double = js.native
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
  @scala.inline
  implicit class CategoriesOps[Self <: Categories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayInLegend(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStyle(value: dotted | dashed | solid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineType(value: curved | stepped | centeredStepped | segmented | centeredSegmented | straight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: front | back): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: area | line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

