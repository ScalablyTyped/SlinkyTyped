package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.ReminderEmailConfig
import typingsSlinky.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBusinessAddress extends js.Object {
  var businessAddress: js.UndefOr[String] = js.native
  var clipFullPage: js.UndefOr[Boolean] = js.native
  var comments: js.UndefOr[String] = js.native
  var dailyEmailLimit: js.UndefOr[Double] = js.native
  var dateAgreedToTermsOfService: js.UndefOr[Timestamp] = js.native
  var defaultLatitude: js.UndefOr[Double] = js.native
  var defaultLocationName: js.UndefOr[String] = js.native
  var defaultLongitude: js.UndefOr[Double] = js.native
  var educationalDiscount: js.UndefOr[Boolean] = js.native
  var emailAddressLastConfirmed: js.UndefOr[Timestamp] = js.native
  var emailOptOutDate: js.UndefOr[Timestamp] = js.native
  var groupName: js.UndefOr[String] = js.native
  var hideSponsorBilling: js.UndefOr[Boolean] = js.native
  var incomingEmailAddress: js.UndefOr[String] = js.native
  var maxReferrals: js.UndefOr[Double] = js.native
  var partnerEmailOptInDate: js.UndefOr[Timestamp] = js.native
  var passwordUpdated: js.UndefOr[Timestamp] = js.native
  var preactivation: js.UndefOr[Boolean] = js.native
  var preferredCountry: js.UndefOr[String] = js.native
  var preferredLanguage: js.UndefOr[String] = js.native
  var recentMailedAddresses: js.UndefOr[js.Array[String]] = js.native
  var recognitionLanguage: js.UndefOr[String] = js.native
  var refererCode: js.UndefOr[String] = js.native
  var referralCount: js.UndefOr[Double] = js.native
  var referralProof: js.UndefOr[String] = js.native
  var reminderEmailConfig: js.UndefOr[ReminderEmailConfig] = js.native
  var salesforcePushEnabled: js.UndefOr[Boolean] = js.native
  var sentEmailCount: js.UndefOr[Double] = js.native
  var sentEmailDate: js.UndefOr[Timestamp] = js.native
  var taxExempt: js.UndefOr[Boolean] = js.native
  var twitterId: js.UndefOr[String] = js.native
  var twitterUserName: js.UndefOr[String] = js.native
  var useEmailAutoFiling: js.UndefOr[Boolean] = js.native
  var viewedPromotions: js.UndefOr[js.Array[String]] = js.native
}

object AnonBusinessAddress {
  @scala.inline
  def apply(): AnonBusinessAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBusinessAddress]
  }
  @scala.inline
  implicit class AnonBusinessAddressOps[Self <: AnonBusinessAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusinessAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withClipFullPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipFullPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipFullPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipFullPage")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withDailyEmailLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyEmailLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailyEmailLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyEmailLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withDateAgreedToTermsOfService(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateAgreedToTermsOfService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateAgreedToTermsOfService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateAgreedToTermsOfService")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLatitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLatitude")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLocationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLocationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocationName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLongitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLongitude")(js.undefined)
        ret
    }
    @scala.inline
    def withEducationalDiscount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("educationalDiscount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEducationalDiscount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("educationalDiscount")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddressLastConfirmed(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddressLastConfirmed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddressLastConfirmed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddressLastConfirmed")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailOptOutDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOptOutDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailOptOutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOptOutDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSponsorBilling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSponsorBilling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSponsorBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSponsorBilling")(js.undefined)
        ret
    }
    @scala.inline
    def withIncomingEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncomingEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReferrals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReferrals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReferrals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReferrals")(js.undefined)
        ret
    }
    @scala.inline
    def withPartnerEmailOptInDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerEmailOptInDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnerEmailOptInDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerEmailOptInDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withPreactivation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preactivation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreactivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preactivation")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withRecentMailedAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentMailedAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecentMailedAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentMailedAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognitionLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognitionLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognitionLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognitionLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withRefererCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refererCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefererCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refererCode")(js.undefined)
        ret
    }
    @scala.inline
    def withReferralCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferralCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralCount")(js.undefined)
        ret
    }
    @scala.inline
    def withReferralProof(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferralProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralProof")(js.undefined)
        ret
    }
    @scala.inline
    def withReminderEmailConfig(value: ReminderEmailConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderEmailConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderEmailConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderEmailConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSalesforcePushEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salesforcePushEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalesforcePushEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salesforcePushEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSentEmailCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentEmailCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentEmailCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentEmailCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSentEmailDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentEmailDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentEmailDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentEmailDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxExempt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxExempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxExempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxExempt")(js.undefined)
        ret
    }
    @scala.inline
    def withTwitterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwitterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitterId")(js.undefined)
        ret
    }
    @scala.inline
    def withTwitterUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitterUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwitterUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitterUserName")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEmailAutoFiling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEmailAutoFiling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEmailAutoFiling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEmailAutoFiling")(js.undefined)
        ret
    }
    @scala.inline
    def withViewedPromotions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewedPromotions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewedPromotions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewedPromotions")(js.undefined)
        ret
    }
  }
  
}

