package typingsSlinky.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFast extends js.Object {
  var fast: Double = js.native
  var slow: Double = js.native
}

object AnonFast {
  @scala.inline
  def apply(fast: Double, slow: Double): AnonFast = {
    val __obj = js.Dynamic.literal(fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFast]
  }
  @scala.inline
  implicit class AnonFastOps[Self <: AnonFast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

