package typingsSlinky.googleapis.plusV1Mod.plusV1

import typingsSlinky.googleapis.AnonCoverInfo
import typingsSlinky.googleapis.AnonDepartment
import typingsSlinky.googleapis.AnonFormatted
import typingsSlinky.googleapis.AnonIsDefault
import typingsSlinky.googleapis.AnonLabelType
import typingsSlinky.googleapis.AnonMin
import typingsSlinky.googleapis.AnonPrimary
import typingsSlinky.googleapis.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPerson extends js.Object {
  /**
    * A short biography for this person.
    */
  var aboutMe: js.UndefOr[String] = js.native
  /**
    * The age range of the person. Valid ranges are 17 or younger, 18 to 20,
    * and 21 or older. Age is determined from the user&#39;s birthday using
    * Western age reckoning.
    */
  var ageRange: js.UndefOr[AnonMin] = js.native
  /**
    * The person&#39;s date of birth, represented as YYYY-MM-DD.
    */
  var birthday: js.UndefOr[String] = js.native
  /**
    * The &quot;bragging rights&quot; line of this person.
    */
  var braggingRights: js.UndefOr[String] = js.native
  /**
    * For followers who are visible, the number of people who have added this
    * person or page to a circle.
    */
  var circledByCount: js.UndefOr[Double] = js.native
  /**
    * The cover photo content.
    */
  var cover: js.UndefOr[AnonCoverInfo] = js.native
  /**
    * (this field is not currently used)
    */
  var currentLocation: js.UndefOr[String] = js.native
  /**
    * The name of this person, which is suitable for display.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The hosted domain name for the user&#39;s Google Apps account. For
    * instance, example.com. The plus.profile.emails.read or email scope is
    * needed to get this domain name.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * A list of email addresses that this person has, including their Google
    * account email address, and the public verified email addresses on their
    * Google+ profile. The plus.profile.emails.read scope is needed to retrieve
    * these email addresses, or the email scope can be used to retrieve just
    * the Google account email address.
    */
  var emails: js.UndefOr[js.Array[AnonValue]] = js.native
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The person&#39;s gender. Possible values include, but are not limited to,
    * the following values:   - &quot;male&quot; - Male gender.  -
    * &quot;female&quot; - Female gender.  - &quot;other&quot; - Other.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * The ID of this person.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The representation of the person&#39;s profile photo.
    */
  var image: js.UndefOr[AnonIsDefault] = js.native
  /**
    * Whether this user has signed up for Google+.
    */
  var isPlusUser: js.UndefOr[Boolean] = js.native
  /**
    * Identifies this resource as a person. Value: &quot;plus#person&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The user&#39;s preferred language for rendering.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * An object representation of the individual components of a person&#39;s
    * name.
    */
  var name: js.UndefOr[AnonFormatted] = js.native
  /**
    * The nickname of this person.
    */
  var nickname: js.UndefOr[String] = js.native
  /**
    * Type of person within Google+. Possible values include, but are not
    * limited to, the following values:   - &quot;person&quot; - represents an
    * actual person.  - &quot;page&quot; - represents a page.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The occupation of this person.
    */
  var occupation: js.UndefOr[String] = js.native
  /**
    * A list of current or past organizations with which this person is
    * associated.
    */
  var organizations: js.UndefOr[js.Array[AnonDepartment]] = js.native
  /**
    * A list of places where this person has lived.
    */
  var placesLived: js.UndefOr[js.Array[AnonPrimary]] = js.native
  /**
    * If a Google+ Page, the number of people who have +1&#39;d this page.
    */
  var plusOneCount: js.UndefOr[Double] = js.native
  /**
    * The person&#39;s relationship status. Possible values include, but are
    * not limited to, the following values:   - &quot;single&quot; - Person is
    * single.  - &quot;in_a_relationship&quot; - Person is in a relationship.
    * - &quot;engaged&quot; - Person is engaged.  - &quot;married&quot; -
    * Person is married.  - &quot;its_complicated&quot; - The relationship is
    * complicated.  - &quot;open_relationship&quot; - Person is in an open
    * relationship.  - &quot;widowed&quot; - Person is widowed.  -
    * &quot;in_domestic_partnership&quot; - Person is in a domestic
    * partnership.  - &quot;in_civil_union&quot; - Person is in a civil union.
    */
  var relationshipStatus: js.UndefOr[String] = js.native
  /**
    * The person&#39;s skills.
    */
  var skills: js.UndefOr[String] = js.native
  /**
    * The brief description (tagline) of this person.
    */
  var tagline: js.UndefOr[String] = js.native
  /**
    * The URL of this person&#39;s profile.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * A list of URLs for this person.
    */
  var urls: js.UndefOr[js.Array[AnonLabelType]] = js.native
  /**
    * Whether the person or Google+ Page has been verified.
    */
  var verified: js.UndefOr[Boolean] = js.native
}

object SchemaPerson {
  @scala.inline
  def apply(): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerson]
  }
  @scala.inline
  implicit class SchemaPersonOps[Self <: SchemaPerson] (val x: Self) extends AnyVal {
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
    def withAgeRange(value: AnonMin): Self = {
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
    def withUrls(value: js.Array[AnonLabelType]): Self = {
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

