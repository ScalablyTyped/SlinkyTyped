package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActivatedRulesInRuleGroupRequest extends js.Object {
  /**
    * Specifies the number of ActivatedRules that you want AWS WAF to return for this request. If you have more ActivatedRules than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of ActivatedRules.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  /**
    * If you specify a value for Limit and you have more ActivatedRules than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of ActivatedRules. For the second and subsequent ListActivatedRulesInRuleGroup requests, specify the value of NextMarker from the previous response to get information about another batch of ActivatedRules.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
  /**
    * The RuleGroupId of the RuleGroup for which you want to get a list of ActivatedRule objects.
    */
  var RuleGroupId: js.UndefOr[ResourceId] = js.native
}

object ListActivatedRulesInRuleGroupRequest {
  @scala.inline
  def apply(): ListActivatedRulesInRuleGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActivatedRulesInRuleGroupRequest]
  }
  @scala.inline
  implicit class ListActivatedRulesInRuleGroupRequestOps[Self <: ListActivatedRulesInRuleGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: PaginationLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: NextMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleGroupId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleGroupId")(js.undefined)
        ret
    }
  }
  
}

