package typingsSlinky.gapiPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLeftImageOffset extends js.Object {
  var leftImageOffset: Double = js.native
  var topImageOffset: Double = js.native
}

object AnonLeftImageOffset {
  @scala.inline
  def apply(leftImageOffset: Double, topImageOffset: Double): AnonLeftImageOffset = {
    val __obj = js.Dynamic.literal(leftImageOffset = leftImageOffset.asInstanceOf[js.Any], topImageOffset = topImageOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeftImageOffset]
  }
  @scala.inline
  implicit class AnonLeftImageOffsetOps[Self <: AnonLeftImageOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftImageOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftImageOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopImageOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topImageOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

