package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permitted answer
  */
@js.native
trait QuestionnaireItemOption extends BackboneElement {
  
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.native
  
  /**
    * Answer value
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  
  /**
    * Answer value
    */
  var valueDate: js.UndefOr[date] = js.native
  
  /**
    * Answer value
    */
  var valueInteger: js.UndefOr[integer] = js.native
  
  /**
    * Answer value
    */
  var valueString: js.UndefOr[String] = js.native
  
  /**
    * Answer value
    */
  var valueTime: js.UndefOr[time] = js.native
}
object QuestionnaireItemOption {
  
  @scala.inline
  def apply(): QuestionnaireItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireItemOption]
  }
  
  @scala.inline
  implicit class QuestionnaireItemOptionMutableBuilder[Self <: QuestionnaireItemOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    @scala.inline
    def setValueDate(value: date): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    @scala.inline
    def setValueInteger(value: integer): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    @scala.inline
    def setValueTime(value: time): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    @scala.inline
    def set_valueDate(value: Element): Self = StObject.set(x, "_valueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueDateUndefined: Self = StObject.set(x, "_valueDate", js.undefined)
    
    @scala.inline
    def set_valueInteger(value: Element): Self = StObject.set(x, "_valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueIntegerUndefined: Self = StObject.set(x, "_valueInteger", js.undefined)
    
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
