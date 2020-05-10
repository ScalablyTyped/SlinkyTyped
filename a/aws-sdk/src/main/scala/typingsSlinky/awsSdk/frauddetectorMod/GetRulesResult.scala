package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRulesResult extends js.Object {
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The details of the requested rule.
    */
  var ruleDetails: js.UndefOr[RuleDetailList] = js.native
}

object GetRulesResult {
  @scala.inline
  def apply(): GetRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRulesResult]
  }
  @scala.inline
  implicit class GetRulesResultOps[Self <: GetRulesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withRuleDetails(value: RuleDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleDetails")(js.undefined)
        ret
    }
  }
  
}

