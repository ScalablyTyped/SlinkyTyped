package typingsSlinky.pulumiAws.resolverEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.route53.ResolverEndpointIpAddress
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverEndpointState extends js.Object {
  /**
    * The ARN of the Route 53 Resolver endpoint.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The direction of DNS queries to or from the Route 53 Resolver endpoint.
    * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
    * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
    */
  val direction: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC that you want to create the resolver endpoint in.
    */
  val hostVpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
    * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
    */
  val ipAddresses: js.UndefOr[Input[js.Array[Input[ResolverEndpointIpAddress]]]] = js.native
  /**
    * The friendly name of the Route 53 Resolver endpoint.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ResolverEndpointState {
  @scala.inline
  def apply(): ResolverEndpointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverEndpointState]
  }
  @scala.inline
  implicit class ResolverEndpointStateOps[Self <: ResolverEndpointState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withHostVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostVpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddresses(value: Input[js.Array[Input[ResolverEndpointIpAddress]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(js.undefined)
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
    def withSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(js.undefined)
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

