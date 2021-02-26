package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindDevicesByDeviceIdentifierRequest extends StObject {
  
  /** Required. Required. The device identifier to search for. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
  
  /** Required. The maximum number of devices to show in a page of results. Must be between 1 and 100 inclusive. */
  var limit: js.UndefOr[String] = js.native
  
  /** A token specifying which result page to return. */
  var pageToken: js.UndefOr[String] = js.native
}
object FindDevicesByDeviceIdentifierRequest {
  
  @scala.inline
  def apply(): FindDevicesByDeviceIdentifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDevicesByDeviceIdentifierRequest]
  }
  
  @scala.inline
  implicit class FindDevicesByDeviceIdentifierRequestMutableBuilder[Self <: FindDevicesByDeviceIdentifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
