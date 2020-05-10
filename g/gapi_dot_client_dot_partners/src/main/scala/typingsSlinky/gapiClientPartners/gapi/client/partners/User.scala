package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * This is the list of AdWords Manager Accounts the user has edit access to.
    * If the user has edit access to multiple accounts, the user can choose the
    * preferred account and we use this when a personal account is needed. Can
    * be empty meaning the user has access to no accounts.
    * @OutputOnly
    */
  var availableAdwordsManagerAccounts: js.UndefOr[js.Array[AdWordsManagerAccountInfo]] = js.native
  /**
    * The list of achieved certifications. These are calculated based on exam
    * results and other requirements.
    * @OutputOnly
    */
  var certificationStatus: js.UndefOr[js.Array[Certification]] = js.native
  /**
    * The company that the user is associated with.
    * If not present, the user is not associated with any company.
    */
  var company: js.UndefOr[CompanyRelation] = js.native
  /**
    * The email address used by the user used for company verification.
    * @OutputOnly
    */
  var companyVerificationEmail: js.UndefOr[String] = js.native
  /**
    * The list of exams the user ever taken. For each type of exam, only one
    * entry is listed.
    */
  var examStatus: js.UndefOr[js.Array[ExamStatus]] = js.native
  /** The ID of the user. */
  var id: js.UndefOr[String] = js.native
  /**
    * The internal user ID.
    * Only available for a whitelisted set of api clients.
    */
  var internalId: js.UndefOr[String] = js.native
  /**
    * The most recent time the user interacted with the Partners site.
    * @OutputOnly
    */
  var lastAccessTime: js.UndefOr[String] = js.native
  /**
    * The list of emails the user has access to/can select as primary.
    * @OutputOnly
    */
  var primaryEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * The profile information of a Partners user, contains all the directly
    * editable user information.
    */
  var profile: js.UndefOr[UserProfile] = js.native
  /** Information about a user's external public profile outside Google Partners. */
  var publicProfile: js.UndefOr[PublicProfile] = js.native
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
    def withAvailableAdwordsManagerAccounts(value: js.Array[AdWordsManagerAccountInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableAdwordsManagerAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableAdwordsManagerAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableAdwordsManagerAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificationStatus(value: js.Array[Certification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: CompanyRelation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyVerificationEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyVerificationEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyVerificationEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyVerificationEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withExamStatus(value: js.Array[ExamStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAccessTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccessTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: UserProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicProfile(value: PublicProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicProfile")(js.undefined)
        ret
    }
  }
  
}

