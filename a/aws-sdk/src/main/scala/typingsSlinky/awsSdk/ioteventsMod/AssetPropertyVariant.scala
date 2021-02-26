package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetPropertyVariant extends StObject {
  
  /**
    * The asset property value is a Boolean value that must be TRUE or FALSE. You can also specify an expression. If you use an expression, the evaluated result should be a Boolean value.
    */
  var booleanValue: js.UndefOr[AssetPropertyBooleanValue] = js.native
  
  /**
    * The asset property value is a double. You can also specify an expression. If you use an expression, the evaluated result should be a double.
    */
  var doubleValue: js.UndefOr[AssetPropertyDoubleValue] = js.native
  
  /**
    * The asset property value is an integer. You can also specify an expression. If you use an expression, the evaluated result should be an integer.
    */
  var integerValue: js.UndefOr[AssetPropertyIntegerValue] = js.native
  
  /**
    * The asset property value is a string. You can also specify an expression. If you use an expression, the evaluated result should be a string.
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
