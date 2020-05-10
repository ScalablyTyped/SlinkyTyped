package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangeSetsOutput extends js.Object {
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of ChangeSetSummary structures that provides the ID and status of each change set for the specified stack.
    */
  var Summaries: js.UndefOr[ChangeSetSummaries] = js.native
}

object ListChangeSetsOutput {
  @scala.inline
  def apply(): ListChangeSetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChangeSetsOutput]
  }
  @scala.inline
  implicit class ListChangeSetsOutputOps[Self <: ListChangeSetsOutput] (val x: Self) extends AnyVal {
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
    def withSummaries(value: ChangeSetSummaries): Self = {
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

