package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSelectionAxisContextObject extends js.Object {
  /**
    * The selected Axis.
    */
  var axis: Axis = js.native
  /**
    * The maximum axis value, either automatic or set manually.
    */
  var max: Double = js.native
  /**
    * The minimum axis value, either automatic or set manually.
    */
  var min: Double = js.native
}

object ChartSelectionAxisContextObject {
  @scala.inline
  def apply(axis: Axis, max: Double, min: Double): ChartSelectionAxisContextObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSelectionAxisContextObject]
  }
  @scala.inline
  implicit class ChartSelectionAxisContextObjectOps[Self <: ChartSelectionAxisContextObject] (val x: Self) extends AnyVal {
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
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

