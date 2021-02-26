package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Record of use of a device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait DeviceUseStatement extends DomainResource {
  
  /**
    * Contains extended information for property 'recordedOn'.
    */
  var _recordedOn: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Target body site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Reference to device used
    */
  var device: Reference = js.native
  
  /**
    * External identifier for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Why device was used
    */
  var indication: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Addition details (comments, instructions)
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * When statement was recorded
    */
  var recordedOn: js.UndefOr[dateTime] = js.native
  
  /**
    * Who made the statement
    */
  var source: js.UndefOr[Reference] = js.native
  
  /**
    * active | completed | entered-in-error +
    */
  var status: code = js.native
  
  /**
    * Patient using device
    */
  var subject: Reference = js.native
  
  /**
    * How often  the device was used
    */
  var timingDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * How often  the device was used
    */
  var timingPeriod: js.UndefOr[Period] = js.native
  
  /**
    * How often  the device was used
    */
  var timingTiming: js.UndefOr[Timing] = js.native
  
  /**
    * Period device was used
    */
  var whenUsed: js.UndefOr[Period] = js.native
}
object DeviceUseStatement {
  
  @scala.inline
  def apply(device: Reference, status: code, subject: Reference): DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUseStatement]
  }
  
  @scala.inline
  implicit class DeviceUseStatementMutableBuilder[Self <: DeviceUseStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    @scala.inline
    def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setIndication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    @scala.inline
    def setIndicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "indication", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setRecordedOn(value: dateTime): Self = StObject.set(x, "recordedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordedOnUndefined: Self = StObject.set(x, "recordedOn", js.undefined)
    
    @scala.inline
    def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingDateTime(value: dateTime): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    @scala.inline
    def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    @scala.inline
    def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
    @scala.inline
    def setWhenUsed(value: Period): Self = StObject.set(x, "whenUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenUsedUndefined: Self = StObject.set(x, "whenUsed", js.undefined)
    
    @scala.inline
    def set_recordedOn(value: Element): Self = StObject.set(x, "_recordedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_recordedOnUndefined: Self = StObject.set(x, "_recordedOn", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
  }
}
