package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Medical device request
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait DeviceRequest extends DomainResource {
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * When recorded
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Device requested
    */
  var codeCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Device requested
    */
  var codeReference: js.UndefOr[Reference] = js.native
  /**
    * Encounter or Episode motivating request
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Identifier of composite request
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * External Request identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * proposal | plan | original-order | encoded | reflex-order
    */
  var intent: CodeableConcept = js.native
  /**
    * Notes or comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Desired time or schedule for use
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Desired time or schedule for use
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  /**
    * Desired time or schedule for use
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.native
  /**
    * Requested Filler
    */
  var performer: js.UndefOr[Reference] = js.native
  /**
    * Fille role
    */
  var performerType: js.UndefOr[CodeableConcept] = js.native
  /**
    * What request replaces
    */
  var priorRequest: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Indicates how quickly the {{title}} should be addressed with respect to other requests
    */
  var priority: js.UndefOr[code] = js.native
  /**
    * Coded Reason for request
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Linked Reason for request
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Request provenance
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who/what is requesting diagnostics
    */
  var requester: js.UndefOr[DeviceRequestRequester] = js.native
  /**
    * draft | active | suspended | completed | entered-in-error | cancelled
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Focus of request
    */
  var subject: Reference = js.native
  /**
    * Additional clinical information
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.native
}

object DeviceRequest {
  @scala.inline
  def apply(intent: CodeableConcept, subject: Reference): DeviceRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceRequest]
  }
  @scala.inline
  implicit class DeviceRequestOps[Self <: DeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: CodeableConcept): Self = {
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
    def with_occurrenceDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_occurrenceDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_occurrenceDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_occurrenceDateTime")(js.undefined)
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
    def withCodeCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeReference")(js.undefined)
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
    def withOccurrenceDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrencePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrencePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrenceTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformer(value: Reference): Self = {
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
    def withPerformerType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performerType")(js.undefined)
        ret
    }
    @scala.inline
    def withPriorRequest(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriorRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorRequest")(js.undefined)
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
    def withRelevantHistory(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevantHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelevantHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevantHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withRequester(value: DeviceRequestRequester): Self = {
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
    def withSupportingInfo(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingInfo")(js.undefined)
        ret
    }
  }
  
}

