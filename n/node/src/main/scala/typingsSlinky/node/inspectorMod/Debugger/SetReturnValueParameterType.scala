package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.CallArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetReturnValueParameterType extends StObject {
  
  /**
    * New return value.
    */
  var newValue: CallArgument = js.native
}
object SetReturnValueParameterType {
  
  @scala.inline
  def apply(newValue: CallArgument): SetReturnValueParameterType = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetReturnValueParameterType]
  }
  
  @scala.inline
  implicit class SetReturnValueParameterTypeMutableBuilder[Self <: SetReturnValueParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: CallArgument): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
