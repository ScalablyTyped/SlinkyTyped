package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPointInput extends js.Object {
  /**
    * One or more Availability Zones from the same region as the load balancer. You must specify at least one Availability Zone. You can add more Availability Zones after you create the load balancer using EnableAvailabilityZonesForLoadBalancer.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.elbMod.AvailabilityZones] = js.native
  /**
    * The listeners. For more information, see Listeners for Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  var Listeners: typingsSlinky.awsSdk.elbMod.Listeners = js.native
  /**
    * The name of the load balancer. This name must be unique within your set of load balancers for the region, must have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The type of a load balancer. Valid only for load balancers in a VPC. By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves to public IP addresses. For more information about Internet-facing and Internal load balancers, see Load Balancer Scheme in the Elastic Load Balancing User Guide. Specify internal to create a load balancer with a DNS name that resolves to private IP addresses.
    */
  var Scheme: js.UndefOr[LoadBalancerScheme] = js.native
  /**
    * The IDs of the security groups to assign to the load balancer.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsSdk.elbMod.SecurityGroups] = js.native
  /**
    * The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability Zone specified in AvailabilityZones.
    */
  var Subnets: js.UndefOr[typingsSlinky.awsSdk.elbMod.Subnets] = js.native
  /**
    * A list of tags to assign to the load balancer. For more information about tagging your load balancer, see Tag Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateAccessPointInput {
  @scala.inline
  def apply(Listeners: Listeners, LoadBalancerName: AccessPointName): CreateAccessPointInput = {
    val __obj = js.Dynamic.literal(Listeners = Listeners.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointInput]
  }
  @scala.inline
  implicit class CreateAccessPointInputOps[Self <: CreateAccessPointInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListeners(value: Listeners): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerName(value: AccessPointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: LoadBalancerScheme): Self = {
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
  }
  
}

