package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyRuleAction extends js.Object {
  /**
    * The type of action to be taken.
    */
  var `type`: js.UndefOr[ImageActionType] = js.native
}

object LifecyclePolicyRuleAction {
  @scala.inline
  def apply(): LifecyclePolicyRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyRuleAction]
  }
  @scala.inline
  implicit class LifecyclePolicyRuleActionOps[Self <: LifecyclePolicyRuleAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ImageActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

