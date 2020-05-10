package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Administration of medication to a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait MedicationAdministration extends DomainResource {
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'notGiven'.
    */
  var _notGiven: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Encounter or Episode of Care administered as part of
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Device used to administer
    */
  var device: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Details of how medication was taken
    */
  var dosage: js.UndefOr[MedicationAdministrationDosage] = js.native
  /**
    * Start and end time of administration
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Start and end time of administration
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  /**
    * A list of events of interest in the lifecycle
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * What was administered
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * What was administered
    */
  var medicationReference: js.UndefOr[Reference] = js.native
  /**
    * True if medication not administered
    */
  var notGiven: js.UndefOr[Boolean] = js.native
  /**
    * Information about the administration
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who administered substance
    */
  var performer: js.UndefOr[js.Array[MedicationAdministrationPerformer]] = js.native
  /**
    * Request administration performed against
    */
  var prescription: js.UndefOr[Reference] = js.native
  /**
    * Reason administration performed
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Reason administration not performed
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Condition or Observation that supports why the medication was administered
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * in-progress | on-hold | completed | entered-in-error | stopped | unknown
    */
  var status: code = js.native
  /**
    * Who received medication
    */
  var subject: Reference = js.native
  /**
    * Additional information to support administration
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
}

object MedicationAdministration {
  @scala.inline
  def apply(status: code, subject: Reference): MedicationAdministration = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationAdministration]
  }
  @scala.inline
  implicit class MedicationAdministrationOps[Self <: MedicationAdministration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_effectiveDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effectiveDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_effectiveDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effectiveDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_notGiven(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notGiven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_notGiven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notGiven")(js.undefined)
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withDosage(value: MedicationAdministrationDosage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDosage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosage")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectivePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectivePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectivePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectivePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withEventHistory(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHistory")(js.undefined)
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
    def withMedicationCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicationCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedicationCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicationCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withMedicationReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicationReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedicationReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicationReference")(js.undefined)
        ret
    }
    @scala.inline
    def withNotGiven(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notGiven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotGiven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notGiven")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withPartOf(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOf")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformer(value: js.Array[MedicationAdministrationPerformer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(js.undefined)
        ret
    }
    @scala.inline
    def withPrescription(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prescription")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonNotGiven(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonNotGiven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonNotGiven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonNotGiven")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonReference(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonReference")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportingInformation(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportingInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingInformation")(js.undefined)
        ret
    }
  }
  
}

