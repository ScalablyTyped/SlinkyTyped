package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an individual or animal receiving health care services
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Patient extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deceasedBoolean'.
    */
  var _deceasedBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deceasedDateTime'.
    */
  var _deceasedDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'multipleBirthBoolean'.
    */
  var _multipleBirthBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'multipleBirthInteger'.
    */
  var _multipleBirthInteger: js.UndefOr[Element] = js.native
  /**
    * Whether this patient's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Addresses for the individual
    */
  var address: js.UndefOr[js.Array[Address]] = js.native
  /**
    * This patient is known to be an animal (non-human)
    */
  var animal: js.UndefOr[PatientAnimal] = js.native
  /**
    * The date of birth for the individual
    */
  var birthDate: js.UndefOr[date] = js.native
  /**
    * A list of Languages which may be used to communicate with the patient about their health
    */
  var communication: js.UndefOr[js.Array[PatientCommunication]] = js.native
  /**
    * A contact party (e.g. guardian, partner, friend) for the patient
    */
  var contact: js.UndefOr[js.Array[PatientContact]] = js.native
  /**
    * Indicates if the individual is deceased or not
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the individual is deceased or not
    */
  var deceasedDateTime: js.UndefOr[dateTime] = js.native
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  /**
    * Patient's nominated primary care provider
    */
  var generalPractitioner: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * An identifier for this patient
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Link to another patient resource that concerns the same actual person
    */
  var link: js.UndefOr[js.Array[PatientLink]] = js.native
  /**
    * Organization that is the custodian of the patient record
    */
  var managingOrganization: js.UndefOr[Reference] = js.native
  /**
    * Marital (civil) status of a patient
    */
  var maritalStatus: js.UndefOr[CodeableConcept] = js.native
  /**
    * Whether patient is part of a multiple birth
    */
  var multipleBirthBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Whether patient is part of a multiple birth
    */
  var multipleBirthInteger: js.UndefOr[integer] = js.native
  /**
    * A name associated with the patient
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.native
  /**
    * Image of the patient
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.native
  /**
    * A contact detail for the individual
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}

object Patient {
  @scala.inline
  def apply(): Patient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Patient]
  }
  @scala.inline
  implicit class PatientOps[Self <: Patient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def with_deceasedBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_deceasedBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_deceasedDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_deceasedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedDateTime")(js.undefined)
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
    def with_multipleBirthBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_multipleBirthBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_multipleBirthBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_multipleBirthBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_multipleBirthInteger(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_multipleBirthInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_multipleBirthInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_multipleBirthInteger")(js.undefined)
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
    def withAnimal(value: PatientAnimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animal")(js.undefined)
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
    def withCommunication(value: js.Array[PatientCommunication]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("communication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommunication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("communication")(js.undefined)
        ret
    }
    @scala.inline
    def withContact(value: js.Array[PatientContact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
        ret
    }
    @scala.inline
    def withDeceasedBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceasedBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withDeceasedDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceasedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedDateTime")(js.undefined)
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
    def withGeneralPractitioner(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generalPractitioner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneralPractitioner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generalPractitioner")(js.undefined)
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
    def withLink(value: js.Array[PatientLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withManagingOrganization(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagingOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingOrganization")(js.undefined)
        ret
    }
    @scala.inline
    def withMaritalStatus(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maritalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaritalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maritalStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleBirthBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleBirthBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleBirthBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleBirthBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleBirthInteger(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleBirthInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleBirthInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleBirthInteger")(js.undefined)
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

