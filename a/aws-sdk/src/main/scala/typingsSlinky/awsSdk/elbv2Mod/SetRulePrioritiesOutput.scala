package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRulePrioritiesOutput extends js.Object {
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Rules] = js.native
}

object SetRulePrioritiesOutput {
  @scala.inline
  def apply(): SetRulePrioritiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetRulePrioritiesOutput]
  }
  @scala.inline
  implicit class SetRulePrioritiesOutputOps[Self <: SetRulePrioritiesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: Rules): Self = {
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

