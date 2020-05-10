package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends js.Object {
  /** The person's street addresses. */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  /**
    * Output only. &#42;&#42;DEPRECATED&#42;&#42; (Please use `person.ageRanges` instead)
    *
    * The person's age range.
    */
  var ageRange: js.UndefOr[String] = js.native
  /** Output only. The person's age ranges. */
  var ageRanges: js.UndefOr[js.Array[AgeRangeType]] = js.native
  /** The person's biographies. */
  var biographies: js.UndefOr[js.Array[Biography]] = js.native
  /** The person's birthdays. */
  var birthdays: js.UndefOr[js.Array[Birthday]] = js.native
  /** The person's bragging rights. */
  var braggingRights: js.UndefOr[js.Array[BraggingRights]] = js.native
  /** Output only. The person's cover photos. */
  var coverPhotos: js.UndefOr[js.Array[CoverPhoto]] = js.native
  /** The person's email addresses. */
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.native
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.native
  /** The person's events. */
  var events: js.UndefOr[js.Array[Event]] = js.native
  /** The person's genders. */
  var genders: js.UndefOr[js.Array[Gender]] = js.native
  /** The person's instant messaging clients. */
  var imClients: js.UndefOr[js.Array[ImClient]] = js.native
  /** The person's interests. */
  var interests: js.UndefOr[js.Array[Interest]] = js.native
  /** The person's locale preferences. */
  var locales: js.UndefOr[js.Array[Locale]] = js.native
  /** The person's group memberships. */
  var memberships: js.UndefOr[js.Array[Membership]] = js.native
  /** Output only. Metadata about the person. */
  var metadata: js.UndefOr[PersonMetadata] = js.native
  /** The person's names. */
  var names: js.UndefOr[js.Array[Name]] = js.native
  /** The person's nicknames. */
  var nicknames: js.UndefOr[js.Array[Nickname]] = js.native
  /** The person's occupations. */
  var occupations: js.UndefOr[js.Array[Occupation]] = js.native
  /** The person's past or current organizations. */
  var organizations: js.UndefOr[js.Array[Organization]] = js.native
  /** The person's phone numbers. */
  var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.native
  /** Output only. The person's photos. */
  var photos: js.UndefOr[js.Array[Photo]] = js.native
  /** The person's relations. */
  var relations: js.UndefOr[js.Array[Relation]] = js.native
  /** Output only. The person's relationship interests. */
  var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.native
  /** Output only. The person's relationship statuses. */
  var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.native
  /** The person's residences. */
  var residences: js.UndefOr[js.Array[Residence]] = js.native
  /**
    * The resource name for the person, assigned by the server. An ASCII string
    * with a max length of 27 characters, in the form of
    * `people/{person_id}`.
    */
  var resourceName: js.UndefOr[String] = js.native
  /** The person's SIP addresses. */
  var sipAddresses: js.UndefOr[js.Array[SipAddress]] = js.native
  /** The person's skills. */
  var skills: js.UndefOr[js.Array[Skill]] = js.native
  /** Output only. The person's taglines. */
  var taglines: js.UndefOr[js.Array[Tagline]] = js.native
  /** The person's associated URLs. */
  var urls: js.UndefOr[js.Array[Url]] = js.native
  /** The person's user defined data. */
  var userDefined: js.UndefOr[js.Array[UserDefined]] = js.native
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
    def withAddresses(value: js.Array[Address]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withAgeRange(value: String): Self = {
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
    def withAgeRanges(value: js.Array[AgeRangeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withBiographies(value: js.Array[Biography]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biographies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBiographies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biographies")(js.undefined)
        ret
    }
    @scala.inline
    def withBirthdays(value: js.Array[Birthday]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBirthdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthdays")(js.undefined)
        ret
    }
    @scala.inline
    def withBraggingRights(value: js.Array[BraggingRights]): Self = {
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
    def withCoverPhotos(value: js.Array[CoverPhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhotos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverPhotos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhotos")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddresses(value: js.Array[EmailAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddresses")(js.undefined)
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
    def withGenders(value: js.Array[Gender]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genders")(js.undefined)
        ret
    }
    @scala.inline
    def withImClients(value: js.Array[ImClient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imClients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImClients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imClients")(js.undefined)
        ret
    }
    @scala.inline
    def withInterests(value: js.Array[Interest]): Self = {
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
    def withLocales(value: js.Array[Locale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberships(value: js.Array[Membership]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberships")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: PersonMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withNicknames(value: js.Array[Nickname]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nicknames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNicknames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nicknames")(js.undefined)
        ret
    }
    @scala.inline
    def withOccupations(value: js.Array[Occupation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occupations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccupations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occupations")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizations(value: js.Array[Organization]): Self = {
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
    def withPhoneNumbers(value: js.Array[PhoneNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[Photo]): Self = {
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
    def withRelations(value: js.Array[Relation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipInterests(value: js.Array[RelationshipInterest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipInterests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipInterests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipInterests")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipStatuses(value: js.Array[RelationshipStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withResidences(value: js.Array[Residence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResidences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residences")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withSipAddresses(value: js.Array[SipAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSipAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withSkills(value: js.Array[Skill]): Self = {
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
    def withTaglines(value: js.Array[Tagline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taglines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaglines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taglines")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[Url]): Self = {
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
    def withUserDefined(value: js.Array[UserDefined]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefined")(js.undefined)
        ret
    }
  }
  
}

