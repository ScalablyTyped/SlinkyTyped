package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationAggregationSource extends js.Object {
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.native
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.native
  /**
    * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
    */
  var RoleArn: String = js.native
}

object OrganizationAggregationSource {
  @scala.inline
  def apply(RoleArn: String): OrganizationAggregationSource = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationAggregationSource]
  }
  @scala.inline
  implicit class OrganizationAggregationSourceOps[Self <: OrganizationAggregationSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
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

