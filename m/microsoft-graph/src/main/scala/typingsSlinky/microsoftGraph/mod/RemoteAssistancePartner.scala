package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteAssistancePartner extends Entity {
  // Display name of the partner.
  var displayName: js.UndefOr[String] = js.native
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[String] = js.native
  // TBD. Possible values are: notOnboarded, onboarding, onboarded.
  var onboardingStatus: js.UndefOr[RemoteAssistanceOnboardingStatus] = js.native
  // URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
  var onboardingUrl: js.UndefOr[String] = js.native
}

object RemoteAssistancePartner {
  @scala.inline
  def apply(): RemoteAssistancePartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAssistancePartner]
  }
  @scala.inline
  implicit class RemoteAssistancePartnerOps[Self <: RemoteAssistancePartner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOnboardingStatus(value: RemoteAssistanceOnboardingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onboardingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnboardingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onboardingStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnboardingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onboardingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnboardingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onboardingUrl")(js.undefined)
        ret
    }
  }
  
}

