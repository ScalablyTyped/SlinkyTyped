package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcClassicLinkDnsSupportResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.native
  /**
    * Information about the ClassicLink DNS support status of the VPCs.
    */
  var Vpcs: js.UndefOr[ClassicLinkDnsSupportList] = js.native
}

object DescribeVpcClassicLinkDnsSupportResult {
  @scala.inline
  def apply(): DescribeVpcClassicLinkDnsSupportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportResult]
  }
  @scala.inline
  implicit class DescribeVpcClassicLinkDnsSupportResultOps[Self <: DescribeVpcClassicLinkDnsSupportResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: DescribeVpcClassicLinkDnsSupportNextToken): Self = {
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
    def withVpcs(value: ClassicLinkDnsSupportList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpcs")(js.undefined)
        ret
    }
  }
  
}

