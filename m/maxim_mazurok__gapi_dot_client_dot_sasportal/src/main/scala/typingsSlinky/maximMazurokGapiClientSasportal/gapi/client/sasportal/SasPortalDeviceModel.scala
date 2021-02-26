package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDeviceModel extends StObject {
  
  /** The firmware version of the device. */
  var firmwareVersion: js.UndefOr[String] = js.native
  
  /** The hardware version of the device. */
  var hardwareVersion: js.UndefOr[String] = js.native
  
  /** The name of the device model. */
  var name: js.UndefOr[String] = js.native
  
  /** The software version of the device. */
  var softwareVersion: js.UndefOr[String] = js.native
  
  /** The name of the device vendor. */
  var vendor: js.UndefOr[String] = js.native
}
object SasPortalDeviceModel {
  
  @scala.inline
  def apply(): SasPortalDeviceModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceModel]
  }
  
  @scala.inline
  implicit class SasPortalDeviceModelMutableBuilder[Self <: SasPortalDeviceModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirmwareVersion(value: String): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmwareVersionUndefined: Self = StObject.set(x, "firmwareVersion", js.undefined)
    
    @scala.inline
    def setHardwareVersion(value: String): Self = StObject.set(x, "hardwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareVersionUndefined: Self = StObject.set(x, "hardwareVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSoftwareVersion(value: String): Self = StObject.set(x, "softwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareVersionUndefined: Self = StObject.set(x, "softwareVersion", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
