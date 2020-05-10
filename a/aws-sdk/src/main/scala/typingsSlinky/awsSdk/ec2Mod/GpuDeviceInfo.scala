package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GpuDeviceInfo extends js.Object {
  /**
    * The number of GPUs for the instance type.
    */
  var Count: js.UndefOr[GpuDeviceCount] = js.native
  /**
    * The manufacturer of the GPU accelerator.
    */
  var Manufacturer: js.UndefOr[GpuDeviceManufacturerName] = js.native
  /**
    * Describes the memory available to the GPU accelerator.
    */
  var MemoryInfo: js.UndefOr[GpuDeviceMemoryInfo] = js.native
  /**
    * The name of the GPU accelerator.
    */
  var Name: js.UndefOr[GpuDeviceName] = js.native
}

object GpuDeviceInfo {
  @scala.inline
  def apply(): GpuDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GpuDeviceInfo]
  }
  @scala.inline
  implicit class GpuDeviceInfoOps[Self <: GpuDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: GpuDeviceCount): Self = {
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
    def withManufacturer(value: GpuDeviceManufacturerName): Self = {
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
    def withMemoryInfo(value: GpuDeviceMemoryInfo): Self = {
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
    def withName(value: GpuDeviceName): Self = {
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

