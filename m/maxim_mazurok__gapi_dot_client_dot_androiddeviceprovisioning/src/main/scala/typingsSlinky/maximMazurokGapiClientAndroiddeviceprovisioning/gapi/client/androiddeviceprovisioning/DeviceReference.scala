package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceReference extends StObject {
  
  /** The ID of the device. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** The hardware IDs of the device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
}
object DeviceReference {
  
  @scala.inline
  def apply(): DeviceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceReference]
  }
  
  @scala.inline
  implicit class DeviceReferenceMutableBuilder[Self <: DeviceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
  }
}
