package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTlsCertificateRenewalSummary extends js.Object {
  /**
    * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request.
    */
  var domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList] = js.native
  /**
    * The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
    */
  var renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus] = js.native
}

object LoadBalancerTlsCertificateRenewalSummary {
  @scala.inline
  def apply(): LoadBalancerTlsCertificateRenewalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateRenewalSummary]
  }
  @scala.inline
  implicit class LoadBalancerTlsCertificateRenewalSummaryOps[Self <: LoadBalancerTlsCertificateRenewalSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainValidationOptions(value: LoadBalancerTlsCertificateDomainValidationOptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainValidationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainValidationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainValidationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewalStatus(value: LoadBalancerTlsCertificateRenewalStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalStatus")(js.undefined)
        ret
    }
  }
  
}

