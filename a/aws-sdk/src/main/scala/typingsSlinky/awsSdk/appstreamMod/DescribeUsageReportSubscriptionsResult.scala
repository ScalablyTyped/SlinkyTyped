package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUsageReportSubscriptionsResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the usage report subscription.
    */
  var UsageReportSubscriptions: js.UndefOr[UsageReportSubscriptionList] = js.native
}

object DescribeUsageReportSubscriptionsResult {
  @scala.inline
  def apply(): DescribeUsageReportSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsageReportSubscriptionsResult]
  }
  @scala.inline
  implicit class DescribeUsageReportSubscriptionsResultOps[Self <: DescribeUsageReportSubscriptionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUsageReportSubscriptions(value: UsageReportSubscriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageReportSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageReportSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageReportSubscriptions")(js.undefined)
        ret
    }
  }
  
}

