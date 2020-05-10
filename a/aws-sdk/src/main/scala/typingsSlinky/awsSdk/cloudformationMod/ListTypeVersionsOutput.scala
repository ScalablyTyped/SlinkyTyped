package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypeVersionsOutput extends js.Object {
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of TypeVersionSummary structures that contain information about the specified type's versions.
    */
  var TypeVersionSummaries: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TypeVersionSummaries] = js.native
}

object ListTypeVersionsOutput {
  @scala.inline
  def apply(): ListTypeVersionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeVersionsOutput]
  }
  @scala.inline
  implicit class ListTypeVersionsOutputOps[Self <: ListTypeVersionsOutput] (val x: Self) extends AnyVal {
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
    def withTypeVersionSummaries(value: TypeVersionSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeVersionSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeVersionSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeVersionSummaries")(js.undefined)
        ret
    }
  }
  
}

