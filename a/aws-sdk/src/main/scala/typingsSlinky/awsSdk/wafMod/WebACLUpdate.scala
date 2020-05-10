package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebACLUpdate extends js.Object {
  /**
    * Specifies whether to insert a Rule into or delete a Rule from a WebACL.
    */
  var Action: ChangeAction = js.native
  /**
    * The ActivatedRule object in an UpdateWebACL request specifies a Rule that you want to insert or delete, the priority of the Rule in the WebACL, and the action that you want AWS WAF to take when a web request matches the Rule (ALLOW, BLOCK, or COUNT).
    */
  var ActivatedRule: typingsSlinky.awsSdk.wafMod.ActivatedRule = js.native
}

object WebACLUpdate {
  @scala.inline
  def apply(Action: ChangeAction, ActivatedRule: ActivatedRule): WebACLUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ActivatedRule = ActivatedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACLUpdate]
  }
  @scala.inline
  implicit class WebACLUpdateOps[Self <: WebACLUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ChangeAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivatedRule(value: ActivatedRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivatedRule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

