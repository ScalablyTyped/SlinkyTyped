package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceUtilizationReport extends js.Object {
  /** CPU utilization samples. */
  var cpuTime: js.UndefOr[js.Array[CPUTime]] = js.native
}

object ResourceUtilizationReport {
  @scala.inline
  def apply(): ResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilizationReport]
  }
  @scala.inline
  implicit class ResourceUtilizationReportOps[Self <: ResourceUtilizationReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuTime(value: js.Array[CPUTime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuTime")(js.undefined)
        ret
    }
  }
  
}

