package typingsSlinky.reactEasyChart.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactEasyChart.anon.Bottom
import typingsSlinky.reactEasyChart.anon.X
import typingsSlinky.reactEasyChart.reactEasyChartStrings.linear
import typingsSlinky.reactEasyChart.reactEasyChartStrings.text
import typingsSlinky.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[Boolean] = js.native
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[X] = js.native
  /** The width of an individual bar in pixels */
  var barWidth: js.UndefOr[Double] = js.native
  var clickHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** Whether to automatically color the bars */
  var colorBars: js.UndefOr[Boolean] = js.native
  var data: js.Array[BarData] = js.native
  /** A d3 time formatting pattern to be applied to format the x axis values */
  var datePattern: js.UndefOr[String] = js.native
  /** Whether to show horizontal grid lines on the chart */
  var grid: js.UndefOr[Boolean] = js.native
  /** Height of the chart in pixels */
  var height: js.UndefOr[Double] = js.native
  /** Interpolation method if you add a line to this chart (via lineData) */
  var interpolate: js.UndefOr[String] = js.native
  var lineData: js.UndefOr[js.Array[LineData]] = js.native
  /** css margins */
  var margin: js.UndefOr[Bottom] = js.native
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** The d3 time format to be used for the x axis (when xType is 'time') */
  var tickTimeDisplayFormat: js.UndefOr[String] = js.native
  /** Width of the chart in pixels */
  var width: js.UndefOr[Double] = js.native
  /** The range that the x axis should show (otherwise automatically calculated) */
  var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  /** The amount of ticks to be shown on the x axis */
  var xTickNumber: js.UndefOr[Double] = js.native
  /** What data type the x axis is */
  var xType: js.UndefOr[time | text | linear] = js.native
  /** What data type the second y axis is */
  var y2Type: js.UndefOr[time | text | linear] = js.native
  /** Whether to show the axis on the right (default false: left) */
  var yAxisOrientRight: js.UndefOr[Boolean] = js.native
  /** The range that the y axis should show (otherwise automatically calculated) */
  var yDomainRange: js.UndefOr[js.Array[Double]] = js.native
  /** The amount of ticks to be shown on the y axis */
  var yTickNumber: js.UndefOr[Double] = js.native
}

object BarChartProps {
  @scala.inline
  def apply(data: js.Array[BarData]): BarChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps]
  }
  @scala.inline
  implicit class BarChartPropsOps[Self <: BarChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[BarData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabels(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withClickHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClickHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBars")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withInterpolate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.undefined)
        ret
    }
    @scala.inline
    def withLineData(value: js.Array[LineData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineData")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseMoveHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseMoveHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMoveHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOutHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOutHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseOutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOutHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOverHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseOverHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withTickTimeDisplayFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickTimeDisplayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickTimeDisplayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickTimeDisplayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
    @scala.inline
    def withXDomainRange(value: js.Array[js.Date | Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDomainRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXDomainRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDomainRange")(js.undefined)
        ret
    }
    @scala.inline
    def withXTickNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTickNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXTickNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTickNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withXType(value: time | text | linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xType")(js.undefined)
        ret
    }
    @scala.inline
    def withY2Type(value: time | text | linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY2Type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2Type")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisOrientRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisOrientRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisOrientRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisOrientRight")(js.undefined)
        ret
    }
    @scala.inline
    def withYDomainRange(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yDomainRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYDomainRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yDomainRange")(js.undefined)
        ret
    }
    @scala.inline
    def withYTickNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yTickNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYTickNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yTickNumber")(js.undefined)
        ret
    }
  }
  
}

