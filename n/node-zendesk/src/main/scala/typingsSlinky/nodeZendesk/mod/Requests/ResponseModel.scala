package typingsSlinky.nodeZendesk.mod.Requests

import typingsSlinky.nodeZendesk.mod.AuditableModel
import typingsSlinky.nodeZendesk.mod.Tickets.Field
import typingsSlinky.nodeZendesk.mod.Tickets.Priority
import typingsSlinky.nodeZendesk.mod.Tickets.Status
import typingsSlinky.nodeZendesk.mod.Tickets.TicketType
import typingsSlinky.nodeZendesk.mod.Tickets.Via
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#json-format|Zendesk Requests JSON Format}
  */
@js.native
trait ResponseModel extends AuditableModel {
  val assignee_id: ZendeskID | Null = js.native
  val can_be_solved_by_me: js.UndefOr[Boolean] = js.native
  val collaborator_ids: js.Array[ZendeskID] = js.native
  val custom_fields: js.Array[Field] | Null = js.native
  val description: String = js.native
  val due_at: String | Null = js.native
  val email_cc_ids: js.Array[ZendeskID] = js.native
  val fields: js.Array[Field] | Null = js.native
  val followup_source_id: String | Null = js.native
  val group_id: js.UndefOr[ZendeskID | Null] = js.native
  val is_public: Boolean = js.native
  val organization_id: ZendeskID | Null = js.native
  val priority: Priority | Null = js.native
  val recipient: String | Null = js.native
  val requester_id: ZendeskID = js.native
  val solved: js.UndefOr[Boolean] = js.native
  val status: Status = js.native
  val subject: String = js.native
  val ticket_form_id: js.UndefOr[Double | Null] = js.native
  val `type`: TicketType | Null = js.native
  val url: String = js.native
  val via: Via = js.native
}

object ResponseModel {
  @scala.inline
  def apply(
    collaborator_ids: js.Array[ZendeskID],
    created_at: String,
    description: String,
    email_cc_ids: js.Array[ZendeskID],
    id: ZendeskID,
    is_public: Boolean,
    requester_id: ZendeskID,
    status: Status,
    subject: String,
    url: String,
    via: Via
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(collaborator_ids = collaborator_ids.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email_cc_ids = email_cc_ids.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_public = is_public.asInstanceOf[js.Any], requester_id = requester_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollaborator_ids(value: js.Array[ZendeskID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborator_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail_cc_ids(value: js.Array[ZendeskID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_cc_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_public(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequester_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVia(value: Via): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignee_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignee_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_id")(null)
        ret
    }
    @scala.inline
    def withCan_be_solved_by_me(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_be_solved_by_me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_be_solved_by_me: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_be_solved_by_me")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_fields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_fieldsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_fields")(null)
        ret
    }
    @scala.inline
    def withDue_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDue_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_at")(null)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(null)
        ret
    }
    @scala.inline
    def withFollowup_source_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followup_source_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowup_source_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followup_source_id")(null)
        ret
    }
    @scala.inline
    def withGroup_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_id")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_id")(null)
        ret
    }
    @scala.inline
    def withOrganization_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_id")(null)
        ret
    }
    @scala.inline
    def withPriority(value: Priority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriorityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(null)
        ret
    }
    @scala.inline
    def withRecipient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(null)
        ret
    }
    @scala.inline
    def withSolved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solved")(js.undefined)
        ret
    }
    @scala.inline
    def withTicket_form_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket_form_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicket_form_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket_form_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTicket_form_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket_form_id")(null)
        ret
    }
    @scala.inline
    def withType(value: TicketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

