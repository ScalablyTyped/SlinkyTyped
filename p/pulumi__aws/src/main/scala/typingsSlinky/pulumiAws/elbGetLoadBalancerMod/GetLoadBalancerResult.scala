package typingsSlinky.pulumiAws.elbGetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.elb.GetLoadBalancerAccessLogs
import typingsSlinky.pulumiAws.outputMod.elb.GetLoadBalancerHealthCheck
import typingsSlinky.pulumiAws.outputMod.elb.GetLoadBalancerListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerResult extends js.Object {
  val accessLogs: GetLoadBalancerAccessLogs = js.native
  val arn: String = js.native
  val availabilityZones: js.Array[String] = js.native
  val connectionDraining: Boolean = js.native
  val connectionDrainingTimeout: Double = js.native
  val crossZoneLoadBalancing: Boolean = js.native
  val dnsName: String = js.native
  val healthCheck: GetLoadBalancerHealthCheck = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val idleTimeout: Double = js.native
  val instances: js.Array[String] = js.native
  val internal: Boolean = js.native
  val listeners: js.Array[GetLoadBalancerListener] = js.native
  val name: String = js.native
  val securityGroups: js.Array[String] = js.native
  val sourceSecurityGroup: String = js.native
  val sourceSecurityGroupId: String = js.native
  val subnets: js.Array[String] = js.native
  val tags: StringDictionary[js.Any] = js.native
  val zoneId: String = js.native
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(
    accessLogs: GetLoadBalancerAccessLogs,
    arn: String,
    availabilityZones: js.Array[String],
    connectionDraining: Boolean,
    connectionDrainingTimeout: Double,
    crossZoneLoadBalancing: Boolean,
    dnsName: String,
    healthCheck: GetLoadBalancerHealthCheck,
    id: String,
    idleTimeout: Double,
    instances: js.Array[String],
    internal: Boolean,
    listeners: js.Array[GetLoadBalancerListener],
    name: String,
    securityGroups: js.Array[String],
    sourceSecurityGroup: String,
    sourceSecurityGroupId: String,
    subnets: js.Array[String],
    tags: StringDictionary[js.Any],
    zoneId: String
  ): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal(accessLogs = accessLogs.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], connectionDraining = connectionDraining.asInstanceOf[js.Any], connectionDrainingTimeout = connectionDrainingTimeout.asInstanceOf[js.Any], crossZoneLoadBalancing = crossZoneLoadBalancing.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], sourceSecurityGroup = sourceSecurityGroup.asInstanceOf[js.Any], sourceSecurityGroupId = sourceSecurityGroupId.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
  @scala.inline
  implicit class GetLoadBalancerResultOps[Self <: GetLoadBalancerResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessLogs(value: GetLoadBalancerAccessLogs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionDraining(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDraining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionDrainingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDrainingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossZoneLoadBalancing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossZoneLoadBalancing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthCheck(value: GetLoadBalancerHealthCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdleTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstances(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListeners(value: js.Array[GetLoadBalancerListener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSecurityGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSecurityGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

