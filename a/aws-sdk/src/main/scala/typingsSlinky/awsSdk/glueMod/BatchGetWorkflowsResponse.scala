package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetWorkflowsResponse extends js.Object {
  /**
    * A list of names of workflows not found.
    */
  var MissingWorkflows: js.UndefOr[WorkflowNames] = js.native
  /**
    * A list of workflow resource metadata.
    */
  var Workflows: js.UndefOr[typingsSlinky.awsSdk.glueMod.Workflows] = js.native
}

object BatchGetWorkflowsResponse {
  @scala.inline
  def apply(): BatchGetWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetWorkflowsResponse]
  }
  @scala.inline
  implicit class BatchGetWorkflowsResponseOps[Self <: BatchGetWorkflowsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissingWorkflows(value: WorkflowNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingWorkflows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingWorkflows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingWorkflows")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflows(value: Workflows): Self = {
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

