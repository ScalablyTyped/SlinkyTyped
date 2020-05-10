package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
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
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: DeviceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceSerialNumber(value: DeviceSerialNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceSerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceSerialNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceStatus(value: DeviceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceStatusInfo(value: DeviceStatusInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceStatusInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStatusInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceStatusInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceType(value: DeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMacAddress(value: MacAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProfileInfo(value: DeviceNetworkProfileInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProfileInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareVersion(value: SoftwareVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareVersion")(js.undefined)
        ret
    }
  }
  
}

