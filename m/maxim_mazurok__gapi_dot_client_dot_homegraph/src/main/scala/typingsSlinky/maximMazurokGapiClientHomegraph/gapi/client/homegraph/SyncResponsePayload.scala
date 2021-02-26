package typingsSlinky.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncResponsePayload extends StObject {
  
  /** Third-party user ID */
  var agentUserId: js.UndefOr[String] = js.native
  
  /** Devices associated with the third-party user. */
  var devices: js.UndefOr[js.Array[Device]] = js.native
}
object SyncResponsePayload {
  
  @scala.inline
  def apply(): SyncResponsePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResponsePayload]
  }
  
  @scala.inline
  implicit class SyncResponsePayloadMutableBuilder[Self <: SyncResponsePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    @scala.inline
    def setDevices(value: js.Array[Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value :_*))
  }
}
