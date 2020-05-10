package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WafOverrideAction extends js.Object {
  /**
    *  COUNT overrides the action specified by the individual rule within a RuleGroup . If set to NONE, the rule's action will take place.
    */
  var Type: WafOverrideActionType = js.native
}

object WafOverrideAction {
  @scala.inline
  def apply(Type: WafOverrideActionType): WafOverrideAction = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[WafOverrideAction]
  }
  @scala.inline
  implicit class WafOverrideActionOps[Self <: WafOverrideAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: WafOverrideActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

