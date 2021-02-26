package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeviceStateRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
  
  /**
    * If true, the device is enabled. If false, the device is
    disabled.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}
object UpdateDeviceStateRequest {
  
  @scala.inline
  def apply(DeviceId: string): UpdateDeviceStateRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceStateRequest]
  }
  
  @scala.inline
  implicit class UpdateDeviceStateRequestMutableBuilder[Self <: UpdateDeviceStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
