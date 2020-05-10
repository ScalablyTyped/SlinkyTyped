package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAggregationSource extends js.Object {
  /**
    * The 12-digit account ID of the account being aggregated. 
    */
  var AccountIds: AccountAggregationSourceAccountList = js.native
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.native
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.native
}

object AccountAggregationSource {
  @scala.inline
  def apply(AccountIds: AccountAggregationSourceAccountList): AccountAggregationSource = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAggregationSource]
  }
  @scala.inline
  implicit class AccountAggregationSourceOps[Self <: AccountAggregationSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountIds(value: AccountAggregationSourceAccountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllAwsRegions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllAwsRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllAwsRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllAwsRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsRegions(value: AggregatorRegionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegions")(js.undefined)
        ret
    }
  }
  
}

