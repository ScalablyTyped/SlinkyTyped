package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainAssociation extends js.Object {
  /**
    *  DNS Record for certificate verification. 
    */
  var certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord] = js.native
  /**
    *  ARN for the Domain Association. 
    */
  var domainAssociationArn: DomainAssociationArn = js.native
  /**
    *  Name of the domain. 
    */
  var domainName: DomainName = js.native
  /**
    *  Status fo the Domain Association. 
    */
  var domainStatus: DomainStatus = js.native
  /**
    *  Enables automated creation of Subdomains for branches. (Currently not supported) 
    */
  var enableAutoSubDomain: EnableAutoSubDomain = js.native
  /**
    *  Reason for the current status of the Domain Association. 
    */
  var statusReason: StatusReason = js.native
  /**
    *  Subdomains for the Domain Association. 
    */
  var subDomains: SubDomains = js.native
}

object DomainAssociation {
  @scala.inline
  def apply(
    domainAssociationArn: DomainAssociationArn,
    domainName: DomainName,
    domainStatus: DomainStatus,
    enableAutoSubDomain: EnableAutoSubDomain,
    statusReason: StatusReason,
    subDomains: SubDomains
  ): DomainAssociation = {
    val __obj = js.Dynamic.literal(domainAssociationArn = domainAssociationArn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainStatus = domainStatus.asInstanceOf[js.Any], enableAutoSubDomain = enableAutoSubDomain.asInstanceOf[js.Any], statusReason = statusReason.asInstanceOf[js.Any], subDomains = subDomains.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainAssociation]
  }
  @scala.inline
  implicit class DomainAssociationOps[Self <: DomainAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainAssociationArn(value: DomainAssociationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainAssociationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainStatus(value: DomainStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableAutoSubDomain(value: EnableAutoSubDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoSubDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusReason(value: StatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubDomains(value: SubDomains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateVerificationDNSRecord(value: CertificateVerificationDNSRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateVerificationDNSRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateVerificationDNSRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateVerificationDNSRecord")(js.undefined)
        ret
    }
  }
  
}

