package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntuneBrand extends js.Object {
  // Email address of the person/organization responsible for IT support.
  var contactITEmailAddress: js.UndefOr[String] = js.native
  // Name of the person/organization responsible for IT support.
  var contactITName: js.UndefOr[String] = js.native
  // Text comments regarding the person/organization responsible for IT support.
  var contactITNotes: js.UndefOr[String] = js.native
  // Phone number of the person/organization responsible for IT support.
  var contactITPhoneNumber: js.UndefOr[String] = js.native
  // Logo image displayed in Company Portal apps which have a dark background behind the logo.
  var darkBackgroundLogo: js.UndefOr[MimeContent] = js.native
  // Company/organization name that is displayed to end users.
  var displayName: js.UndefOr[String] = js.native
  // Logo image displayed in Company Portal apps which have a light background behind the logo.
  var lightBackgroundLogo: js.UndefOr[MimeContent] = js.native
  // Display name of the company/organization’s IT helpdesk site.
  var onlineSupportSiteName: js.UndefOr[String] = js.native
  // URL to the company/organization’s IT helpdesk site.
  var onlineSupportSiteUrl: js.UndefOr[String] = js.native
  // URL to the company/organization’s privacy policy.
  var privacyUrl: js.UndefOr[String] = js.native
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showDisplayNameNextToLogo: js.UndefOr[Boolean] = js.native
  // Boolean that represents whether the administrator-supplied logo images are shown or not shown.
  var showLogo: js.UndefOr[Boolean] = js.native
  // Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
  var showNameNextToLogo: js.UndefOr[Boolean] = js.native
  // Primary theme color used in the Company Portal applications and web portal.
  var themeColor: js.UndefOr[RgbColor] = js.native
}

object IntuneBrand {
  @scala.inline
  def apply(): IntuneBrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntuneBrand]
  }
  @scala.inline
  implicit class IntuneBrandOps[Self <: IntuneBrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactITEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactITEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactITEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactITEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withContactITName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactITName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactITName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactITName")(js.undefined)
        ret
    }
    @scala.inline
    def withContactITNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactITNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactITNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactITNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withContactITPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactITPhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactITPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactITPhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDarkBackgroundLogo(value: MimeContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkBackgroundLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarkBackgroundLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkBackgroundLogo")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withLightBackgroundLogo(value: MimeContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightBackgroundLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightBackgroundLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightBackgroundLogo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlineSupportSiteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineSupportSiteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlineSupportSiteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineSupportSiteName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlineSupportSiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineSupportSiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlineSupportSiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineSupportSiteUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDisplayNameNextToLogo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDisplayNameNextToLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDisplayNameNextToLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDisplayNameNextToLogo")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLogo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLogo")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNameNextToLogo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNameNextToLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNameNextToLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNameNextToLogo")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeColor(value: RgbColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeColor")(js.undefined)
        ret
    }
  }
  
}

