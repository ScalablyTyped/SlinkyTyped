package typingsSlinky.nodeZendesk.mod.Tickets

import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#create-ticket|Zendesk Tickets Create}
  */
@js.native
trait CreateModel extends js.Object {
  var assignee_id: js.UndefOr[ZendeskID | Null] = js.native
  var brand_id: js.UndefOr[Double | Null] = js.native
  var collaborator_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  var collaborators: js.UndefOr[js.Array[_] | Null] = js.native
  var comment: typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel = js.native
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.native
  var due_at: js.UndefOr[String | Null] = js.native
  var email_cc_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  var external_id: js.UndefOr[String | Null] = js.native
  var fields: js.UndefOr[js.Array[Field] | Null] = js.native
  var follower_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  var forum_topic_id: js.UndefOr[Double | Null] = js.native
  var group_id: js.UndefOr[Double | Null] = js.native
  var macro_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  var organization_id: js.UndefOr[Double | Null] = js.native
  var priority: js.UndefOr[Priority | Null] = js.native
  var problem_id: js.UndefOr[Double | Null] = js.native
  var raw_subject: js.UndefOr[String | Null] = js.native
  var recipient: js.UndefOr[String | Null] = js.native
  var requester_id: js.UndefOr[ZendeskID] = js.native
  var status: js.UndefOr[Status | Null] = js.native
  var subject: js.UndefOr[String | Null] = js.native
  var submitter_id: js.UndefOr[ZendeskID | Null] = js.native
  var tags: js.UndefOr[js.Array[String] | Null] = js.native
  var ticket_form_id: js.UndefOr[Double | Null] = js.native
  var `type`: js.UndefOr[TicketType | Null] = js.native
  var via_followup_source_id: js.UndefOr[Double | Null] = js.native
}

object CreateModel {
  @scala.inline
  def apply(comment: typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
  @scala.inline
  implicit class CreateModelOps[Self <: CreateModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignee_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignee_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignee_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_id")(null)
        ret
    }
    @scala.inline
    def withBrand_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand_id")(js.undefined)
        ret
    }
    @scala.inline
    def withBrand_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand_id")(null)
        ret
    }
    @scala.inline
    def withCollaborator_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborator_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollaborator_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborator_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withCollaborator_idsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborator_ids")(null)
        ret
    }
    @scala.inline
    def withCollaborators(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollaborators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(js.undefined)
        ret
    }
    @scala.inline
    def withCollaboratorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(null)
        ret
    }
    @scala.inline
    def withCustom_fields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_fields")(js.undefined)
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
    def withoutDue_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_at")(js.undefined)
        ret
    }
    @scala.inline
    def withDue_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_at")(null)
        ret
    }
    @scala.inline
    def withEmail_cc_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_cc_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail_cc_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_cc_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail_cc_idsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_cc_ids")(null)
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(null)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(null)
        ret
    }
    @scala.inline
    def withFollower_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follower_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollower_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follower_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withFollower_idsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follower_ids")(null)
        ret
    }
    @scala.inline
    def withForum_topic_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forum_topic_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForum_topic_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forum_topic_id")(js.undefined)
        ret
    }
    @scala.inline
    def withForum_topic_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forum_topic_id")(null)
        ret
    }
    @scala.inline
    def withGroup_id(value: Double): Self = {
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
    def withMacro_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macro_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacro_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macro_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withMacro_idsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macro_ids")(null)
        ret
    }
    @scala.inline
    def withOrganization_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_id")(js.undefined)
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
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withPriorityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(null)
        ret
    }
    @scala.inline
    def withProblem_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("problem_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProblem_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("problem_id")(js.undefined)
        ret
    }
    @scala.inline
    def withProblem_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("problem_id")(null)
        ret
    }
    @scala.inline
    def withRaw_subject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw_subject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_subject")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw_subjectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_subject")(null)
        ret
    }
    @scala.inline
    def withRecipient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(null)
        ret
    }
    @scala.inline
    def withRequester_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequester_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_id")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(null)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(null)
        ret
    }
    @scala.inline
    def withSubmitter_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitter_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitter_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitter_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitter_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitter_id")(null)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(null)
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
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
    @scala.inline
    def withVia_followup_source_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via_followup_source_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVia_followup_source_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via_followup_source_id")(js.undefined)
        ret
    }
    @scala.inline
    def withVia_followup_source_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via_followup_source_id")(null)
        ret
    }
  }
  
}

