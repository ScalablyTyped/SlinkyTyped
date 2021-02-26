package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerClaim extends StObject {
  
  /** Required. The ID of the customer for whom the device is being claimed. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Required. Required. Device identifier of the device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
  
  /** Required. The metadata to attach to the device at claim. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.native
  
  /** Required. The section type of the device's provisioning record. */
  var sectionType: js.UndefOr[String] = js.native
}
object PartnerClaim {
  
  @scala.inline
  def apply(): PartnerClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerClaim]
  }
  
  @scala.inline
  implicit class PartnerClaimMutableBuilder[Self <: PartnerClaim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: DeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
  }
}
