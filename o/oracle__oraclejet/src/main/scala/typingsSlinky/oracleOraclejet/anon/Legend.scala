package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Legend extends js.Object {
  var legend: DragEnter = js.native
  var plotArea: DragEnter = js.native
  var xAxis: DragEnter = js.native
  var y2Axis: DragEnter = js.native
  var yAxis: DragEnter = js.native
}

object Legend {
  @scala.inline
  def apply(legend: DragEnter, plotArea: DragEnter, xAxis: DragEnter, y2Axis: DragEnter, yAxis: DragEnter): Legend = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  @scala.inline
  implicit class LegendOps[Self <: Legend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLegend(value: DragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlotArea(value: DragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXAxis(value: DragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2Axis(value: DragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2Axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYAxis(value: DragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

