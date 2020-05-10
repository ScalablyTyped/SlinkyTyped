package typingsSlinky.nodeZendesk

import typingsSlinky.nodeZendesk.mod.Users._UpdateIdPayload
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExternalids extends _UpdateIdPayload {
  var external_ids: js.Array[ZendeskID] = js.native
}

object AnonExternalids {
  @scala.inline
  def apply(external_ids: js.Array[ZendeskID]): AnonExternalids = {
    val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExternalids]
  }
  @scala.inline
  implicit class AnonExternalidsOps[Self <: AnonExternalids] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternal_ids(value: js.Array[ZendeskID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_ids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

