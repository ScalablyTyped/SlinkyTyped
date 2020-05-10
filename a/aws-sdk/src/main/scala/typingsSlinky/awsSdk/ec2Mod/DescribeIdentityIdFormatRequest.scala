package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityIdFormatRequest extends js.Object {
  /**
    * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
    */
  var PrincipalArn: String = js.native
  /**
    * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway 
    */
  var Resource: js.UndefOr[String] = js.native
}

object DescribeIdentityIdFormatRequest {
  @scala.inline
  def apply(PrincipalArn: String): DescribeIdentityIdFormatRequest = {
    val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityIdFormatRequest]
  }
  @scala.inline
  implicit class DescribeIdentityIdFormatRequestOps[Self <: DescribeIdentityIdFormatRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrincipalArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(js.undefined)
        ret
    }
  }
  
}

