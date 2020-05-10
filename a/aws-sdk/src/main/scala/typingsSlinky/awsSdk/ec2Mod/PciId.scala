package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PciId extends js.Object {
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the subsystem.
    */
  var SubsystemId: js.UndefOr[String] = js.native
  /**
    * The ID of the vendor for the subsystem.
    */
  var SubsystemVendorId: js.UndefOr[String] = js.native
  /**
    * The ID of the vendor.
    */
  var VendorId: js.UndefOr[String] = js.native
}

object PciId {
  @scala.inline
  def apply(): PciId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PciId]
  }
  @scala.inline
  implicit class PciIdOps[Self <: PciId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubsystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubsystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubsystemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubsystemId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubsystemVendorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubsystemVendorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubsystemVendorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubsystemVendorId")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VendorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VendorId")(js.undefined)
        ret
    }
  }
  
}

