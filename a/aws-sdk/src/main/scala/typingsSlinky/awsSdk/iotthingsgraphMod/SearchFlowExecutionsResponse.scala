package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFlowExecutionsResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of objects that contain summary information about each workflow execution in the result set.
    */
  var summaries: js.UndefOr[FlowExecutionSummaries] = js.native
}

object SearchFlowExecutionsResponse {
  @scala.inline
  def apply(): SearchFlowExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFlowExecutionsResponse]
  }
  @scala.inline
  implicit class SearchFlowExecutionsResponseOps[Self <: SearchFlowExecutionsResponse] (val x: Self) extends AnyVal {
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
    def withSummaries(value: FlowExecutionSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(js.undefined)
        ret
    }
  }
  
}

