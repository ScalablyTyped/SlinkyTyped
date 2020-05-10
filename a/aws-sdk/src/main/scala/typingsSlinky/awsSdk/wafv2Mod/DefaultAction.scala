package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultAction extends js.Object {
  /**
    * Specifies that AWS WAF should allow requests by default.
    */
  var Allow: js.UndefOr[AllowAction] = js.native
  /**
    * Specifies that AWS WAF should block requests by default. 
    */
  var Block: js.UndefOr[BlockAction] = js.native
}

object DefaultAction {
  @scala.inline
  def apply(): DefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultAction]
  }
  @scala.inline
  implicit class DefaultActionOps[Self <: DefaultAction] (val x: Self) extends AnyVal {
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
  }
  
}

