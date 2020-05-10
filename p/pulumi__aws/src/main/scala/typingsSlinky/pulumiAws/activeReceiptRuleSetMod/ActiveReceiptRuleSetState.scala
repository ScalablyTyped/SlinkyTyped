package typingsSlinky.pulumiAws.activeReceiptRuleSetMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveReceiptRuleSetState extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: js.UndefOr[Input[String]] = js.native
}

object ActiveReceiptRuleSetState {
  @scala.inline
  def apply(): ActiveReceiptRuleSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveReceiptRuleSetState]
  }
  @scala.inline
  implicit class ActiveReceiptRuleSetStateOps[Self <: ActiveReceiptRuleSetState] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutRuleSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSetName")(js.undefined)
        ret
    }
  }
  
}

