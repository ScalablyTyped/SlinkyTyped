package typingsSlinky.canvasjs

import typingsSlinky.canvasjs.mod.Chart
import typingsSlinky.canvasjs.mod.ChartDataPoint
import typingsSlinky.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChart extends js.Object {
  var chart: Chart = js.native
  var dataPoint: ChartDataPoint = js.native
  var dataSeries: ChartDataSeriesOptions = js.native
  var legend: this.type = js.native
}

object AnonChart {
  @scala.inline
  def apply(chart: Chart, dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions, legend: AnonChart): AnonChart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChart]
  }
  @scala.inline
  implicit class AnonChartOps[Self <: AnonChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataPoint(value: ChartDataPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSeries(value: ChartDataSeriesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegend(value: AnonChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

