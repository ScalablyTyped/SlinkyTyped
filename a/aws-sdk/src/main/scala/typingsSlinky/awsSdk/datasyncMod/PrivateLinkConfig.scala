package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateLinkConfig extends js.Object {
  /**
    * The private endpoint that is configured for an agent that has access to IP addresses in a PrivateLink. An agent that is configured with this endpoint will not be accessible over the public Internet.
    */
  var PrivateLinkEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the EC2 resource that hosts an agent activated in a VPC or an agent that has access to a VPC endpoint.
    */
  var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the subnets that are configured for an agent activated in a VPC or an agent that has access to a VPC endpoint.
    */
  var SubnetArns: js.UndefOr[PLSubnetArnList] = js.native
  /**
    * The ID of the VPC endpoint that is configured for an agent. An agent that is configured with a VPC endpoint will not be accessible over the public Internet.
    */
  var VpcEndpointId: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.VpcEndpointId] = js.native
}

object PrivateLinkConfig {
  @scala.inline
  def apply(): PrivateLinkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateLinkConfig]
  }
  @scala.inline
  implicit class PrivateLinkConfigOps[Self <: PrivateLinkConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivateLinkEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateLinkEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateLinkEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateLinkEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupArns(value: PLSecurityGroupArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupArns")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetArns(value: PLSubnetArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetArns")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointId(value: VpcEndpointId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(js.undefined)
        ret
    }
  }
  
}

