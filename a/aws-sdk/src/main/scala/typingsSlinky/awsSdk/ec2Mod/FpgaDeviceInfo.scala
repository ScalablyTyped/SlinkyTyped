package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaDeviceInfo extends js.Object {
  /**
    * The count of FPGA accelerators for the instance type.
    */
  var Count: js.UndefOr[FpgaDeviceCount] = js.native
  /**
    * The manufacturer of the FPGA accelerator.
    */
  var Manufacturer: js.UndefOr[FpgaDeviceManufacturerName] = js.native
  /**
    * Describes the memory for the FPGA accelerator for the instance type.
    */
  var MemoryInfo: js.UndefOr[FpgaDeviceMemoryInfo] = js.native
  /**
    * The name of the FPGA accelerator.
    */
  var Name: js.UndefOr[FpgaDeviceName] = js.native
}

object FpgaDeviceInfo {
  @scala.inline
  def apply(): FpgaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaDeviceInfo]
  }
  @scala.inline
  implicit class FpgaDeviceInfoOps[Self <: FpgaDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: FpgaDeviceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: FpgaDeviceManufacturerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryInfo(value: FpgaDeviceMemoryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemoryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemoryInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: FpgaDeviceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

