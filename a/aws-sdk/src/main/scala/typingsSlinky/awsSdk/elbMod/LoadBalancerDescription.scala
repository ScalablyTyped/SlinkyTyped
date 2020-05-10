package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerDescription extends js.Object {
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.elbMod.AvailabilityZones] = js.native
  /**
    * Information about your EC2 instances.
    */
  var BackendServerDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbMod.BackendServerDescriptions] = js.native
  /**
    * The DNS name of the load balancer. For more information, see Configure a Custom Domain Name in the Classic Load Balancers Guide.
    */
  var CanonicalHostedZoneName: js.UndefOr[DNSName] = js.native
  /**
    * The ID of the Amazon Route 53 hosted zone for the load balancer.
    */
  var CanonicalHostedZoneNameID: js.UndefOr[DNSName] = js.native
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typingsSlinky.awsSdk.elbMod.DNSName] = js.native
  /**
    * Information about the health checks conducted on the load balancer.
    */
  var HealthCheck: js.UndefOr[typingsSlinky.awsSdk.elbMod.HealthCheck] = js.native
  /**
    * The IDs of the instances for the load balancer.
    */
  var Instances: js.UndefOr[typingsSlinky.awsSdk.elbMod.Instances] = js.native
  /**
    * The listeners for the load balancer.
    */
  var ListenerDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbMod.ListenerDescriptions] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.native
  /**
    * The policies defined for the load balancer.
    */
  var Policies: js.UndefOr[typingsSlinky.awsSdk.elbMod.Policies] = js.native
  /**
    * The type of load balancer. Valid only for load balancers in a VPC. If Scheme is internet-facing, the load balancer has a public DNS name that resolves to a public IP address. If Scheme is internal, the load balancer has a public DNS name that resolves to a private IP address.
    */
  var Scheme: js.UndefOr[LoadBalancerScheme] = js.native
  /**
    * The security groups for the load balancer. Valid only for load balancers in a VPC.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsSdk.elbMod.SecurityGroups] = js.native
  /**
    * The security group for the load balancer, which you can use as part of your inbound rules for your registered instances. To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
    */
  var SourceSecurityGroup: js.UndefOr[typingsSlinky.awsSdk.elbMod.SourceSecurityGroup] = js.native
  /**
    * The IDs of the subnets for the load balancer.
    */
  var Subnets: js.UndefOr[typingsSlinky.awsSdk.elbMod.Subnets] = js.native
  /**
    * The ID of the VPC for the load balancer.
    */
  var VPCId: js.UndefOr[typingsSlinky.awsSdk.elbMod.VPCId] = js.native
}

object LoadBalancerDescription {
  @scala.inline
  def apply(): LoadBalancerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerDescription]
  }
  @scala.inline
  implicit class LoadBalancerDescriptionOps[Self <: LoadBalancerDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBackendServerDescriptions(value: BackendServerDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackendServerDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendServerDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackendServerDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCanonicalHostedZoneName(value: DNSName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanonicalHostedZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonicalHostedZoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanonicalHostedZoneName")(js.undefined)
        ret
    }
    @scala.inline
    def withCanonicalHostedZoneNameID(value: DNSName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanonicalHostedZoneNameID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonicalHostedZoneNameID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanonicalHostedZoneNameID")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDNSName(value: DNSName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DNSName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDNSName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DNSName")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheck(value: HealthCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withInstances(value: Instances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(js.undefined)
        ret
    }
    @scala.inline
    def withListenerDescriptions(value: ListenerDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenerDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListenerDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenerDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancerName(value: AccessPointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerName")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicies(value: Policies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(js.undefined)
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
    def withSourceSecurityGroup(value: SourceSecurityGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSecurityGroup")(js.undefined)
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
    def withVPCId(value: VPCId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPCId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCId")(js.undefined)
        ret
    }
  }
  
}

