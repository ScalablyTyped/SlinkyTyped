package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceRequest extends StObject {
  
  /**
    * The ARN of the device for which to request details. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
}
object GetDeviceRequest {
  
  @scala.inline
  def apply(): GetDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceRequest]
  }
  
  @scala.inline
  implicit class GetDeviceRequestMutableBuilder[Self <: GetDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
  }
}
