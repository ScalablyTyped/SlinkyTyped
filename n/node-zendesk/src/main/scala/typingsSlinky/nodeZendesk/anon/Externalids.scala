package typingsSlinky.nodeZendesk.anon

import typingsSlinky.nodeZendesk.mod.Users.UpdateIdPayload
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Externalids extends UpdateIdPayload {
  var external_ids: js.Array[ZendeskID] = js.native
}

object Externalids {
  @scala.inline
  def apply(external_ids: js.Array[ZendeskID]): Externalids = {
    val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Externalids]
  }
  @scala.inline
  implicit class ExternalidsOps[Self <: Externalids] (val x: Self) extends AnyVal {
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

