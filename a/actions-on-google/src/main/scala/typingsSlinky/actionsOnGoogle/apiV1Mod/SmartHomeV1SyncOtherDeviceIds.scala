package typingsSlinky.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncOtherDeviceIds extends StObject {
  
  var agentId: js.UndefOr[String] = js.native
  
  var deviceId: String = js.native
}
object SmartHomeV1SyncOtherDeviceIds {
  
  @scala.inline
  def apply(deviceId: String): SmartHomeV1SyncOtherDeviceIds = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncOtherDeviceIds]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncOtherDeviceIdsMutableBuilder[Self <: SmartHomeV1SyncOtherDeviceIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
  }
}
