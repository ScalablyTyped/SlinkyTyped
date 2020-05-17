package typingsSlinky.canvasjs.anon

import typingsSlinky.canvasjs.mod.ChartDataPoint
import typingsSlinky.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPoint extends js.Object {
  var dataPoint: ChartDataPoint = js.native
  var dataSeries: ChartDataSeriesOptions = js.native
}

object DataPoint {
  @scala.inline
  def apply(dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): DataPoint = {
    val __obj = js.Dynamic.literal(dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
  @scala.inline
  implicit class DataPointOps[Self <: DataPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

