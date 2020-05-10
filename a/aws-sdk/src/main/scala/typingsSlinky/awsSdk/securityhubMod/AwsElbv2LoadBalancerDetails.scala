package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElbv2LoadBalancerDetails extends js.Object {
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.AvailabilityZones] = js.native
  /**
    * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
    */
  var CanonicalHostedZoneId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[NonEmptyString] = js.native
  /**
    * The public DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
    */
  var IpAddressType: js.UndefOr[NonEmptyString] = js.native
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses.
    */
  var Scheme: js.UndefOr[NonEmptyString] = js.native
  /**
    * The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.SecurityGroups] = js.native
  /**
    * The state of the load balancer.
    */
  var State: js.UndefOr[LoadBalancerState] = js.native
  /**
    * The type of load balancer.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}

object AwsElbv2LoadBalancerDetails {
  @scala.inline
  def apply(): AwsElbv2LoadBalancerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbv2LoadBalancerDetails]
  }
  @scala.inline
  implicit class AwsElbv2LoadBalancerDetailsOps[Self <: AwsElbv2LoadBalancerDetails] (val x: Self) extends AnyVal {
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
    def withCanonicalHostedZoneId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanonicalHostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonicalHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanonicalHostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: NonEmptyString): Self = {
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
    def withDNSName(value: NonEmptyString): Self = {
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
    def withIpAddressType(value: NonEmptyString): Self = {
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
    def withScheme(value: NonEmptyString): Self = {
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
    def withState(value: LoadBalancerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NonEmptyString): Self = {
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
    @scala.inline
    def withVpcId(value: NonEmptyString): Self = {
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

