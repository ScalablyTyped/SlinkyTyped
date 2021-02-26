package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetPropertyVariant extends StObject {
  
  /**
    * Optional. A string that contains the boolean value (true or false) of the value entry. Accepts substitution templates.
    */
  var booleanValue: js.UndefOr[AssetPropertyBooleanValue] = js.native
  
  /**
    * Optional. A string that contains the double value of the value entry. Accepts substitution templates.
    */
  var doubleValue: js.UndefOr[AssetPropertyDoubleValue] = js.native
  
  /**
    * Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
    */
  var integerValue: js.UndefOr[AssetPropertyIntegerValue] = js.native
  
  /**
    * Optional. The string value of the value entry. Accepts substitution templates.
    */
  var stringValue: js.UndefOr[AssetPropertyStringValue] = js.native
}
object AssetPropertyVariant {
  
  @scala.inline
  def apply(): AssetPropertyVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetPropertyVariant]
  }
  
  @scala.inline
  implicit class AssetPropertyVariantMutableBuilder[Self <: AssetPropertyVariant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanValue(value: AssetPropertyBooleanValue): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: AssetPropertyDoubleValue): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: AssetPropertyIntegerValue): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: AssetPropertyStringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
