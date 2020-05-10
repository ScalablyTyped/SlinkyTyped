package typingsSlinky.nodeZendesk.mod.Users.Identities

import typingsSlinky.nodeZendesk.mod.AuditableModel
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseModel extends AuditableModel {
  val deliverable_state: DeliverableState = js.native
  val primary: Boolean = js.native
  val `type`: IdentityType = js.native
  val undeliverable_count: Double = js.native
  val url: String = js.native
  val user_id: ZendeskID = js.native
  val value: String = js.native
  val verified: Boolean = js.native
}

object ResponseModel {
  @scala.inline
  def apply(
    created_at: String,
    deliverable_state: DeliverableState,
    id: ZendeskID,
    primary: Boolean,
    `type`: IdentityType,
    undeliverable_count: Double,
    url: String,
    user_id: ZendeskID,
    value: String,
    verified: Boolean
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], deliverable_state = deliverable_state.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], undeliverable_count = undeliverable_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliverable_state(value: DeliverableState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliverable_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: IdentityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndeliverable_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeliverable_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

