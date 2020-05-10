package typingsSlinky.nodeZendesk.mod.Tickets

import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#update-ticket|Zendesk Tickets Update}
  */
@js.native
trait UpdateModel extends js.Object {
  var additional_collaborators: js.UndefOr[js.Array[_] | Null] = js.native
  var assignee_email: js.UndefOr[String | Null] = js.native
  var assignee_id: js.UndefOr[ZendeskID | Null] = js.native
  var attribute_value_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  var collaborator_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  var comment: js.UndefOr[typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel] = js.native
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.native
  var due_at: js.UndefOr[String | Null] = js.native
  var email_ccs: js.UndefOr[js.Array[EmailCC] | Null] = js.native
  var external_id: js.UndefOr[String | Null] = js.native
  var followers: js.UndefOr[js.Array[Follower] | Null] = js.native
  var group_id: js.UndefOr[Double | Null] = js.native
  var macro_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  var organization_id: js.UndefOr[Double | Null] = js.native
  var priority: js.UndefOr[Priority | Null] = js.native
  var problem_id: js.UndefOr[Double | Null] = js.native
  var requester_id: js.UndefOr[ZendeskID] = js.native
  var safe_update: js.UndefOr[Boolean] = js.native
  var sharing_agreement_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  var status: js.UndefOr[Status | Null] = js.native
  var subject: js.UndefOr[String | Null] = js.native
  var tags: js.UndefOr[js.Array[String] | Null] = js.native
  var `type`: js.UndefOr[TicketType | Null] = js.native
  var updated_stamp: js.UndefOr[String | Null] = js.native
}

object UpdateModel {
  @scala.inline
  def apply(): UpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModel]
  }
  @scala.inline
  implicit class UpdateModelOps[Self <: UpdateModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional_collaborators(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_collaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_collaborators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_collaborators")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditional_collaboratorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_collaborators")(null)
        ret
    }
    @scala.inline
    def withAssignee_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignee_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_email")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignee_emailNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_email")(null)
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
    def withAttribute_value_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute_value_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribute_value_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute_value_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withAttribute_value_idsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute_value_ids")(null)
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
    def withComment(value: typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
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
    def withEmail_ccs(value: js.Array[EmailCC]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_ccs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail_ccs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_ccs")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail_ccsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_ccs")(null)
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
    def withFollowers(value: js.Array[Follower]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers")(null)
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
    def withSafe_update(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe_update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafe_update: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe_update")(js.undefined)
        ret
    }
    @scala.inline
    def withSharing_agreement_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharing_agreement_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharing_agreement_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharing_agreement_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withSharing_agreement_idsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharing_agreement_ids")(null)
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
    def withUpdated_stamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_stamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_stamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_stamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_stampNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_stamp")(null)
        ret
    }
  }
  
}

