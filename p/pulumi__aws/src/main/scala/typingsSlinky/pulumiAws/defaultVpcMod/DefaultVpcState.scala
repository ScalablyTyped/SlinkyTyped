package typingsSlinky.pulumiAws.defaultVpcMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultVpcState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Whether or not an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC was assigned
    */
  val assignGeneratedIpv6CidrBlock: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The CIDR block of the VPC
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the network ACL created by default on VPC creation
    */
  val defaultNetworkAclId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the route table created by default on VPC creation
    */
  val defaultRouteTableId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the security group created by default on VPC creation
    */
  val defaultSecurityGroupId: js.UndefOr[Input[String]] = js.native
  val dhcpOptionsId: js.UndefOr[Input[String]] = js.native
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: js.UndefOr[Input[Boolean]] = js.native
  val enableClassiclinkDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Tenancy of instances spin up within VPC.
    */
  val instanceTenancy: js.UndefOr[Input[String]] = js.native
  /**
    * The association ID for the IPv6 CIDR block of the VPC
    */
  val ipv6AssociationId: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv6 CIDR block of the VPC
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the main route table associated with
    * this VPC. Note that you can change a VPC's main route table by using an
    * [`aws.ec2.MainRouteTableAssociation`](https://www.terraform.io/docs/providers/aws/r/main_route_table_association.html)
    */
  val mainRouteTableId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DefaultVpcState {
  @scala.inline
  def apply(): DefaultVpcState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultVpcState]
  }
  @scala.inline
  implicit class DefaultVpcStateOps[Self <: DefaultVpcState] (val x: Self) extends AnyVal {
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
    def withAssignGeneratedIpv6CidrBlock(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignGeneratedIpv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignGeneratedIpv6CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignGeneratedIpv6CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withCidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNetworkAclId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNetworkAclId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNetworkAclId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNetworkAclId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouteTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSecurityGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSecurityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withDhcpOptionsId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhcpOptionsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDhcpOptionsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhcpOptionsId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClassiclink(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClassiclink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClassiclink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClassiclink")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClassiclinkDnsSupport(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClassiclinkDnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClassiclinkDnsSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClassiclinkDnsSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDnsHostnames(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsHostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDnsHostnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsHostnames")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDnsSupport(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDnsSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTenancy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTenancy")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6AssociationId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6AssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6AssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6CidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withMainRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainRouteTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(js.undefined)
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

