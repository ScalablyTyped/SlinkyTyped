package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends DirectoryObject {
  
  // A freeform text entry field for the user to describe themselves.
  var aboutMe: js.UndefOr[NullableOption[String]] = js.native
  
  // true if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
  var accountEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The user's activities across devices. Read-only. Nullable.
  var activities: js.UndefOr[NullableOption[js.Array[UserActivity]]] = js.native
  
  /**
    * Sets the age group of the user. Allowed values: null, minor, notAdult and adult. Refer to the legal age group property
    * definitions for further information.
    */
  var ageGroup: js.UndefOr[NullableOption[String]] = js.native
  
  var appRoleAssignments: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.native
  
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
    * property. Read-only for users synced from on-premises directory.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  
  // The user's primary calendar. Read-only.
  var calendar: js.UndefOr[NullableOption[Calendar]] = js.native
  
  // The user's calendar groups. Read-only. Nullable.
  var calendarGroups: js.UndefOr[NullableOption[js.Array[CalendarGroup]]] = js.native
  
  // The calendar view for the calendar. Read-only. Nullable.
  var calendarView: js.UndefOr[NullableOption[js.Array[Event]]] = js.native
  
  // The user's calendars. Read-only. Nullable.
  var calendars: js.UndefOr[NullableOption[js.Array[Calendar]]] = js.native
  
  // The city in which the user is located. Supports $filter.
  var city: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The company name which the user is associated. This property can be useful for describing the company that an external
    * user comes from. The maximum length of the company name is 64 chararcters.Returned only on $select.
    */
  var companyName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Sets whether consent has been obtained for minors. Allowed values: null, granted, denied and notRequired. Refer to the
    * legal age group property definitions for further information.
    */
  var consentProvidedForMinor: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's contacts folders. Read-only. Nullable.
  var contactFolders: js.UndefOr[NullableOption[js.Array[ContactFolder]]] = js.native
  
  // The user's contacts. Read-only. Nullable.
  var contacts: js.UndefOr[NullableOption[js.Array[Contact]]] = js.native
  
  // The country/region in which the user is located; for example, 'US' or 'UK'. Supports $filter.
  var country: js.UndefOr[NullableOption[String]] = js.native
  
  // The created date of the user object.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Directory objects that were created by the user. Read-only. Nullable.
  var createdObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Indicates whether the user account was created as a regular school or work account (null), an external account
    * (Invitation), a local account for an Azure Active Directory B2C tenant (LocalAccount) or self-service sign-up using
    * email verification (EmailVerified). Read-only.
    */
  var creationType: js.UndefOr[NullableOption[String]] = js.native
  
  // The name for the department in which the user works. Supports $filter.
  var department: js.UndefOr[NullableOption[String]] = js.native
  
  // The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
  var deviceEnrollmentLimit: js.UndefOr[Double] = js.native
  
  // The list of troubleshooting events for this user.
  var deviceManagementTroubleshootingEvents: js.UndefOr[NullableOption[js.Array[DeviceManagementTroubleshootingEvent]]] = js.native
  
  /**
    * The users and contacts that report to the user. (The users and contacts that have their manager property set to this
    * user.) Read-only. Nullable.
    */
  var directReports: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle
    * initial and last name. This property is required when a user is created and it cannot be cleared during updates.
    * Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's OneDrive. Read-only.
  var drive: js.UndefOr[NullableOption[Drive]] = js.native
  
  // A collection of drives available for this user. Read-only.
  var drives: js.UndefOr[NullableOption[js.Array[Drive]]] = js.native
  
  // The employee identifier assigned to the user by the organization. Returned only on $select. Supports $filter.
  var employeeId: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable.
  var events: js.UndefOr[NullableOption[js.Array[Event]]] = js.native
  
  // The collection of open extensions defined for the user. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  /**
    * For an external user invited to the tenant using the invitation API, this property represents the invited user's
    * invitation status. For invited users, the state can be PendingAcceptance or Accepted, or null for all other users.
    * Returned only on $select. Supports $filter with the supported values. For example: $filter=externalUserState eq
    * 'PendingAcceptance'.
    */
  var externalUserState: js.UndefOr[NullableOption[String]] = js.native
  
  // Shows the timestamp for the latest change to the externalUserState property. Returned only on $select.
  var externalUserStateChangeDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The fax number of the user.
  var faxNumber: js.UndefOr[NullableOption[String]] = js.native
  
  var followedSites: js.UndefOr[NullableOption[js.Array[Site]]] = js.native
  
  // The given name (first name) of the user. Supports $filter.
  var givenName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always
    * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned only on
    * $select. Note: This property is specific to SharePoint Online. We recommend using the native employeeHireDate property
    * to set and update hire date values using Microsoft Graph APIs.
    */
  var hireDate: js.UndefOr[String] = js.native
  
  /**
    * Represents the identities that can be used to sign in to this user account. An identity can be provided by Microsoft
    * (also known as a local account), by organizations, or by social identity providers such as Facebook, Google, and
    * Microsoft, and tied to a user account. May contain multiple items with the same signInType value. Supports $filter.
    */
  var identities: js.UndefOr[NullableOption[js.Array[ObjectIdentity]]] = js.native
  
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only.
  var imAddresses: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Relevance classification of the user's messages based on explicit designations which override inferred relevance or
    * importance.
    */
  var inferenceClassification: js.UndefOr[NullableOption[InferenceClassification]] = js.native
  
  // Read-only. Nullable.
  var insights: js.UndefOr[NullableOption[OfficeGraphInsights]] = js.native
  
  // A list for the user to describe their interests.
  var interests: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Do not use – reserved for future use.
  var isResourceAccount: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The user's job title. Supports $filter.
  var jobTitle: js.UndefOr[NullableOption[String]] = js.native
  
  var joinedTeams: js.UndefOr[NullableOption[js.Array[Team]]] = js.native
  
  /**
    * The time when this Azure AD user last changed their password. The date and time information uses ISO 8601 format and is
    * always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastPasswordChangeDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated
    * based on ageGroup and consentProvidedForMinor properties. Allowed values: null, minorWithOutParentalConsent,
    * minorWithParentalConsent, minorNoParentalConsentRequired, notAdult and adult. Refer to the legal age group property
    * definitions for further information.)
    */
  var legalAgeGroupClassification: js.UndefOr[NullableOption[String]] = js.native
  
  // State of license assignments for this user. Read-only.
  var licenseAssignmentStates: js.UndefOr[NullableOption[js.Array[LicenseAssignmentState]]] = js.native
  
  // A collection of this user's license details. Read-only.
  var licenseDetails: js.UndefOr[NullableOption[js.Array[LicenseDetails]]] = js.native
  
  // The SMTP address for the user, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter.
  var mail: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's mail folders. Read-only. Nullable.
  var mailFolders: js.UndefOr[NullableOption[js.Array[MailFolder]]] = js.native
  
  // The mail alias for the user. This property must be specified when a user is created. Supports $filter.
  var mailNickname: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to
    * incoming messages, locale and time zone.
    */
  var mailboxSettings: js.UndefOr[NullableOption[MailboxSettings]] = js.native
  
  // Zero or more managed app registrations that belong to the user.
  var managedAppRegistrations: js.UndefOr[NullableOption[js.Array[ManagedAppRegistration]]] = js.native
  
  // The managed devices associated with the user.
  var managedDevices: js.UndefOr[NullableOption[js.Array[ManagedDevice]]] = js.native
  
  // The user or contact that is this user's manager. Read-only. (HTTP Methods: GET, PUT, DELETE.)
  var manager: js.UndefOr[NullableOption[DirectoryObject]] = js.native
  
  // The groups and directory roles that the user is a member of. Read-only. Nullable.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // The messages in a mailbox or folder. Read-only. Nullable.
  var messages: js.UndefOr[NullableOption[js.Array[Message]]] = js.native
  
  // The primary cellular telephone number for the user. Read-only for users synced from on-premises directory.
  var mobilePhone: js.UndefOr[NullableOption[String]] = js.native
  
  // The URL for the user's personal site.
  var mySite: js.UndefOr[NullableOption[String]] = js.native
  
  var oauth2PermissionGrants: js.UndefOr[NullableOption[js.Array[OAuth2PermissionGrant]]] = js.native
  
  // The office location in the user's place of business.
  var officeLocation: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who
    * are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesDistinguishedName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The
    * property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory
    * via Azure AD Connect. Read-only.
    */
  var onPremisesDomainName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains extensionAttributes 1-15 for the user. Note that the individual extension attributes are neither selectable
    * nor filterable. For an onPremisesSyncEnabled user, the source of authority for this set of properties is the
    * on-premises and is read-only. For a cloud-only user (where onPremisesSyncEnabled is false), these properties may be set
    * during creation or update. These extension attributes are also known as Exchange custom attributes 1-15.
    */
  var onPremisesExtensionAttributes: js.UndefOr[NullableOption[OnPremisesExtensionAttributes]] = js.native
  
  /**
    * This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This
    * property must be specified when creating a new user account in the Graph if you are using a federated domain for the
    * user's userPrincipalName (UPN) property. Important: The $ and _ characters cannot be used when specifying this
    * property. Supports $filter.
    */
  var onPremisesImmutableId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Indicates the last time at which the object was synced with the on-premises directory; for example:
    * '2013-02-16T03:04:54Z'. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Errors when using Microsoft synchronization product during provisioning.
  var onPremisesProvisioningErrors: js.UndefOr[NullableOption[js.Array[OnPremisesProvisioningError]]] = js.native
  
  /**
    * Contains the on-premises samAccountName synchronized from the on-premises directory. The property is only populated for
    * customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesSamAccountName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud.
    * Read-only.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated
    * for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.
    * Read-only.
    */
  var onPremisesUserPrincipalName: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only.
  var onenote: js.UndefOr[NullableOption[Onenote]] = js.native
  
  var onlineMeetings: js.UndefOr[NullableOption[js.Array[OnlineMeeting]]] = js.native
  
  /**
    * A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com']. Supports
    * $filter.
    */
  var otherMails: js.UndefOr[js.Array[String]] = js.native
  
  // Read-only.
  var outlook: js.UndefOr[NullableOption[OutlookUser]] = js.native
  
  // Devices that are owned by the user. Read-only. Nullable.
  var ownedDevices: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // Directory objects that are owned by the user. Read-only. Nullable.
  var ownedObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Specifies password policies for the user. This value is an enumeration with one possible value being
    * 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified.
    * 'DisablePasswordExpiration' can also be specified. The two may be specified together; for example:
    * 'DisablePasswordExpiration, DisableStrongPassword'.
    */
  var passwordPolicies: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a
    * user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies
    * property. By default, a strong password is required.
    */
  var passwordProfile: js.UndefOr[NullableOption[PasswordProfile]] = js.native
  
  // A list for the user to enumerate their past projects.
  var pastProjects: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // People that are relevant to the user. Read-only. Nullable.
  var people: js.UndefOr[NullableOption[js.Array[Person]]] = js.native
  
  // The user's profile photo. Read-only.
  var photo: js.UndefOr[NullableOption[ProfilePhoto]] = js.native
  
  var photos: js.UndefOr[NullableOption[js.Array[ProfilePhoto]]] = js.native
  
  // Entry-point to the Planner resource that might exist for a user. Read-only.
  var planner: js.UndefOr[NullableOption[PlannerUser]] = js.native
  
  /**
    * The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United
    * States of America, this attribute contains the ZIP code.
    */
  var postalCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The preferred language for the user. Should follow ISO 639-1 Code; for example 'en-US'.
  var preferredLanguage: js.UndefOr[NullableOption[String]] = js.native
  
  // The preferred name for the user.
  var preferredName: js.UndefOr[NullableOption[String]] = js.native
  
  // The plans that are provisioned for the user. Read-only. Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.native
  
  /**
    * For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'] The any operator is required for filter
    * expressions on multi-valued properties. Read-only, Not nullable. Supports $filter.
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.native
  
  // Devices that are registered for the user. Read-only. Nullable.
  var registeredDevices: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // A list for the user to enumerate their responsibilities.
  var responsibilities: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // A list for the user to enumerate the schools they have attended.
  var schools: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var scopedRoleMemberOf: js.UndefOr[NullableOption[js.Array[ScopedRoleMembership]]] = js.native
  
  var settings: js.UndefOr[NullableOption[UserSettings]] = js.native
  
  /**
    * true if the Outlook global address list should contain this user, otherwise false. If not set, this will be treated as
    * true. For users invited through the invitation manager, this property will be set to false.
    */
  var showInAddressList: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get
    * an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as
    * Microsoft Graph). If this happens, the application will need to acquire a new refresh token by making a request to the
    * authorize endpoint. Read-only. Use revokeSignInSessions to reset.
    */
  var signInSessionsValidFromDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // A list for the user to enumerate their skills.
  var skills: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // The state or province in the user's address. Supports $filter.
  var state: js.UndefOr[NullableOption[String]] = js.native
  
  // The street address of the user's place of business.
  var streetAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's surname (family name or last name). Supports $filter.
  var surname: js.UndefOr[NullableOption[String]] = js.native
  
  var teamwork: js.UndefOr[NullableOption[UserTeamwork]] = js.native
  
  // Represents the To Do services available to a user.
  var todo: js.UndefOr[NullableOption[Todo]] = js.native
  
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal
    * requirement to check for availability of services in countries. Examples include: 'US', 'JP', and 'GB'. Not nullable.
    * Supports $filter.
    */
  var usageLocation: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet
    * standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where
    * domain must be present in the tenant's collection of verified domains. This property is required when a user is
    * created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.
    * Supports $filter and $orderby.
    */
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports
    * $filter.
    */
  var userType: js.UndefOr[NullableOption[String]] = js.native
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAboutMe(value: NullableOption[String]): Self = StObject.set(x, "aboutMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutMeNull: Self = StObject.set(x, "aboutMe", null)
    
    @scala.inline
    def setAboutMeUndefined: Self = StObject.set(x, "aboutMe", js.undefined)
    
    @scala.inline
    def setAccountEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "accountEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountEnabledNull: Self = StObject.set(x, "accountEnabled", null)
    
    @scala.inline
    def setAccountEnabledUndefined: Self = StObject.set(x, "accountEnabled", js.undefined)
    
    @scala.inline
    def setActivities(value: NullableOption[js.Array[UserActivity]]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesNull: Self = StObject.set(x, "activities", null)
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: UserActivity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setAgeGroup(value: NullableOption[String]): Self = StObject.set(x, "ageGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeGroupNull: Self = StObject.set(x, "ageGroup", null)
    
    @scala.inline
    def setAgeGroupUndefined: Self = StObject.set(x, "ageGroup", js.undefined)
    
    @scala.inline
    def setAppRoleAssignments(value: NullableOption[js.Array[AppRoleAssignment]]): Self = StObject.set(x, "appRoleAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRoleAssignmentsNull: Self = StObject.set(x, "appRoleAssignments", null)
    
    @scala.inline
    def setAppRoleAssignmentsUndefined: Self = StObject.set(x, "appRoleAssignments", js.undefined)
    
    @scala.inline
    def setAppRoleAssignmentsVarargs(value: AppRoleAssignment*): Self = StObject.set(x, "appRoleAssignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignedLicenses(value: js.Array[AssignedLicense]): Self = StObject.set(x, "assignedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedLicensesUndefined: Self = StObject.set(x, "assignedLicenses", js.undefined)
    
    @scala.inline
    def setAssignedLicensesVarargs(value: AssignedLicense*): Self = StObject.set(x, "assignedLicenses", js.Array(value :_*))
    
    @scala.inline
    def setAssignedPlans(value: js.Array[AssignedPlan]): Self = StObject.set(x, "assignedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedPlansUndefined: Self = StObject.set(x, "assignedPlans", js.undefined)
    
    @scala.inline
    def setAssignedPlansVarargs(value: AssignedPlan*): Self = StObject.set(x, "assignedPlans", js.Array(value :_*))
    
    @scala.inline
    def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    @scala.inline
    def setBusinessPhones(value: js.Array[String]): Self = StObject.set(x, "businessPhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessPhonesUndefined: Self = StObject.set(x, "businessPhones", js.undefined)
    
    @scala.inline
    def setBusinessPhonesVarargs(value: String*): Self = StObject.set(x, "businessPhones", js.Array(value :_*))
    
    @scala.inline
    def setCalendar(value: NullableOption[Calendar]): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarGroups(value: NullableOption[js.Array[CalendarGroup]]): Self = StObject.set(x, "calendarGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarGroupsNull: Self = StObject.set(x, "calendarGroups", null)
    
    @scala.inline
    def setCalendarGroupsUndefined: Self = StObject.set(x, "calendarGroups", js.undefined)
    
    @scala.inline
    def setCalendarGroupsVarargs(value: CalendarGroup*): Self = StObject.set(x, "calendarGroups", js.Array(value :_*))
    
    @scala.inline
    def setCalendarNull: Self = StObject.set(x, "calendar", null)
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setCalendarView(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "calendarView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarViewNull: Self = StObject.set(x, "calendarView", null)
    
    @scala.inline
    def setCalendarViewUndefined: Self = StObject.set(x, "calendarView", js.undefined)
    
    @scala.inline
    def setCalendarViewVarargs(value: Event*): Self = StObject.set(x, "calendarView", js.Array(value :_*))
    
    @scala.inline
    def setCalendars(value: NullableOption[js.Array[Calendar]]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsNull: Self = StObject.set(x, "calendars", null)
    
    @scala.inline
    def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    @scala.inline
    def setCalendarsVarargs(value: Calendar*): Self = StObject.set(x, "calendars", js.Array(value :_*))
    
    @scala.inline
    def setCity(value: NullableOption[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityNull: Self = StObject.set(x, "city", null)
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCompanyName(value: NullableOption[String]): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameNull: Self = StObject.set(x, "companyName", null)
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    @scala.inline
    def setConsentProvidedForMinor(value: NullableOption[String]): Self = StObject.set(x, "consentProvidedForMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsentProvidedForMinorNull: Self = StObject.set(x, "consentProvidedForMinor", null)
    
    @scala.inline
    def setConsentProvidedForMinorUndefined: Self = StObject.set(x, "consentProvidedForMinor", js.undefined)
    
    @scala.inline
    def setContactFolders(value: NullableOption[js.Array[ContactFolder]]): Self = StObject.set(x, "contactFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactFoldersNull: Self = StObject.set(x, "contactFolders", null)
    
    @scala.inline
    def setContactFoldersUndefined: Self = StObject.set(x, "contactFolders", js.undefined)
    
    @scala.inline
    def setContactFoldersVarargs(value: ContactFolder*): Self = StObject.set(x, "contactFolders", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: NullableOption[js.Array[Contact]]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactsNull: Self = StObject.set(x, "contacts", null)
    
    @scala.inline
    def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = StObject.set(x, "contacts", js.Array(value :_*))
    
    @scala.inline
    def setCountry(value: NullableOption[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNull: Self = StObject.set(x, "country", null)
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "createdObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedObjectsNull: Self = StObject.set(x, "createdObjects", null)
    
    @scala.inline
    def setCreatedObjectsUndefined: Self = StObject.set(x, "createdObjects", js.undefined)
    
    @scala.inline
    def setCreatedObjectsVarargs(value: DirectoryObject*): Self = StObject.set(x, "createdObjects", js.Array(value :_*))
    
    @scala.inline
    def setCreationType(value: NullableOption[String]): Self = StObject.set(x, "creationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTypeNull: Self = StObject.set(x, "creationType", null)
    
    @scala.inline
    def setCreationTypeUndefined: Self = StObject.set(x, "creationType", js.undefined)
    
    @scala.inline
    def setDepartment(value: NullableOption[String]): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentNull: Self = StObject.set(x, "department", null)
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setDeviceEnrollmentLimit(value: Double): Self = StObject.set(x, "deviceEnrollmentLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceEnrollmentLimitUndefined: Self = StObject.set(x, "deviceEnrollmentLimit", js.undefined)
    
    @scala.inline
    def setDeviceManagementTroubleshootingEvents(value: NullableOption[js.Array[DeviceManagementTroubleshootingEvent]]): Self = StObject.set(x, "deviceManagementTroubleshootingEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceManagementTroubleshootingEventsNull: Self = StObject.set(x, "deviceManagementTroubleshootingEvents", null)
    
    @scala.inline
    def setDeviceManagementTroubleshootingEventsUndefined: Self = StObject.set(x, "deviceManagementTroubleshootingEvents", js.undefined)
    
    @scala.inline
    def setDeviceManagementTroubleshootingEventsVarargs(value: DeviceManagementTroubleshootingEvent*): Self = StObject.set(x, "deviceManagementTroubleshootingEvents", js.Array(value :_*))
    
    @scala.inline
    def setDirectReports(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "directReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectReportsNull: Self = StObject.set(x, "directReports", null)
    
    @scala.inline
    def setDirectReportsUndefined: Self = StObject.set(x, "directReports", js.undefined)
    
    @scala.inline
    def setDirectReportsVarargs(value: DirectoryObject*): Self = StObject.set(x, "directReports", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDrive(value: NullableOption[Drive]): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveNull: Self = StObject.set(x, "drive", null)
    
    @scala.inline
    def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    @scala.inline
    def setDrives(value: NullableOption[js.Array[Drive]]): Self = StObject.set(x, "drives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrivesNull: Self = StObject.set(x, "drives", null)
    
    @scala.inline
    def setDrivesUndefined: Self = StObject.set(x, "drives", js.undefined)
    
    @scala.inline
    def setDrivesVarargs(value: Drive*): Self = StObject.set(x, "drives", js.Array(value :_*))
    
    @scala.inline
    def setEmployeeId(value: NullableOption[String]): Self = StObject.set(x, "employeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmployeeIdNull: Self = StObject.set(x, "employeeId", null)
    
    @scala.inline
    def setEmployeeIdUndefined: Self = StObject.set(x, "employeeId", js.undefined)
    
    @scala.inline
    def setEvents(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsNull: Self = StObject.set(x, "events", null)
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setExternalUserState(value: NullableOption[String]): Self = StObject.set(x, "externalUserState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUserStateChangeDateTime(value: NullableOption[String]): Self = StObject.set(x, "externalUserStateChangeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUserStateChangeDateTimeNull: Self = StObject.set(x, "externalUserStateChangeDateTime", null)
    
    @scala.inline
    def setExternalUserStateChangeDateTimeUndefined: Self = StObject.set(x, "externalUserStateChangeDateTime", js.undefined)
    
    @scala.inline
    def setExternalUserStateNull: Self = StObject.set(x, "externalUserState", null)
    
    @scala.inline
    def setExternalUserStateUndefined: Self = StObject.set(x, "externalUserState", js.undefined)
    
    @scala.inline
    def setFaxNumber(value: NullableOption[String]): Self = StObject.set(x, "faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumberNull: Self = StObject.set(x, "faxNumber", null)
    
    @scala.inline
    def setFaxNumberUndefined: Self = StObject.set(x, "faxNumber", js.undefined)
    
    @scala.inline
    def setFollowedSites(value: NullableOption[js.Array[Site]]): Self = StObject.set(x, "followedSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowedSitesNull: Self = StObject.set(x, "followedSites", null)
    
    @scala.inline
    def setFollowedSitesUndefined: Self = StObject.set(x, "followedSites", js.undefined)
    
    @scala.inline
    def setFollowedSitesVarargs(value: Site*): Self = StObject.set(x, "followedSites", js.Array(value :_*))
    
    @scala.inline
    def setGivenName(value: NullableOption[String]): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    @scala.inline
    def setHireDate(value: String): Self = StObject.set(x, "hireDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHireDateUndefined: Self = StObject.set(x, "hireDate", js.undefined)
    
    @scala.inline
    def setIdentities(value: NullableOption[js.Array[ObjectIdentity]]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesNull: Self = StObject.set(x, "identities", null)
    
    @scala.inline
    def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    @scala.inline
    def setIdentitiesVarargs(value: ObjectIdentity*): Self = StObject.set(x, "identities", js.Array(value :_*))
    
    @scala.inline
    def setImAddresses(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "imAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImAddressesNull: Self = StObject.set(x, "imAddresses", null)
    
    @scala.inline
    def setImAddressesUndefined: Self = StObject.set(x, "imAddresses", js.undefined)
    
    @scala.inline
    def setImAddressesVarargs(value: String*): Self = StObject.set(x, "imAddresses", js.Array(value :_*))
    
    @scala.inline
    def setInferenceClassification(value: NullableOption[InferenceClassification]): Self = StObject.set(x, "inferenceClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceClassificationNull: Self = StObject.set(x, "inferenceClassification", null)
    
    @scala.inline
    def setInferenceClassificationUndefined: Self = StObject.set(x, "inferenceClassification", js.undefined)
    
    @scala.inline
    def setInsights(value: NullableOption[OfficeGraphInsights]): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsNull: Self = StObject.set(x, "insights", null)
    
    @scala.inline
    def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
    
    @scala.inline
    def setInterests(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "interests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterestsNull: Self = StObject.set(x, "interests", null)
    
    @scala.inline
    def setInterestsUndefined: Self = StObject.set(x, "interests", js.undefined)
    
    @scala.inline
    def setInterestsVarargs(value: String*): Self = StObject.set(x, "interests", js.Array(value :_*))
    
    @scala.inline
    def setIsResourceAccount(value: NullableOption[Boolean]): Self = StObject.set(x, "isResourceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResourceAccountNull: Self = StObject.set(x, "isResourceAccount", null)
    
    @scala.inline
    def setIsResourceAccountUndefined: Self = StObject.set(x, "isResourceAccount", js.undefined)
    
    @scala.inline
    def setJobTitle(value: NullableOption[String]): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitleNull: Self = StObject.set(x, "jobTitle", null)
    
    @scala.inline
    def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    @scala.inline
    def setJoinedTeams(value: NullableOption[js.Array[Team]]): Self = StObject.set(x, "joinedTeams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinedTeamsNull: Self = StObject.set(x, "joinedTeams", null)
    
    @scala.inline
    def setJoinedTeamsUndefined: Self = StObject.set(x, "joinedTeams", js.undefined)
    
    @scala.inline
    def setJoinedTeamsVarargs(value: Team*): Self = StObject.set(x, "joinedTeams", js.Array(value :_*))
    
    @scala.inline
    def setLastPasswordChangeDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastPasswordChangeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPasswordChangeDateTimeNull: Self = StObject.set(x, "lastPasswordChangeDateTime", null)
    
    @scala.inline
    def setLastPasswordChangeDateTimeUndefined: Self = StObject.set(x, "lastPasswordChangeDateTime", js.undefined)
    
    @scala.inline
    def setLegalAgeGroupClassification(value: NullableOption[String]): Self = StObject.set(x, "legalAgeGroupClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalAgeGroupClassificationNull: Self = StObject.set(x, "legalAgeGroupClassification", null)
    
    @scala.inline
    def setLegalAgeGroupClassificationUndefined: Self = StObject.set(x, "legalAgeGroupClassification", js.undefined)
    
    @scala.inline
    def setLicenseAssignmentStates(value: NullableOption[js.Array[LicenseAssignmentState]]): Self = StObject.set(x, "licenseAssignmentStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseAssignmentStatesNull: Self = StObject.set(x, "licenseAssignmentStates", null)
    
    @scala.inline
    def setLicenseAssignmentStatesUndefined: Self = StObject.set(x, "licenseAssignmentStates", js.undefined)
    
    @scala.inline
    def setLicenseAssignmentStatesVarargs(value: LicenseAssignmentState*): Self = StObject.set(x, "licenseAssignmentStates", js.Array(value :_*))
    
    @scala.inline
    def setLicenseDetails(value: NullableOption[js.Array[LicenseDetails]]): Self = StObject.set(x, "licenseDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseDetailsNull: Self = StObject.set(x, "licenseDetails", null)
    
    @scala.inline
    def setLicenseDetailsUndefined: Self = StObject.set(x, "licenseDetails", js.undefined)
    
    @scala.inline
    def setLicenseDetailsVarargs(value: LicenseDetails*): Self = StObject.set(x, "licenseDetails", js.Array(value :_*))
    
    @scala.inline
    def setMail(value: NullableOption[String]): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailFolders(value: NullableOption[js.Array[MailFolder]]): Self = StObject.set(x, "mailFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailFoldersNull: Self = StObject.set(x, "mailFolders", null)
    
    @scala.inline
    def setMailFoldersUndefined: Self = StObject.set(x, "mailFolders", js.undefined)
    
    @scala.inline
    def setMailFoldersVarargs(value: MailFolder*): Self = StObject.set(x, "mailFolders", js.Array(value :_*))
    
    @scala.inline
    def setMailNickname(value: NullableOption[String]): Self = StObject.set(x, "mailNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailNicknameNull: Self = StObject.set(x, "mailNickname", null)
    
    @scala.inline
    def setMailNicknameUndefined: Self = StObject.set(x, "mailNickname", js.undefined)
    
    @scala.inline
    def setMailNull: Self = StObject.set(x, "mail", null)
    
    @scala.inline
    def setMailUndefined: Self = StObject.set(x, "mail", js.undefined)
    
    @scala.inline
    def setMailboxSettings(value: NullableOption[MailboxSettings]): Self = StObject.set(x, "mailboxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailboxSettingsNull: Self = StObject.set(x, "mailboxSettings", null)
    
    @scala.inline
    def setMailboxSettingsUndefined: Self = StObject.set(x, "mailboxSettings", js.undefined)
    
    @scala.inline
    def setManagedAppRegistrations(value: NullableOption[js.Array[ManagedAppRegistration]]): Self = StObject.set(x, "managedAppRegistrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedAppRegistrationsNull: Self = StObject.set(x, "managedAppRegistrations", null)
    
    @scala.inline
    def setManagedAppRegistrationsUndefined: Self = StObject.set(x, "managedAppRegistrations", js.undefined)
    
    @scala.inline
    def setManagedAppRegistrationsVarargs(value: ManagedAppRegistration*): Self = StObject.set(x, "managedAppRegistrations", js.Array(value :_*))
    
    @scala.inline
    def setManagedDevices(value: NullableOption[js.Array[ManagedDevice]]): Self = StObject.set(x, "managedDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedDevicesNull: Self = StObject.set(x, "managedDevices", null)
    
    @scala.inline
    def setManagedDevicesUndefined: Self = StObject.set(x, "managedDevices", js.undefined)
    
    @scala.inline
    def setManagedDevicesVarargs(value: ManagedDevice*): Self = StObject.set(x, "managedDevices", js.Array(value :_*))
    
    @scala.inline
    def setManager(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerNull: Self = StObject.set(x, "manager", null)
    
    @scala.inline
    def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    @scala.inline
    def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberOfNull: Self = StObject.set(x, "memberOf", null)
    
    @scala.inline
    def setMemberOfUndefined: Self = StObject.set(x, "memberOf", js.undefined)
    
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "memberOf", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: NullableOption[js.Array[Message]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setMobilePhone(value: NullableOption[String]): Self = StObject.set(x, "mobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobilePhoneNull: Self = StObject.set(x, "mobilePhone", null)
    
    @scala.inline
    def setMobilePhoneUndefined: Self = StObject.set(x, "mobilePhone", js.undefined)
    
    @scala.inline
    def setMySite(value: NullableOption[String]): Self = StObject.set(x, "mySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMySiteNull: Self = StObject.set(x, "mySite", null)
    
    @scala.inline
    def setMySiteUndefined: Self = StObject.set(x, "mySite", js.undefined)
    
    @scala.inline
    def setOauth2PermissionGrants(value: NullableOption[js.Array[OAuth2PermissionGrant]]): Self = StObject.set(x, "oauth2PermissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2PermissionGrantsNull: Self = StObject.set(x, "oauth2PermissionGrants", null)
    
    @scala.inline
    def setOauth2PermissionGrantsUndefined: Self = StObject.set(x, "oauth2PermissionGrants", js.undefined)
    
    @scala.inline
    def setOauth2PermissionGrantsVarargs(value: OAuth2PermissionGrant*): Self = StObject.set(x, "oauth2PermissionGrants", js.Array(value :_*))
    
    @scala.inline
    def setOfficeLocation(value: NullableOption[String]): Self = StObject.set(x, "officeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeLocationNull: Self = StObject.set(x, "officeLocation", null)
    
    @scala.inline
    def setOfficeLocationUndefined: Self = StObject.set(x, "officeLocation", js.undefined)
    
    @scala.inline
    def setOnPremisesDistinguishedName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesDistinguishedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesDistinguishedNameNull: Self = StObject.set(x, "onPremisesDistinguishedName", null)
    
    @scala.inline
    def setOnPremisesDistinguishedNameUndefined: Self = StObject.set(x, "onPremisesDistinguishedName", js.undefined)
    
    @scala.inline
    def setOnPremisesDomainName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesDomainNameNull: Self = StObject.set(x, "onPremisesDomainName", null)
    
    @scala.inline
    def setOnPremisesDomainNameUndefined: Self = StObject.set(x, "onPremisesDomainName", js.undefined)
    
    @scala.inline
    def setOnPremisesExtensionAttributes(value: NullableOption[OnPremisesExtensionAttributes]): Self = StObject.set(x, "onPremisesExtensionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesExtensionAttributesNull: Self = StObject.set(x, "onPremisesExtensionAttributes", null)
    
    @scala.inline
    def setOnPremisesExtensionAttributesUndefined: Self = StObject.set(x, "onPremisesExtensionAttributes", js.undefined)
    
    @scala.inline
    def setOnPremisesImmutableId(value: NullableOption[String]): Self = StObject.set(x, "onPremisesImmutableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesImmutableIdNull: Self = StObject.set(x, "onPremisesImmutableId", null)
    
    @scala.inline
    def setOnPremisesImmutableIdUndefined: Self = StObject.set(x, "onPremisesImmutableId", js.undefined)
    
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = StObject.set(x, "onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeNull: Self = StObject.set(x, "onPremisesLastSyncDateTime", null)
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeUndefined: Self = StObject.set(x, "onPremisesLastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOnPremisesProvisioningErrors(value: NullableOption[js.Array[OnPremisesProvisioningError]]): Self = StObject.set(x, "onPremisesProvisioningErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesProvisioningErrorsNull: Self = StObject.set(x, "onPremisesProvisioningErrors", null)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsUndefined: Self = StObject.set(x, "onPremisesProvisioningErrors", js.undefined)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsVarargs(value: OnPremisesProvisioningError*): Self = StObject.set(x, "onPremisesProvisioningErrors", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesSamAccountName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesSamAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSamAccountNameNull: Self = StObject.set(x, "onPremisesSamAccountName", null)
    
    @scala.inline
    def setOnPremisesSamAccountNameUndefined: Self = StObject.set(x, "onPremisesSamAccountName", js.undefined)
    
    @scala.inline
    def setOnPremisesSecurityIdentifier(value: NullableOption[String]): Self = StObject.set(x, "onPremisesSecurityIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSecurityIdentifierNull: Self = StObject.set(x, "onPremisesSecurityIdentifier", null)
    
    @scala.inline
    def setOnPremisesSecurityIdentifierUndefined: Self = StObject.set(x, "onPremisesSecurityIdentifier", js.undefined)
    
    @scala.inline
    def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSyncEnabledNull: Self = StObject.set(x, "onPremisesSyncEnabled", null)
    
    @scala.inline
    def setOnPremisesSyncEnabledUndefined: Self = StObject.set(x, "onPremisesSyncEnabled", js.undefined)
    
    @scala.inline
    def setOnPremisesUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesUserPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesUserPrincipalNameNull: Self = StObject.set(x, "onPremisesUserPrincipalName", null)
    
    @scala.inline
    def setOnPremisesUserPrincipalNameUndefined: Self = StObject.set(x, "onPremisesUserPrincipalName", js.undefined)
    
    @scala.inline
    def setOnenote(value: NullableOption[Onenote]): Self = StObject.set(x, "onenote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnenoteNull: Self = StObject.set(x, "onenote", null)
    
    @scala.inline
    def setOnenoteUndefined: Self = StObject.set(x, "onenote", js.undefined)
    
    @scala.inline
    def setOnlineMeetings(value: NullableOption[js.Array[OnlineMeeting]]): Self = StObject.set(x, "onlineMeetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineMeetingsNull: Self = StObject.set(x, "onlineMeetings", null)
    
    @scala.inline
    def setOnlineMeetingsUndefined: Self = StObject.set(x, "onlineMeetings", js.undefined)
    
    @scala.inline
    def setOnlineMeetingsVarargs(value: OnlineMeeting*): Self = StObject.set(x, "onlineMeetings", js.Array(value :_*))
    
    @scala.inline
    def setOtherMails(value: js.Array[String]): Self = StObject.set(x, "otherMails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherMailsUndefined: Self = StObject.set(x, "otherMails", js.undefined)
    
    @scala.inline
    def setOtherMailsVarargs(value: String*): Self = StObject.set(x, "otherMails", js.Array(value :_*))
    
    @scala.inline
    def setOutlook(value: NullableOption[OutlookUser]): Self = StObject.set(x, "outlook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookNull: Self = StObject.set(x, "outlook", null)
    
    @scala.inline
    def setOutlookUndefined: Self = StObject.set(x, "outlook", js.undefined)
    
    @scala.inline
    def setOwnedDevices(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "ownedDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnedDevicesNull: Self = StObject.set(x, "ownedDevices", null)
    
    @scala.inline
    def setOwnedDevicesUndefined: Self = StObject.set(x, "ownedDevices", js.undefined)
    
    @scala.inline
    def setOwnedDevicesVarargs(value: DirectoryObject*): Self = StObject.set(x, "ownedDevices", js.Array(value :_*))
    
    @scala.inline
    def setOwnedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "ownedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnedObjectsNull: Self = StObject.set(x, "ownedObjects", null)
    
    @scala.inline
    def setOwnedObjectsUndefined: Self = StObject.set(x, "ownedObjects", js.undefined)
    
    @scala.inline
    def setOwnedObjectsVarargs(value: DirectoryObject*): Self = StObject.set(x, "ownedObjects", js.Array(value :_*))
    
    @scala.inline
    def setPasswordPolicies(value: NullableOption[String]): Self = StObject.set(x, "passwordPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordPoliciesNull: Self = StObject.set(x, "passwordPolicies", null)
    
    @scala.inline
    def setPasswordPoliciesUndefined: Self = StObject.set(x, "passwordPolicies", js.undefined)
    
    @scala.inline
    def setPasswordProfile(value: NullableOption[PasswordProfile]): Self = StObject.set(x, "passwordProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordProfileNull: Self = StObject.set(x, "passwordProfile", null)
    
    @scala.inline
    def setPasswordProfileUndefined: Self = StObject.set(x, "passwordProfile", js.undefined)
    
    @scala.inline
    def setPastProjects(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "pastProjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastProjectsNull: Self = StObject.set(x, "pastProjects", null)
    
    @scala.inline
    def setPastProjectsUndefined: Self = StObject.set(x, "pastProjects", js.undefined)
    
    @scala.inline
    def setPastProjectsVarargs(value: String*): Self = StObject.set(x, "pastProjects", js.Array(value :_*))
    
    @scala.inline
    def setPeople(value: NullableOption[js.Array[Person]]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleNull: Self = StObject.set(x, "people", null)
    
    @scala.inline
    def setPeopleUndefined: Self = StObject.set(x, "people", js.undefined)
    
    @scala.inline
    def setPeopleVarargs(value: Person*): Self = StObject.set(x, "people", js.Array(value :_*))
    
    @scala.inline
    def setPhoto(value: NullableOption[ProfilePhoto]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setPhotos(value: NullableOption[js.Array[ProfilePhoto]]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosNull: Self = StObject.set(x, "photos", null)
    
    @scala.inline
    def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    @scala.inline
    def setPhotosVarargs(value: ProfilePhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    @scala.inline
    def setPlanner(value: NullableOption[PlannerUser]): Self = StObject.set(x, "planner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannerNull: Self = StObject.set(x, "planner", null)
    
    @scala.inline
    def setPlannerUndefined: Self = StObject.set(x, "planner", js.undefined)
    
    @scala.inline
    def setPostalCode(value: NullableOption[String]): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setPreferredLanguage(value: NullableOption[String]): Self = StObject.set(x, "preferredLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredLanguageNull: Self = StObject.set(x, "preferredLanguage", null)
    
    @scala.inline
    def setPreferredLanguageUndefined: Self = StObject.set(x, "preferredLanguage", js.undefined)
    
    @scala.inline
    def setPreferredName(value: NullableOption[String]): Self = StObject.set(x, "preferredName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredNameNull: Self = StObject.set(x, "preferredName", null)
    
    @scala.inline
    def setPreferredNameUndefined: Self = StObject.set(x, "preferredName", js.undefined)
    
    @scala.inline
    def setProvisionedPlans(value: js.Array[ProvisionedPlan]): Self = StObject.set(x, "provisionedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedPlansUndefined: Self = StObject.set(x, "provisionedPlans", js.undefined)
    
    @scala.inline
    def setProvisionedPlansVarargs(value: ProvisionedPlan*): Self = StObject.set(x, "provisionedPlans", js.Array(value :_*))
    
    @scala.inline
    def setProxyAddresses(value: js.Array[String]): Self = StObject.set(x, "proxyAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyAddressesUndefined: Self = StObject.set(x, "proxyAddresses", js.undefined)
    
    @scala.inline
    def setProxyAddressesVarargs(value: String*): Self = StObject.set(x, "proxyAddresses", js.Array(value :_*))
    
    @scala.inline
    def setRegisteredDevices(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "registeredDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredDevicesNull: Self = StObject.set(x, "registeredDevices", null)
    
    @scala.inline
    def setRegisteredDevicesUndefined: Self = StObject.set(x, "registeredDevices", js.undefined)
    
    @scala.inline
    def setRegisteredDevicesVarargs(value: DirectoryObject*): Self = StObject.set(x, "registeredDevices", js.Array(value :_*))
    
    @scala.inline
    def setResponsibilities(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "responsibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsibilitiesNull: Self = StObject.set(x, "responsibilities", null)
    
    @scala.inline
    def setResponsibilitiesUndefined: Self = StObject.set(x, "responsibilities", js.undefined)
    
    @scala.inline
    def setResponsibilitiesVarargs(value: String*): Self = StObject.set(x, "responsibilities", js.Array(value :_*))
    
    @scala.inline
    def setSchools(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "schools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchoolsNull: Self = StObject.set(x, "schools", null)
    
    @scala.inline
    def setSchoolsUndefined: Self = StObject.set(x, "schools", js.undefined)
    
    @scala.inline
    def setSchoolsVarargs(value: String*): Self = StObject.set(x, "schools", js.Array(value :_*))
    
    @scala.inline
    def setScopedRoleMemberOf(value: NullableOption[js.Array[ScopedRoleMembership]]): Self = StObject.set(x, "scopedRoleMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopedRoleMemberOfNull: Self = StObject.set(x, "scopedRoleMemberOf", null)
    
    @scala.inline
    def setScopedRoleMemberOfUndefined: Self = StObject.set(x, "scopedRoleMemberOf", js.undefined)
    
    @scala.inline
    def setScopedRoleMemberOfVarargs(value: ScopedRoleMembership*): Self = StObject.set(x, "scopedRoleMemberOf", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: NullableOption[UserSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setShowInAddressList(value: NullableOption[Boolean]): Self = StObject.set(x, "showInAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInAddressListNull: Self = StObject.set(x, "showInAddressList", null)
    
    @scala.inline
    def setShowInAddressListUndefined: Self = StObject.set(x, "showInAddressList", js.undefined)
    
    @scala.inline
    def setSignInSessionsValidFromDateTime(value: NullableOption[String]): Self = StObject.set(x, "signInSessionsValidFromDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInSessionsValidFromDateTimeNull: Self = StObject.set(x, "signInSessionsValidFromDateTime", null)
    
    @scala.inline
    def setSignInSessionsValidFromDateTimeUndefined: Self = StObject.set(x, "signInSessionsValidFromDateTime", js.undefined)
    
    @scala.inline
    def setSkills(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillsNull: Self = StObject.set(x, "skills", null)
    
    @scala.inline
    def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
    
    @scala.inline
    def setSkillsVarargs(value: String*): Self = StObject.set(x, "skills", js.Array(value :_*))
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStreetAddress(value: NullableOption[String]): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddressNull: Self = StObject.set(x, "streetAddress", null)
    
    @scala.inline
    def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurnameNull: Self = StObject.set(x, "surname", null)
    
    @scala.inline
    def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    
    @scala.inline
    def setTeamwork(value: NullableOption[UserTeamwork]): Self = StObject.set(x, "teamwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamworkNull: Self = StObject.set(x, "teamwork", null)
    
    @scala.inline
    def setTeamworkUndefined: Self = StObject.set(x, "teamwork", js.undefined)
    
    @scala.inline
    def setTodo(value: NullableOption[Todo]): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTodoNull: Self = StObject.set(x, "todo", null)
    
    @scala.inline
    def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveMemberOfNull: Self = StObject.set(x, "transitiveMemberOf", null)
    
    @scala.inline
    def setTransitiveMemberOfUndefined: Self = StObject.set(x, "transitiveMemberOf", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMemberOf", js.Array(value :_*))
    
    @scala.inline
    def setUsageLocation(value: NullableOption[String]): Self = StObject.set(x, "usageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageLocationNull: Self = StObject.set(x, "usageLocation", null)
    
    @scala.inline
    def setUsageLocationUndefined: Self = StObject.set(x, "usageLocation", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
    
    @scala.inline
    def setUserType(value: NullableOption[String]): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypeNull: Self = StObject.set(x, "userType", null)
    
    @scala.inline
    def setUserTypeUndefined: Self = StObject.set(x, "userType", js.undefined)
  }
}
