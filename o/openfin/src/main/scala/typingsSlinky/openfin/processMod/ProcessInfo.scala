package typingsSlinky.openfin.processMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessInfo extends js.Object {
  var cpuUsage: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var nonPagedPoolUsage: js.UndefOr[Double] = js.native
  var pageFaultCount: js.UndefOr[Double] = js.native
  var pagedPoolUsage: js.UndefOr[Double] = js.native
  var pagefileUsage: js.UndefOr[Double] = js.native
  var peakNonPagedPoolUsage: js.UndefOr[Double] = js.native
  var peakPagedPoolUsage: js.UndefOr[Double] = js.native
  var peakPagefileUsage: js.UndefOr[Double] = js.native
  var peakWorkingSetSize: js.UndefOr[Double] = js.native
  var processId: js.UndefOr[Double] = js.native
  var uuid: js.UndefOr[String] = js.native
  var workingSetSize: js.UndefOr[Double] = js.native
}

object ProcessInfo {
  @scala.inline
  def apply(): ProcessInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessInfo]
  }
  @scala.inline
  implicit class ProcessInfoOps[Self <: ProcessInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNonPagedPoolUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPagedPoolUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonPagedPoolUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPagedPoolUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPageFaultCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFaultCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageFaultCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFaultCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPagedPoolUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagedPoolUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagedPoolUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagedPoolUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPagefileUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagefileUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagefileUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagefileUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPeakNonPagedPoolUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakNonPagedPoolUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeakNonPagedPoolUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakNonPagedPoolUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPeakPagedPoolUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakPagedPoolUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeakPagedPoolUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakPagedPoolUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPeakPagefileUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakPagefileUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeakPagefileUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakPagefileUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPeakWorkingSetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakWorkingSetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeakWorkingSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakWorkingSetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingSetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingSetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingSetSize")(js.undefined)
        ret
    }
  }
  
}

