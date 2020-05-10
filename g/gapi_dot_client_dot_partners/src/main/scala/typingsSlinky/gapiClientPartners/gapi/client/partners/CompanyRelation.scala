package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompanyRelation extends js.Object {
  /** The primary address for this company. */
  var address: js.UndefOr[String] = js.native
  /** Whether the company is a Partner. */
  var badgeTier: js.UndefOr[String] = js.native
  /** Indicates if the user is an admin for this company. */
  var companyAdmin: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the company. There may be no id if this is a
    * pending company.5
    */
  var companyId: js.UndefOr[String] = js.native
  /**
    * The timestamp of when affiliation was requested.
    * @OutputOnly
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * The internal company ID.
    * Only available for a whitelisted set of api clients.
    */
  var internalCompanyId: js.UndefOr[String] = js.native
  /** The flag that indicates if the company is pending verification. */
  var isPending: js.UndefOr[Boolean] = js.native
  /** A URL to a profile photo, e.g. a G+ profile photo. */
  var logoUrl: js.UndefOr[String] = js.native
  /** The AdWords manager account # associated this company. */
  var managerAccount: js.UndefOr[String] = js.native
  /** The name (in the company's primary language) for the company. */
  var name: js.UndefOr[String] = js.native
  /** The phone number for the company's primary address. */
  var phoneNumber: js.UndefOr[String] = js.native
  /** The primary location of the company. */
  var primaryAddress: js.UndefOr[Location] = js.native
  /** The primary country code of the company. */
  var primaryCountryCode: js.UndefOr[String] = js.native
  /** The primary language code of the company. */
  var primaryLanguageCode: js.UndefOr[String] = js.native
  /**
    * The timestamp when the user was approved.
    * @OutputOnly
    */
  var resolvedTimestamp: js.UndefOr[String] = js.native
  /** The segment the company is classified as. */
  var segment: js.UndefOr[js.Array[String]] = js.native
  /** The list of Google Partners specialization statuses for the company. */
  var specializationStatus: js.UndefOr[js.Array[SpecializationStatus]] = js.native
  /** The state of relationship, in terms of approvals. */
  var state: js.UndefOr[String] = js.native
  /** The website URL for this company. */
  var website: js.UndefOr[String] = js.native
}

object CompanyRelation {
  @scala.inline
  def apply(): CompanyRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanyRelation]
  }
  @scala.inline
  implicit class CompanyRelationOps[Self <: CompanyRelation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
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
    def withCompanyAdmin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyAdmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyAdmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyAdmin")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalCompanyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalCompanyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalCompanyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalCompanyId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPending")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withManagerAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managerAccount")(js.undefined)
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
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryAddress(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryCountryCode")(js.undefined)
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
    def withResolvedTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
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
    def withWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(js.undefined)
        ret
    }
  }
  
}

