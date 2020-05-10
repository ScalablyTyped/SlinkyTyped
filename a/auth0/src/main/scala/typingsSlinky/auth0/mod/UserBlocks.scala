package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserBlocks extends js.Object {
  var blocked_for: js.Array[BlockedForEntry] = js.native
}

object UserBlocks {
  @scala.inline
  def apply(blocked_for: js.Array[BlockedForEntry]): UserBlocks = {
    val __obj = js.Dynamic.literal(blocked_for = blocked_for.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserBlocks]
  }
  @scala.inline
  implicit class UserBlocksOps[Self <: UserBlocks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked_for(value: js.Array[BlockedForEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked_for")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

