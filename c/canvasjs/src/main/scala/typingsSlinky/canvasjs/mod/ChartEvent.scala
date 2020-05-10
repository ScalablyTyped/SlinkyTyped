package typingsSlinky.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartEvent extends js.Object {
  /**
    * The chart object
    */
  var chart: Chart = js.native
  /**
    * The datapoint options
    */
  var dataPoint: ChartDataPoint = js.native
  /**
    * The index of the data point
    */
  var dataPointIndex: Double = js.native
  /**
    * The data series options
    */
  var dataSeries: ChartDataSeriesOptions = js.native
  /**
    * The index of the data series
    */
  var dataSeriesIndex: Double = js.native
  /**
    * The x value of the item
    */
  var x: js.Any = js.native
  /**
    * The y value of the item
    */
  var y: Double = js.native
}

object ChartEvent {
  @scala.inline
  def apply(
    chart: Chart,
    dataPoint: ChartDataPoint,
    dataPointIndex: Double,
    dataSeries: ChartDataSeriesOptions,
    dataSeriesIndex: Double,
    x: js.Any,
    y: Double
  ): ChartEvent = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataPointIndex = dataPointIndex.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any], dataSeriesIndex = dataSeriesIndex.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartEvent]
  }
  @scala.inline
  implicit class ChartEventOps[Self <: ChartEvent] (val x: Self) extends AnyVal {
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
    def withDataPointIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPointIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSeries(value: ChartDataSeriesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSeriesIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSeriesIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

