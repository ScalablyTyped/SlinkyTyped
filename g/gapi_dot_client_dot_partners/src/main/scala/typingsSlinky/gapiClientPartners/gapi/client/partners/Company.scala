package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Company extends js.Object {
  /**
    * URL of the company's additional websites used to verify the dynamic badges.
    * These are stored as full URLs as entered by the user, but only the TLD will
    * be used for the actual verification.
    */
  var additionalWebsites: js.UndefOr[js.Array[String]] = js.native
  /**
    * Email domains that allow users with a matching email address to get
    * auto-approved for associating with this company.
    */
  var autoApprovalEmailDomains: js.UndefOr[js.Array[String]] = js.native
  /** Partner badge tier */
  var badgeTier: js.UndefOr[String] = js.native
  /** The list of Google Partners certification statuses for the company. */
  var certificationStatuses: js.UndefOr[js.Array[CertificationStatus]] = js.native
  /** Company type labels listed on the company's profile. */
  var companyTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The minimum monthly budget that the company accepts for partner business,
    * converted to the requested currency code.
    */
  var convertedMinMonthlyBudget: js.UndefOr[Money] = js.native
  /** The ID of the company. */
  var id: js.UndefOr[String] = js.native
  /** Industries the company can help with. */
  var industries: js.UndefOr[js.Array[String]] = js.native
  /** The list of localized info for the company. */
  var localizedInfos: js.UndefOr[js.Array[LocalizedCompanyInfo]] = js.native
  /**
    * The list of all company locations.
    * If set, must include the
    * primary_location
    * in the list.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.native
  /** The name of the company. */
  var name: js.UndefOr[String] = js.native
  /**
    * The unconverted minimum monthly budget that the company accepts for partner
    * business.
    */
  var originalMinMonthlyBudget: js.UndefOr[Money] = js.native
  /** The Primary AdWords Manager Account id. */
  var primaryAdwordsManagerAccountId: js.UndefOr[String] = js.native
  /**
    * The primary language code of the company, as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var primaryLanguageCode: js.UndefOr[String] = js.native
  /** The primary location of the company. */
  var primaryLocation: js.UndefOr[Location] = js.native
  /** The public viewability status of the company's profile. */
  var profileStatus: js.UndefOr[String] = js.native
  /** Basic information from the company's public profile. */
  var publicProfile: js.UndefOr[PublicProfile] = js.native
  /**
    * Information related to the ranking of the company within the list of
    * companies.
    */
  var ranks: js.UndefOr[js.Array[Rank]] = js.native
  /** Services the company can help with. */
  var services: js.UndefOr[js.Array[String]] = js.native
  /** The list of Google Partners specialization statuses for the company. */
  var specializationStatus: js.UndefOr[js.Array[SpecializationStatus]] = js.native
  /** URL of the company's website. */
  var websiteUrl: js.UndefOr[String] = js.native
}

object Company {
  @scala.inline
  def apply(): Company = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Company]
  }
  @scala.inline
  implicit class CompanyOps[Self <: Company] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalWebsites(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalWebsites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalWebsites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalWebsites")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoApprovalEmailDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApprovalEmailDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoApprovalEmailDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApprovalEmailDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeTier")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificationStatuses(value: js.Array[CertificationStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificationStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertedMinMonthlyBudget(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertedMinMonthlyBudget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertedMinMonthlyBudget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertedMinMonthlyBudget")(js.undefined)
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
    def withIndustries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndustries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industries")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizedInfos(value: js.Array[LocalizedCompanyInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalMinMonthlyBudget(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMinMonthlyBudget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalMinMonthlyBudget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMinMonthlyBudget")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryAdwordsManagerAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryAdwordsManagerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryAdwordsManagerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryAdwordsManagerAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileStatus")(js.undefined)
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
    @scala.inline
    def withRanks(value: js.Array[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranks")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecializationStatus(value: js.Array[SpecializationStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specializationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecializationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specializationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(js.undefined)
        ret
    }
  }
  
}

