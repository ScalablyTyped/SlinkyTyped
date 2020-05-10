package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchRuleGroup extends js.Object {
  /**
    * The rules that make up the rule group.
    */
  var PatchRules: PatchRuleList = js.native
}

object PatchRuleGroup {
  @scala.inline
  def apply(PatchRules: PatchRuleList): PatchRuleGroup = {
    val __obj = js.Dynamic.literal(PatchRules = PatchRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRuleGroup]
  }
  @scala.inline
  implicit class PatchRuleGroupOps[Self <: PatchRuleGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatchRules(value: PatchRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchRules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

