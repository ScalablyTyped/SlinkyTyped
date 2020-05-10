package typingsSlinky.oracleOraclejet.ojnboxMod

import typingsSlinky.oracleOraclejet.AnonBorderRadiusBorderWidth
import typingsSlinky.oracleOraclejet.AnonBorderWidthColor
import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojNBoxNodeSettableProperties extends JetSettableProperties {
  var borderColor: String = js.native
  var borderWidth: Double = js.native
  var categories: js.Array[String] = js.native
  var color: js.UndefOr[String] = js.native
  var column: String = js.native
  var groupCategory: js.UndefOr[String] = js.native
  var icon: js.UndefOr[AnonBorderRadiusBorderWidth] = js.native
  var indicatorColor: js.UndefOr[String] = js.native
  var indicatorIcon: js.UndefOr[AnonBorderWidthColor] = js.native
  var label: String = js.native
  var row: String = js.native
  var secondaryLabel: String = js.native
  var shortDesc: String = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object | Null = js.native
  var xPercentage: js.UndefOr[Double | Null] = js.native
  var yPercentage: js.UndefOr[Double | Null] = js.native
}

object ojNBoxNodeSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    categories: js.Array[String],
    column: String,
    label: String,
    row: String,
    secondaryLabel: String,
    shortDesc: String,
    svgClassName: String
  ): ojNBoxNodeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], secondaryLabel = secondaryLabel.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxNodeSettableProperties]
  }
  @scala.inline
  implicit class ojNBoxNodeSettablePropertiesOps[Self <: ojNBoxNodeSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryLabel")(value.asInstanceOf[js.Any])
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
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: AnonBorderRadiusBorderWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorIcon(value: AnonBorderWidthColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(null)
        ret
    }
    @scala.inline
    def withXPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withXPercentageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPercentage")(null)
        ret
    }
    @scala.inline
    def withYPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withYPercentageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPercentage")(null)
        ret
    }
  }
  
}

