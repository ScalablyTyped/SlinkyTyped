package typingsSlinky.actionsOnGoogle.apiV1Mod

import typingsSlinky.actionsOnGoogle.anon.Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncRequest
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryRequest
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteRequest
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectRequest
*/
trait SmartHomeV1Request extends StObject
object SmartHomeV1Request {
  
  @scala.inline
  def SmartHomeV1DisconnectRequest(inputs: js.Array[Intent], requestId: String): typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectRequest]
  }
  
  @scala.inline
  def SmartHomeV1ExecuteRequest(inputs: js.Array[SmartHomeV1ExecuteRequestInputs], requestId: String): typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteRequest]
  }
  
  @scala.inline
  def SmartHomeV1QueryRequest(inputs: js.Array[SmartHomeV1QueryRequestInputs], requestId: String): typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryRequest]
  }
  
  @scala.inline
  def SmartHomeV1SyncRequest(inputs: js.Array[SmartHomeV1SyncRequestInputs], requestId: String): typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncRequest]
  }
}
