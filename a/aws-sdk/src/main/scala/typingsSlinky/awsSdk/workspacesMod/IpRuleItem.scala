package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpRuleItem extends js.Object {
  /**
    * The IP address range, in CIDR notation.
    */
  var ipRule: js.UndefOr[IpRule] = js.native
  /**
    * The description.
    */
  var ruleDesc: js.UndefOr[IpRuleDesc] = js.native
}

object IpRuleItem {
  @scala.inline
  def apply(): IpRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpRuleItem]
  }
  @scala.inline
  implicit class IpRuleItemOps[Self <: IpRuleItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpRule(value: IpRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipRule")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleDesc(value: IpRuleDesc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleDesc")(js.undefined)
        ret
    }
  }
  
}

