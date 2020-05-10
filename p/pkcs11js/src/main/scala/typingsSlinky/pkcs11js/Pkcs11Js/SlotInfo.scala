package typingsSlinky.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotInfo extends js.Object {
  var firmwareVersion: Version = js.native
  var flags: Double = js.native
  var hardwareVersion: Version = js.native
  var manufacturerID: String = js.native
  var slotDescription: String = js.native
}

object SlotInfo {
  @scala.inline
  def apply(
    firmwareVersion: Version,
    flags: Double,
    hardwareVersion: Version,
    manufacturerID: String,
    slotDescription: String
  ): SlotInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any], slotDescription = slotDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotInfo]
  }
  @scala.inline
  implicit class SlotInfoOps[Self <: SlotInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirmwareVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHardwareVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotDescription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

