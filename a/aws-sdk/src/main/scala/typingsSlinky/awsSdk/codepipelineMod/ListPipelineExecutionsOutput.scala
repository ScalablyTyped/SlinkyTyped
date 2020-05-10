package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelineExecutionsOutput extends js.Object {
  /**
    * A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of executions in the history of a pipeline.
    */
  var pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList] = js.native
}

object ListPipelineExecutionsOutput {
  @scala.inline
  def apply(): ListPipelineExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelineExecutionsOutput]
  }
  @scala.inline
  implicit class ListPipelineExecutionsOutputOps[Self <: ListPipelineExecutionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPipelineExecutionSummaries(value: PipelineExecutionSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineExecutionSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineExecutionSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineExecutionSummaries")(js.undefined)
        ret
    }
  }
  
}

