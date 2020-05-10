package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkflowsResponse extends js.Object {
  /**
    * A continuation token, if not all workflow names have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * List of names of workflows in the account.
    */
  var Workflows: js.UndefOr[WorkflowNames] = js.native
}

object ListWorkflowsResponse {
  @scala.inline
  def apply(): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
  @scala.inline
  implicit class ListWorkflowsResponseOps[Self <: ListWorkflowsResponse] (val x: Self) extends AnyVal {
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
    def withWorkflows(value: WorkflowNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workflows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workflows")(js.undefined)
        ret
    }
  }
  
}

