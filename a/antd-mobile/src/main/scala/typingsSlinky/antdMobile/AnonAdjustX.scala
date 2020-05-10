package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdjustX extends js.Object {
  var adjustX: Double = js.native
  var adjustY: Double = js.native
}

object AnonAdjustX {
  @scala.inline
  def apply(adjustX: Double, adjustY: Double): AnonAdjustX = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdjustX]
  }
  @scala.inline
  implicit class AnonAdjustXOps[Self <: AnonAdjustX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdjustY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

