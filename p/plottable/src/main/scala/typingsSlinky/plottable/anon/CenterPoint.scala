package typingsSlinky.plottable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CenterPoint extends js.Object {
  var centerPoint: Double = js.native
  var zoomAmount: Double = js.native
}

object CenterPoint {
  @scala.inline
  def apply(centerPoint: Double, zoomAmount: Double): CenterPoint = {
    val __obj = js.Dynamic.literal(centerPoint = centerPoint.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterPoint]
  }
  @scala.inline
  implicit class CenterPointOps[Self <: CenterPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAmount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

