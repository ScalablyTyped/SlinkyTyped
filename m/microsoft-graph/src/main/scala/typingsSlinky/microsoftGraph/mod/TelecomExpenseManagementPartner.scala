package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelecomExpenseManagementPartner extends Entity {
  // Whether the partner's AAD app has been authorized to access Intune.
  var appAuthorized: js.UndefOr[Boolean] = js.native
  // Display name of the TEM partner.
  var displayName: js.UndefOr[String] = js.native
  // Whether Intune's connection to the TEM service is currently enabled or disabled.
  var enabled: js.UndefOr[Boolean] = js.native
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[String] = js.native
  // URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service.
  var url: js.UndefOr[String] = js.native
}

object TelecomExpenseManagementPartner {
  @scala.inline
  def apply(): TelecomExpenseManagementPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelecomExpenseManagementPartner]
  }
  @scala.inline
  implicit class TelecomExpenseManagementPartnerOps[Self <: TelecomExpenseManagementPartner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAuthorized")(js.undefined)
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
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLastConnectionDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastConnectionDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastConnectionDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastConnectionDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

