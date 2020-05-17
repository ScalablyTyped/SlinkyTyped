package typingsSlinky.intercomWeb.Intercom

import typingsSlinky.intercomWeb.anon.Createdat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntercomSettings extends js.Object {
  var action_color: js.UndefOr[String] = js.native
  var alignment: js.UndefOr[String] = js.native
  // Messenger attributes
  var app_id: js.UndefOr[String] = js.native
  var background_color: js.UndefOr[String] = js.native
  var company: js.UndefOr[Createdat] = js.native
  var created_at: js.UndefOr[Double] = js.native
  var custom_launcher_selector: js.UndefOr[String] = js.native
  // Data attributes
  var email: js.UndefOr[String] = js.native
  var hide_default_launcher: js.UndefOr[Boolean] = js.native
  var horizontal_padding: js.UndefOr[Double] = js.native
  var language_override: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var phone: js.UndefOr[String] = js.native
  var session_duration: js.UndefOr[Double] = js.native
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.native
  var user_hash: js.UndefOr[String] = js.native
  var user_id: js.UndefOr[String] = js.native
  var utm_campaign: js.UndefOr[String] = js.native
  var utm_content: js.UndefOr[String] = js.native
  var utm_medium: js.UndefOr[String] = js.native
  var utm_source: js.UndefOr[String] = js.native
  var utm_term: js.UndefOr[String] = js.native
  var vertical_padding: js.UndefOr[Double] = js.native
}

object IntercomSettings {
  @scala.inline
  def apply(): IntercomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntercomSettings]
  }
  @scala.inline
  implicit class IntercomSettingsOps[Self <: IntercomSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_color")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
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
    def withBackground_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background_color")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: Createdat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
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
    def withCustom_launcher_selector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_launcher_selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_launcher_selector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_launcher_selector")(js.undefined)
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
    def withHide_default_launcher(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_default_launcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide_default_launcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_default_launcher")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal_padding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal_padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal_padding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal_padding")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage_override(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage_override: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_override")(js.undefined)
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
    def withSession_duration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_duration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_duration")(js.undefined)
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
    def withUser_hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_hash")(js.undefined)
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
    @scala.inline
    def withUtm_campaign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_campaign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtm_campaign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_campaign")(js.undefined)
        ret
    }
    @scala.inline
    def withUtm_content(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtm_content: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_content")(js.undefined)
        ret
    }
    @scala.inline
    def withUtm_medium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtm_medium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_medium")(js.undefined)
        ret
    }
    @scala.inline
    def withUtm_source(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtm_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_source")(js.undefined)
        ret
    }
    @scala.inline
    def withUtm_term(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtm_term: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_term")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical_padding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical_padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical_padding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical_padding")(js.undefined)
        ret
    }
  }
  
}

