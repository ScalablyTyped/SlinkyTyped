package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ordering of medication for patient or group
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait MedicationRequest extends DomainResource {
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * When request was initially authored
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Created during encounter/admission/stay
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Clinical Issue with action
    */
  var detectedIssue: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Medication supply authorization
    */
  var dispenseRequest: js.UndefOr[MedicationRequestDispenseRequest] = js.native
  /**
    * How the medication should be taken
    */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.native
  /**
    * A list of events of interest in the lifecycle
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Composite request this is part of
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * External ids for this request
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * proposal | plan | order | instance-order
    */
  var intent: code = js.native
  /**
    * Medication to be taken
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Medication to be taken
    */
  var medicationReference: js.UndefOr[Reference] = js.native
  /**
    * Information about the prescription
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * An order/prescription that is being replaced
    */
  var priorPrescription: js.UndefOr[Reference] = js.native
  /**
    * routine | urgent | stat | asap
    */
  var priority: js.UndefOr[code] = js.native
  /**
    * Reason or indication for writing the prescription
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Condition or Observation that supports why the prescription is being written
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Person who entered the request
    */
  var recorder: js.UndefOr[Reference] = js.native
  /**
    * Who/What requested the Request
    */
  var requester: js.UndefOr[MedicationRequestRequester] = js.native
  /**
    * active | on-hold | cancelled | completed | entered-in-error | stopped | draft | unknown
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Who or group medication request is for
    */
  var subject: Reference = js.native
  /**
    * Any restrictions on medication substitution
    */
  var substitution: js.UndefOr[MedicationRequestSubstitution] = js.native
  /**
    * Information to support ordering of the medication
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
}

object MedicationRequest {
  @scala.inline
  def apply(intent: code, subject: Reference): MedicationRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationRequest]
  }
  @scala.inline
  implicit class MedicationRequestOps[Self <: MedicationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_authoredOn(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authoredOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_authoredOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authoredOn")(js.undefined)
        ret
    }
    @scala.inline
    def with_intent(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_intent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_intent")(js.undefined)
        ret
    }
    @scala.inline
    def with_priority(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_priority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_priority")(js.undefined)
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
    def withAuthoredOn(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoredOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthoredOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoredOn")(js.undefined)
        ret
    }
    @scala.inline
    def withBasedOn(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(js.undefined)
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
    def withDispenseRequest(value: MedicationRequestDispenseRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispenseRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispenseRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispenseRequest")(js.undefined)
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
    def withGroupIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIdentifier")(js.undefined)
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
    def withPriorPrescription(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorPrescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriorPrescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorPrescription")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
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
    def withRecorder(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorder")(js.undefined)
        ret
    }
    @scala.inline
    def withRequester(value: MedicationRequestRequester): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequester: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(js.undefined)
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
    def withSubstitution(value: MedicationRequestSubstitution): Self = {
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
  }
  
}

