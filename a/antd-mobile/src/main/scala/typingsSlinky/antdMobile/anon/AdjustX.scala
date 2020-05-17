package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjustX extends js.Object {
  var adjustX: Double = js.native
  var adjustY: Double = js.native
}

object AdjustX {
  @scala.inline
  def apply(adjustX: Double, adjustY: Double): AdjustX = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustX]
  }
  @scala.inline
  implicit class AdjustXOps[Self <: AdjustX] (val x: Self) extends AnyVal {
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

