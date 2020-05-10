package typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedPublicVirtualInterfaceState extends js.Object {
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: js.UndefOr[Input[String]] = js.native
  val amazonSideAsn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the virtual interface.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
    */
  val awsDevice: js.UndefOr[Input[String]] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: js.UndefOr[Input[Double]] = js.native
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the virtual interface.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The VLAN ID.
    */
  val vlan: js.UndefOr[Input[Double]] = js.native
}

object HostedPublicVirtualInterfaceState {
  @scala.inline
  def apply(): HostedPublicVirtualInterfaceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedPublicVirtualInterfaceState]
  }
  @scala.inline
  implicit class HostedPublicVirtualInterfaceStateOps[Self <: HostedPublicVirtualInterfaceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressFamily(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withAmazonAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazonAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withAmazonSideAsn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonSideAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazonSideAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonSideAsn")(js.undefined)
        ret
    }
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
    def withAwsDevice(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withBgpAsn(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withBgpAuthKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpAuthKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpAuthKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpAuthKey")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerAddress")(js.undefined)
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
    def withOwnerAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteFilterPrefixes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeFilterPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteFilterPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeFilterPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withVlan(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vlan")(js.undefined)
        ret
    }
  }
  
}

