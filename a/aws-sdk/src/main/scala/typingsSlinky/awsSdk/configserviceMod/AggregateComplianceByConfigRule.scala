package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateComplianceByConfigRule extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AwsRegion] = js.native
  /**
    * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect the compliance.
    */
  var Compliance: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Compliance] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigRuleName] = js.native
}

object AggregateComplianceByConfigRule {
  @scala.inline
  def apply(): AggregateComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateComplianceByConfigRule]
  }
  @scala.inline
  implicit class AggregateComplianceByConfigRuleOps[Self <: AggregateComplianceByConfigRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsRegion(value: AwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegion")(js.undefined)
        ret
    }
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

