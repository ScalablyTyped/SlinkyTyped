package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRunsResponse extends js.Object {
  /**
    * A continuation token, if not all requested workflow runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of workflow run metadata objects.
    */
  var Runs: js.UndefOr[WorkflowRuns] = js.native
}

object GetWorkflowRunsResponse {
  @scala.inline
  def apply(): GetWorkflowRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowRunsResponse]
  }
  @scala.inline
  implicit class GetWorkflowRunsResponseOps[Self <: GetWorkflowRunsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: GenericString): Self = {
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
    @scala.inline
    def withRuns(value: WorkflowRuns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Runs")(js.undefined)
        ret
    }
  }
  
}

