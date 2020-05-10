package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisLabelsFormatterContextObject extends js.Object {
  var axis: Axis = js.native
  var chart: Chart_ = js.native
  var isFirst: Boolean = js.native
  var isLast: Boolean = js.native
  var pos: Double = js.native
  var value: Double = js.native
}

object AxisLabelsFormatterContextObject {
  @scala.inline
  def apply(axis: Axis, chart: Chart_, isFirst: Boolean, isLast: Boolean, pos: Double, value: Double): AxisLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabelsFormatterContextObject]
  }
  @scala.inline
  implicit class AxisLabelsFormatterContextObjectOps[Self <: AxisLabelsFormatterContextObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChart(value: Chart_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

