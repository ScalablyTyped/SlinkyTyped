package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Medical care, research study or other healthcare event causing physical injury
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait AdverseEvent extends DomainResource {
  
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * AE | PAE
    * An adverse event is an event that caused harm to a patient,  an adverse reaction is a something that is a subject-specific event that is a result of an exposure to a medication, food, device or environmental substance, a potential adverse event is something that occurred and that could have caused harm to a patient but did not
    */
  var category: js.UndefOr[code] = js.native
  
  /**
    * When the event occurred
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Description of the adverse event
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Who  was involved in the adverse event or the potential adverse event
    */
  var eventParticipant: js.UndefOr[Reference] = js.native
  
  /**
    * Business identifier for the event
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Location where adverse event occurred
    */
  var location: js.UndefOr[Reference] = js.native
  
  /**
    * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Adverse Reaction Events linked to exposure to substance
    */
  var reaction: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Who recorded the adverse event
    */
  var recorder: js.UndefOr[Reference] = js.native
  
  /**
    * AdverseEvent.referenceDocument
    */
  var referenceDocument: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Mild | Moderate | Severe
    */
  var seriousness: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * AdverseEvent.study
    */
  var study: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Subject or group impacted by event
    */
  var subject: js.UndefOr[Reference] = js.native
  
  /**
    * AdverseEvent.subjectMedicalHistory
    */
  var subjectMedicalHistory: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * The suspected agent causing the adverse event
    */
  var suspectEntity: js.UndefOr[js.Array[AdverseEventSuspectEntity]] = js.native
  
  /**
    * actual | potential
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object AdverseEvent {
  
  @scala.inline
  def apply(): AdverseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdverseEvent]
  }
  
  @scala.inline
  implicit class AdverseEventMutableBuilder[Self <: AdverseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: code): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEventParticipant(value: Reference): Self = StObject.set(x, "eventParticipant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventParticipantUndefined: Self = StObject.set(x, "eventParticipant", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setReaction(value: js.Array[Reference]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    @scala.inline
    def setReactionVarargs(value: Reference*): Self = StObject.set(x, "reaction", js.Array(value :_*))
    
    @scala.inline
    def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    @scala.inline
    def setReferenceDocument(value: js.Array[Reference]): Self = StObject.set(x, "referenceDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceDocumentUndefined: Self = StObject.set(x, "referenceDocument", js.undefined)
    
    @scala.inline
    def setReferenceDocumentVarargs(value: Reference*): Self = StObject.set(x, "referenceDocument", js.Array(value :_*))
    
    @scala.inline
    def setSeriousness(value: CodeableConcept): Self = StObject.set(x, "seriousness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriousnessUndefined: Self = StObject.set(x, "seriousness", js.undefined)
    
    @scala.inline
    def setStudy(value: js.Array[Reference]): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudyUndefined: Self = StObject.set(x, "study", js.undefined)
    
    @scala.inline
    def setStudyVarargs(value: Reference*): Self = StObject.set(x, "study", js.Array(value :_*))
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectMedicalHistory(value: js.Array[Reference]): Self = StObject.set(x, "subjectMedicalHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectMedicalHistoryUndefined: Self = StObject.set(x, "subjectMedicalHistory", js.undefined)
    
    @scala.inline
    def setSubjectMedicalHistoryVarargs(value: Reference*): Self = StObject.set(x, "subjectMedicalHistory", js.Array(value :_*))
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setSuspectEntity(value: js.Array[AdverseEventSuspectEntity]): Self = StObject.set(x, "suspectEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspectEntityUndefined: Self = StObject.set(x, "suspectEntity", js.undefined)
    
    @scala.inline
    def setSuspectEntityVarargs(value: AdverseEventSuspectEntity*): Self = StObject.set(x, "suspectEntity", js.Array(value :_*))
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_category(value: Element): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
