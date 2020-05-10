package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupIpRange extends js.Object {
  /**
    * The IPv4 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To specify a single IPv4 address, use the /32 prefix length.
    */
  var CidrIp: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2SecurityGroupIpRange {
  @scala.inline
  def apply(): AwsEc2SecurityGroupIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupIpRange]
  }
  @scala.inline
  implicit class AwsEc2SecurityGroupIpRangeOps[Self <: AwsEc2SecurityGroupIpRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrIp(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrIp")(js.undefined)
        ret
    }
  }
  
}

