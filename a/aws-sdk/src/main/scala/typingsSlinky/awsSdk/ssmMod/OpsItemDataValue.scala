package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpsItemDataValue extends StObject {
  
  /**
    * The type of key-value pair. Valid types include SearchableString and String.
    */
  var Type: js.UndefOr[OpsItemDataType] = js.native
  
  /**
    * The value of the OperationalData key.
    */
  var Value: js.UndefOr[OpsItemDataValueString] = js.native
}
object OpsItemDataValue {
  
  @scala.inline
  def apply(): OpsItemDataValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemDataValue]
  }
  
  @scala.inline
  implicit class OpsItemDataValueMutableBuilder[Self <: OpsItemDataValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: OpsItemDataType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: OpsItemDataValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
