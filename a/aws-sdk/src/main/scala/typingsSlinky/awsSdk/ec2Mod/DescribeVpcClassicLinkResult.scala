package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcClassicLinkResult extends js.Object {
  /**
    * The ClassicLink status of one or more VPCs.
    */
  var Vpcs: js.UndefOr[VpcClassicLinkList] = js.native
}

object DescribeVpcClassicLinkResult {
  @scala.inline
  def apply(): DescribeVpcClassicLinkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkResult]
  }
  @scala.inline
  implicit class DescribeVpcClassicLinkResultOps[Self <: DescribeVpcClassicLinkResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcs(value: VpcClassicLinkList): Self = {
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

