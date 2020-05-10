package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackRuleCompliance extends js.Object {
  /**
    * Compliance of the AWS Config rule The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.native
  /**
    * Name of the config rule.
    */
  var ConfigRuleName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigRuleName] = js.native
}

object ConformancePackRuleCompliance {
  @scala.inline
  def apply(): ConformancePackRuleCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackRuleCompliance]
  }
  @scala.inline
  implicit class ConformancePackRuleComplianceOps[Self <: ConformancePackRuleCompliance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceType(value: ConformancePackComplianceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleName(value: ConfigRuleName): Self = {
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

