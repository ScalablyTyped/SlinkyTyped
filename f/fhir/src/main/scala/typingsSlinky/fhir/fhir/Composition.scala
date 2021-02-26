package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of resources composed into a single coherent clinical statement with clinical attestation
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Composition extends DomainResource {
  
  /**
    * Contains extended information for property 'confidentiality'.
    */
  var _confidentiality: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Attests to accuracy of composition
    */
  var attester: js.UndefOr[js.Array[CompositionAttester]] = js.native
  
  /**
    * Who and/or what authored the composition
    */
  var author: js.Array[Reference] = js.native
  
  /**
    * Categorization of Composition
    */
  var `class`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * As defined by affinity domain
    */
  var confidentiality: js.UndefOr[code] = js.native
  
  /**
    * Organization which maintains the composition
    */
  var custodian: js.UndefOr[Reference] = js.native
  
  /**
    * Composition editing time
    */
  var date: dateTime = js.native
  
  /**
    * Context of the Composition
    */
  var encounter: js.UndefOr[Reference] = js.native
  
  /**
    * The clinical service(s) being documented
    */
  var event: js.UndefOr[js.Array[CompositionEvent]] = js.native
  
  /**
    * Logical identifier of composition (version-independent)
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Relationships to other compositions/documents
    */
  var relatesTo: js.UndefOr[js.Array[CompositionRelatesTo]] = js.native
  
  /**
    * Composition is broken into sections
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.native
  
  /**
    * preliminary | final | amended | entered-in-error
    */
  var status: code = js.native
  
  /**
    * Who and/or what the composition is about
    */
  var subject: Reference = js.native
  
  /**
    * Human Readable name/title
    */
  var title: String = js.native
  
  /**
    * Kind of composition (LOINC if possible)
    */
  var `type`: CodeableConcept = js.native
}
object Composition {
  
  @scala.inline
  def apply(
    author: js.Array[Reference],
    date: dateTime,
    status: code,
    subject: Reference,
    title: String,
    `type`: CodeableConcept
  ): Composition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Composition]
  }
  
  @scala.inline
  implicit class CompositionMutableBuilder[Self <: Composition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttester(value: js.Array[CompositionAttester]): Self = StObject.set(x, "attester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttesterUndefined: Self = StObject.set(x, "attester", js.undefined)
    
    @scala.inline
    def setAttesterVarargs(value: CompositionAttester*): Self = StObject.set(x, "attester", js.Array(value :_*))
    
    @scala.inline
    def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value :_*))
    
    @scala.inline
    def setClass(value: CodeableConcept): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setConfidentiality(value: code): Self = StObject.set(x, "confidentiality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidentialityUndefined: Self = StObject.set(x, "confidentiality", js.undefined)
    
    @scala.inline
    def setCustodian(value: Reference): Self = StObject.set(x, "custodian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustodianUndefined: Self = StObject.set(x, "custodian", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Array[CompositionEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: CompositionEvent*): Self = StObject.set(x, "event", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setRelatesTo(value: js.Array[CompositionRelatesTo]): Self = StObject.set(x, "relatesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatesToUndefined: Self = StObject.set(x, "relatesTo", js.undefined)
    
    @scala.inline
    def setRelatesToVarargs(value: CompositionRelatesTo*): Self = StObject.set(x, "relatesTo", js.Array(value :_*))
    
    @scala.inline
    def setSection(value: js.Array[CompositionSection]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    @scala.inline
    def setSectionVarargs(value: CompositionSection*): Self = StObject.set(x, "section", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_confidentiality(value: Element): Self = StObject.set(x, "_confidentiality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_confidentialityUndefined: Self = StObject.set(x, "_confidentiality", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
