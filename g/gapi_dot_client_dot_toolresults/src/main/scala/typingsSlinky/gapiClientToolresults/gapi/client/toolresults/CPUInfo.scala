package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPUInfo extends js.Object {
  /** description of the device processor ie '1.8 GHz hexa core 64-bit ARMv8-A' */
  var cpuProcessor: js.UndefOr[String] = js.native
  /** the CPU clock speed in GHz */
  var cpuSpeedInGhz: js.UndefOr[Double] = js.native
  /** the number of CPU cores */
  var numberOfCores: js.UndefOr[Double] = js.native
}

object CPUInfo {
  @scala.inline
  def apply(): CPUInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPUInfo]
  }
  @scala.inline
  implicit class CPUInfoOps[Self <: CPUInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuProcessor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuProcessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuSpeedInGhz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuSpeedInGhz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuSpeedInGhz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuSpeedInGhz")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfCores(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfCores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfCores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfCores")(js.undefined)
        ret
    }
  }
  
}

