package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.active
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frozen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetWebLifecycleStateRequest extends StObject {
  
  /**
    * Target lifecycle state (SetWebLifecycleStateRequestState enum)
    */
  var state: frozen | active = js.native
}
object SetWebLifecycleStateRequest {
  
  @scala.inline
  def apply(state: frozen | active): SetWebLifecycleStateRequest = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWebLifecycleStateRequest]
  }
  
  @scala.inline
  implicit class SetWebLifecycleStateRequestMutableBuilder[Self <: SetWebLifecycleStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: frozen | active): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
