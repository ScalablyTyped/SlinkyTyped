package typingsSlinky.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends js.Object {
  var BraggingRights: js.UndefOr[js.Array[typingsSlinky.gapiPeople.gapi.client.people.BraggingRights]] = js.native
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  var ageRange: js.UndefOr[AgeRange] = js.native
  var biographies: js.UndefOr[js.Array[Biography]] = js.native
  var birthdays: js.UndefOr[js.Array[Birthday]] = js.native
  var coverPhotos: js.Array[CoverPhoto] = js.native
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.native
  var etag: String = js.native
  var events: js.UndefOr[js.Array[Event]] = js.native
  var genders: js.UndefOr[js.Array[Gender]] = js.native
  var imClients: js.UndefOr[js.Array[ImClient]] = js.native
  var interests: js.UndefOr[js.Array[Interest]] = js.native
  var locales: js.Array[Locale] = js.native
  var memberships: js.UndefOr[js.Array[Membership]] = js.native
  var metadata: PersonMetadata = js.native
  var names: js.Array[Name] = js.native
  var nicknames: js.UndefOr[js.Array[Nickname]] = js.native
  var occupations: js.UndefOr[js.Array[Occupation]] = js.native
  var organizations: js.UndefOr[js.Array[Organization]] = js.native
  var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.native
  var photos: js.UndefOr[js.Array[Photo]] = js.native
  var relations: js.UndefOr[js.Array[Relation]] = js.native
  var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.native
  var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.native
  var residences: js.UndefOr[js.Array[Residence]] = js.native
  var resourceName: String = js.native
  var skills: js.UndefOr[js.Array[Skill]] = js.native
  var taglines: js.UndefOr[js.Array[Tagline]] = js.native
  var urls: js.UndefOr[js.Array[Url]] = js.native
}

object Person {
  @scala.inline
  def apply(
    coverPhotos: js.Array[CoverPhoto],
    etag: String,
    locales: js.Array[Locale],
    metadata: PersonMetadata,
    names: js.Array[Name],
    resourceName: String
  ): Person = {
    val __obj = js.Dynamic.literal(coverPhotos = coverPhotos.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverPhotos(value: js.Array[CoverPhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhotos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocales(value: js.Array[Locale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: PersonMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBraggingRights(value: js.Array[BraggingRights]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BraggingRights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBraggingRights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BraggingRights")(js.undefined)
        ret
    }
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
    def withAgeRange(value: AgeRange): Self = {
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
  }
  
}

