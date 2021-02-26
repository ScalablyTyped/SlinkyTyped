package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardMultiValue extends StObject {
  
  val ID: String = js.native
  
  val IsMultiValue: Boolean = js.native
  
  val State: js.Any = js.native
  
  val ValueParts: js.Any = js.native
}
object IMetadataCardMultiValue {
  
  @scala.inline
  def apply(ID: String, IsMultiValue: Boolean, State: js.Any, ValueParts: js.Any): IMetadataCardMultiValue = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], ValueParts = ValueParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardMultiValue]
  }
  
  @scala.inline
  implicit class IMetadataCardMultiValueMutableBuilder[Self <: IMetadataCardMultiValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiValue(value: Boolean): Self = StObject.set(x, "IsMultiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueParts(value: js.Any): Self = StObject.set(x, "ValueParts", value.asInstanceOf[js.Any])
  }
}
