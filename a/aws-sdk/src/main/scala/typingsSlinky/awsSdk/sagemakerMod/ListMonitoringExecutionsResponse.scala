package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMonitoringExecutionsResponse extends js.Object {
  /**
    * A JSON array in which each element is a summary for a monitoring execution.
    */
  var MonitoringExecutionSummaries: MonitoringExecutionSummaryList = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent reques
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListMonitoringExecutionsResponse {
  @scala.inline
  def apply(MonitoringExecutionSummaries: MonitoringExecutionSummaryList): ListMonitoringExecutionsResponse = {
    val __obj = js.Dynamic.literal(MonitoringExecutionSummaries = MonitoringExecutionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringExecutionsResponse]
  }
  @scala.inline
  implicit class ListMonitoringExecutionsResponseOps[Self <: ListMonitoringExecutionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitoringExecutionSummaries(value: MonitoringExecutionSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringExecutionSummaries")(value.asInstanceOf[js.Any])
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

