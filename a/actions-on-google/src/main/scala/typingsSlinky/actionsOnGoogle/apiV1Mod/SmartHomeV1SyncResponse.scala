package typingsSlinky.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncResponse extends SmartHomeV1Response {
  
  var payload: SmartHomeV1SyncPayload = js.native
  
  var requestId: String = js.native
}
object SmartHomeV1SyncResponse {
  
  @scala.inline
  def apply(payload: SmartHomeV1SyncPayload, requestId: String): SmartHomeV1SyncResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncResponse]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncResponseMutableBuilder[Self <: SmartHomeV1SyncResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: SmartHomeV1SyncPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
