package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfile extends js.Object {
  /** The user's mailing address, contains multiple fields. */
  var address: js.UndefOr[Location] = js.native
  /**
    * If the user has edit access to multiple accounts, the user can choose the
    * preferred account and it is used when a personal account is needed. Can
    * be empty.
    */
  var adwordsManagerAccount: js.UndefOr[String] = js.native
  /** A list of ids representing which channels the user selected they were in. */
  var channels: js.UndefOr[js.Array[String]] = js.native
  /** The email address the user has selected on the Partners site as primary. */
  var emailAddress: js.UndefOr[String] = js.native
  /** The list of opt-ins for the user, related to communication preferences. */
  var emailOptIns: js.UndefOr[OptIns] = js.native
  /** The user's family name. */
  var familyName: js.UndefOr[String] = js.native
  /** The user's given name. */
  var givenName: js.UndefOr[String] = js.native
  /** A list of ids representing which industries the user selected. */
  var industries: js.UndefOr[js.Array[String]] = js.native
  /** A list of ids represnting which job categories the user selected. */
  var jobFunctions: js.UndefOr[js.Array[String]] = js.native
  /** The list of languages this user understands. */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /** A list of ids representing which markets the user was interested in. */
  var markets: js.UndefOr[js.Array[String]] = js.native
  /** The user's phone number. */
  var phoneNumber: js.UndefOr[String] = js.native
  /** The user's primary country, an ISO 2-character code. */
  var primaryCountryCode: js.UndefOr[String] = js.native
  /** Whether the user's public profile is visible to anyone with the URL. */
  var profilePublic: js.UndefOr[Boolean] = js.native
}

object UserProfile {
  @scala.inline
  def apply(): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfile]
  }
  @scala.inline
  implicit class UserProfileOps[Self <: UserProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Location): Self = {
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
    def withAdwordsManagerAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsManagerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdwordsManagerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsManagerAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailOptIns(value: OptIns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOptIns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailOptIns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOptIns")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
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
    def withJobFunctions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markets")(js.undefined)
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
    def withProfilePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfilePublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilePublic")(js.undefined)
        ret
    }
  }
  
}

