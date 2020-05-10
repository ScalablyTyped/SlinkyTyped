package typingsSlinky.pulumiAws.defaultSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultSubnetState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.native
  val assignIpv6AddressOnCreation: js.UndefOr[Input[Boolean]] = js.native
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  val availabilityZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block for the subnet.
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  val ipv6CidrBlockAssociationId: js.UndefOr[Input[String]] = js.native
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address.
    */
  val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC ID.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object DefaultSubnetState {
  @scala.inline
  def apply(): DefaultSubnetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSubnetState]
  }
  @scala.inline
  implicit class DefaultSubnetStateOps[Self <: DefaultSubnetState] (val x: Self) extends AnyVal {
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
    def withAssignIpv6AddressOnCreation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignIpv6AddressOnCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignIpv6AddressOnCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignIpv6AddressOnCreation")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZoneId")(js.undefined)
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
    def withIpv6CidrBlockAssociationId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlockAssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlockAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlockAssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withMapPublicIpOnLaunch(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPublicIpOnLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapPublicIpOnLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPublicIpOnLaunch")(js.undefined)
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
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
  }
  
}

