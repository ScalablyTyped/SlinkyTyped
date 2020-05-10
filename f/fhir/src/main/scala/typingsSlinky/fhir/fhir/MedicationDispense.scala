package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dispensing a medication to a named patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait MedicationDispense extends DomainResource {
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'whenHandedOver'.
    */
  var _whenHandedOver: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'whenPrepared'.
    */
  var _whenPrepared: js.UndefOr[Element] = js.native
  /**
    * Medication order that authorizes the dispense
    */
  var authorizingPrescription: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Type of medication dispense
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Encounter / Episode associated with event
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Amount of medication expressed as a timing amount
    */
  var daysSupply: js.UndefOr[Quantity] = js.native
  /**
    * Where the medication was sent
    */
  var destination: js.UndefOr[Reference] = js.native
  /**
    * Clinical issue with action
    */
  var detectedIssue: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * How the medication is to be used by the patient or administered by the caregiver
    */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.native
  /**
    * A list of releveant lifecycle events
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * What medication was supplied
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * What medication was supplied
    */
  var medicationReference: js.UndefOr[Reference] = js.native
  /**
    * Whether the dispense was or was not performed
    */
  var notDone: js.UndefOr[Boolean] = js.native
  /**
    * Why a dispense was not performed
    */
  var notDoneReasonCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Why a dispense was not performed
    */
  var notDoneReasonReference: js.UndefOr[Reference] = js.native
  /**
    * Information about the dispense
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Event that dispense is part of
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who performed event
    */
  var performer: js.UndefOr[js.Array[MedicationDispensePerformer]] = js.native
  /**
    * Amount dispensed
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Who collected the medication
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * preparation | in-progress | on-hold | completed | entered-in-error | stopped
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Who the dispense is for
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * Whether a substitution was performed on the dispense
    */
  var substitution: js.UndefOr[MedicationDispenseSubstitution] = js.native
  /**
    * Information that supports the dispensing of the medication
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Trial fill, partial fill, emergency fill, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  /**
    * When product was given out
    */
  var whenHandedOver: js.UndefOr[dateTime] = js.native
  /**
    * When product was packaged and reviewed
    */
  var whenPrepared: js.UndefOr[dateTime] = js.native
}

object MedicationDispense {
  @scala.inline
  def apply(): MedicationDispense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationDispense]
  }
  @scala.inline
  implicit class MedicationDispenseOps[Self <: MedicationDispense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_notDone(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_notDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notDone")(js.undefined)
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
    def with_whenHandedOver(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whenHandedOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_whenHandedOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whenHandedOver")(js.undefined)
        ret
    }
    @scala.inline
    def with_whenPrepared(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whenPrepared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_whenPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whenPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizingPrescription(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizingPrescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizingPrescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizingPrescription")(js.undefined)
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
    def withDaysSupply(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysSupply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysSupply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysSupply")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedIssue(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedIssue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedIssue")(js.undefined)
        ret
    }
    @scala.inline
    def withDosageInstruction(value: js.Array[Dosage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosageInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDosageInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosageInstruction")(js.undefined)
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
    def withNotDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDone")(js.undefined)
        ret
    }
    @scala.inline
    def withNotDoneReasonCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDoneReasonCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotDoneReasonCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDoneReasonCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withNotDoneReasonReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDoneReasonReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotDoneReasonReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDoneReasonReference")(js.undefined)
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
    def withPerformer(value: js.Array[MedicationDispensePerformer]): Self = {
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
    def withQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiver(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitution(value: MedicationDispenseSubstitution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution")(js.undefined)
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
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenHandedOver(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenHandedOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhenHandedOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenHandedOver")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenPrepared(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenPrepared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhenPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenPrepared")(js.undefined)
        ret
    }
  }
  
}

