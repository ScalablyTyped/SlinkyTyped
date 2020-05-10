package typingsSlinky.modernizr

import typingsSlinky.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashBoolean extends Boolean {
  var blocked: scala.Boolean = js.native
}

object FlashBoolean {
  @scala.inline
  def apply(blocked: scala.Boolean): FlashBoolean = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBoolean]
  }
  @scala.inline
  implicit class FlashBooleanOps[Self <: FlashBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

