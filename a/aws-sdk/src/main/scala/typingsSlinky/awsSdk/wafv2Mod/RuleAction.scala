package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleAction extends js.Object {
  /**
    * Instructs AWS WAF to allow the web request.
    */
  var Allow: js.UndefOr[AllowAction] = js.native
  /**
    * Instructs AWS WAF to block the web request.
    */
  var Block: js.UndefOr[BlockAction] = js.native
  /**
    * Instructs AWS WAF to count the web request and allow it.
    */
  var Count: js.UndefOr[CountAction] = js.native
}

object RuleAction {
  @scala.inline
  def apply(): RuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleAction]
  }
  @scala.inline
  implicit class RuleActionOps[Self <: RuleAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: AllowAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Allow")(js.undefined)
        ret
    }
    @scala.inline
    def withBlock(value: BlockAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Block")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: CountAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
  }
  
}

