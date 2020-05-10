package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCommandInvocationsResult extends js.Object {
  /**
    * (Optional) A list of all invocations. 
    */
  var CommandInvocations: js.UndefOr[CommandInvocationList] = js.native
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}

object ListCommandInvocationsResult {
  @scala.inline
  def apply(): ListCommandInvocationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandInvocationsResult]
  }
  @scala.inline
  implicit class ListCommandInvocationsResultOps[Self <: ListCommandInvocationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandInvocations(value: CommandInvocationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandInvocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandInvocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandInvocations")(js.undefined)
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

