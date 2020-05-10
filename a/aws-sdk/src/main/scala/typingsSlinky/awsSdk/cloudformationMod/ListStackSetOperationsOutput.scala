package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackSetOperationsOutput extends js.Object {
  /**
    * If the request doesn't return all results, NextToken is set to a token. To retrieve the next set of results, call ListOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of StackSetOperationSummary structures that contain summary information about operations for the specified stack set.
    */
  var Summaries: js.UndefOr[StackSetOperationSummaries] = js.native
}

object ListStackSetOperationsOutput {
  @scala.inline
  def apply(): ListStackSetOperationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackSetOperationsOutput]
  }
  @scala.inline
  implicit class ListStackSetOperationsOutputOps[Self <: ListStackSetOperationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSummaries(value: StackSetOperationSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Summaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Summaries")(js.undefined)
        ret
    }
  }
  
}

