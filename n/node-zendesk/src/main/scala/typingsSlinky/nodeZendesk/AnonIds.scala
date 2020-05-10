package typingsSlinky.nodeZendesk

import typingsSlinky.nodeZendesk.mod.Users._UpdateIdPayload
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIds extends _UpdateIdPayload {
  var ids: js.Array[ZendeskID] = js.native
}

object AnonIds {
  @scala.inline
  def apply(ids: js.Array[ZendeskID]): AnonIds = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIds]
  }
  @scala.inline
  implicit class AnonIdsOps[Self <: AnonIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: js.Array[ZendeskID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

