package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerfEnvironment extends js.Object {
  /** CPU related environment info */
  var cpuInfo: js.UndefOr[CPUInfo] = js.native
  /** Memory related environment info */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.native
}

object PerfEnvironment {
  @scala.inline
  def apply(): PerfEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfEnvironment]
  }
  @scala.inline
  implicit class PerfEnvironmentOps[Self <: PerfEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuInfo(value: CPUInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryInfo(value: MemoryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryInfo")(js.undefined)
        ret
    }
  }
  
}

