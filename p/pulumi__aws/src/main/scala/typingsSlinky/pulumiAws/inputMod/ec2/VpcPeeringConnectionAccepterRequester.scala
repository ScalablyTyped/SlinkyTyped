package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionAccepterRequester extends js.Object {
  /**
    * Indicates whether a local ClassicLink connection can communicate
    * with the peer VPC over the VPC Peering Connection.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether a local VPC can resolve public DNS hostnames to
    * private IP addresses when queried from instances in a peer VPC.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether a local VPC can communicate with a ClassicLink
    * connection in the peer VPC over the VPC Peering Connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Input[Boolean]] = js.native
}

object VpcPeeringConnectionAccepterRequester {
  @scala.inline
  def apply(): VpcPeeringConnectionAccepterRequester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionAccepterRequester]
  }
  @scala.inline
  implicit class VpcPeeringConnectionAccepterRequesterOps[Self <: VpcPeeringConnectionAccepterRequester] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowClassicLinkToRemoteVpc(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClassicLinkToRemoteVpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClassicLinkToRemoteVpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClassicLinkToRemoteVpc")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRemoteVpcDnsResolution(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRemoteVpcDnsResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRemoteVpcDnsResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRemoteVpcDnsResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowVpcToRemoteClassicLink(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVpcToRemoteClassicLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowVpcToRemoteClassicLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVpcToRemoteClassicLink")(js.undefined)
        ret
    }
  }
  
}

