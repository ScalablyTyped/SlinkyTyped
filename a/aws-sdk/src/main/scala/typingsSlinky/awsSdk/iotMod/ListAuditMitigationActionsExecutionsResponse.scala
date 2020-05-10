package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditMitigationActionsExecutionsResponse extends js.Object {
  /**
    * A set of task execution results based on the input parameters. Details include the mitigation action applied, start time, and task status.
    */
  var actionsExecutions: js.UndefOr[AuditMitigationActionExecutionMetadataList] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAuditMitigationActionsExecutionsResponse {
  @scala.inline
  def apply(): ListAuditMitigationActionsExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditMitigationActionsExecutionsResponse]
  }
  @scala.inline
  implicit class ListAuditMitigationActionsExecutionsResponseOps[Self <: ListAuditMitigationActionsExecutionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionsExecutions(value: AuditMitigationActionExecutionMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsExecutions")(js.undefined)
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

