package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * The RuleId of the Rule that you want to update. RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId = js.native
  /**
    * An array of RuleUpdate objects that you want to insert into or delete from a Rule. For more information, see the applicable data types:    RuleUpdate: Contains Action and Predicate     Predicate: Contains DataId, Negated, and Type     FieldToMatch: Contains Data and Type   
    */
  var Updates: RuleUpdates = js.native
}

object UpdateRuleRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RuleId: ResourceId, Updates: RuleUpdates): UpdateRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleRequest]
  }
  @scala.inline
  implicit class UpdateRuleRequestOps[Self <: UpdateRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeToken(value: ChangeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdates(value: RuleUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Updates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

