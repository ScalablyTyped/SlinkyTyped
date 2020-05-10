package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WafOverrideAction extends js.Object {
  /**
    *  COUNT overrides the action specified by the individual rule within a RuleGroup . If set to NONE, the rule's action takes place.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
}

object WafOverrideAction {
  @scala.inline
  def apply(): WafOverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafOverrideAction]
  }
  @scala.inline
  implicit class WafOverrideActionOps[Self <: WafOverrideAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

