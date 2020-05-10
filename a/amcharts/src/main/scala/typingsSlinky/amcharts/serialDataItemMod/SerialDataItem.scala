package typingsSlinky.amcharts.serialDataItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialDataItem extends js.Object {
  /**
    * You can access each GraphDataItem using this object.
    * The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
    */
  var axes: js.Object = js.native
  /**
    * category value. String if parseDates is false, Date if true.
    */
  var category: js.Any = js.native
  /**
    * Timestamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
    */
  var time: Double = js.native
  /**
    * Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
    */
  var x: Double = js.native
}

object SerialDataItem {
  @scala.inline
  def apply(axes: js.Object, category: js.Any, time: Double, x: Double): SerialDataItem = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialDataItem]
  }
  @scala.inline
  implicit class SerialDataItemOps[Self <: SerialDataItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

