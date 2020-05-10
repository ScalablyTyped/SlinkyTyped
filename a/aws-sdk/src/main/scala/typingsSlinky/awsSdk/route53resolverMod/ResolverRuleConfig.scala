package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleConfig extends js.Object {
  /**
    * The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53 console. 
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Name] = js.native
  /**
    * The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  /**
    * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
}

object ResolverRuleConfig {
  @scala.inline
  def apply(): ResolverRuleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleConfig]
  }
  @scala.inline
  implicit class ResolverRuleConfigOps[Self <: ResolverRuleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withResolverEndpointId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetIps(value: TargetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIps")(js.undefined)
        ret
    }
  }
  
}

