package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for a procedure or diagnostic to be performed
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ProcedureRequest extends DomainResource {
  
  /**
    * Contains extended information for property 'asNeededBoolean'.
    */
  var _asNeededBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'doNotPerform'.
    */
  var _doNotPerform: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.native
  
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
    * Preconditions for procedure or diagnostic
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Preconditions for procedure or diagnostic
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Date request signed
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Location on Body
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Classification of procedure
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * What is being requested/ordered
    */
  var code: CodeableConcept = js.native
  
  /**
    * Encounter or Episode during which request was created
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * True if procedure should not be performed
    */
  var doNotPerform: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifiers assigned to this order
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * proposal | plan | order +
    */
  var intent: code = js.native
  
  /**
    * Comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * When procedure should occur
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * When procedure should occur
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  
  /**
    * When procedure should occur
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.native
  
  /**
    * Requested perfomer
    */
  var performer: js.UndefOr[Reference] = js.native
  
  /**
    * Performer role
    */
  var performerType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * routine | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.native
  
  /**
    * Explanation/Justification for test
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Explanation/Justification for test
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Request provenance
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * What request replaces
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Who/what is requesting procedure or diagnostic
    */
  var requester: js.UndefOr[ProcedureRequestRequester] = js.native
  
  /**
    * Composite Request ID
    */
  var requisition: js.UndefOr[Identifier] = js.native
  
  /**
    * Procedure Samples
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * draft | active | suspended | completed | entered-in-error | cancelled
    */
  var status: code = js.native
  
  /**
    * Individual the service is ordered for
    */
  var subject: Reference = js.native
  
  /**
    * Additional clinical information
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.native
}
object ProcedureRequest {
  
  @scala.inline
  def apply(code: CodeableConcept, intent: code, status: code, subject: Reference): ProcedureRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureRequest]
  }
  
  @scala.inline
  implicit class ProcedureRequestMutableBuilder[Self <: ProcedureRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsNeededBoolean(value: Boolean): Self = StObject.set(x, "asNeededBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsNeededBooleanUndefined: Self = StObject.set(x, "asNeededBoolean", js.undefined)
    
    @scala.inline
    def setAsNeededCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "asNeededCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsNeededCodeableConceptUndefined: Self = StObject.set(x, "asNeededCodeableConcept", js.undefined)
    
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    @scala.inline
    def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    @scala.inline
    def setDoNotPerform(value: Boolean): Self = StObject.set(x, "doNotPerform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotPerformUndefined: Self = StObject.set(x, "doNotPerform", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setIntent(value: code): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    @scala.inline
    def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    @scala.inline
    def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerType(value: CodeableConcept): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setPriority(value: code): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    @scala.inline
    def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value :_*))
    
    @scala.inline
    def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    @scala.inline
    def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value :_*))
    
    @scala.inline
    def setRequester(value: ProcedureRequestRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    @scala.inline
    def setRequisition(value: Identifier): Self = StObject.set(x, "requisition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequisitionUndefined: Self = StObject.set(x, "requisition", js.undefined)
    
    @scala.inline
    def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    @scala.inline
    def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInfo(value: js.Array[Reference]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    @scala.inline
    def setSupportingInfoVarargs(value: Reference*): Self = StObject.set(x, "supportingInfo", js.Array(value :_*))
    
    @scala.inline
    def set_asNeededBoolean(value: Element): Self = StObject.set(x, "_asNeededBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_asNeededBooleanUndefined: Self = StObject.set(x, "_asNeededBoolean", js.undefined)
    
    @scala.inline
    def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    @scala.inline
    def set_doNotPerform(value: Element): Self = StObject.set(x, "_doNotPerform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_doNotPerformUndefined: Self = StObject.set(x, "_doNotPerform", js.undefined)
    
    @scala.inline
    def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
