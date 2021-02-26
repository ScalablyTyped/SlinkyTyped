package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotDefaultValue extends StObject {
  
  /**
    * The default value for the slot. You can specify one of the following:    #context-name.slot-name - The slot value "slot-name" in the context "context-name."    {attribute} - The slot value of the session attribute "attribute."    'value' - The discrete value "value."  
    */
  var defaultValue: SlotDefaultValueString = js.native
}
object SlotDefaultValue {
  
  @scala.inline
  def apply(defaultValue: SlotDefaultValueString): SlotDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDefaultValue]
  }
  
  @scala.inline
  implicit class SlotDefaultValueMutableBuilder[Self <: SlotDefaultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: SlotDefaultValueString): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
