package typingsSlinky.pulumiAws.bgpPeerMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BgpPeerState extends js.Object {
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val amazonAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The Direct Connect endpoint on which the BGP peer terminates.
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
    * The ID of the BGP peer.
    */
  val bgpPeerId: js.UndefOr[Input[String]] = js.native
  /**
    * The Up/Down state of the BGP peer.
    */
  val bgpStatus: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val customerAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect virtual interface on which to create the BGP peer.
    */
  val virtualInterfaceId: js.UndefOr[Input[String]] = js.native
}

object BgpPeerState {
  @scala.inline
  def apply(): BgpPeerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BgpPeerState]
  }
  @scala.inline
  implicit class BgpPeerStateOps[Self <: BgpPeerState] (val x: Self) extends AnyVal {
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
    def withBgpPeerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpPeerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeerId")(js.undefined)
        ret
    }
    @scala.inline
    def withBgpStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpStatus")(js.undefined)
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
    def withVirtualInterfaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(js.undefined)
        ret
    }
  }
  
}

