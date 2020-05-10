package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePublicIpv4PoolsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the address pools.
    */
  var PublicIpv4Pools: js.UndefOr[PublicIpv4PoolSet] = js.native
}

object DescribePublicIpv4PoolsResult {
  @scala.inline
  def apply(): DescribePublicIpv4PoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePublicIpv4PoolsResult]
  }
  @scala.inline
  implicit class DescribePublicIpv4PoolsResultOps[Self <: DescribePublicIpv4PoolsResult] (val x: Self) extends AnyVal {
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
    def withPublicIpv4Pools(value: PublicIpv4PoolSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIpv4Pools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIpv4Pools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIpv4Pools")(js.undefined)
        ret
    }
  }
  
}

