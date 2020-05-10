package typingsSlinky.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppPanel extends js.Object {
  /**
    * Country code for the country of the users that the panel contains. Uses standard ISO 3166-1 2-character language codes. For instance, 'US' for the
    * United States, and 'GB' for the United Kingdom. Any survey created targeting this panel must also target the corresponding country.
    */
  var country: js.UndefOr[String] = js.native
  /** Whether or not the panel is accessible to all API users. */
  var isPublicPanel: js.UndefOr[Boolean] = js.native
  /**
    * Language code that the panel can target. For instance, 'en-US'. Uses standard BCP47 language codes. See specification. Any survey created targeting
    * this panel must also target the corresponding language.
    */
  var language: js.UndefOr[String] = js.native
  /** Unique panel ID string. This corresponds to the mobile_app_panel_id used in Survey Insert requests. */
  var mobileAppPanelId: js.UndefOr[String] = js.native
  /** Human readable name of the audience panel. */
  var name: js.UndefOr[String] = js.native
  /**
    * List of email addresses for users who can target members of this panel. Must contain at least the address of the user making the API call for panels
    * that are not public. This field will be empty for public panels.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
}

object MobileAppPanel {
  @scala.inline
  def apply(): MobileAppPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppPanel]
  }
  @scala.inline
  implicit class MobileAppPanelOps[Self <: MobileAppPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPublicPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublicPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPublicPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublicPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileAppPanelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppPanelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileAppPanelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppPanelId")(js.undefined)
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
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
  }
  
}

