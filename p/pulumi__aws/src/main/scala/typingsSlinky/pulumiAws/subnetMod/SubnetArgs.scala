package typingsSlinky.pulumiAws.subnetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetArgs extends js.Object {
  /**
    * Specify true to indicate
    * that network interfaces created in the specified subnet should be
    * assigned an IPv6 address. Default is `false`
    */
  val assignIpv6AddressOnCreation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AZ for the subnet.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The AZ ID of the subnet.
    */
  val availabilityZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block for the subnet.
    */
  val cidrBlock: Input[String] = js.native
  /**
    * The IPv6 network range for the subnet,
    * in CIDR notation. The subnet size must use a /64 prefix length.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address. Default is `false`.
    */
  val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC ID.
    */
  val vpcId: Input[String] = js.native
}

object SubnetArgs {
  @scala.inline
  def apply(cidrBlock: Input[String], vpcId: Input[String]): SubnetArgs = {
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetArgs]
  }
  @scala.inline
  implicit class SubnetArgsOps[Self <: SubnetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
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

