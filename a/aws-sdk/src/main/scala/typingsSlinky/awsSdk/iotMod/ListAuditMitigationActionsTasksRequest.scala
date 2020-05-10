package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditMitigationActionsTasksRequest extends js.Object {
  /**
    * Specify this filter to limit results to tasks that were applied to results for a specific audit.
    */
  var auditTaskId: js.UndefOr[AuditTaskId] = js.native
  /**
    * Specify this filter to limit results to tasks that were completed or canceled on or before a specific date and time.
    */
  var endTime: js.Date = js.native
  /**
    * Specify this filter to limit results to tasks that were applied to a specific audit finding.
    */
  var findingId: js.UndefOr[FindingId] = js.native
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Specify this filter to limit results to tasks that began on or after a specific date and time.
    */
  var startTime: js.Date = js.native
  /**
    * Specify this filter to limit results to tasks that are in a specific state.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.native
}

object ListAuditMitigationActionsTasksRequest {
  @scala.inline
  def apply(endTime: js.Date, startTime: js.Date): ListAuditMitigationActionsTasksRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditMitigationActionsTasksRequest]
  }
  @scala.inline
  implicit class ListAuditMitigationActionsTasksRequestOps[Self <: ListAuditMitigationActionsTasksRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuditTaskId(value: AuditTaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditTaskId")(js.undefined)
        ret
    }
    @scala.inline
    def withFindingId(value: FindingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
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
    @scala.inline
    def withTaskStatus(value: AuditMitigationActionsTaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatus")(js.undefined)
        ret
    }
  }
  
}

