package typingsSlinky.canvasjs.anon

import typingsSlinky.canvasjs.mod.ChartAxisYOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  var axis: ChartAxisYOptions = js.native
  var chart: typingsSlinky.canvasjs.mod.Chart = js.native
  var stripline: this.type = js.native
}

object Axis {
  @scala.inline
  def apply(axis: ChartAxisYOptions, chart: typingsSlinky.canvasjs.mod.Chart, stripline: Axis): Axis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], stripline = stripline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
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
    def withChart(value: typingsSlinky.canvasjs.mod.Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStripline(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

