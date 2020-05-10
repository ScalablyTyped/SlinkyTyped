package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcAttributeResult extends js.Object {
  /**
    * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is true, instances in the VPC get DNS hostnames; otherwise, they do not.
    */
  var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether DNS resolution is enabled for the VPC. If this attribute is true, the Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
    */
  var EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DescribeVpcAttributeResult {
  @scala.inline
  def apply(): DescribeVpcAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcAttributeResult]
  }
  @scala.inline
  implicit class DescribeVpcAttributeResultOps[Self <: DescribeVpcAttributeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableDnsHostnames(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDnsHostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDnsHostnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDnsHostnames")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDnsSupport(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDnsSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDnsSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

