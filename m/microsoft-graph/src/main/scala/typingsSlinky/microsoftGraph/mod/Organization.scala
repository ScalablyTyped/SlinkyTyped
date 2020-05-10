package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends DirectoryObject {
  // The collection of service plans associated with the tenant. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.native
  /**
    * Telephone number for the organization. NOTE: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  /**
    * Navigation property to manage certificate-based authentication configuration. Only a single instance of
    * certificateBasedAuthConfiguration can be created in the collection.
    */
  var certificateBasedAuthConfiguration: js.UndefOr[js.Array[CertificateBasedAuthConfiguration]] = js.native
  // City name of the address for the organization.
  var city: js.UndefOr[String] = js.native
  // Country/region name of the address for the organization.
  var country: js.UndefOr[String] = js.native
  // Country/region abbreviation for the organization.
  var countryLetterCode: js.UndefOr[String] = js.native
  /**
    * Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the
    * organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  // The display name for the tenant.
  var displayName: js.UndefOr[String] = js.native
  // The collection of open extensions defined for the organization. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  // Not nullable.
  var marketingNotificationEmails: js.UndefOr[js.Array[String]] = js.native
  // Mobile device management authority. Possible values are: unknown, intune, sccm, office365.
  var mobileDeviceManagementAuthority: js.UndefOr[MdmAuthority] = js.native
  /**
    * The time and date at which the tenant was last synced with the on-premise directory. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.native
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default).
    */
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.native
  // Postal code of the address for the organization.
  var postalCode: js.UndefOr[String] = js.native
  // The preferred language for the organization. Should follow ISO 639-1 Code; for example 'en'.
  var preferredLanguage: js.UndefOr[String] = js.native
  // The privacy profile of an organization.
  var privacyProfile: js.UndefOr[PrivacyProfile] = js.native
  // Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.native
  var securityComplianceNotificationMails: js.UndefOr[js.Array[String]] = js.native
  var securityComplianceNotificationPhones: js.UndefOr[js.Array[String]] = js.native
  // State name of the address for the organization.
  var state: js.UndefOr[String] = js.native
  // Street name of the address for organization.
  var street: js.UndefOr[String] = js.native
  // Not nullable.
  var technicalNotificationMails: js.UndefOr[js.Array[String]] = js.native
  // The collection of domains associated with this tenant. Not nullable.
  var verifiedDomains: js.UndefOr[js.Array[VerifiedDomain]] = js.native
}

object Organization {
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  @scala.inline
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedPlans(value: js.Array[AssignedPlan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedPlans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedPlans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedPlans")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessPhones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessPhones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessPhones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessPhones")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateBasedAuthConfiguration(value: js.Array[CertificateBasedAuthConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateBasedAuthConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateBasedAuthConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateBasedAuthConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryLetterCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryLetterCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryLetterCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryLetterCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
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
    def withExtensions(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketingNotificationEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingNotificationEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketingNotificationEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingNotificationEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileDeviceManagementAuthority(value: MdmAuthority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDeviceManagementAuthority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileDeviceManagementAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDeviceManagementAuthority")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesLastSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesLastSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesLastSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesLastSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesSyncEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesSyncEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSyncEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(js.undefined)
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
    def withPrivacyProfile(value: PrivacyProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedPlans(value: js.Array[ProvisionedPlan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionedPlans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedPlans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionedPlans")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityComplianceNotificationMails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityComplianceNotificationMails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityComplianceNotificationMails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityComplianceNotificationMails")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityComplianceNotificationPhones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityComplianceNotificationPhones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityComplianceNotificationPhones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityComplianceNotificationPhones")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
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
    def withStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(js.undefined)
        ret
    }
    @scala.inline
    def withTechnicalNotificationMails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("technicalNotificationMails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTechnicalNotificationMails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("technicalNotificationMails")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifiedDomains(value: js.Array[VerifiedDomain]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifiedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifiedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifiedDomains")(js.undefined)
        ret
    }
  }
  
}

