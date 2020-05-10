package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a person merged from various data sources such as the
  * authenticated user&#39;s contacts and profile data.  Most fields can have
  * multiple items. The items in a field have no guaranteed order, but each
  * non-empty field is guaranteed to have exactly one field with
  * `metadata.primary` set to true.
  */
@js.native
trait SchemaPerson extends js.Object {
  /**
    * The person&#39;s street addresses.
    */
  var addresses: js.UndefOr[js.Array[SchemaAddress]] = js.native
  /**
    * **DEPRECATED** (Please use `person.ageRanges` instead)**  The
    * person&#39;s read-only age range.
    */
  var ageRange: js.UndefOr[String] = js.native
  /**
    * The person&#39;s read-only age ranges.
    */
  var ageRanges: js.UndefOr[js.Array[SchemaAgeRangeType]] = js.native
  /**
    * The person&#39;s biographies.
    */
  var biographies: js.UndefOr[js.Array[SchemaBiography]] = js.native
  /**
    * The person&#39;s birthdays.
    */
  var birthdays: js.UndefOr[js.Array[SchemaBirthday]] = js.native
  /**
    * The person&#39;s bragging rights.
    */
  var braggingRights: js.UndefOr[js.Array[SchemaBraggingRights]] = js.native
  /**
    * The person&#39;s read-only cover photos.
    */
  var coverPhotos: js.UndefOr[js.Array[SchemaCoverPhoto]] = js.native
  /**
    * The person&#39;s email addresses.
    */
  var emailAddresses: js.UndefOr[js.Array[SchemaEmailAddress]] = js.native
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The person&#39;s events.
    */
  var events: js.UndefOr[js.Array[SchemaEvent]] = js.native
  /**
    * The person&#39;s genders.
    */
  var genders: js.UndefOr[js.Array[SchemaGender]] = js.native
  /**
    * The person&#39;s instant messaging clients.
    */
  var imClients: js.UndefOr[js.Array[SchemaImClient]] = js.native
  /**
    * The person&#39;s interests.
    */
  var interests: js.UndefOr[js.Array[SchemaInterest]] = js.native
  /**
    * The person&#39;s locale preferences.
    */
  var locales: js.UndefOr[js.Array[SchemaLocale]] = js.native
  /**
    * The person&#39;s read-only group memberships.
    */
  var memberships: js.UndefOr[js.Array[SchemaMembership]] = js.native
  /**
    * Read-only metadata about the person.
    */
  var metadata: js.UndefOr[SchemaPersonMetadata] = js.native
  /**
    * The person&#39;s names.
    */
  var names: js.UndefOr[js.Array[SchemaName]] = js.native
  /**
    * The person&#39;s nicknames.
    */
  var nicknames: js.UndefOr[js.Array[SchemaNickname]] = js.native
  /**
    * The person&#39;s occupations.
    */
  var occupations: js.UndefOr[js.Array[SchemaOccupation]] = js.native
  /**
    * The person&#39;s past or current organizations.
    */
  var organizations: js.UndefOr[js.Array[SchemaOrganization]] = js.native
  /**
    * The person&#39;s phone numbers.
    */
  var phoneNumbers: js.UndefOr[js.Array[SchemaPhoneNumber]] = js.native
  /**
    * The person&#39;s read-only photos.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.native
  /**
    * The person&#39;s relations.
    */
  var relations: js.UndefOr[js.Array[SchemaRelation]] = js.native
  /**
    * The person&#39;s read-only relationship interests.
    */
  var relationshipInterests: js.UndefOr[js.Array[SchemaRelationshipInterest]] = js.native
  /**
    * The person&#39;s read-only relationship statuses.
    */
  var relationshipStatuses: js.UndefOr[js.Array[SchemaRelationshipStatus]] = js.native
  /**
    * The person&#39;s residences.
    */
  var residences: js.UndefOr[js.Array[SchemaResidence]] = js.native
  /**
    * The resource name for the person, assigned by the server. An ASCII string
    * with a max length of 27 characters, in the form of
    * `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The person&#39;s SIP addresses.
    */
  var sipAddresses: js.UndefOr[js.Array[SchemaSipAddress]] = js.native
  /**
    * The person&#39;s skills.
    */
  var skills: js.UndefOr[js.Array[SchemaSkill]] = js.native
  /**
    * The person&#39;s read-only taglines.
    */
  var taglines: js.UndefOr[js.Array[SchemaTagline]] = js.native
  /**
    * The person&#39;s associated URLs.
    */
  var urls: js.UndefOr[js.Array[SchemaUrl]] = js.native
  /**
    * The person&#39;s user defined data.
    */
  var userDefined: js.UndefOr[js.Array[SchemaUserDefined]] = js.native
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
    def withAddresses(value: js.Array[SchemaAddress]): Self = {
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
    def withAgeRanges(value: js.Array[SchemaAgeRangeType]): Self = {
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
    def withBiographies(value: js.Array[SchemaBiography]): Self = {
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
    def withBirthdays(value: js.Array[SchemaBirthday]): Self = {
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
    def withBraggingRights(value: js.Array[SchemaBraggingRights]): Self = {
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
    def withCoverPhotos(value: js.Array[SchemaCoverPhoto]): Self = {
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
    def withEmailAddresses(value: js.Array[SchemaEmailAddress]): Self = {
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
    def withEvents(value: js.Array[SchemaEvent]): Self = {
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
    def withGenders(value: js.Array[SchemaGender]): Self = {
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
    def withImClients(value: js.Array[SchemaImClient]): Self = {
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
    def withInterests(value: js.Array[SchemaInterest]): Self = {
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
    def withLocales(value: js.Array[SchemaLocale]): Self = {
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
    def withMemberships(value: js.Array[SchemaMembership]): Self = {
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
    def withMetadata(value: SchemaPersonMetadata): Self = {
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
    def withNames(value: js.Array[SchemaName]): Self = {
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
    def withNicknames(value: js.Array[SchemaNickname]): Self = {
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
    def withOccupations(value: js.Array[SchemaOccupation]): Self = {
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
    def withOrganizations(value: js.Array[SchemaOrganization]): Self = {
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
    def withPhoneNumbers(value: js.Array[SchemaPhoneNumber]): Self = {
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
    def withPhotos(value: js.Array[SchemaPhoto]): Self = {
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
    def withRelations(value: js.Array[SchemaRelation]): Self = {
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
    def withRelationshipInterests(value: js.Array[SchemaRelationshipInterest]): Self = {
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
    def withRelationshipStatuses(value: js.Array[SchemaRelationshipStatus]): Self = {
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
    def withResidences(value: js.Array[SchemaResidence]): Self = {
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
    def withSipAddresses(value: js.Array[SchemaSipAddress]): Self = {
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
    def withSkills(value: js.Array[SchemaSkill]): Self = {
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
    def withTaglines(value: js.Array[SchemaTagline]): Self = {
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
    def withUrls(value: js.Array[SchemaUrl]): Self = {
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
    def withUserDefined(value: js.Array[SchemaUserDefined]): Self = {
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

