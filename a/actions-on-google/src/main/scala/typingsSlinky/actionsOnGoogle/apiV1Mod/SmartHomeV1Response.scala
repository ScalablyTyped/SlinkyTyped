package typingsSlinky.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectResponse
*/
trait SmartHomeV1Response extends StObject
object SmartHomeV1Response {
  
  @scala.inline
  def SmartHomeV1ExecuteResponse(payload: SmartHomeV1ExecutePayload, requestId: String): typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse]
  }
  
  @scala.inline
  def SmartHomeV1QueryResponse(payload: SmartHomeV1QueryPayload, requestId: String): typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse]
  }
  
  @scala.inline
  def SmartHomeV1SyncResponse(payload: SmartHomeV1SyncPayload, requestId: String): typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse]
  }
}
