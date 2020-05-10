package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewalSummary extends js.Object {
  /**
    * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: DomainValidationList = js.native
  /**
    * The status of ACM's managed renewal of the certificate.
    */
  var RenewalStatus: typingsSlinky.awsSdk.acmMod.RenewalStatus = js.native
  /**
    * The reason that a renewal request was unsuccessful.
    */
  var RenewalStatusReason: js.UndefOr[FailureReason] = js.native
  /**
    * The time at which the renewal summary was last updated.
    */
  var UpdatedAt: js.Date = js.native
}

object RenewalSummary {
  @scala.inline
  def apply(DomainValidationOptions: DomainValidationList, RenewalStatus: RenewalStatus, UpdatedAt: js.Date): RenewalSummary = {
    val __obj = js.Dynamic.literal(DomainValidationOptions = DomainValidationOptions.asInstanceOf[js.Any], RenewalStatus = RenewalStatus.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewalSummary]
  }
  @scala.inline
  implicit class RenewalSummaryOps[Self <: RenewalSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainValidationOptions(value: DomainValidationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainValidationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenewalStatus(value: RenewalStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenewalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenewalStatusReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenewalStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewalStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenewalStatusReason")(js.undefined)
        ret
    }
  }
  
}

