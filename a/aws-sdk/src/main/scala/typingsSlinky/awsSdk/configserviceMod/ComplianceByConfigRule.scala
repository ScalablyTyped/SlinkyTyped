package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceByConfigRule extends js.Object {
  /**
    * Indicates whether the AWS Config rule is compliant.
    */
  var Compliance: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Compliance] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.native
}

object ComplianceByConfigRule {
  @scala.inline
  def apply(): ComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceByConfigRule]
  }
  @scala.inline
  implicit class ComplianceByConfigRuleOps[Self <: ComplianceByConfigRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompliance(value: Compliance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compliance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compliance")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleName(value: StringWithCharLimit64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(js.undefined)
        ret
    }
  }
  
}

