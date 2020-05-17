package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pending extends js.Object {
  var pending: Boolean = js.native
}

object Pending {
  @scala.inline
  def apply(pending: Boolean): Pending = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pending]
  }
  @scala.inline
  implicit class PendingOps[Self <: Pending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

