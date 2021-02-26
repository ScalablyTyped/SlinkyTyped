package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action that is being or was performed on a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Procedure extends DomainResource {
  
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'performedDateTime'.
    */
  var _performedDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * A request for this procedure
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Target body sites
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Classification of the procedure
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Identification of the procedure
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Complication following the procedure
    */
  var complication: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * A condition that is a result of the procedure
    */
  var complicationDetail: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Encounter or episode associated with the procedure
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Device changed in procedure
    */
  var focalDevice: js.UndefOr[js.Array[ProcedureFocalDevice]] = js.native
  
  /**
    * Instructions for follow up
    */
  var followUp: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * External Identifiers for this procedure
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Where the procedure happened
    */
  var location: js.UndefOr[Reference] = js.native
  
  /**
    * True if procedure was not performed as scheduled
    */
  var notDone: js.UndefOr[Boolean] = js.native
  
  /**
    * Reason procedure was not performed
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Additional information about the procedure
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * The result of procedure
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Date/Period the procedure was performed
    */
  var performedDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Date/Period the procedure was performed
    */
  var performedPeriod: js.UndefOr[Period] = js.native
  
  /**
    * The people who performed the procedure
    */
  var performer: js.UndefOr[js.Array[ProcedurePerformer]] = js.native
  
  /**
    * Coded reason procedure performed
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Condition that is the reason the procedure performed
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Any report resulting from the procedure
    */
  var report: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * preparation | in-progress | suspended | aborted | completed | entered-in-error | unknown
    */
  var status: code = js.native
  
  /**
    * Who the procedure was performed on
    */
  var subject: Reference = js.native
  
  /**
    * Coded items used during the procedure
    */
  var usedCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Items used during procedure
    */
  var usedReference: js.UndefOr[js.Array[Reference]] = js.native
}
object Procedure {
  
  @scala.inline
  def apply(status: code, subject: Reference): Procedure = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  
  @scala.inline
  implicit class ProcedureMutableBuilder[Self <: Procedure] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setComplication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "complication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplicationDetail(value: js.Array[Reference]): Self = StObject.set(x, "complicationDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplicationDetailUndefined: Self = StObject.set(x, "complicationDetail", js.undefined)
    
    @scala.inline
    def setComplicationDetailVarargs(value: Reference*): Self = StObject.set(x, "complicationDetail", js.Array(value :_*))
    
    @scala.inline
    def setComplicationUndefined: Self = StObject.set(x, "complication", js.undefined)
    
    @scala.inline
    def setComplicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "complication", js.Array(value :_*))
    
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
    def setFocalDevice(value: js.Array[ProcedureFocalDevice]): Self = StObject.set(x, "focalDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalDeviceUndefined: Self = StObject.set(x, "focalDevice", js.undefined)
    
    @scala.inline
    def setFocalDeviceVarargs(value: ProcedureFocalDevice*): Self = StObject.set(x, "focalDevice", js.Array(value :_*))
    
    @scala.inline
    def setFollowUp(value: js.Array[CodeableConcept]): Self = StObject.set(x, "followUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUpUndefined: Self = StObject.set(x, "followUp", js.undefined)
    
    @scala.inline
    def setFollowUpVarargs(value: CodeableConcept*): Self = StObject.set(x, "followUp", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNotDone(value: Boolean): Self = StObject.set(x, "notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotDoneReason(value: CodeableConcept): Self = StObject.set(x, "notDoneReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotDoneReasonUndefined: Self = StObject.set(x, "notDoneReason", js.undefined)
    
    @scala.inline
    def setNotDoneUndefined: Self = StObject.set(x, "notDone", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    @scala.inline
    def setPerformedDateTime(value: dateTime): Self = StObject.set(x, "performedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformedDateTimeUndefined: Self = StObject.set(x, "performedDateTime", js.undefined)
    
    @scala.inline
    def setPerformedPeriod(value: Period): Self = StObject.set(x, "performedPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformedPeriodUndefined: Self = StObject.set(x, "performedPeriod", js.undefined)
    
    @scala.inline
    def setPerformer(value: js.Array[ProcedurePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: ProcedurePerformer*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
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
    def setReport(value: js.Array[Reference]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    @scala.inline
    def setReportVarargs(value: Reference*): Self = StObject.set(x, "report", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "usedCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedCodeUndefined: Self = StObject.set(x, "usedCode", js.undefined)
    
    @scala.inline
    def setUsedCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "usedCode", js.Array(value :_*))
    
    @scala.inline
    def setUsedReference(value: js.Array[Reference]): Self = StObject.set(x, "usedReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedReferenceUndefined: Self = StObject.set(x, "usedReference", js.undefined)
    
    @scala.inline
    def setUsedReferenceVarargs(value: Reference*): Self = StObject.set(x, "usedReference", js.Array(value :_*))
    
    @scala.inline
    def set_notDone(value: Element): Self = StObject.set(x, "_notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_notDoneUndefined: Self = StObject.set(x, "_notDone", js.undefined)
    
    @scala.inline
    def set_performedDateTime(value: Element): Self = StObject.set(x, "_performedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_performedDateTimeUndefined: Self = StObject.set(x, "_performedDateTime", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
