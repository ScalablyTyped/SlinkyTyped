package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackResourcesOutput extends js.Object {
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of StackResourceSummary structures.
    */
  var StackResourceSummaries: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackResourceSummaries] = js.native
}

object ListStackResourcesOutput {
  @scala.inline
  def apply(): ListStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackResourcesOutput]
  }
  @scala.inline
  implicit class ListStackResourcesOutputOps[Self <: ListStackResourcesOutput] (val x: Self) extends AnyVal {
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
    def withStackResourceSummaries(value: StackResourceSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResourceSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackResourceSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResourceSummaries")(js.undefined)
        ret
    }
  }
  
}

