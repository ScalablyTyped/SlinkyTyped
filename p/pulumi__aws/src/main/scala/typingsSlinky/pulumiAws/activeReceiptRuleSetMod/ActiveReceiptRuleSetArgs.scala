package typingsSlinky.pulumiAws.activeReceiptRuleSetMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveReceiptRuleSetArgs extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: Input[String] = js.native
}

object ActiveReceiptRuleSetArgs {
  @scala.inline
  def apply(ruleSetName: Input[String]): ActiveReceiptRuleSetArgs = {
    val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveReceiptRuleSetArgs]
  }
  @scala.inline
  implicit class ActiveReceiptRuleSetArgsOps[Self <: ActiveReceiptRuleSetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleSetName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSetName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

