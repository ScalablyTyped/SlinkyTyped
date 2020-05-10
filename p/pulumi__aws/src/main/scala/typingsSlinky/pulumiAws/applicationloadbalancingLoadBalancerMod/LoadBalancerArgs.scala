package typingsSlinky.pulumiAws.applicationloadbalancingLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerAccessLogs
import typingsSlinky.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerSubnetMapping
import typingsSlinky.pulumiAws.ipAddressTypeMod.IpAddressType
import typingsSlinky.pulumiAws.loadBalancerTypeMod.LoadBalancerType
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerArgs extends js.Object {
  /**
    * An Access Logs block. Access Logs documented below.
    */
  val accessLogs: js.UndefOr[Input[LoadBalancerAccessLogs]] = js.native
  /**
    * If true, cross-zone load balancing of the load balancer will be enabled.
    * This is a `network` load balancer feature. Defaults to `false`.
    */
  val enableCrossZoneLoadBalancing: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If true, deletion of the load balancer will be disabled via
    * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
    */
  val enableDeletionProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
    */
  val enableHttp2: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
    */
  val idleTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * If true, the LB will be internal.
    */
  val internal: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
    */
  val ipAddressType: js.UndefOr[Input[IpAddressType]] = js.native
  /**
    * The type of load balancer to create. Possible values are `application` or `network`. The default value is `application`.
    */
  val loadBalancerType: js.UndefOr[Input[LoadBalancerType]] = js.native
  /**
    * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
    * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
    * this provider will autogenerate a name beginning with `tf-lb`.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A subnet mapping block as documented below.
    */
  val subnetMappings: js.UndefOr[Input[js.Array[Input[LoadBalancerSubnetMapping]]]] = js.native
  /**
    * A list of subnet IDs to attach to the LB. Subnets
    * cannot be updated for Load Balancers of type `network`. Changing this value
    * for load balancers of type `network` will force a recreation of the resource.
    */
  val subnets: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LoadBalancerArgs {
  @scala.inline
  def apply(): LoadBalancerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerArgs]
  }
  @scala.inline
  implicit class LoadBalancerArgsOps[Self <: LoadBalancerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessLogs(value: Input[LoadBalancerAccessLogs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCrossZoneLoadBalancing(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCrossZoneLoadBalancing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCrossZoneLoadBalancing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCrossZoneLoadBalancing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeletionProtection(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeletionProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeletionProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeletionProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHttp2(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHttp2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHttp2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHttp2")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInternal(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddressType(value: Input[IpAddressType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddressType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddressType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddressType")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancerType(value: Input[LoadBalancerType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetMappings(value: Input[js.Array[Input[LoadBalancerSubnetMapping]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnets(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

