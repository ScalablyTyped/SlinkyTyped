package typingsSlinky.pulumiAws.resolverEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.route53.ResolverEndpointIpAddress
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverEndpointArgs extends js.Object {
  /**
    * The direction of DNS queries to or from the Route 53 Resolver endpoint.
    * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
    * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
    */
  val direction: Input[String] = js.native
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
    * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
    */
  val ipAddresses: Input[js.Array[Input[ResolverEndpointIpAddress]]] = js.native
  /**
    * The friendly name of the Route 53 Resolver endpoint.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC.
    */
  val securityGroupIds: Input[js.Array[Input[String]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ResolverEndpointArgs {
  @scala.inline
  def apply(
    direction: Input[String],
    ipAddresses: Input[js.Array[Input[ResolverEndpointIpAddress]]],
    securityGroupIds: Input[js.Array[Input[String]]]
  ): ResolverEndpointArgs = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], ipAddresses = ipAddresses.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverEndpointArgs]
  }
  @scala.inline
  implicit class ResolverEndpointArgsOps[Self <: ResolverEndpointArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddresses(value: Input[js.Array[Input[ResolverEndpointIpAddress]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
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

