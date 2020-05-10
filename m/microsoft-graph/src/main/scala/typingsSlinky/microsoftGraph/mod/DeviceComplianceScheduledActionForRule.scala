package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceComplianceScheduledActionForRule extends Entity {
  // Name of the rule which this scheduled action applies to.
  var ruleName: js.UndefOr[String] = js.native
  // The list of scheduled action configurations for this compliance policy.
  var scheduledActionConfigurations: js.UndefOr[js.Array[DeviceComplianceActionItem]] = js.native
}

object DeviceComplianceScheduledActionForRule {
  @scala.inline
  def apply(): DeviceComplianceScheduledActionForRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceScheduledActionForRule]
  }
  @scala.inline
  implicit class DeviceComplianceScheduledActionForRuleOps[Self <: DeviceComplianceScheduledActionForRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledActionConfigurations(value: js.Array[DeviceComplianceActionItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledActionConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledActionConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledActionConfigurations")(js.undefined)
        ret
    }
  }
  
}

