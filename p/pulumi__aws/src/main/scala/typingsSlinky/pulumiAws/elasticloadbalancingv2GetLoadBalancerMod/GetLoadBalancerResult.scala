package typingsSlinky.pulumiAws.elasticloadbalancingv2GetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.elasticloadbalancingv2.GetLoadBalancerAccessLogs
import typingsSlinky.pulumiAws.outputMod.elasticloadbalancingv2.GetLoadBalancerSubnetMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerResult extends js.Object {
  val accessLogs: GetLoadBalancerAccessLogs = js.native
  val arn: String = js.native
  val arnSuffix: String = js.native
  val dnsName: String = js.native
  val enableDeletionProtection: Boolean = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val idleTimeout: Double = js.native
  val internal: Boolean = js.native
  val loadBalancerType: String = js.native
  val name: String = js.native
  val securityGroups: js.Array[String] = js.native
  val subnetMappings: js.Array[GetLoadBalancerSubnetMapping] = js.native
  val subnets: js.Array[String] = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
  val zoneId: String = js.native
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(
    accessLogs: GetLoadBalancerAccessLogs,
    arn: String,
    arnSuffix: String,
    dnsName: String,
    enableDeletionProtection: Boolean,
    id: String,
    idleTimeout: Double,
    internal: Boolean,
    loadBalancerType: String,
    name: String,
    securityGroups: js.Array[String],
    subnetMappings: js.Array[GetLoadBalancerSubnetMapping],
    subnets: js.Array[String],
    tags: StringDictionary[js.Any],
    vpcId: String,
    zoneId: String
  ): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal(accessLogs = accessLogs.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], arnSuffix = arnSuffix.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], enableDeletionProtection = enableDeletionProtection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], loadBalancerType = loadBalancerType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetMappings = subnetMappings.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
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
    def withArnSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arnSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableDeletionProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeletionProtection")(value.asInstanceOf[js.Any])
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
    def withInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerType")(value.asInstanceOf[js.Any])
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
    def withSubnetMappings(value: js.Array[GetLoadBalancerSubnetMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetMappings")(value.asInstanceOf[js.Any])
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
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
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

