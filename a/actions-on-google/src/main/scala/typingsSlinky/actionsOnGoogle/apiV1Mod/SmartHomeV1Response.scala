package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectResponse
*/
trait SmartHomeV1Response extends js.Object
object SmartHomeV1Response {
  
  @scala.inline
  def SmartHomeV1SyncResponse(payload: SmartHomeV1SyncPayload, requestId: String): SmartHomeV1Response = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Response]
  }
  
  @scala.inline
  def SmartHomeV1QueryResponse(payload: SmartHomeV1QueryPayload, requestId: String): SmartHomeV1Response = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Response]
  }
  
  @scala.inline
  def SmartHomeV1ExecuteResponse(payload: SmartHomeV1ExecutePayload, requestId: String): SmartHomeV1Response = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Response]
  }
}
