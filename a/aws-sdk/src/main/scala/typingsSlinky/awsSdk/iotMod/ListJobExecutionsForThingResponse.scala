package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobExecutionsForThingResponse extends js.Object {
  /**
    * A list of job execution summaries.
    */
  var executionSummaries: js.UndefOr[JobExecutionSummaryForThingList] = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListJobExecutionsForThingResponse {
  @scala.inline
  def apply(): ListJobExecutionsForThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobExecutionsForThingResponse]
  }
  @scala.inline
  implicit class ListJobExecutionsForThingResponseOps[Self <: ListJobExecutionsForThingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionSummaries(value: JobExecutionSummaryForThingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

