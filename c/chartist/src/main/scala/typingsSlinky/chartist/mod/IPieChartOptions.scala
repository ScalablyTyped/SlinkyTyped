package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPieChartOptions extends IChartOptions {
  /**
    * Padding of the chart drawing area to the container element and labels as a number or padding object {top: 5, right: 5, bottom: 5, left: 5}
    */
  var chartPadding: js.UndefOr[IChartPadding | Double] = js.native
  /**
    * Override the class names that are used to generate the SVG structure of the chart
    */
  var classNames: js.UndefOr[IPieChartClasses] = js.native
  /**
    * If specified the donut CSS classes will be used and strokes will be drawn instead of pie slices.
    */
  var donut: js.UndefOr[Boolean] = js.native
  /**
    * If specified the donut segments will be drawn as shapes instead of strokes.
    */
  var donutSolid: js.UndefOr[Boolean] = js.native
  /**
    * Specify the donut stroke width, currently done in javascript for convenience. May move to CSS styles in the future.
    * This option can be set as number or string to specify a relative width (i.e. 100 or '30%').
    */
  var donutWidth: js.UndefOr[Double | String] = js.native
  /**
    * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * If true empty values will be ignored to avoid drawing unncessary slices and labels
    */
  var ignoreEmptyValues: js.UndefOr[Boolean] = js.native
  /**
    * Label direction can be 'neutral', 'explode' or 'implode'.  Default is 'neutral'.  The labels anchor will be positioned based on those settings as well as the fact if the labels are on the right or left side of the center of the chart. Usually explode is useful when labels are positioned far away from the center.
    */
  var labelDirection: js.UndefOr[String] = js.native
  /**
    * An interpolation function for the label value
    */
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.native
  /**
    * Label position offset from the standard position which is half distance of the radius. This value can be either positive or negative. Positive values will position the label away from the center.
    */
  var labelOffset: js.UndefOr[Double] = js.native
  /**
    * This option can be set to 'inside', 'outside' or 'center'. Positioned with 'inside' the labels will be placed on half the distance of the radius to the border of the Pie by respecting the 'labelOffset'. The 'outside' option will place the labels at the border of the pie and 'center' will place the labels in the absolute center point of the chart. The 'center' option only makes sense in conjunction with the 'labelOffset' option.
    */
  var labelPosition: js.UndefOr[String] = js.native
  /**
    * Specify if a label should be shown or not
    */
  var showLabel: js.UndefOr[Boolean] = js.native
  /**
    * The start angle of the pie chart in degrees where 0 points north. A higher value offsets the start angle clockwise.
    */
  var startAngle: js.UndefOr[Double] = js.native
  /**
    * An optional total you can specify. By specifying a total value, the sum of the values in the series must be this total in order to draw a full pie. You can use this parameter to draw only parts of a pie or gauge charts.
    */
  var total: js.UndefOr[Double] = js.native
  /**
    * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
    */
  var width: js.UndefOr[Double | String] = js.native
}

object IPieChartOptions {
  @scala.inline
  def apply(): IPieChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieChartOptions]
  }
  @scala.inline
  implicit class IPieChartOptionsOps[Self <: IPieChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartPadding(value: IChartPadding | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNames(value: IPieChartClasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDonut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDonut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(js.undefined)
        ret
    }
    @scala.inline
    def withDonutSolid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donutSolid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDonutSolid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donutSolid")(js.undefined)
        ret
    }
    @scala.inline
    def withDonutWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donutWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDonutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donutWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEmptyValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEmptyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyValues")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelInterpolationFnc(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInterpolationFnc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInterpolationFnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInterpolationFnc")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

