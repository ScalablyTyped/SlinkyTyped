package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationMessageTemplate extends Entity {
  /**
    * The Message Template Branding Options. Branding is defined in the Intune Admin Console. Possible values are: none,
    * includeCompanyLogo, includeCompanyName, includeContactInformation.
    */
  var brandingOptions: js.UndefOr[NotificationTemplateBrandingOptions] = js.native
  // The default locale to fallback onto when the requested locale is not available.
  var defaultLocale: js.UndefOr[String] = js.native
  // Display name for the Notification Message Template.
  var displayName: js.UndefOr[String] = js.native
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // The list of localized messages for this Notification Message Template.
  var localizedNotificationMessages: js.UndefOr[js.Array[LocalizedNotificationMessage]] = js.native
}

object NotificationMessageTemplate {
  @scala.inline
  def apply(): NotificationMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationMessageTemplate]
  }
  @scala.inline
  implicit class NotificationMessageTemplateOps[Self <: NotificationMessageTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrandingOptions(value: NotificationTemplateBrandingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrandingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(js.undefined)
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
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizedNotificationMessages(value: js.Array[LocalizedNotificationMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedNotificationMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedNotificationMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedNotificationMessages")(js.undefined)
        ret
    }
  }
  
}

