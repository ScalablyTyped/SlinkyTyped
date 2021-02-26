package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends StObject {
  
  /**
    * The ARN of a device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of a device.
    */
  var DeviceName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DeviceName] = js.native
  
  /**
    * The serial number of a device.
    */
  var DeviceSerialNumber: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DeviceSerialNumber] = js.native
  
  /**
    * The status of a device. If the status is not READY, check the DeviceStatusInfo value for details.
    */
  var DeviceStatus: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DeviceStatus] = js.native
  
  /**
    * Detailed information about a device's status.
    */
  var DeviceStatusInfo: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DeviceStatusInfo] = js.native
  
  /**
    * The type of a device.
    */
  var DeviceType: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DeviceType] = js.native
  
  /**
    * The MAC address of a device.
    */
  var MacAddress: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.MacAddress] = js.native
  
  /**
    * Detailed information about a device's network profile.
    */
  var NetworkProfileInfo: js.UndefOr[DeviceNetworkProfileInfo] = js.native
  
  /**
    * The room ARN of a device.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  
  /**
    * The software version of a device.
    */
  var SoftwareVersion: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SoftwareVersion] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    @scala.inline
    def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setDeviceSerialNumber(value: DeviceSerialNumber): Self = StObject.set(x, "DeviceSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSerialNumberUndefined: Self = StObject.set(x, "DeviceSerialNumber", js.undefined)
    
    @scala.inline
    def setDeviceStatus(value: DeviceStatus): Self = StObject.set(x, "DeviceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusInfo(value: DeviceStatusInfo): Self = StObject.set(x, "DeviceStatusInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusInfoUndefined: Self = StObject.set(x, "DeviceStatusInfo", js.undefined)
    
    @scala.inline
    def setDeviceStatusUndefined: Self = StObject.set(x, "DeviceStatus", js.undefined)
    
    @scala.inline
    def setDeviceType(value: DeviceType): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    @scala.inline
    def setMacAddress(value: MacAddress): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    @scala.inline
    def setNetworkProfileInfo(value: DeviceNetworkProfileInfo): Self = StObject.set(x, "NetworkProfileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileInfoUndefined: Self = StObject.set(x, "NetworkProfileInfo", js.undefined)
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    @scala.inline
    def setSoftwareVersion(value: SoftwareVersion): Self = StObject.set(x, "SoftwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareVersionUndefined: Self = StObject.set(x, "SoftwareVersion", js.undefined)
  }
}
