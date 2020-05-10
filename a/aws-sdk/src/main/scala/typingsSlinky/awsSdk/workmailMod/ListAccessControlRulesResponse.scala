package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccessControlRulesResponse extends js.Object {
  /**
    * The access control rules.
    */
  var Rules: js.UndefOr[AccessControlRulesList] = js.native
}

object ListAccessControlRulesResponse {
  @scala.inline
  def apply(): ListAccessControlRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessControlRulesResponse]
  }
  @scala.inline
  implicit class ListAccessControlRulesResponseOps[Self <: ListAccessControlRulesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: AccessControlRulesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(js.undefined)
        ret
    }
  }
  
}

