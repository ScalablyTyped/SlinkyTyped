package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationAggregatorSourcesStatusRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Filters the status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
    */
  var UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList] = js.native
}

object DescribeConfigurationAggregatorSourcesStatusRequest {
  @scala.inline
  def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): DescribeConfigurationAggregatorSourcesStatusRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusRequest]
  }
  @scala.inline
  implicit class DescribeConfigurationAggregatorSourcesStatusRequestOps[Self <: DescribeConfigurationAggregatorSourcesStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationAggregatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateStatus(value: AggregatedSourceStatusTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateStatus")(js.undefined)
        ret
    }
  }
  
}

