package typingsSlinky.gapiClientPlus.gapi.client.plus

import typingsSlinky.gapiClientPlus.AnonCoverInfo
import typingsSlinky.gapiClientPlus.AnonDepartment
import typingsSlinky.gapiClientPlus.AnonFormatted
import typingsSlinky.gapiClientPlus.AnonIsDefault
import typingsSlinky.gapiClientPlus.AnonLabel
import typingsSlinky.gapiClientPlus.AnonMax
import typingsSlinky.gapiClientPlus.AnonPrimary
import typingsSlinky.gapiClientPlus.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends js.Object {
  /** A short biography for this person. */
  var aboutMe: js.UndefOr[String] = js.native
  /**
    * The age range of the person. Valid ranges are 17 or younger, 18 to 20, and 21 or older. Age is determined from the user's birthday using Western age
    * reckoning.
    */
  var ageRange: js.UndefOr[AnonMax] = js.native
  /** The person's date of birth, represented as YYYY-MM-DD. */
  var birthday: js.UndefOr[String] = js.native
  /** The "bragging rights" line of this person. */
  var braggingRights: js.UndefOr[String] = js.native
  /** For followers who are visible, the number of people who have added this person or page to a circle. */
  var circledByCount: js.UndefOr[Double] = js.native
  /** The cover photo content. */
  var cover: js.UndefOr[AnonCoverInfo] = js.native
  /** (this field is not currently used) */
  var currentLocation: js.UndefOr[String] = js.native
  /** The name of this person, which is suitable for display. */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The hosted domain name for the user's Google Apps account. For instance, example.com. The plus.profile.emails.read or email scope is needed to get this
    * domain name.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * A list of email addresses that this person has, including their Google account email address, and the public verified email addresses on their Google+
    * profile. The plus.profile.emails.read scope is needed to retrieve these email addresses, or the email scope can be used to retrieve just the Google
    * account email address.
    */
  var emails: js.UndefOr[js.Array[AnonValue]] = js.native
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /**
    * The person's gender. Possible values include, but are not limited to, the following values:
    * - "male" - Male gender.
    * - "female" - Female gender.
    * - "other" - Other.
    */
  var gender: js.UndefOr[String] = js.native
  /** The ID of this person. */
  var id: js.UndefOr[String] = js.native
  /** The representation of the person's profile photo. */
  var image: js.UndefOr[AnonIsDefault] = js.native
  /** Whether this user has signed up for Google+. */
  var isPlusUser: js.UndefOr[Boolean] = js.native
  /** Identifies this resource as a person. Value: "plus#person". */
  var kind: js.UndefOr[String] = js.native
  /** The user's preferred language for rendering. */
  var language: js.UndefOr[String] = js.native
  /** An object representation of the individual components of a person's name. */
  var name: js.UndefOr[AnonFormatted] = js.native
  /** The nickname of this person. */
  var nickname: js.UndefOr[String] = js.native
  /**
    * Type of person within Google+. Possible values include, but are not limited to, the following values:
    * - "person" - represents an actual person.
    * - "page" - represents a page.
    */
  var objectType: js.UndefOr[String] = js.native
  /** The occupation of this person. */
  var occupation: js.UndefOr[String] = js.native
  /** A list of current or past organizations with which this person is associated. */
  var organizations: js.UndefOr[js.Array[AnonDepartment]] = js.native
  /** A list of places where this person has lived. */
  var placesLived: js.UndefOr[js.Array[AnonPrimary]] = js.native
  /** If a Google+ Page, the number of people who have +1'd this page. */
  var plusOneCount: js.UndefOr[Double] = js.native
  /**
    * The person's relationship status. Possible values include, but are not limited to, the following values:
    * - "single" - Person is single.
    * - "in_a_relationship" - Person is in a relationship.
    * - "engaged" - Person is engaged.
    * - "married" - Person is married.
    * - "its_complicated" - The relationship is complicated.
    * - "open_relationship" - Person is in an open relationship.
    * - "widowed" - Person is widowed.
    * - "in_domestic_partnership" - Person is in a domestic partnership.
    * - "in_civil_union" - Person is in a civil union.
    */
  var relationshipStatus: js.UndefOr[String] = js.native
  /** The person's skills. */
  var skills: js.UndefOr[String] = js.native
  /** The brief description (tagline) of this person. */
  var tagline: js.UndefOr[String] = js.native
  /** The URL of this person's profile. */
  var url: js.UndefOr[String] = js.native
  /** A list of URLs for this person. */
  var urls: js.UndefOr[js.Array[AnonLabel]] = js.native
  /** Whether the person or Google+ Page has been verified. */
  var verified: js.UndefOr[Boolean] = js.native
}

object Person {
  @scala.inline
  def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
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
    def withAgeRange(value: AnonMax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageRange")(js.undefined)
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
    def withBraggingRights(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braggingRights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBraggingRights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braggingRights")(js.undefined)
        ret
    }
    @scala.inline
    def withCircledByCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circledByCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircledByCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circledByCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCover(value: AnonCoverInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLocation")(js.undefined)
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
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withEmails(value: js.Array[AnonValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
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
    def withImage(value: AnonIsDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPlusUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlusUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPlusUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlusUser")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: AnonFormatted): Self = {
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
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
    @scala.inline
    def withOccupation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occupation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccupation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occupation")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizations(value: js.Array[AnonDepartment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacesLived(value: js.Array[AnonPrimary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placesLived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacesLived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placesLived")(js.undefined)
        ret
    }
    @scala.inline
    def withPlusOneCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusOneCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlusOneCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusOneCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSkills(value: String): Self = {
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
    def withTagline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagline")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[AnonLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(js.undefined)
        ret
    }
  }
  
}

