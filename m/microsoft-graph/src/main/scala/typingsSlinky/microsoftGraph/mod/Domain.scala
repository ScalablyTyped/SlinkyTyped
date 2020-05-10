package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends Entity {
  /**
    * Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed
    * indicates a cloud managed domain where Azure AD performs user authentication.Federated indicates authentication is
    * federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation
    * Services. This property is read-only and is not nullable.
    */
  var authenticationType: js.UndefOr[String] = js.native
  /**
    * This property is always null except when the verify action is used. When the verify action is used, a domain entity is
    * returned in the response. The availabilityStatus property of the domain entity in the response is either
    * AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
    */
  var availabilityStatus: js.UndefOr[String] = js.native
  // Read-only, Nullable
  var domainNameReferences: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * The value of the property is false if the DNS record management of the domain has been delegated to Office 365.
    * Otherwise, the value is true. Not nullable
    */
  var isAdminManaged: js.UndefOr[Boolean] = js.native
  /**
    * True if this is the default domain that is used for user creation. There is only one default domain per company. Not
    * nullable
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * True if this is the initial domain created by Microsoft Online Services (companyname.onmicrosoft.com). There is only
    * one initial domain per company. Not nullable
    */
  var isInitial: js.UndefOr[Boolean] = js.native
  // True if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable
  var isRoot: js.UndefOr[Boolean] = js.native
  // True if the domain has completed domain ownership verification. Not nullable
  var isVerified: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the number of days before a user receives notification that their password will expire. If the property is
    * not set, a default value of 14 days will be used.
    */
  var passwordNotificationWindowInDays: js.UndefOr[Double] = js.native
  /**
    * Specifies the length of time that a password is valid before it must be changed. If the property is not set, a default
    * value of 90 days will be used.
    */
  var passwordValidityPeriodInDays: js.UndefOr[Double] = js.native
  /**
    * DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online
    * services.Read-only, Nullable
    */
  var serviceConfigurationRecords: js.UndefOr[js.Array[DomainDnsRecord]] = js.native
  // Status of asynchronous operations scheduled for the domain.
  var state: js.UndefOr[DomainState] = js.native
  /**
    * The capabilities assigned to the domain.Can include 0, 1 or more of following values: Email, Sharepoint,
    * EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic,
    * OrgIdAuthentication, Yammer, Intune The values which you can add/remove using Graph API include: Email,
    * OfficeCommunicationsOnline, YammerNot nullable
    */
  var supportedServices: js.UndefOr[js.Array[String]] = js.native
  /**
    * DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership
    * verification with Azure AD.Read-only, Nullable
    */
  var verificationDnsRecords: js.UndefOr[js.Array[DomainDnsRecord]] = js.native
}

object Domain {
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainNameReferences(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainNameReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNameReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainNameReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAdminManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdminManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAdminManaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdminManaged")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInitial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitial")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerified")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordNotificationWindowInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordNotificationWindowInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordNotificationWindowInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordNotificationWindowInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordValidityPeriodInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordValidityPeriodInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordValidityPeriodInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordValidityPeriodInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceConfigurationRecords(value: js.Array[DomainDnsRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigurationRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceConfigurationRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigurationRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: DomainState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedServices")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationDnsRecords(value: js.Array[DomainDnsRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationDnsRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationDnsRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationDnsRecords")(js.undefined)
        ret
    }
  }
  
}

