package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationAggregatorSourcesStatusResponse extends js.Object {
  /**
    * Returns an AggregatedSourceStatus object. 
    */
  var AggregatedSourceStatusList: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AggregatedSourceStatusList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeConfigurationAggregatorSourcesStatusResponse {
  @scala.inline
  def apply(): DescribeConfigurationAggregatorSourcesStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationAggregatorSourcesStatusResponseOps[Self <: DescribeConfigurationAggregatorSourcesStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedSourceStatusList(value: AggregatedSourceStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregatedSourceStatusList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregatedSourceStatusList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregatedSourceStatusList")(js.undefined)
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
  }
  
}

