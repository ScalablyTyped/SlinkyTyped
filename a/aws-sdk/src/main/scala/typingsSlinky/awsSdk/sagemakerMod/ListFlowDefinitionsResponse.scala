package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFlowDefinitionsResponse extends js.Object {
  /**
    * An array of objects describing the flow definitions.
    */
  var FlowDefinitionSummaries: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionSummaries = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListFlowDefinitionsResponse {
  @scala.inline
  def apply(FlowDefinitionSummaries: FlowDefinitionSummaries): ListFlowDefinitionsResponse = {
    val __obj = js.Dynamic.literal(FlowDefinitionSummaries = FlowDefinitionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFlowDefinitionsResponse]
  }
  @scala.inline
  implicit class ListFlowDefinitionsResponseOps[Self <: ListFlowDefinitionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowDefinitionSummaries(value: FlowDefinitionSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
  }
  
}

