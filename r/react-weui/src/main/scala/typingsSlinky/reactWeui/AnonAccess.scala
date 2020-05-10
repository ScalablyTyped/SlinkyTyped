package typingsSlinky.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccess extends js.Object {
  var access: Boolean = js.native
}

object AnonAccess {
  @scala.inline
  def apply(access: Boolean): AnonAccess = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccess]
  }
  @scala.inline
  implicit class AnonAccessOps[Self <: AnonAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

