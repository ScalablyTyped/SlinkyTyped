package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRuleNamesByTargetResponse extends js.Object {
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.NextToken] = js.native
  /**
    * The names of the rules that can invoke the given target.
    */
  var RuleNames: js.UndefOr[RuleNameList] = js.native
}

object ListRuleNamesByTargetResponse {
  @scala.inline
  def apply(): ListRuleNamesByTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleNamesByTargetResponse]
  }
  @scala.inline
  implicit class ListRuleNamesByTargetResponseOps[Self <: ListRuleNamesByTargetResponse] (val x: Self) extends AnyVal {
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
    def withRuleNames(value: RuleNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleNames")(js.undefined)
        ret
    }
  }
  
}

