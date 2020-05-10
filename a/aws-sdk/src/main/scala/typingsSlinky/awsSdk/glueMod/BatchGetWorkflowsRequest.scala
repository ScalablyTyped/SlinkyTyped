package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetWorkflowsRequest extends js.Object {
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  /**
    * A list of workflow names, which may be the names returned from the ListWorkflows operation.
    */
  var Names: WorkflowNames = js.native
}

object BatchGetWorkflowsRequest {
  @scala.inline
  def apply(Names: WorkflowNames): BatchGetWorkflowsRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetWorkflowsRequest]
  }
  @scala.inline
  implicit class BatchGetWorkflowsRequestOps[Self <: BatchGetWorkflowsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNames(value: WorkflowNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeGraph(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeGraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeGraph")(js.undefined)
        ret
    }
  }
  
}

