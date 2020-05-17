package typingsSlinky.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.intercomClient.intercomClientStrings.contact
import typingsSlinky.intercomClient.userMod.Avatar
import typingsSlinky.intercomClient.userMod.LocationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Lead.Lead> */
@js.native
trait PartialLead extends js.Object {
  var avatar: js.UndefOr[Avatar] = js.native
  var companies: js.UndefOr[Companies] = js.native
  var created_at: js.UndefOr[Double] = js.native
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var last_request_at: js.UndefOr[Double] = js.native
  var last_seen_ip: js.UndefOr[String] = js.native
  var location_data: js.UndefOr[LocationData | js.Object] = js.native
  var name: js.UndefOr[String] = js.native
  var phone: js.UndefOr[String] = js.native
  var referrer: js.UndefOr[String] = js.native
  var segments: js.UndefOr[Segments] = js.native
  var social_profiles: js.UndefOr[Socialprofiles] = js.native
  var tags: js.UndefOr[Tags] = js.native
  var `type`: js.UndefOr[contact] = js.native
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.native
  var updated_at: js.UndefOr[Double] = js.native
  var user_agent_data: js.UndefOr[String] = js.native
  var user_id: js.UndefOr[String] = js.native
}

object PartialLead {
  @scala.inline
  def apply(): PartialLead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLead]
  }
  @scala.inline
  implicit class PartialLeadOps[Self <: PartialLead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCompanies(value: Companies): Self = {
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
    def withLocation_data(value: LocationData | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_data")(js.undefined)
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
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: Segments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withSocial_profiles(value: Socialprofiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocial_profiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_profiles")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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
    def withType(value: contact): Self = {
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

