package typingsSlinky.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait item extends js.Object {
          // the point, e.g. [0, 2]
  var dataIndex: Double = js.native
  var datapoint: js.Array[Double] = js.native
          //the index of the series
  var pageX: Double = js.native
  var pageY: Double = js.native
            // the index of the point in the data array
  var series: dataSeries = js.native
               //the series object
  var seriesIndex: Double = js.native
}

object item {
  @scala.inline
  def apply(
    dataIndex: Double,
    datapoint: js.Array[Double],
    pageX: Double,
    pageY: Double,
    series: dataSeries,
    seriesIndex: Double
  ): item = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any], datapoint = datapoint.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[item]
  }
  @scala.inline
  implicit class itemOps[Self <: item] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatapoint(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datapoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeries(value: dataSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

