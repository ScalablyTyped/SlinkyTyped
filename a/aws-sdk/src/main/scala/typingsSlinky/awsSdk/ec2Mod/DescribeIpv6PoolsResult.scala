package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIpv6PoolsResult extends js.Object {
  /**
    * Information about the IPv6 address pools.
    */
  var Ipv6Pools: js.UndefOr[Ipv6PoolSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeIpv6PoolsResult {
  @scala.inline
  def apply(): DescribeIpv6PoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpv6PoolsResult]
  }
  @scala.inline
  implicit class DescribeIpv6PoolsResultOps[Self <: DescribeIpv6PoolsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpv6Pools(value: Ipv6PoolSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Pools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Pools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Pools")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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

