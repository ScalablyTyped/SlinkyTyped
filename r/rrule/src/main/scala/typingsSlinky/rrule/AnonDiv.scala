package typingsSlinky.rrule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiv extends js.Object {
  var div: Double = js.native
  var mod: Double = js.native
}

object AnonDiv {
  @scala.inline
  def apply(div: Double, mod: Double): AnonDiv = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiv]
  }
  @scala.inline
  implicit class AnonDivOps[Self <: AnonDiv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiv(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mod")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

