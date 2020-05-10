package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EducationUser extends Entity {
  // True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
  var accountEnabled: js.UndefOr[Boolean] = js.native
  // The licenses that are assigned to the user. Not nullable.
  var assignedLicenses: js.UndefOr[js.Array[AssignedLicense]] = js.native
  // The plans that are assigned to the user. Read-only. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.native
  /**
    * The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  // Classes to which the user belongs. Nullable.
  var classes: js.UndefOr[js.Array[EducationClass]] = js.native
  // Entity who created the user.
  var createdBy: js.UndefOr[IdentitySet] = js.native
  // The name for the department in which the user works. Supports $filter.
  var department: js.UndefOr[String] = js.native
  /**
    * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle
    * initial, and last name. This property is required when a user is created and it cannot be cleared during updates.
    * Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[String] = js.native
  // Where this user was created from. The possible values are: sis, manual.
  var externalSource: js.UndefOr[EducationExternalSource] = js.native
  // The given name (first name) of the user. Supports $filter.
  var givenName: js.UndefOr[String] = js.native
  // The SMTP address for the user; for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports $filter.
  var mail: js.UndefOr[String] = js.native
  // The mail alias for the user. This property must be specified when a user is created. Supports $filter.
  var mailNickname: js.UndefOr[String] = js.native
  // Mail address of user.
  var mailingAddress: js.UndefOr[PhysicalAddress] = js.native
  // The middle name of user.
  var middleName: js.UndefOr[String] = js.native
  // The primary cellular telephone number for the user.
  var mobilePhone: js.UndefOr[String] = js.native
  var officeLocation: js.UndefOr[String] = js.native
  /**
    * Specifies password policies for the user. This value is an enumeration with one possible value being
    * 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified.
    * 'DisablePasswordExpiration' can also be specified. The two can be specified together; for example:
    * 'DisablePasswordExpiration, DisableStrongPassword'.
    */
  var passwordPolicies: js.UndefOr[String] = js.native
  /**
    * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a
    * user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies
    * property. By default, a strong password is required.
    */
  var passwordProfile: js.UndefOr[PasswordProfile] = js.native
  // The preferred language for the user. Should follow ISO 639-1 Code; for example, 'en-US'.
  var preferredLanguage: js.UndefOr[String] = js.native
  /**
    * Default role for a user. The user's role might be different in an individual class. The possible values are: student,
    * teacher. Supports $filter.
    */
  var primaryRole: js.UndefOr[EducationUserRole] = js.native
  // The plans that are provisioned for the user. Read-only. Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.native
  var refreshTokensValidFromDateTime: js.UndefOr[String] = js.native
  // Address where user lives.
  var residenceAddress: js.UndefOr[PhysicalAddress] = js.native
  // Schools to which the user belongs. Nullable.
  var schools: js.UndefOr[js.Array[EducationSchool]] = js.native
  var showInAddressList: js.UndefOr[Boolean] = js.native
  // If the primary role is student, this block will contain student specific data.
  var student: js.UndefOr[EducationStudent] = js.native
  // The user's surname (family name or last name). Supports $filter.
  var surname: js.UndefOr[String] = js.native
  // If the primary role is teacher, this block will contain teacher specific data.
  var teacher: js.UndefOr[EducationTeacher] = js.native
  /**
    * A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal
    * requirement to check for availability of services in countries or regions. Examples include: 'US', 'JP', and 'GB'. Not
    * nullable. Supports $filter.
    */
  var usageLocation: js.UndefOr[String] = js.native
  // The directory user corresponding to this user.
  var user: js.UndefOr[User] = js.native
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

object EducationUser {
  @scala.inline
  def apply(): EducationUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationUser]
  }
  @scala.inline
  implicit class EducationUserOps[Self <: EducationUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClasses(value: js.Array[EducationClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBy(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(js.undefined)
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
    def withExternalSource(value: EducationExternalSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSource")(js.undefined)
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
    def withMailingAddress(value: PhysicalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(js.undefined)
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
    def withPrimaryRole(value: EducationUserRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRole")(js.undefined)
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
    def withRefreshTokensValidFromDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTokensValidFromDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshTokensValidFromDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTokensValidFromDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResidenceAddress(value: PhysicalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residenceAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResidenceAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residenceAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSchools(value: js.Array[EducationSchool]): Self = {
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
    def withStudent(value: EducationStudent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("student")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("student")(js.undefined)
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
    def withTeacher(value: EducationTeacher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teacher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeacher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teacher")(js.undefined)
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
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
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

