package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelineExecutionsInput extends js.Object {
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline execution start times. Default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token that was returned from the previous ListPipelineExecutions call, which can be used to return the next set of pipeline executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the pipeline for which you want to get execution summary information.
    */
  var pipelineName: PipelineName = js.native
}

object ListPipelineExecutionsInput {
  @scala.inline
  def apply(pipelineName: PipelineName): ListPipelineExecutionsInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelineExecutionsInput]
  }
  @scala.inline
  implicit class ListPipelineExecutionsInputOps[Self <: ListPipelineExecutionsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineName")(value.asInstanceOf[js.Any])
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
  }
  
}

