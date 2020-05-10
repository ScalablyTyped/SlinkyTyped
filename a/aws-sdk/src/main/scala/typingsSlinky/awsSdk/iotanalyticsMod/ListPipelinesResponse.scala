package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesResponse extends js.Object {
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of "PipelineSummary" objects.
    */
  var pipelineSummaries: js.UndefOr[PipelineSummaries] = js.native
}

object ListPipelinesResponse {
  @scala.inline
  def apply(): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesResponse]
  }
  @scala.inline
  implicit class ListPipelinesResponseOps[Self <: ListPipelinesResponse] (val x: Self) extends AnyVal {
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
    def withPipelineSummaries(value: PipelineSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineSummaries")(js.undefined)
        ret
    }
  }
  
}

