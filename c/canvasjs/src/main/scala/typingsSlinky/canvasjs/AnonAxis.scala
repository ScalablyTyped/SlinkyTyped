package typingsSlinky.canvasjs

import typingsSlinky.canvasjs.mod.Chart
import typingsSlinky.canvasjs.mod.ChartAxisYOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAxis extends js.Object {
  var axis: ChartAxisYOptions = js.native
  var chart: Chart = js.native
  var stripline: this.type = js.native
}

object AnonAxis {
  @scala.inline
  def apply(axis: ChartAxisYOptions, chart: Chart, stripline: AnonAxis): AnonAxis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], stripline = stripline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxis]
  }
  @scala.inline
  implicit class AnonAxisOps[Self <: AnonAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: ChartAxisYOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChart(value: Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStripline(value: AnonAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

