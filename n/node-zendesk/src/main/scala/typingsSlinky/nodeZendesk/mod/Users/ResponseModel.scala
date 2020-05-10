package typingsSlinky.nodeZendesk.mod.Users

import typingsSlinky.nodeZendesk.mod.Attachments.Model
import typingsSlinky.nodeZendesk.mod.AuditableModel
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/users#json-format-for-agent-or-admin-requests|Zendesk Users JSON Format}
  */
@js.native
trait ResponseModel extends AuditableModel {
  val active: Boolean = js.native
  val alias: String | Null = js.native
  val chat_only: Boolean = js.native
  val custom_role_id: Double | Null = js.native
  val default_group_id: Double | Null = js.native
  val details: String | Null = js.native
  val email: String | Null = js.native
  val external_id: String | Null = js.native
  val last_login_at: String | Null = js.native
  val locale: String | Null = js.native
  val locale_id: Double | Null = js.native
  val moderator: Boolean = js.native
  val name: String = js.native
  val notes: String | Null = js.native
  val only_private_comments: Boolean = js.native
  val organization_id: Double | Null = js.native
  val phone: String | Null = js.native
  val photo: Model | Null = js.native
  val report_csv: Boolean = js.native
  val restricted_agent: Boolean = js.native
  val role: Role = js.native
  val role_type: RoleType = js.native
  val shared: Boolean = js.native
  val shared_agent: Boolean = js.native
  val shared_phone_number: Boolean | Null = js.native
  val signature: String | Null = js.native
  val suspended: Boolean = js.native
  val tags: js.UndefOr[js.Array[_] | Null] = js.native
  val ticket_restriction: TicketRestriction | Null = js.native
  val time_zone: String | Null = js.native
  val two_factor_auth_enabled: Boolean = js.native
  val url: String = js.native
  val user_fields: js.UndefOr[js.Object | Null] = js.native
  val verified: Boolean = js.native
}

object ResponseModel {
  @scala.inline
  def apply(
    active: Boolean,
    chat_only: Boolean,
    created_at: String,
    id: ZendeskID,
    moderator: Boolean,
    name: String,
    only_private_comments: Boolean,
    report_csv: Boolean,
    restricted_agent: Boolean,
    role: Role,
    role_type: RoleType,
    shared: Boolean,
    shared_agent: Boolean,
    suspended: Boolean,
    two_factor_auth_enabled: Boolean,
    url: String,
    verified: Boolean
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chat_only = chat_only.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], only_private_comments = only_private_comments.asInstanceOf[js.Any], report_csv = report_csv.asInstanceOf[js.Any], restricted_agent = restricted_agent.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], role_type = role_type.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], shared_agent = shared_agent.asInstanceOf[js.Any], suspended = suspended.asInstanceOf[js.Any], two_factor_auth_enabled = two_factor_auth_enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChat_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chat_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnly_private_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only_private_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport_csv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report_csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestricted_agent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole_type(value: RoleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShared_agent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwo_factor_auth_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two_factor_auth_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(null)
        ret
    }
    @scala.inline
    def withCustom_role_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_role_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_role_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_role_id")(null)
        ret
    }
    @scala.inline
    def withDefault_group_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_group_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_group_id")(null)
        ret
    }
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetailsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(null)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(null)
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
    def withLast_login_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_login_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_login_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_login_at")(null)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocaleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(null)
        ret
    }
    @scala.inline
    def withLocale_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale_id")(null)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(null)
        ret
    }
    @scala.inline
    def withOrganization_id(value: Double): Self = {
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
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(null)
        ret
    }
    @scala.inline
    def withPhoto(value: Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(null)
        ret
    }
    @scala.inline
    def withShared_phone_number(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared_phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShared_phone_numberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared_phone_number")(null)
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(null)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[_]): Self = {
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
    def withTicket_restriction(value: TicketRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket_restriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicket_restrictionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket_restriction")(null)
        ret
    }
    @scala.inline
    def withTime_zone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_zoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_zone")(null)
        ret
    }
    @scala.inline
    def withUser_fields(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_fieldsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_fields")(null)
        ret
    }
  }
  
}

