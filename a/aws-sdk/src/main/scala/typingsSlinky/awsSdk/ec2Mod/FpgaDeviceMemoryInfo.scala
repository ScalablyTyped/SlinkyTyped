package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaDeviceMemoryInfo extends js.Object {
  /**
    * The size (in MiB) for the memory available to the FPGA accelerator.
    */
  var SizeInMiB: js.UndefOr[FpgaDeviceMemorySize] = js.native
}

object FpgaDeviceMemoryInfo {
  @scala.inline
  def apply(): FpgaDeviceMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaDeviceMemoryInfo]
  }
  @scala.inline
  implicit class FpgaDeviceMemoryInfoOps[Self <: FpgaDeviceMemoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizeInMiB(value: FpgaDeviceMemorySize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInMiB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInMiB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInMiB")(js.undefined)
        ret
    }
  }
  
}

