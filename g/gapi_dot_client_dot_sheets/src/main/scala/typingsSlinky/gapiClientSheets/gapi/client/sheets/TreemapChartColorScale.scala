package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreemapChartColorScale extends js.Object {
  /**
    * The background color for cells with a color value greater than or equal
    * to maxValue. Defaults to #109618 if not
    * specified.
    */
  var maxValueColor: js.UndefOr[Color] = js.native
  /**
    * The background color for cells with a color value greater than or equal
    * to maxValue. Defaults to #109618 if not
    * specified.
    * If max_value_color is also set, this field takes precedence.
    */
  var maxValueColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The background color for cells with a color value at the midpoint between
    * minValue and
    * maxValue. Defaults to #efe6dc if not
    * specified.
    */
  var midValueColor: js.UndefOr[Color] = js.native
  /**
    * The background color for cells with a color value at the midpoint between
    * minValue and
    * maxValue. Defaults to #efe6dc if not
    * specified.
    * If mid_value_color is also set, this field takes precedence.
    */
  var midValueColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The background color for cells with a color value less than or equal to
    * minValue. Defaults to #dc3912 if not
    * specified.
    */
  var minValueColor: js.UndefOr[Color] = js.native
  /**
    * The background color for cells with a color value less than or equal to
    * minValue. Defaults to #dc3912 if not
    * specified.
    * If min_value_color is also set, this field takes precedence.
    */
  var minValueColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The background color for cells that have no color data associated with
    * them. Defaults to #000000 if not specified.
    */
  var noDataColor: js.UndefOr[Color] = js.native
  /**
    * The background color for cells that have no color data associated with
    * them. Defaults to #000000 if not specified.
    * If no_data_color is also set, this field takes precedence.
    */
  var noDataColorStyle: js.UndefOr[ColorStyle] = js.native
}

object TreemapChartColorScale {
  @scala.inline
  def apply(): TreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapChartColorScale]
  }
  @scala.inline
  implicit class TreemapChartColorScaleOps[Self <: TreemapChartColorScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxValueColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValueColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValueColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValueColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMidValueColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midValueColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidValueColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midValueColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMidValueColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midValueColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidValueColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midValueColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValueColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValueColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataColorStyle")(js.undefined)
        ret
    }
  }
  
}

