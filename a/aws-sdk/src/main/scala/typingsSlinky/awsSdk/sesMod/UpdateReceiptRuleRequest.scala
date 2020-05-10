package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReceiptRuleRequest extends js.Object {
  /**
    * A data structure that contains the updated receipt rule information.
    */
  var Rule: ReceiptRule = js.native
  /**
    * The name of the receipt rule set that the receipt rule belongs to.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}

object UpdateReceiptRuleRequest {
  @scala.inline
  def apply(Rule: ReceiptRule, RuleSetName: ReceiptRuleSetName): UpdateReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReceiptRuleRequest]
  }
  @scala.inline
  implicit class UpdateReceiptRuleRequestOps[Self <: UpdateReceiptRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: ReceiptRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleSetName(value: ReceiptRuleSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

