package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component results
  */
@js.native
trait ObservationComponent extends BackboneElement {
  
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.native
  
  /**
    * Type of component observation (code / type)
    */
  var code: CodeableConcept = js.native
  
  /**
    * Why the component result is missing
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * High, low, normal, etc.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Provides guide for interpretation of component result
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.native
  
  /**
    * Actual component result
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Actual component result
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Actual component result
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Actual component result
    */
  var valuePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Actual component result
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Actual component result
    */
  var valueRange: js.UndefOr[Range] = js.native
  
  /**
    * Actual component result
    */
  var valueRatio: js.UndefOr[Ratio] = js.native
  
  /**
    * Actual component result
    */
  var valueSampledData: js.UndefOr[SampledData] = js.native
  
  /**
    * Actual component result
    */
  var valueString: js.UndefOr[String] = js.native
  
  /**
    * Actual component result
    */
  var valueTime: js.UndefOr[time] = js.native
}
object ObservationComponent {
  
  @scala.inline
  def apply(code: CodeableConcept): ObservationComponent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationComponent]
  }
  
  @scala.inline
  implicit class ObservationComponentMutableBuilder[Self <: ObservationComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAbsentReason(value: CodeableConcept): Self = StObject.set(x, "dataAbsentReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAbsentReasonUndefined: Self = StObject.set(x, "dataAbsentReason", js.undefined)
    
    @scala.inline
    def setInterpretation(value: CodeableConcept): Self = StObject.set(x, "interpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpretationUndefined: Self = StObject.set(x, "interpretation", js.undefined)
    
    @scala.inline
    def setReferenceRange(value: js.Array[ObservationReferenceRange]): Self = StObject.set(x, "referenceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceRangeUndefined: Self = StObject.set(x, "referenceRange", js.undefined)
    
    @scala.inline
    def setReferenceRangeVarargs(value: ObservationReferenceRange*): Self = StObject.set(x, "referenceRange", js.Array(value :_*))
    
    @scala.inline
    def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueDateTime(value: dateTime): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    @scala.inline
    def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    @scala.inline
    def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    @scala.inline
    def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    @scala.inline
    def setValueRatio(value: Ratio): Self = StObject.set(x, "valueRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRatioUndefined: Self = StObject.set(x, "valueRatio", js.undefined)
    
    @scala.inline
    def setValueSampledData(value: SampledData): Self = StObject.set(x, "valueSampledData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSampledDataUndefined: Self = StObject.set(x, "valueSampledData", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    @scala.inline
    def setValueTime(value: time): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    @scala.inline
    def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    @scala.inline
    def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    @scala.inline
    def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
  }
}
