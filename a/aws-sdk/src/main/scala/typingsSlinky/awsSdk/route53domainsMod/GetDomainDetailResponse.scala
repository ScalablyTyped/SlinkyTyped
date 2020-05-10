package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainDetailResponse extends js.Object {
  /**
    * Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
    */
  var AbuseContactEmail: js.UndefOr[Email] = js.native
  /**
    * Phone number for reporting abuse.
    */
  var AbuseContactPhone: js.UndefOr[ContactNumber] = js.native
  /**
    * Provides details about the domain administrative contact.
    */
  var AdminContact: ContactDetail = js.native
  /**
    * Specifies whether contact information is concealed from WHOIS queries. If the value is true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If the value is false, WHOIS queries return the information that you entered for the admin contact.
    */
  var AdminPrivacy: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the domain registration is set to renew automatically.
    */
  var AutoRenew: js.UndefOr[Boolean] = js.native
  /**
    * The date when the domain was created as found in the response to a WHOIS query. The date and time is in Coordinated Universal time (UTC).
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * Reserved for future use.
    */
  var DnsSec: js.UndefOr[DNSSec] = js.native
  /**
    * The name of a domain.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * The date when the registration for the domain is set to expire. The date and time is in Coordinated Universal time (UTC).
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the domain.
    */
  var Nameservers: NameserverList = js.native
  /**
    * Provides details about the domain registrant.
    */
  var RegistrantContact: ContactDetail = js.native
  /**
    * Specifies whether contact information is concealed from WHOIS queries. If the value is true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If the value is false, WHOIS queries return the information that you entered for the registrant contact (domain owner).
    */
  var RegistrantPrivacy: js.UndefOr[Boolean] = js.native
  /**
    * Name of the registrar of the domain as identified in the registry. Domains with a .com, .net, or .org TLD are registered by Amazon Registrar. All other domains are registered by our registrar associate, Gandi. The value for domains that are registered by Gandi is "GANDI SAS". 
    */
  var RegistrarName: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.RegistrarName] = js.native
  /**
    * Web address of the registrar.
    */
  var RegistrarUrl: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.RegistrarUrl] = js.native
  /**
    * Reserved for future use.
    */
  var RegistryDomainId: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.RegistryDomainId] = js.native
  /**
    * Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have "Amazon" as the reseller. 
    */
  var Reseller: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.Reseller] = js.native
  /**
    * An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status codes. ICANN, the organization that maintains a central database of domain names, has developed a set of domain name status codes that tell you the status of a variety of operations on a domain name, for example, registering a domain name, transferring a domain name to another registrar, renewing the registration for a domain name, and so on. All registrars use this same set of status codes. For a current list of domain name status codes and an explanation of what each code means, go to the ICANN website and search for epp status codes. (Search on the ICANN website; web searches sometimes return an old version of the document.)
    */
  var StatusList: js.UndefOr[DomainStatusList] = js.native
  /**
    * Provides details about the domain technical contact.
    */
  var TechContact: ContactDetail = js.native
  /**
    * Specifies whether contact information is concealed from WHOIS queries. If the value is true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If the value is false, WHOIS queries return the information that you entered for the technical contact.
    */
  var TechPrivacy: js.UndefOr[Boolean] = js.native
  /**
    * The last updated date of the domain as found in the response to a WHOIS query. The date and time is in Coordinated Universal time (UTC).
    */
  var UpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
    */
  var WhoIsServer: js.UndefOr[RegistrarWhoIsServer] = js.native
}

object GetDomainDetailResponse {
  @scala.inline
  def apply(
    AdminContact: ContactDetail,
    DomainName: DomainName,
    Nameservers: NameserverList,
    RegistrantContact: ContactDetail,
    TechContact: ContactDetail
  ): GetDomainDetailResponse = {
    val __obj = js.Dynamic.literal(AdminContact = AdminContact.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Nameservers = Nameservers.asInstanceOf[js.Any], RegistrantContact = RegistrantContact.asInstanceOf[js.Any], TechContact = TechContact.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDetailResponse]
  }
  @scala.inline
  implicit class GetDomainDetailResponseOps[Self <: GetDomainDetailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminContact(value: ContactDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameservers(value: NameserverList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nameservers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrantContact(value: ContactDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrantContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTechContact(value: ContactDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TechContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbuseContactEmail(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbuseContactEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbuseContactEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbuseContactEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withAbuseContactPhone(value: ContactNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbuseContactPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbuseContactPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbuseContactPhone")(js.undefined)
        ret
    }
    @scala.inline
    def withAdminPrivacy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminPrivacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminPrivacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminPrivacy")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRenew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRenew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRenew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRenew")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsSec(value: DNSSec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsSec")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrantPrivacy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrantPrivacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrantPrivacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrantPrivacy")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrarName(value: RegistrarName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrarName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrarName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrarName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrarUrl(value: RegistrarUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrarUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrarUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrarUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistryDomainId(value: RegistryDomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryDomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryDomainId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryDomainId")(js.undefined)
        ret
    }
    @scala.inline
    def withReseller(value: Reseller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reseller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReseller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reseller")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusList(value: DomainStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusList")(js.undefined)
        ret
    }
    @scala.inline
    def withTechPrivacy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TechPrivacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTechPrivacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TechPrivacy")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoIsServer(value: RegistrarWhoIsServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhoIsServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoIsServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhoIsServer")(js.undefined)
        ret
    }
  }
  
}

