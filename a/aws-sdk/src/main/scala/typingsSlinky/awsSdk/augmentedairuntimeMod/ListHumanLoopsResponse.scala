package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHumanLoopsResponse extends js.Object {
  /**
    * An array of objects containing information about the human loops.
    */
  var HumanLoopSummaries: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopSummaries = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.NextToken] = js.native
}

object ListHumanLoopsResponse {
  @scala.inline
  def apply(HumanLoopSummaries: HumanLoopSummaries): ListHumanLoopsResponse = {
    val __obj = js.Dynamic.literal(HumanLoopSummaries = HumanLoopSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanLoopsResponse]
  }
  @scala.inline
  implicit class ListHumanLoopsResponseOps[Self <: ListHumanLoopsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanLoopSummaries(value: HumanLoopSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopSummaries")(value.asInstanceOf[js.Any])
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

