package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountResponse extends js.Object {
  /**
    * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated with your account.
    */
  var DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled] = js.native
  /**
    * The reputation status of your Amazon Pinpoint account. The status can be one of the following:    HEALTHY – There are no reputation-related issues that currently impact your account.    PROBATION – We've identified some issues with your Amazon Pinpoint account. We're placing your account under review while you work on correcting these issues.    SHUTDOWN – Your account's ability to send email is currently paused because of an issue with the email sent from your account. When you correct the issue, you can contact us and request that your account's ability to send email is resumed.  
    */
  var EnforcementStatus: js.UndefOr[GeneralEnforcementStatus] = js.native
  /**
    * Indicates whether or not your account has production access in the current AWS Region. If the value is false, then your account is in the sandbox. When your account is in the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your maximum sending rate) is 1. If the value is true, then your account has production access. When your account has production access, you can send email to any address. The sending quota and maximum sending rate for your account vary based on your specific use case.
    */
  var ProductionAccessEnabled: js.UndefOr[Enabled] = js.native
  /**
    * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint account in the current AWS Region.
    */
  var SendQuota: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.SendQuota] = js.native
  /**
    * Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS Region.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}

object GetAccountResponse {
  @scala.inline
  def apply(): GetAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountResponse]
  }
  @scala.inline
  implicit class GetAccountResponseOps[Self <: GetAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDedicatedIpAutoWarmupEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedIpAutoWarmupEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedIpAutoWarmupEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedIpAutoWarmupEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforcementStatus(value: GeneralEnforcementStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnforcementStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforcementStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnforcementStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withProductionAccessEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductionAccessEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductionAccessEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductionAccessEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSendQuota(value: SendQuota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withSendingEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingEnabled")(js.undefined)
        ret
    }
  }
  
}

