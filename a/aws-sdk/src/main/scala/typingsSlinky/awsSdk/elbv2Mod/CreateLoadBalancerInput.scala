package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerInput extends js.Object {
  /**
    * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). Internal load balancers must use ipv4.
    */
  var IpAddressType: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.IpAddressType] = js.native
  /**
    * The name of the load balancer. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with "internal-".
    */
  var Name: LoadBalancerName = js.native
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can route requests only from clients with access to the VPC for the load balancer. The default is an Internet-facing load balancer.
    */
  var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.native
  /**
    * [Application Load Balancers] The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.SecurityGroups] = js.native
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify Elastic IP addresses for your subnets. [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic IP address per subnet if you need static IP addresses for your internet-facing load balancer. For internal load balancers, you can specify one private IP address per subnet from the IPv4 range of the subnet.
    */
  var SubnetMappings: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.SubnetMappings] = js.native
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. [Network Load Balancers] You can specify subnets from one or more Availability Zones.
    */
  var Subnets: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Subnets] = js.native
  /**
    * One or more tags to assign to the load balancer.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of load balancer. The default is application.
    */
  var Type: js.UndefOr[LoadBalancerTypeEnum] = js.native
}

object CreateLoadBalancerInput {
  @scala.inline
  def apply(Name: LoadBalancerName): CreateLoadBalancerInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerInput]
  }
  @scala.inline
  implicit class CreateLoadBalancerInputOps[Self <: CreateLoadBalancerInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: LoadBalancerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddressType(value: IpAddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddressType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressType")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: LoadBalancerSchemeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: SecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetMappings(value: SubnetMappings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnets(value: Subnets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnets")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: LoadBalancerTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

