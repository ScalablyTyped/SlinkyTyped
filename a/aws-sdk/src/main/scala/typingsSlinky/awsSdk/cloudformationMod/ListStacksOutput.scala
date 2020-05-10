package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStacksOutput extends js.Object {
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of StackSummary structures containing information about the specified stacks.
    */
  var StackSummaries: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSummaries] = js.native
}

object ListStacksOutput {
  @scala.inline
  def apply(): ListStacksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStacksOutput]
  }
  @scala.inline
  implicit class ListStacksOutputOps[Self <: ListStacksOutput] (val x: Self) extends AnyVal {
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
    def withStackSummaries(value: StackSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSummaries")(js.undefined)
        ret
    }
  }
  
}

