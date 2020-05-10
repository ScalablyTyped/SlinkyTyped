package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLegend extends js.Object {
  var legend: AnonDragEnter = js.native
  var plotArea: AnonDragEnter = js.native
  var xAxis: AnonDragEnter = js.native
  var y2Axis: AnonDragEnter = js.native
  var yAxis: AnonDragEnter = js.native
}

object AnonLegend {
  @scala.inline
  def apply(
    legend: AnonDragEnter,
    plotArea: AnonDragEnter,
    xAxis: AnonDragEnter,
    y2Axis: AnonDragEnter,
    yAxis: AnonDragEnter
  ): AnonLegend = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLegend]
  }
  @scala.inline
  implicit class AnonLegendOps[Self <: AnonLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLegend(value: AnonDragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlotArea(value: AnonDragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXAxis(value: AnonDragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2Axis(value: AnonDragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2Axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYAxis(value: AnonDragEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

