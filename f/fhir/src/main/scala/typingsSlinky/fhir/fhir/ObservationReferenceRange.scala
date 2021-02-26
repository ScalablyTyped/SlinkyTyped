package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides guide for interpretation
  */
@js.native
trait ObservationReferenceRange extends BackboneElement {
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Applicable age range, if relevant
    */
  var age: js.UndefOr[Range] = js.native
  
  /**
    * Reference range population
    */
  var appliesTo: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * High Range, if relevant
    */
  var high: js.UndefOr[Quantity] = js.native
  
  /**
    * Low Range, if relevant
    */
  var low: js.UndefOr[Quantity] = js.native
  
  /**
    * Text based reference range in an observation
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Reference range qualifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object ObservationReferenceRange {
  
  @scala.inline
  def apply(): ObservationReferenceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservationReferenceRange]
  }
  
  @scala.inline
  implicit class ObservationReferenceRangeMutableBuilder[Self <: ObservationReferenceRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAge(value: Range): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    @scala.inline
    def setAppliesTo(value: js.Array[CodeableConcept]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    @scala.inline
    def setAppliesToVarargs(value: CodeableConcept*): Self = StObject.set(x, "appliesTo", js.Array(value :_*))
    
    @scala.inline
    def setHigh(value: Quantity): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setLow(value: Quantity): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
