package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigRuleComplianceSummaryFilters extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * The source region where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AwsRegion] = js.native
}

object ConfigRuleComplianceSummaryFilters {
  @scala.inline
  def apply(): ConfigRuleComplianceSummaryFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRuleComplianceSummaryFilters]
  }
  @scala.inline
  implicit class ConfigRuleComplianceSummaryFiltersOps[Self <: ConfigRuleComplianceSummaryFilters] (val x: Self) extends AnyVal {
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
  }
  
}

