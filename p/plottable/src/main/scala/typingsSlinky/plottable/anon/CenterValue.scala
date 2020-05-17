package typingsSlinky.plottable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CenterValue extends js.Object {
  var centerValue: CenterX = js.native
  var zoomAmount: Double = js.native
}

object CenterValue {
  @scala.inline
  def apply(centerValue: CenterX, zoomAmount: Double): CenterValue = {
    val __obj = js.Dynamic.literal(centerValue = centerValue.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterValue]
  }
  @scala.inline
  implicit class CenterValueOps[Self <: CenterValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterValue(value: CenterX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerValue")(value.asInstanceOf[js.Any])
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

