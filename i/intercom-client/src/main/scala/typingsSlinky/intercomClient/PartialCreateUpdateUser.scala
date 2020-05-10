package typingsSlinky.intercomClient

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.intercomClient.intercomClientStrings.contact
import typingsSlinky.intercomClient.intercomClientStrings.user
import typingsSlinky.intercomClient.userMod.Avatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/User.CreateUpdateUser> */
@js.native
trait PartialCreateUpdateUser extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.native
  var app_id: js.UndefOr[String] = js.native
  var avatar: js.UndefOr[Avatar] = js.native
  var companies: js.UndefOr[js.Array[PartialCompanyremoveboole]] = js.native
  var created_at: js.UndefOr[Double] = js.native
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var last_request_at: js.UndefOr[Double] = js.native
  var last_seen_ip: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var phone: js.UndefOr[String] = js.native
  var pseudonym: js.UndefOr[String] = js.native
  var session_count: js.UndefOr[Double] = js.native
  var signed_up_at: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[user | contact] = js.native
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.native
  var updated_at: js.UndefOr[Double] = js.native
  var user_agent_data: js.UndefOr[String] = js.native
  var user_id: js.UndefOr[String] = js.native
}

object PartialCreateUpdateUser {
  @scala.inline
  def apply(): PartialCreateUpdateUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateUpdateUser]
  }
  @scala.inline
  implicit class PartialCreateUpdateUserOps[Self <: PartialCreateUpdateUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withApp_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatar(value: Avatar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanies(value: js.Array[PartialCompanyremoveboole]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companies")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_attributes(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_request_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_request_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_request_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_request_at")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_seen_ip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_seen_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_seen_ip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_seen_ip")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withPseudonym(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudonym")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPseudonym: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudonym")(js.undefined)
        ret
    }
    @scala.inline
    def withSession_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_count")(js.undefined)
        ret
    }
    @scala.inline
    def withSigned_up_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed_up_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigned_up_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed_up_at")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: user | contact): Self = {
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
    def withUnsubscribed_from_emails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribed_from_emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsubscribed_from_emails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribed_from_emails")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_agent_data(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_agent_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent_data")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
  }
  
}

