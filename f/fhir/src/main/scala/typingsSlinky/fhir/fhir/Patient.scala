package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class PatientMutableBuilder[Self <: Patient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value :_*))
    
    @scala.inline
    def setAnimal(value: PatientAnimal): Self = StObject.set(x, "animal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimalUndefined: Self = StObject.set(x, "animal", js.undefined)
    
    @scala.inline
    def setBirthDate(value: date): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
    @scala.inline
    def setCommunication(value: js.Array[PatientCommunication]): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunicationUndefined: Self = StObject.set(x, "communication", js.undefined)
    
    @scala.inline
    def setCommunicationVarargs(value: PatientCommunication*): Self = StObject.set(x, "communication", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[PatientContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: PatientContact*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setDeceasedBoolean(value: Boolean): Self = StObject.set(x, "deceasedBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeceasedBooleanUndefined: Self = StObject.set(x, "deceasedBoolean", js.undefined)
    
    @scala.inline
    def setDeceasedDateTime(value: dateTime): Self = StObject.set(x, "deceasedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeceasedDateTimeUndefined: Self = StObject.set(x, "deceasedDateTime", js.undefined)
    
    @scala.inline
    def setGender(value: code): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setGeneralPractitioner(value: js.Array[Reference]): Self = StObject.set(x, "generalPractitioner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralPractitionerUndefined: Self = StObject.set(x, "generalPractitioner", js.undefined)
    
    @scala.inline
    def setGeneralPractitionerVarargs(value: Reference*): Self = StObject.set(x, "generalPractitioner", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[PatientLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: PatientLink*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    @scala.inline
    def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    @scala.inline
    def setMaritalStatus(value: CodeableConcept): Self = StObject.set(x, "maritalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaritalStatusUndefined: Self = StObject.set(x, "maritalStatus", js.undefined)
    
    @scala.inline
    def setMultipleBirthBoolean(value: Boolean): Self = StObject.set(x, "multipleBirthBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleBirthBooleanUndefined: Self = StObject.set(x, "multipleBirthBoolean", js.undefined)
    
    @scala.inline
    def setMultipleBirthInteger(value: integer): Self = StObject.set(x, "multipleBirthInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleBirthIntegerUndefined: Self = StObject.set(x, "multipleBirthInteger", js.undefined)
    
    @scala.inline
    def setName(value: js.Array[HumanName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: HumanName*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setPhoto(value: js.Array[Attachment]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setPhotoVarargs(value: Attachment*): Self = StObject.set(x, "photo", js.Array(value :_*))
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    @scala.inline
    def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    @scala.inline
    def set_birthDate(value: Element): Self = StObject.set(x, "_birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_birthDateUndefined: Self = StObject.set(x, "_birthDate", js.undefined)
    
    @scala.inline
    def set_deceasedBoolean(value: Element): Self = StObject.set(x, "_deceasedBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_deceasedBooleanUndefined: Self = StObject.set(x, "_deceasedBoolean", js.undefined)
    
    @scala.inline
    def set_deceasedDateTime(value: Element): Self = StObject.set(x, "_deceasedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_deceasedDateTimeUndefined: Self = StObject.set(x, "_deceasedDateTime", js.undefined)
    
    @scala.inline
    def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
    
    @scala.inline
    def set_multipleBirthBoolean(value: Element): Self = StObject.set(x, "_multipleBirthBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_multipleBirthBooleanUndefined: Self = StObject.set(x, "_multipleBirthBoolean", js.undefined)
    
    @scala.inline
    def set_multipleBirthInteger(value: Element): Self = StObject.set(x, "_multipleBirthInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_multipleBirthIntegerUndefined: Self = StObject.set(x, "_multipleBirthInteger", js.undefined)
  }
}
