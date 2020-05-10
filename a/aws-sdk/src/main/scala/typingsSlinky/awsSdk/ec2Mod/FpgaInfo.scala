package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaInfo extends js.Object {
  /**
    * Describes the FPGAs for the instance type.
    */
  var Fpgas: js.UndefOr[FpgaDeviceInfoList] = js.native
  /**
    * The total memory of all FPGA accelerators for the instance type.
    */
  var TotalFpgaMemoryInMiB: js.UndefOr[totalFpgaMemory] = js.native
}

object FpgaInfo {
  @scala.inline
  def apply(): FpgaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaInfo]
  }
  @scala.inline
  implicit class FpgaInfoOps[Self <: FpgaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFpgas(value: FpgaDeviceInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fpgas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpgas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fpgas")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFpgaMemoryInMiB(value: totalFpgaMemory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalFpgaMemoryInMiB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalFpgaMemoryInMiB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalFpgaMemoryInMiB")(js.undefined)
        ret
    }
  }
  
}

