package typingsSlinky.canvasjs.anon

import typingsSlinky.canvasjs.mod.ChartDataPoint
import typingsSlinky.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSeries extends js.Object {
  var chart: typingsSlinky.canvasjs.mod.Chart = js.native
  var dataPoint: ChartDataPoint = js.native
  var dataSeries: ChartDataSeriesOptions = js.native
  var index: js.UndefOr[Double] = js.native
  var pencent: js.UndefOr[Double] = js.native
  var total: js.UndefOr[Double] = js.native
}

object DataSeries {
  @scala.inline
  def apply(
    chart: typingsSlinky.canvasjs.mod.Chart,
    dataPoint: ChartDataPoint,
    dataSeries: ChartDataSeriesOptions
  ): DataSeries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSeries]
  }
  @scala.inline
  implicit class DataSeriesOps[Self <: DataSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: typingsSlinky.canvasjs.mod.Chart): Self = {
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
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withPencent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pencent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPencent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pencent")(js.undefined)
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
  }
  
}

