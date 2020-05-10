package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetActiveReceiptRuleSetRequest extends js.Object {
  /**
    * The name of the receipt rule set to make active. Setting this value to null disables all email receiving.
    */
  var RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.native
}

object SetActiveReceiptRuleSetRequest {
  @scala.inline
  def apply(): SetActiveReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetActiveReceiptRuleSetRequest]
  }
  @scala.inline
  implicit class SetActiveReceiptRuleSetRequestOps[Self <: SetActiveReceiptRuleSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleSetName(value: ReceiptRuleSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetName")(js.undefined)
        ret
    }
  }
  
}

