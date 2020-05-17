package typingsSlinky.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Added extends js.Object {
  var added: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact] = js.native
  var removed: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact] = js.native
}

object Added {
  @scala.inline
  def apply(
    added: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact],
    removed: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact]
  ): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  @scala.inline
  implicit class AddedOps[Self <: Added] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

