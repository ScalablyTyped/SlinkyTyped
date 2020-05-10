package typingsSlinky.nodeZendesk.mod.Tickets

import typingsSlinky.nodeZendesk.mod.AuditableModel
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#json-format|Zendesk Tickets JSON Format}
  */
@js.native
trait ResponseModel extends AuditableModel {
  val allow_attachments: Boolean = js.native
   // Enterprise version only
  val allow_channelback: Boolean = js.native
  val assignee_id: ZendeskID | Null = js.native
   // Enterprise version only
  val brand_id: js.UndefOr[Double | Null] = js.native
  val collaborator_ids: js.Array[Double] = js.native
  val comment_count: js.UndefOr[Double] = js.native
  val custom_fields: js.Array[Field] = js.native
  val description: String = js.native
  val due_at: String | Null = js.native
  val email_cc_ids: js.Array[Double] = js.native
  val external_id: String | Null = js.native
  val fields: js.Array[Field] = js.native
  val follower_ids: js.Array[Double] = js.native
  val followup_ids: js.Array[Double] = js.native
  val forum_topic_id: Double | Null = js.native
  val group_id: Double | Null = js.native
  val has_incidents: Boolean = js.native
  val is_public: Boolean = js.native
  val organization_id: Double = js.native
  val priority: Priority | Null = js.native
  val problem_id: Double | Null = js.native
  val raw_subject: String | Null = js.native
  val recipient: String | Null = js.native
  val requester_id: ZendeskID = js.native
  val satisfaction_rating: js.Object | String | Null = js.native
  val sharing_agreement_ids: js.Array[Double] = js.native
  val status: Status = js.native
  val subject: String | Null = js.native
  val submitter_id: ZendeskID = js.native
  val tags: js.Array[String] = js.native
  val ticket_form_id: js.UndefOr[Double | Null] = js.native
  val `type`: TicketType | Null = js.native
  val url: String = js.native
  val via: Via = js.native
}

object ResponseModel {
  @scala.inline
  def apply(
    allow_attachments: Boolean,
    allow_channelback: Boolean,
    collaborator_ids: js.Array[Double],
    created_at: String,
    custom_fields: js.Array[Field],
    description: String,
    email_cc_ids: js.Array[Double],
    fields: js.Array[Field],
    follower_ids: js.Array[Double],
    followup_ids: js.Array[Double],
    has_incidents: Boolean,
    id: ZendeskID,
    is_public: Boolean,
    organization_id: Double,
    requester_id: ZendeskID,
    sharing_agreement_ids: js.Array[Double],
    status: Status,
    submitter_id: ZendeskID,
    tags: js.Array[String],
    url: String,
    via: Via
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(allow_attachments = allow_attachments.asInstanceOf[js.Any], allow_channelback = allow_channelback.asInstanceOf[js.Any], collaborator_ids = collaborator_ids.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_fields = custom_fields.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email_cc_ids = email_cc_ids.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], follower_ids = follower_ids.asInstanceOf[js.Any], followup_ids = followup_ids.asInstanceOf[js.Any], has_incidents = has_incidents.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_public = is_public.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], requester_id = requester_id.asInstanceOf[js.Any], sharing_agreement_ids = sharing_agreement_ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], submitter_id = submitter_id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_attachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_channelback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_channelback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollaborator_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborator_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_fields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail_cc_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_cc_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollower_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follower_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowup_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followup_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_incidents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_incidents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_public(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequester_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharing_agreement_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharing_agreement_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitter_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitter_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
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
    def withComment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(js.undefined)
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
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(null)
        ret
    }
    @scala.inline
    def withForum_topic_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forum_topic_id")(value.asInstanceOf[js.Any])
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
    def withGroup_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_id")(null)
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
    def withProblem_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("problem_id")(value.asInstanceOf[js.Any])
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
    def withRecipientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(null)
        ret
    }
    @scala.inline
    def withSatisfaction_rating(value: js.Object | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satisfaction_rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSatisfaction_ratingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satisfaction_rating")(null)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(null)
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

