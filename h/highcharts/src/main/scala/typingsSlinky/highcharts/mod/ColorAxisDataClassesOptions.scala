package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorAxisDataClassesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) The color of each data class. If not
    * set, the color is pulled from the global or chart-specific colors array.
    * In styled mode, this option is ignored. Instead, use colors defined in
    * CSS.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The start of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The name of the data class as it
    * appears in the legend. If no name is given, it is automatically created
    * based on the `from` and `to` values. For full programmatic control,
    * legend.labelFormatter can be used. In the formatter, `this.from` and
    * `this.to` can be accessed.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The end of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var to: js.UndefOr[Double] = js.native
}

object ColorAxisDataClassesOptions {
  @scala.inline
  def apply(): ColorAxisDataClassesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisDataClassesOptions]
  }
  @scala.inline
  implicit class ColorAxisDataClassesOptionsOps[Self <: ColorAxisDataClassesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

