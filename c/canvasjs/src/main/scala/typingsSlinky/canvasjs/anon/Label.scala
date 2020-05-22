package typingsSlinky.canvasjs.anon

import typingsSlinky.canvasjs.mod.ChartAxisYOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var axis: ChartAxisYOptions
  var chart: typingsSlinky.canvasjs.mod.Chart
  var label: String
  var value: Double
}

object Label {
  @scala.inline
  def apply(axis: ChartAxisYOptions, chart: typingsSlinky.canvasjs.mod.Chart, label: String, value: Double): Label = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

