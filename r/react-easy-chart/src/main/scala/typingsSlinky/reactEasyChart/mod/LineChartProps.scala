package typingsSlinky.reactEasyChart.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactEasyChart.AnonBottom
import typingsSlinky.reactEasyChart.AnonY
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`basis-closed`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`basis-open`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`cardinal-closed`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`cardinal-open`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`linear-closed`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`step-after`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`step-before`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.basis
import typingsSlinky.reactEasyChart.reactEasyChartStrings.bundle
import typingsSlinky.reactEasyChart.reactEasyChartStrings.cardinal
import typingsSlinky.reactEasyChart.reactEasyChartStrings.linear
import typingsSlinky.reactEasyChart.reactEasyChartStrings.monotone
import typingsSlinky.reactEasyChart.reactEasyChartStrings.step
import typingsSlinky.reactEasyChart.reactEasyChartStrings.text
import typingsSlinky.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[Boolean] = js.native
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[AnonY] = js.native
  var clickHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
  var data: js.Array[js.Array[LineData]] = js.native
  /** Whether to show circles on the data points */
  var dataPoints: js.UndefOr[Boolean] = js.native
  /** Whether to show horizontal grid lines on the chart */
  var grid: js.UndefOr[Boolean] = js.native
  /** Height of the chart in pixels */
  var height: js.UndefOr[Double] = js.native
  /** Smoothing option for the lines */
  var interpolate: js.UndefOr[
    linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
  ] = js.native
  var lineColors: js.UndefOr[js.Array[String]] = js.native
  /** css margins */
  var margin: js.UndefOr[AnonBottom] = js.native
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** The d3 time format to be used for the x axis (when xType is 'time') */
  var tickTimeDisplayFormat: js.UndefOr[String] = js.native
  /** Whether to show vertical grid lines on the chart */
  var verticalGrid: js.UndefOr[Boolean] = js.native
  /** Width of the chart in pixels */
  var width: js.UndefOr[Double] = js.native
  /** The range that the x axis should show (otherwise automatically calculated) */
  var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  /** The amount of ticks to be shown on the x axis */
  var xTicks: js.UndefOr[Double] = js.native
  /** What data type the x axis is */
  var xType: js.UndefOr[time | text | linear] = js.native
  /** Whether to show the axis on the right (default false: left) */
  var yAxisOrientRight: js.UndefOr[Boolean] = js.native
  /** The range that the y axis should show (otherwise automatically calculated) */
  var yDomainRange: js.UndefOr[js.Array[Double | String]] = js.native
  /** The amount of ticks to be shown on the y axis */
  var yTicks: js.UndefOr[Double] = js.native
  /** What data type the x axis is */
  var yType: js.UndefOr[time | text | linear] = js.native
}

object LineChartProps {
  @scala.inline
  def apply(data: js.Array[js.Array[LineData]]): LineChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineChartProps]
  }
  @scala.inline
  implicit class LineChartPropsOps[Self <: LineChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Array[LineData]]): Self = {
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
    def withAxisLabels(value: AnonY): Self = {
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
    def withClickHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = {
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
    def withDataPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPoints")(js.undefined)
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
    def withInterpolate(
      value: linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
    ): Self = {
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
    def withLineColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColors")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: AnonBottom): Self = {
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
    def withMouseMoveHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = {
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
    def withMouseOutHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = {
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
    def withMouseOverHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = {
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
    def withVerticalGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGrid")(js.undefined)
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
    def withXTicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTicks")(js.undefined)
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
    def withYDomainRange(value: js.Array[Double | String]): Self = {
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
    def withYTicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withYType(value: time | text | linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yType")(js.undefined)
        ret
    }
  }
  
}

