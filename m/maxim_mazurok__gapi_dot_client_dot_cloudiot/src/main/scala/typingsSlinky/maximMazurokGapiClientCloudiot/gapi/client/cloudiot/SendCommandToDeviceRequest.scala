package typingsSlinky.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendCommandToDeviceRequest extends StObject {
  
  /** Required. The command data to send to the device. */
  var binaryData: js.UndefOr[String] = js.native
  
  /**
    * Optional subfolder for the command. If empty, the command will be delivered to the /devices/{device-id}/commands topic, otherwise it will be delivered to the
    * /devices/{device-id}/commands/{subfolder} topic. Multi-level subfolders are allowed. This field must not have more than 256 characters, and must not contain any MQTT wildcards ("+"
    * or "#") or null characters.
    */
  var subfolder: js.UndefOr[String] = js.native
}
object SendCommandToDeviceRequest {
  
  @scala.inline
  def apply(): SendCommandToDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandToDeviceRequest]
  }
  
  @scala.inline
  implicit class SendCommandToDeviceRequestMutableBuilder[Self <: SendCommandToDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryData(value: String): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    @scala.inline
    def setSubfolder(value: String): Self = StObject.set(x, "subfolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubfolderUndefined: Self = StObject.set(x, "subfolder", js.undefined)
  }
}
