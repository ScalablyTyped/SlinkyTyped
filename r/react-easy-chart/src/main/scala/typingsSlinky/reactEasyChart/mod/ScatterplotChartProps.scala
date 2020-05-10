package typingsSlinky.reactEasyChart.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactEasyChart.AnonBottom
import typingsSlinky.reactEasyChart.AnonStroke
import typingsSlinky.reactEasyChart.AnonY
import typingsSlinky.reactEasyChart.reactEasyChartStrings.linear
import typingsSlinky.reactEasyChart.reactEasyChartStrings.text
import typingsSlinky.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterplotChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[Boolean] = js.native
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[AnonY] = js.native
  var clickHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** Allows styling of individual types of points */
  var config: js.UndefOr[js.Array[AnonStroke]] = js.native
  var data: js.Array[ScatterplotData] = js.native
  /** Radius of the dots on the chart */
  var dotRadius: js.UndefOr[Double] = js.native
  /** Whether to show horizontal grid lines on the chart */
  var grid: js.UndefOr[Boolean] = js.native
  /** Height of the chart in pixels */
  var height: js.UndefOr[Double] = js.native
  /** css margins */
  var margin: js.UndefOr[AnonBottom] = js.native
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** Whether to show vertical grid lines on the chart */
  var verticalGrid: js.UndefOr[Boolean] = js.native
  /** Width of the chart in pixels */
  var width: js.UndefOr[Double] = js.native
  /** The range that the x axis should show (otherwise automatically calculated) */
  var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  /** What data type the x axis is */
  var xType: js.UndefOr[time | text | linear] = js.native
  /** Whether to show the axis on the right (default false: left) */
  var yAxisOrientRight: js.UndefOr[Boolean] = js.native
  /** The range that the y axis should show (otherwise automatically calculated) */
  var yDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  /** What data type the x axis is */
  var yType: js.UndefOr[time | text | linear] = js.native
}

object ScatterplotChartProps {
  @scala.inline
  def apply(data: js.Array[ScatterplotData]): ScatterplotChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterplotChartProps]
  }
  @scala.inline
  implicit class ScatterplotChartPropsOps[Self <: ScatterplotChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[ScatterplotData]): Self = {
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
    def withClickHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): Self = {
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
    def withConfig(value: js.Array[AnonStroke]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDotRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotRadius")(js.undefined)
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
    def withMouseMoveHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): Self = {
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
    def withMouseOutHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): Self = {
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
    def withMouseOverHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): Self = {
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
    def withYDomainRange(value: js.Array[js.Date | Double | String]): Self = {
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

