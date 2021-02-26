package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDeviceSyncRequest extends StObject {
  
  /**
    * The ARN of the device to sync. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  
  /**
    * Request structure to start the device sync. Required.
    */
  var Features: typingsSlinky.awsSdk.alexaforbusinessMod.Features = js.native
  
  /**
    * The ARN of the room with which the device to sync is associated. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}
object StartDeviceSyncRequest {
  
  @scala.inline
  def apply(Features: Features): StartDeviceSyncRequest = {
    val __obj = js.Dynamic.literal(Features = Features.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeviceSyncRequest]
  }
  
  @scala.inline
  implicit class StartDeviceSyncRequestMutableBuilder[Self <: StartDeviceSyncRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    @scala.inline
    def setFeatures(value: Features): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "Features", js.Array(value :_*))
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
  }
}
