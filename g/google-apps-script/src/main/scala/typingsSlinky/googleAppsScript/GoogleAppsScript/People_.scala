package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Collection.ContactGroupsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Collection.PeopleCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Address
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.AgeRangeType
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Biography
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Birthday
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.BraggingRights
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.ContactGroup
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.ContactGroupMembership
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.ContactGroupMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.CoverPhoto
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.CreateContactGroupRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Date
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.DomainMembership
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.EmailAddress
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Event
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.FieldMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Gender
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.ImClient
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Interest
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Locale
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Membership
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Name
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Nickname
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Occupation
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Organization
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Person
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.PersonMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.PhoneNumber
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Photo
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.ProfileMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Relation
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.RelationshipInterest
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.RelationshipStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Residence
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.SipAddress
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Skill
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Source
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Tagline
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.UpdateContactGroupRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.Url
import typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema.UserDefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait People_ extends js.Object {
  var ContactGroups: js.UndefOr[ContactGroupsCollection] = js.undefined
  var People: js.UndefOr[PeopleCollection] = js.undefined
  // Create a new instance of Address
  def newAddress(): Address
  // Create a new instance of AgeRangeType
  def newAgeRangeType(): AgeRangeType
  // Create a new instance of Biography
  def newBiography(): Biography
  // Create a new instance of Birthday
  def newBirthday(): Birthday
  // Create a new instance of BraggingRights
  def newBraggingRights(): BraggingRights
  // Create a new instance of ContactGroup
  def newContactGroup(): ContactGroup
  // Create a new instance of ContactGroupMembership
  def newContactGroupMembership(): ContactGroupMembership
  // Create a new instance of ContactGroupMetadata
  def newContactGroupMetadata(): ContactGroupMetadata
  // Create a new instance of CoverPhoto
  def newCoverPhoto(): CoverPhoto
  // Create a new instance of CreateContactGroupRequest
  def newCreateContactGroupRequest(): CreateContactGroupRequest
  // Create a new instance of Date
  def newDate(): Date
  // Create a new instance of DomainMembership
  def newDomainMembership(): DomainMembership
  // Create a new instance of EmailAddress
  def newEmailAddress(): EmailAddress
  // Create a new instance of Event
  def newEvent(): Event
  // Create a new instance of FieldMetadata
  def newFieldMetadata(): FieldMetadata
  // Create a new instance of Gender
  def newGender(): Gender
  // Create a new instance of ImClient
  def newImClient(): ImClient
  // Create a new instance of Interest
  def newInterest(): Interest
  // Create a new instance of Locale
  def newLocale(): Locale
  // Create a new instance of Membership
  def newMembership(): Membership
  // Create a new instance of ModifyContactGroupMembersRequest
  def newModifyContactGroupMembersRequest(): ModifyContactGroupMembersRequest
  // Create a new instance of Name
  def newName(): Name
  // Create a new instance of Nickname
  def newNickname(): Nickname
  // Create a new instance of Occupation
  def newOccupation(): Occupation
  // Create a new instance of Organization
  def newOrganization(): Organization
  // Create a new instance of Person
  def newPerson(): Person
  // Create a new instance of PersonMetadata
  def newPersonMetadata(): PersonMetadata
  // Create a new instance of PhoneNumber
  def newPhoneNumber(): PhoneNumber
  // Create a new instance of Photo
  def newPhoto(): Photo
  // Create a new instance of ProfileMetadata
  def newProfileMetadata(): ProfileMetadata
  // Create a new instance of Relation
  def newRelation(): Relation
  // Create a new instance of RelationshipInterest
  def newRelationshipInterest(): RelationshipInterest
  // Create a new instance of RelationshipStatus
  def newRelationshipStatus(): RelationshipStatus
  // Create a new instance of Residence
  def newResidence(): Residence
  // Create a new instance of SipAddress
  def newSipAddress(): SipAddress
  // Create a new instance of Skill
  def newSkill(): Skill
  // Create a new instance of Source
  def newSource(): Source
  // Create a new instance of Tagline
  def newTagline(): Tagline
  // Create a new instance of UpdateContactGroupRequest
  def newUpdateContactGroupRequest(): UpdateContactGroupRequest
  // Create a new instance of Url
  def newUrl(): Url
  // Create a new instance of UserDefined
  def newUserDefined(): UserDefined
}

object People_ {
  @scala.inline
  def apply(
    newAddress: () => Address,
    newAgeRangeType: () => AgeRangeType,
    newBiography: () => Biography,
    newBirthday: () => Birthday,
    newBraggingRights: () => BraggingRights,
    newContactGroup: () => ContactGroup,
    newContactGroupMembership: () => ContactGroupMembership,
    newContactGroupMetadata: () => ContactGroupMetadata,
    newCoverPhoto: () => CoverPhoto,
    newCreateContactGroupRequest: () => CreateContactGroupRequest,
    newDate: () => Date,
    newDomainMembership: () => DomainMembership,
    newEmailAddress: () => EmailAddress,
    newEvent: () => Event,
    newFieldMetadata: () => FieldMetadata,
    newGender: () => Gender,
    newImClient: () => ImClient,
    newInterest: () => Interest,
    newLocale: () => Locale,
    newMembership: () => Membership,
    newModifyContactGroupMembersRequest: () => ModifyContactGroupMembersRequest,
    newName: () => Name,
    newNickname: () => Nickname,
    newOccupation: () => Occupation,
    newOrganization: () => Organization,
    newPerson: () => Person,
    newPersonMetadata: () => PersonMetadata,
    newPhoneNumber: () => PhoneNumber,
    newPhoto: () => Photo,
    newProfileMetadata: () => ProfileMetadata,
    newRelation: () => Relation,
    newRelationshipInterest: () => RelationshipInterest,
    newRelationshipStatus: () => RelationshipStatus,
    newResidence: () => Residence,
    newSipAddress: () => SipAddress,
    newSkill: () => Skill,
    newSource: () => Source,
    newTagline: () => Tagline,
    newUpdateContactGroupRequest: () => UpdateContactGroupRequest,
    newUrl: () => Url,
    newUserDefined: () => UserDefined,
    ContactGroups: ContactGroupsCollection = null,
    People: PeopleCollection = null
  ): People_ = {
    val __obj = js.Dynamic.literal(newAddress = js.Any.fromFunction0(newAddress), newAgeRangeType = js.Any.fromFunction0(newAgeRangeType), newBiography = js.Any.fromFunction0(newBiography), newBirthday = js.Any.fromFunction0(newBirthday), newBraggingRights = js.Any.fromFunction0(newBraggingRights), newContactGroup = js.Any.fromFunction0(newContactGroup), newContactGroupMembership = js.Any.fromFunction0(newContactGroupMembership), newContactGroupMetadata = js.Any.fromFunction0(newContactGroupMetadata), newCoverPhoto = js.Any.fromFunction0(newCoverPhoto), newCreateContactGroupRequest = js.Any.fromFunction0(newCreateContactGroupRequest), newDate = js.Any.fromFunction0(newDate), newDomainMembership = js.Any.fromFunction0(newDomainMembership), newEmailAddress = js.Any.fromFunction0(newEmailAddress), newEvent = js.Any.fromFunction0(newEvent), newFieldMetadata = js.Any.fromFunction0(newFieldMetadata), newGender = js.Any.fromFunction0(newGender), newImClient = js.Any.fromFunction0(newImClient), newInterest = js.Any.fromFunction0(newInterest), newLocale = js.Any.fromFunction0(newLocale), newMembership = js.Any.fromFunction0(newMembership), newModifyContactGroupMembersRequest = js.Any.fromFunction0(newModifyContactGroupMembersRequest), newName = js.Any.fromFunction0(newName), newNickname = js.Any.fromFunction0(newNickname), newOccupation = js.Any.fromFunction0(newOccupation), newOrganization = js.Any.fromFunction0(newOrganization), newPerson = js.Any.fromFunction0(newPerson), newPersonMetadata = js.Any.fromFunction0(newPersonMetadata), newPhoneNumber = js.Any.fromFunction0(newPhoneNumber), newPhoto = js.Any.fromFunction0(newPhoto), newProfileMetadata = js.Any.fromFunction0(newProfileMetadata), newRelation = js.Any.fromFunction0(newRelation), newRelationshipInterest = js.Any.fromFunction0(newRelationshipInterest), newRelationshipStatus = js.Any.fromFunction0(newRelationshipStatus), newResidence = js.Any.fromFunction0(newResidence), newSipAddress = js.Any.fromFunction0(newSipAddress), newSkill = js.Any.fromFunction0(newSkill), newSource = js.Any.fromFunction0(newSource), newTagline = js.Any.fromFunction0(newTagline), newUpdateContactGroupRequest = js.Any.fromFunction0(newUpdateContactGroupRequest), newUrl = js.Any.fromFunction0(newUrl), newUserDefined = js.Any.fromFunction0(newUserDefined))
    if (ContactGroups != null) __obj.updateDynamic("ContactGroups")(ContactGroups.asInstanceOf[js.Any])
    if (People != null) __obj.updateDynamic("People")(People.asInstanceOf[js.Any])
    __obj.asInstanceOf[People_]
  }
}

