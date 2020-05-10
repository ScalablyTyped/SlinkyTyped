package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscriptionFiltersResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The subscription filters.
    */
  var subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.native
}

object DescribeSubscriptionFiltersResponse {
  @scala.inline
  def apply(): DescribeSubscriptionFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscriptionFiltersResponse]
  }
  @scala.inline
  implicit class DescribeSubscriptionFiltersResponseOps[Self <: DescribeSubscriptionFiltersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionFilters(value: SubscriptionFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionFilters")(js.undefined)
        ret
    }
  }
  
}

