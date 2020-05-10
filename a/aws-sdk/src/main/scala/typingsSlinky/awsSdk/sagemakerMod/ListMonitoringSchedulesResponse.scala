package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMonitoringSchedulesResponse extends js.Object {
  /**
    * A JSON array in which each element is a summary for a monitoring schedule.
    */
  var MonitoringScheduleSummaries: MonitoringScheduleSummaryList = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent reques
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListMonitoringSchedulesResponse {
  @scala.inline
  def apply(MonitoringScheduleSummaries: MonitoringScheduleSummaryList): ListMonitoringSchedulesResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleSummaries = MonitoringScheduleSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringSchedulesResponse]
  }
  @scala.inline
  implicit class ListMonitoringSchedulesResponseOps[Self <: ListMonitoringSchedulesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitoringScheduleSummaries(value: MonitoringScheduleSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringScheduleSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

