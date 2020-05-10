package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTlsCertificateDomainValidationOption extends js.Object {
  /**
    * The fully qualified domain name in the certificate request.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * The status of the domain validation. Valid values are listed below.
    */
  var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.native
}

object LoadBalancerTlsCertificateDomainValidationOption {
  @scala.inline
  def apply(): LoadBalancerTlsCertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationOption]
  }
  @scala.inline
  implicit class LoadBalancerTlsCertificateDomainValidationOptionOps[Self <: LoadBalancerTlsCertificateDomainValidationOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationStatus(value: LoadBalancerTlsCertificateDomainStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationStatus")(js.undefined)
        ret
    }
  }
  
}

