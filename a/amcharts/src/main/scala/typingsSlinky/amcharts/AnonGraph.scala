package typingsSlinky.amcharts

import typingsSlinky.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGraph extends js.Object {
  var chart: default = js.native
  var graph: typingsSlinky.amcharts.amGraphMod.default = js.native
  var index: Double = js.native
  var item: typingsSlinky.amcharts.graphDataItemMod.default = js.native
  var `type`: String = js.native
}

object AnonGraph {
  @scala.inline
  def apply(
    chart: default,
    graph: typingsSlinky.amcharts.amGraphMod.default,
    index: Double,
    item: typingsSlinky.amcharts.graphDataItemMod.default,
    `type`: String
  ): AnonGraph = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGraph]
  }
  @scala.inline
  implicit class AnonGraphOps[Self <: AnonGraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraph(value: typingsSlinky.amcharts.amGraphMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: typingsSlinky.amcharts.graphDataItemMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

