package typingsSlinky.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingTypeEnum extends StObject {
  
  var ConstantValue: BindingType = js.native
  
  var Constructor: BindingType = js.native
  
  var DynamicValue: BindingType = js.native
  
  var Factory: BindingType = js.native
  
  var Function: BindingType = js.native
  
  var Instance: BindingType = js.native
  
  var Invalid: BindingType = js.native
  
  var Provider: BindingType = js.native
}
object BindingTypeEnum {
  
  @scala.inline
  def apply(
    ConstantValue: BindingType,
    Constructor: BindingType,
    DynamicValue: BindingType,
    Factory: BindingType,
    Function: BindingType,
    Instance: BindingType,
    Invalid: BindingType,
    Provider: BindingType
  ): BindingTypeEnum = {
    val __obj = js.Dynamic.literal(ConstantValue = ConstantValue.asInstanceOf[js.Any], Constructor = Constructor.asInstanceOf[js.Any], DynamicValue = DynamicValue.asInstanceOf[js.Any], Factory = Factory.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], Instance = Instance.asInstanceOf[js.Any], Invalid = Invalid.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingTypeEnum]
  }
  
  @scala.inline
  implicit class BindingTypeEnumMutableBuilder[Self <: BindingTypeEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstantValue(value: BindingType): Self = StObject.set(x, "ConstantValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: BindingType): Self = StObject.set(x, "Constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicValue(value: BindingType): Self = StObject.set(x, "DynamicValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactory(value: BindingType): Self = StObject.set(x, "Factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: BindingType): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: BindingType): Self = StObject.set(x, "Instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid(value: BindingType): Self = StObject.set(x, "Invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: BindingType): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
  }
}
