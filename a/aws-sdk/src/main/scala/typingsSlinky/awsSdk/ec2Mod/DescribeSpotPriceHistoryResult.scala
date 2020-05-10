package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotPriceHistoryResult extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null or an empty string when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The historical Spot prices.
    */
  var SpotPriceHistory: js.UndefOr[SpotPriceHistoryList] = js.native
}

object DescribeSpotPriceHistoryResult {
  @scala.inline
  def apply(): DescribeSpotPriceHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotPriceHistoryResult]
  }
  @scala.inline
  implicit class DescribeSpotPriceHistoryResultOps[Self <: DescribeSpotPriceHistoryResult] (val x: Self) extends AnyVal {
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
    def withSpotPriceHistory(value: SpotPriceHistoryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotPriceHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotPriceHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotPriceHistory")(js.undefined)
        ret
    }
  }
  
}

