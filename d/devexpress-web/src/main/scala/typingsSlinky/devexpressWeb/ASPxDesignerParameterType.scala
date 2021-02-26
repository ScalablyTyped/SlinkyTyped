package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerParameterType extends StObject {
  
  var defaultVal: js.Any = js.native
  
  var displayValue: String = js.native
  
  var specifics: String = js.native
  
  var value: String = js.native
  
  def valueConverter(`val`: js.Any): js.Any = js.native
}
object ASPxDesignerParameterType {
  
  @scala.inline
  def apply(
    defaultVal: js.Any,
    displayValue: String,
    specifics: String,
    value: String,
    valueConverter: js.Any => js.Any
  ): ASPxDesignerParameterType = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], specifics = specifics.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueConverter = js.Any.fromFunction1(valueConverter))
    __obj.asInstanceOf[ASPxDesignerParameterType]
  }
  
  @scala.inline
  implicit class ASPxDesignerParameterTypeMutableBuilder[Self <: ASPxDesignerParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultVal(value: js.Any): Self = StObject.set(x, "defaultVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifics(value: String): Self = StObject.set(x, "specifics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueConverter(value: js.Any => js.Any): Self = StObject.set(x, "valueConverter", js.Any.fromFunction1(value))
  }
}
