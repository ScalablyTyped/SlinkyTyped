package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotScatterDataPoint extends js.Object {
  var curveNumber: Double = js.native
  var data: PlotData = js.native
  var pointIndex: Double = js.native
  var pointNumber: Double = js.native
  var x: Double = js.native
  var xaxis: LayoutAxis = js.native
  var y: Double = js.native
  var yaxis: LayoutAxis = js.native
}

object PlotScatterDataPoint {
  @scala.inline
  def apply(
    curveNumber: Double,
    data: PlotData,
    pointIndex: Double,
    pointNumber: Double,
    x: Double,
    xaxis: LayoutAxis,
    y: Double,
    yaxis: LayoutAxis
  ): PlotScatterDataPoint = {
    val __obj = js.Dynamic.literal(curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pointIndex = pointIndex.asInstanceOf[js.Any], pointNumber = pointNumber.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScatterDataPoint]
  }
  @scala.inline
  implicit class PlotScatterDataPointOps[Self <: PlotScatterDataPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurveNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: PlotData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis(value: LayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis(value: LayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

