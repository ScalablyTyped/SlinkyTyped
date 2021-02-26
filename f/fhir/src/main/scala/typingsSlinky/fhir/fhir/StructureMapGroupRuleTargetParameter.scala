package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters to the transform
  */
@js.native
trait StructureMapGroupRuleTargetParameter extends BackboneElement {
  
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueId'.
    */
  var _valueId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueId: js.UndefOr[id] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueInteger: js.UndefOr[integer] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueString: js.UndefOr[String] = js.native
}
object StructureMapGroupRuleTargetParameter {
  
  @scala.inline
  def apply(): StructureMapGroupRuleTargetParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructureMapGroupRuleTargetParameter]
  }
  
  @scala.inline
  implicit class StructureMapGroupRuleTargetParameterMutableBuilder[Self <: StructureMapGroupRuleTargetParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    @scala.inline
    def setValueDecimal(value: decimal): Self = StObject.set(x, "valueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDecimalUndefined: Self = StObject.set(x, "valueDecimal", js.undefined)
    
    @scala.inline
    def setValueId(value: id): Self = StObject.set(x, "valueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIdUndefined: Self = StObject.set(x, "valueId", js.undefined)
    
    @scala.inline
    def setValueInteger(value: integer): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    @scala.inline
    def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    @scala.inline
    def set_valueDecimal(value: Element): Self = StObject.set(x, "_valueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueDecimalUndefined: Self = StObject.set(x, "_valueDecimal", js.undefined)
    
    @scala.inline
    def set_valueId(value: Element): Self = StObject.set(x, "_valueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueIdUndefined: Self = StObject.set(x, "_valueId", js.undefined)
    
    @scala.inline
    def set_valueInteger(value: Element): Self = StObject.set(x, "_valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueIntegerUndefined: Self = StObject.set(x, "_valueInteger", js.undefined)
    
    @scala.inline
    def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
  }
}
