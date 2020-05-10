package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends DirectoryObject {
  // A freeform text entry field for the user to describe themselves.
  var aboutMe: js.UndefOr[String] = js.native
  // true if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
  var accountEnabled: js.UndefOr[Boolean] = js.native
  // The user's activities across devices. Read-only. Nullable.
  var activities: js.UndefOr[js.Array[UserActivity]] = js.native
  /**
    * Sets the age group of the user. Allowed values: null, minor, notAdult and adult. Refer to the legal age group property
    * definitions for further information.
    */
  var ageGroup: js.UndefOr[String] = js.native
  // The licenses that are assigned to the user. Not nullable.
  var assignedLicenses: js.UndefOr[js.Array[AssignedLicense]] = js.native
  // The plans that are assigned to the user. Read-only. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.native
  /**
    * The birthday of the user. The Timestamp type represents date and time information using ISO 8601 format and is always
    * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var birthday: js.UndefOr[String] = js.native
  /**
    * The telephone numbers for the user. NOTE: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  // The user's primary calendar. Read-only.
  var calendar: js.UndefOr[Calendar] = js.native
  // The user's calendar groups. Read-only. Nullable.
  var calendarGroups: js.UndefOr[js.Array[CalendarGroup]] = js.native
  // The calendar view for the calendar. Read-only. Nullable.
  var calendarView: js.UndefOr[js.Array[Event]] = js.native
  // The user's calendars. Read-only. Nullable.
  var calendars: js.UndefOr[js.Array[Calendar]] = js.native
  // The city in which the user is located. Supports $filter.
  var city: js.UndefOr[String] = js.native
  /**
    * The company name which the user is associated. This property can be useful for describing the company that an external
    * user comes from.
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Sets whether consent has been obtained for minors. Allowed values: null, granted, denied and notRequired. Refer to the
    * legal age group property definitions for further information.
    */
  var consentProvidedForMinor: js.UndefOr[String] = js.native
  // The user's contacts folders. Read-only. Nullable.
  var contactFolders: js.UndefOr[js.Array[ContactFolder]] = js.native
  // The user's contacts. Read-only. Nullable.
  var contacts: js.UndefOr[js.Array[Contact]] = js.native
  // The country/region in which the user is located; for example, 'US' or 'UK'. Supports $filter.
  var country: js.UndefOr[String] = js.native
  // Directory objects that were created by the user. Read-only. Nullable.
  var createdObjects: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // The name for the department in which the user works. Supports $filter.
  var department: js.UndefOr[String] = js.native
  // The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
  var deviceEnrollmentLimit: js.UndefOr[Double] = js.native
  // The list of troubleshooting events for this user.
  var deviceManagementTroubleshootingEvents: js.UndefOr[js.Array[DeviceManagementTroubleshootingEvent]] = js.native
  /**
    * The users and contacts that report to the user. (The users and contacts that have their manager property set to this
    * user.) Read-only. Nullable.
    */
  var directReports: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle
    * initial and last name. This property is required when a user is created and it cannot be cleared during updates.
    * Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[String] = js.native
  // The user's OneDrive. Read-only.
  var drive: js.UndefOr[Drive] = js.native
  // A collection of drives available for this user. Read-only.
  var drives: js.UndefOr[js.Array[Drive]] = js.native
  // The employee identifier assigned to the user by the organization. Supports $filter.
  var employeeId: js.UndefOr[String] = js.native
  // The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable.
  var events: js.UndefOr[js.Array[Event]] = js.native
  // The collection of open extensions defined for the user. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  // The fax number of the user.
  var faxNumber: js.UndefOr[String] = js.native
  // The given name (first name) of the user. Supports $filter.
  var givenName: js.UndefOr[String] = js.native
  /**
    * The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always
    * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var hireDate: js.UndefOr[String] = js.native
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only.
  var imAddresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Relevance classification of the user's messages based on explicit designations which override inferred relevance or
    * importance.
    */
  var inferenceClassification: js.UndefOr[InferenceClassification] = js.native
  var insights: js.UndefOr[OfficeGraphInsights] = js.native
  // A list for the user to describe their interests.
  var interests: js.UndefOr[js.Array[String]] = js.native
  // true if the user is a resource account; otherwise, false. Null value should be considered false.
  var isResourceAccount: js.UndefOr[Boolean] = js.native
  // The user’s job title. Supports $filter.
  var jobTitle: js.UndefOr[String] = js.native
  var joinedTeams: js.UndefOr[js.Array[Group]] = js.native
  /**
    * Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated
    * based on ageGroup and consentProvidedForMinor properties. Allowed values: null, minorWithOutParentalConsent,
    * minorWithParentalConsent, minorNoParentalConsentRequired, notAdult and adult. Refer to the legal age group property
    * definitions for further information.)
    */
  var legalAgeGroupClassification: js.UndefOr[String] = js.native
  // State of license assignments for this user. Read-only.
  var licenseAssignmentStates: js.UndefOr[js.Array[LicenseAssignmentState]] = js.native
  // A collection of this user's license details. Read-only.
  var licenseDetails: js.UndefOr[js.Array[LicenseDetails]] = js.native
  // The SMTP address for the user, for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports $filter.
  var mail: js.UndefOr[String] = js.native
  // The user's mail folders. Read-only. Nullable.
  var mailFolders: js.UndefOr[js.Array[MailFolder]] = js.native
  // The mail alias for the user. This property must be specified when a user is created. Supports $filter.
  var mailNickname: js.UndefOr[String] = js.native
  /**
    * Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to
    * incoming messages, locale and time zone.
    */
  var mailboxSettings: js.UndefOr[MailboxSettings] = js.native
  // Zero or more managed app registrations that belong to the user.
  var managedAppRegistrations: js.UndefOr[js.Array[ManagedAppRegistration]] = js.native
  // The managed devices associated with the user.
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.native
  // The user or contact that is this user’s manager. Read-only. (HTTP Methods: GET, PUT, DELETE.)
  var manager: js.UndefOr[DirectoryObject] = js.native
  // The groups and directory roles that the user is a member of. Read-only. Nullable.
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // The messages in a mailbox or folder. Read-only. Nullable.
  var messages: js.UndefOr[js.Array[Message]] = js.native
  // The primary cellular telephone number for the user.
  var mobilePhone: js.UndefOr[String] = js.native
  // The URL for the user's personal site.
  var mySite: js.UndefOr[String] = js.native
  // The office location in the user's place of business.
  var officeLocation: js.UndefOr[String] = js.native
  /**
    * Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who
    * are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesDistinguishedName: js.UndefOr[String] = js.native
  /**
    * Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The
    * property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory
    * via Azure AD Connect. Read-only.
    */
  var onPremisesDomainName: js.UndefOr[String] = js.native
  /**
    * Contains extensionAttributes 1-15 for the user. Note that the individual extension attributes are neither selectable
    * nor filterable. For an onPremisesSyncEnabled user, this set of properties is mastered on-premises and is read-only. For
    * a cloud-only user (where onPremisesSyncEnabled is false), these properties may be set during creation or update.
    */
  var onPremisesExtensionAttributes: js.UndefOr[OnPremisesExtensionAttributes] = js.native
  /**
    * This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This
    * property must be specified when creating a new user account in the Graph if you are using a federated domain for the
    * user’s userPrincipalName (UPN) property. Important: The $ and _ characters cannot be used when specifying this
    * property. Supports $filter.
    */
  var onPremisesImmutableId: js.UndefOr[String] = js.native
  /**
    * Indicates the last time at which the object was synced with the on-premises directory; for example:
    * '2013-02-16T03:04:54Z'. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.native
  // Errors when using Microsoft synchronization product during provisioning.
  var onPremisesProvisioningErrors: js.UndefOr[js.Array[OnPremisesProvisioningError]] = js.native
  /**
    * Contains the on-premises samAccountName synchronized from the on-premises directory. The property is only populated for
    * customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesSamAccountName: js.UndefOr[String] = js.native
  /**
    * Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud.
    * Read-only.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[String] = js.native
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only
    */
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated
    * for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.
    * Read-only.
    */
  var onPremisesUserPrincipalName: js.UndefOr[String] = js.native
  // Read-only.
  var onenote: js.UndefOr[Onenote] = js.native
  var onlineMeetings: js.UndefOr[js.Array[OnlineMeeting]] = js.native
  /**
    * A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com']. Supports
    * $filter.
    */
  var otherMails: js.UndefOr[js.Array[String]] = js.native
  // Read-only.
  var outlook: js.UndefOr[OutlookUser] = js.native
  // Devices that are owned by the user. Read-only. Nullable.
  var ownedDevices: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // Directory objects that are owned by the user. Read-only. Nullable.
  var ownedObjects: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Specifies password policies for the user. This value is an enumeration with one possible value being
    * 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified.
    * 'DisablePasswordExpiration' can also be specified. The two may be specified together; for example:
    * 'DisablePasswordExpiration, DisableStrongPassword'.
    */
  var passwordPolicies: js.UndefOr[String] = js.native
  /**
    * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a
    * user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies
    * property. By default, a strong password is required.
    */
  var passwordProfile: js.UndefOr[PasswordProfile] = js.native
  // A list for the user to enumerate their past projects.
  var pastProjects: js.UndefOr[js.Array[String]] = js.native
  // People that are relevant to the user. Read-only. Nullable.
  var people: js.UndefOr[js.Array[Person]] = js.native
  // The user's profile photo. Read-only.
  var photo: js.UndefOr[ProfilePhoto] = js.native
  var photos: js.UndefOr[js.Array[ProfilePhoto]] = js.native
  // Entry-point to the Planner resource that might exist for a user. Read-only.
  var planner: js.UndefOr[PlannerUser] = js.native
  /**
    * The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United
    * States of America, this attribute contains the ZIP code.
    */
  var postalCode: js.UndefOr[String] = js.native
  // The preferred language for the user. Should follow ISO 639-1 Code; for example 'en-US'.
  var preferredLanguage: js.UndefOr[String] = js.native
  // The preferred name for the user.
  var preferredName: js.UndefOr[String] = js.native
  // The plans that are provisioned for the user. Read-only. Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.native
  /**
    * For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'] The any operator is required for filter
    * expressions on multi-valued properties. Read-only, Not nullable. Supports $filter.
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.native
  // Devices that are registered for the user. Read-only. Nullable.
  var registeredDevices: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // A list for the user to enumerate their responsibilities.
  var responsibilities: js.UndefOr[js.Array[String]] = js.native
  // A list for the user to enumerate the schools they have attended.
  var schools: js.UndefOr[js.Array[String]] = js.native
  var settings: js.UndefOr[UserSettings] = js.native
  /**
    * true if the Outlook global address list should contain this user, otherwise false. If not set, this will be treated as
    * true. For users invited through the invitation manager, this property will be set to false.
    */
  var showInAddressList: js.UndefOr[Boolean] = js.native
  /**
    * Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get
    * an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as
    * Microsoft Graph). If this happens, the application will need to acquire a new refresh token by making a request to the
    * authorize endpoint. Read-only. Use revokeSignInSessions to reset.
    */
  var signInSessionsValidFromDateTime: js.UndefOr[String] = js.native
  // A list for the user to enumerate their skills.
  var skills: js.UndefOr[js.Array[String]] = js.native
  // The state or province in the user's address. Supports $filter.
  var state: js.UndefOr[String] = js.native
  // The street address of the user's place of business.
  var streetAddress: js.UndefOr[String] = js.native
  // The user's surname (family name or last name). Supports $filter.
  var surname: js.UndefOr[String] = js.native
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal
    * requirement to check for availability of services in countries. Examples include: 'US', 'JP', and 'GB'. Not nullable.
    * Supports $filter.
    */
  var usageLocation: js.UndefOr[String] = js.native
  /**
    * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet
    * standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where
    * domain must be present in the tenant’s collection of verified domains. This property is required when a user is
    * created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.
    * Supports $filter and $orderby.
    */
  var userPrincipalName: js.UndefOr[String] = js.native
  /**
    * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports
    * $filter.
    */
  var userType: js.UndefOr[String] = js.native
}

object User {
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAboutMe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboutMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAboutMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboutMe")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withActivities(value: js.Array[UserActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(js.undefined)
        ret
    }
    @scala.inline
    def withAgeGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignedLicenses(value: js.Array[AssignedLicense]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedLicenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedLicenses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedLicenses")(js.undefined)
        ret
    }
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
    def withBirthday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBirthday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthday")(js.undefined)
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
    def withCalendar(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarGroups(value: js.Array[CalendarGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarView(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarView")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendars(value: js.Array[Calendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(js.undefined)
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
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(js.undefined)
        ret
    }
    @scala.inline
    def withConsentProvidedForMinor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consentProvidedForMinor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsentProvidedForMinor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consentProvidedForMinor")(js.undefined)
        ret
    }
    @scala.inline
    def withContactFolders(value: js.Array[ContactFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withContacts(value: js.Array[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(js.undefined)
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
    def withCreatedObjects(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withDepartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceEnrollmentLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceEnrollmentLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceEnrollmentLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceEnrollmentLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceManagementTroubleshootingEvents(value: js.Array[DeviceManagementTroubleshootingEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManagementTroubleshootingEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceManagementTroubleshootingEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManagementTroubleshootingEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectReports(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directReports")(js.undefined)
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
    def withDrive(value: Drive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drive")(js.undefined)
        ret
    }
    @scala.inline
    def withDrives(value: js.Array[Drive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drives")(js.undefined)
        ret
    }
    @scala.inline
    def withEmployeeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("employeeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmployeeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("employeeId")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
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
    def withFaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaxNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faxNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
        ret
    }
    @scala.inline
    def withHireDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hireDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHireDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hireDate")(js.undefined)
        ret
    }
    @scala.inline
    def withImAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withInferenceClassification(value: InferenceClassification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceClassification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferenceClassification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceClassification")(js.undefined)
        ret
    }
    @scala.inline
    def withInsights(value: OfficeGraphInsights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insights")(js.undefined)
        ret
    }
    @scala.inline
    def withInterests(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interests")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResourceAccount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResourceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResourceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResourceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinedTeams(value: js.Array[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinedTeams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinedTeams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinedTeams")(js.undefined)
        ret
    }
    @scala.inline
    def withLegalAgeGroupClassification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalAgeGroupClassification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalAgeGroupClassification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalAgeGroupClassification")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseAssignmentStates(value: js.Array[LicenseAssignmentState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseAssignmentStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseAssignmentStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseAssignmentStates")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseDetails(value: js.Array[LicenseDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail")(js.undefined)
        ret
    }
    @scala.inline
    def withMailFolders(value: js.Array[MailFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withMailNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailNickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailNickname")(js.undefined)
        ret
    }
    @scala.inline
    def withMailboxSettings(value: MailboxSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailboxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailboxSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailboxSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedAppRegistrations(value: js.Array[ManagedAppRegistration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAppRegistrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedAppRegistrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAppRegistrations")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedDevices(value: js.Array[ManagedDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withManager(value: DirectoryObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberOf(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMobilePhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobilePhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhone")(js.undefined)
        ret
    }
    @scala.inline
    def withMySite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mySite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMySite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mySite")(js.undefined)
        ret
    }
    @scala.inline
    def withOfficeLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officeLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfficeLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officeLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesDistinguishedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesDistinguishedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesDistinguishedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesDistinguishedName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesDomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesExtensionAttributes(value: OnPremisesExtensionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesExtensionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesExtensionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesExtensionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesImmutableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesImmutableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesImmutableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesImmutableId")(js.undefined)
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
    def withOnPremisesProvisioningErrors(value: js.Array[OnPremisesProvisioningError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesProvisioningErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesProvisioningErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesProvisioningErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesSamAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSamAccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesSamAccountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSamAccountName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesSecurityIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSecurityIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesSecurityIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSecurityIdentifier")(js.undefined)
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
    def withOnPremisesUserPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesUserPrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesUserPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesUserPrincipalName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnenote(value: Onenote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onenote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnenote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onenote")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlineMeetings(value: js.Array[OnlineMeeting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineMeetings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlineMeetings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineMeetings")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherMails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherMails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherMails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherMails")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlook(value: OutlookUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlook")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnedDevices(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnedDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnedObjects(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnedObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordPolicies(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordProfile(value: PasswordProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withPastProjects(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastProjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPastProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastProjects")(js.undefined)
        ret
    }
    @scala.inline
    def withPeople(value: js.Array[Person]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeople: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: ProfilePhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[ProfilePhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanner(value: PlannerUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planner")(js.undefined)
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
    def withPreferredName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredName")(js.undefined)
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
    def withProxyAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredDevices(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsibilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsibilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsibilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsibilities")(js.undefined)
        ret
    }
    @scala.inline
    def withSchools(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schools")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: UserSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInAddressList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInAddressList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInAddressList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInAddressList")(js.undefined)
        ret
    }
    @scala.inline
    def withSignInSessionsValidFromDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInSessionsValidFromDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignInSessionsValidFromDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInSessionsValidFromDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSkills(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkills: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skills")(js.undefined)
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
    def withStreetAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSurname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitiveMemberOf(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMemberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitiveMemberOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMemberOf")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userType")(js.undefined)
        ret
    }
  }
  
}

