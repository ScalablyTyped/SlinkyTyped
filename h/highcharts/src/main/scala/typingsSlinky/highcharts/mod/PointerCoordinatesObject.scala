package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerCoordinatesObject extends js.Object {
  var chartX: Double = js.native
  var chartY: Double = js.native
}

object PointerCoordinatesObject {
  @scala.inline
  def apply(chartX: Double, chartY: Double): PointerCoordinatesObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerCoordinatesObject]
  }
  @scala.inline
  implicit class PointerCoordinatesObjectOps[Self <: PointerCoordinatesObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

