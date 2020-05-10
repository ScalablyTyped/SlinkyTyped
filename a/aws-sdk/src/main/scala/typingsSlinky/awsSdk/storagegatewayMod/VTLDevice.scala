package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VTLDevice extends js.Object {
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
  implicit class VTLDeviceOps[Self <: VTLDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceiSCSIAttributes(value: DeviceiSCSIAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceiSCSIAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceiSCSIAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceiSCSIAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withVTLDeviceARN(value: VTLDeviceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVTLDeviceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceARN")(js.undefined)
        ret
    }
    @scala.inline
    def withVTLDeviceProductIdentifier(value: VTLDeviceProductIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceProductIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVTLDeviceProductIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceProductIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVTLDeviceType(value: VTLDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVTLDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withVTLDeviceVendor(value: VTLDeviceVendor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceVendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVTLDeviceVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceVendor")(js.undefined)
        ret
    }
  }
  
}

