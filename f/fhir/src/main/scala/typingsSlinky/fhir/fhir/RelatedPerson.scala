package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An person that is related to a patient, but who is not a direct target of care
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait RelatedPerson extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  /**
    * Whether this related person's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Address where the related person can be contacted or visited
    */
  var address: js.UndefOr[js.Array[Address]] = js.native
  /**
    * The date on which the related person was born
    */
  var birthDate: js.UndefOr[date] = js.native
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  /**
    * A human identifier for this person
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * A name associated with the person
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.native
  /**
    * The patient this person is related to
    */
  var patient: Reference = js.native
  /**
    * Period of time that this relationship is considered valid
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Image of the person
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.native
  /**
    * The nature of the relationship
    */
  var relationship: js.UndefOr[CodeableConcept] = js.native
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}

object RelatedPerson {
  @scala.inline
  def apply(patient: Reference): RelatedPerson = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedPerson]
  }
  @scala.inline
  implicit class RelatedPersonOps[Self <: RelatedPerson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_active(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_active: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_active")(js.undefined)
        ret
    }
    @scala.inline
    def with_birthDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_birthDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_birthDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_birthDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_gender(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gender")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress(value: js.Array[Address]): Self = {
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
    def withBirthDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBirthDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: code): Self = {
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
    def withIdentifier(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: js.Array[HumanName]): Self = {
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
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationship(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationship: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(js.undefined)
        ret
    }
    @scala.inline
    def withTelecom(value: js.Array[ContactPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telecom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelecom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telecom")(js.undefined)
        ret
    }
  }
  
}

