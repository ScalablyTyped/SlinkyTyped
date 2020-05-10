package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotInstanceRequestsResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.native
}

object DescribeSpotInstanceRequestsResult {
  @scala.inline
  def apply(): DescribeSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotInstanceRequestsResult]
  }
  @scala.inline
  implicit class DescribeSpotInstanceRequestsResultOps[Self <: DescribeSpotInstanceRequestsResult] (val x: Self) extends AnyVal {
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
    def withSpotInstanceRequests(value: SpotInstanceRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotInstanceRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceRequests")(js.undefined)
        ret
    }
  }
  
}

