package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VTLDevice extends StObject {
  
  /**
    * A list of iSCSI information about a VTL device.
    */
  var DeviceiSCSIAttributes: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DeviceiSCSIAttributes] = js.native
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
    */
  var VTLDeviceARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VTLDeviceARN] = js.native
  
  /**
    * Specifies the model number of device that the VTL device emulates.
    */
  var VTLDeviceProductIdentifier: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VTLDeviceProductIdentifier] = js.native
  
  /**
    * Specifies the type of device that the VTL device emulates.
    */
  var VTLDeviceType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VTLDeviceType] = js.native
  
  /**
    * Specifies the vendor of the device that the VTL device object emulates.
    */
  var VTLDeviceVendor: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VTLDeviceVendor] = js.native
}
object VTLDevice {
  
  @scala.inline
  def apply(): VTLDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VTLDevice]
  }
  
  @scala.inline
  implicit class VTLDeviceMutableBuilder[Self <: VTLDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceiSCSIAttributes(value: DeviceiSCSIAttributes): Self = StObject.set(x, "DeviceiSCSIAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceiSCSIAttributesUndefined: Self = StObject.set(x, "DeviceiSCSIAttributes", js.undefined)
    
    @scala.inline
    def setVTLDeviceARN(value: VTLDeviceARN): Self = StObject.set(x, "VTLDeviceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTLDeviceARNUndefined: Self = StObject.set(x, "VTLDeviceARN", js.undefined)
    
    @scala.inline
    def setVTLDeviceProductIdentifier(value: VTLDeviceProductIdentifier): Self = StObject.set(x, "VTLDeviceProductIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTLDeviceProductIdentifierUndefined: Self = StObject.set(x, "VTLDeviceProductIdentifier", js.undefined)
    
    @scala.inline
    def setVTLDeviceType(value: VTLDeviceType): Self = StObject.set(x, "VTLDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTLDeviceTypeUndefined: Self = StObject.set(x, "VTLDeviceType", js.undefined)
    
    @scala.inline
    def setVTLDeviceVendor(value: VTLDeviceVendor): Self = StObject.set(x, "VTLDeviceVendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTLDeviceVendorUndefined: Self = StObject.set(x, "VTLDeviceVendor", js.undefined)
  }
}
