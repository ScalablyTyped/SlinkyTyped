package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDomainRequest extends js.Object {
  /**
    * Provides detailed contact information.
    */
  var AdminContact: ContactDetail = js.native
  /**
    * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect after the account is charged. Default: true 
    */
  var AutoRenew: js.UndefOr[Boolean] = js.native
  /**
    * The domain name that you want to register. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * The number of years that you want to register the domain for. Domains are registered for a minimum of one year. The maximum period depends on the top-level domain. For the range of valid values for your domain, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. Default: 1
    */
  var DurationInYears: typingsSlinky.awsSdk.route53domainsMod.DurationInYears = js.native
  /**
    * Reserved for future use.
    */
  var IdnLangCode: js.UndefOr[LangCode] = js.native
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact. Default: true 
    */
  var PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.native
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (the domain owner). Default: true 
    */
  var PrivacyProtectRegistrantContact: js.UndefOr[Boolean] = js.native
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the technical contact. Default: true 
    */
  var PrivacyProtectTechContact: js.UndefOr[Boolean] = js.native
  /**
    * Provides detailed contact information.
    */
  var RegistrantContact: ContactDetail = js.native
  /**
    * Provides detailed contact information.
    */
  var TechContact: ContactDetail = js.native
}

object RegisterDomainRequest {
  @scala.inline
  def apply(
    AdminContact: ContactDetail,
    DomainName: DomainName,
    DurationInYears: DurationInYears,
    RegistrantContact: ContactDetail,
    TechContact: ContactDetail
  ): RegisterDomainRequest = {
    val __obj = js.Dynamic.literal(AdminContact = AdminContact.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], DurationInYears = DurationInYears.asInstanceOf[js.Any], RegistrantContact = RegistrantContact.asInstanceOf[js.Any], TechContact = TechContact.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDomainRequest]
  }
  @scala.inline
  implicit class RegisterDomainRequestOps[Self <: RegisterDomainRequest] (val x: Self) extends AnyVal {
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
    def withDurationInYears(value: DurationInYears): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationInYears")(value.asInstanceOf[js.Any])
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
    def withIdnLangCode(value: LangCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdnLangCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdnLangCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdnLangCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyProtectAdminContact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivacyProtectAdminContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyProtectAdminContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivacyProtectAdminContact")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyProtectRegistrantContact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivacyProtectRegistrantContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyProtectRegistrantContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivacyProtectRegistrantContact")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyProtectTechContact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivacyProtectTechContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyProtectTechContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivacyProtectTechContact")(js.undefined)
        ret
    }
  }
  
}

