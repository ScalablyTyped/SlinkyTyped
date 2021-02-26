package typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingCalledEvent extends StObject {
  
  /**
    * Identifier of the context where the call was made.
    */
  var executionContextId: ExecutionContextId = js.native
  
  var name: String = js.native
  
  var payload: String = js.native
}
object BindingCalledEvent {
  
  @scala.inline
  def apply(executionContextId: ExecutionContextId, name: String, payload: String): BindingCalledEvent = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingCalledEvent]
  }
  
  @scala.inline
  implicit class BindingCalledEventMutableBuilder[Self <: BindingCalledEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
