package typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.CallArgument
import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetVariableValueRequest extends StObject {
  
  /**
    * Id of callframe that holds variable.
    */
  var callFrameId: CallFrameId = js.native
  
  /**
    * New variable value.
    */
  var newValue: CallArgument = js.native
  
  /**
    * 0-based number of scope as was listed in scope chain. Only 'local', 'closure' and 'catch'
    * scope types are allowed. Other scopes could be manipulated manually.
    */
  var scopeNumber: integer = js.native
  
  /**
    * Variable name.
    */
  var variableName: String = js.native
}
object SetVariableValueRequest {
  
  @scala.inline
  def apply(callFrameId: CallFrameId, newValue: CallArgument, scopeNumber: integer, variableName: String): SetVariableValueRequest = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], scopeNumber = scopeNumber.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVariableValueRequest]
  }
  
  @scala.inline
  implicit class SetVariableValueRequestMutableBuilder[Self <: SetVariableValueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: CallArgument): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeNumber(value: integer): Self = StObject.set(x, "scopeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
  }
}
