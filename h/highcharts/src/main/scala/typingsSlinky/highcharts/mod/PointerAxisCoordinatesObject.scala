package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerAxisCoordinatesObject extends js.Object {
  /**
    * Positions on the x-axis.
    */
  var xAxis: js.Array[PointerAxisCoordinateObject] = js.native
  /**
    * Positions on the y-axis.
    */
  var yAxis: js.Array[PointerAxisCoordinateObject] = js.native
}

object PointerAxisCoordinatesObject {
  @scala.inline
  def apply(xAxis: js.Array[PointerAxisCoordinateObject], yAxis: js.Array[PointerAxisCoordinateObject]): PointerAxisCoordinatesObject = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerAxisCoordinatesObject]
  }
  @scala.inline
  implicit class PointerAxisCoordinatesObjectOps[Self <: PointerAxisCoordinatesObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXAxis(value: js.Array[PointerAxisCoordinateObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYAxis(value: js.Array[PointerAxisCoordinateObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

