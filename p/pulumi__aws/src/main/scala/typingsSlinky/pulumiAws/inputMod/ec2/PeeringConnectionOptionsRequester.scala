package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeeringConnectionOptionsRequester extends js.Object {
  /**
    * Allow a local linked EC2-Classic instance to communicate
    * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
    * to the remote VPC. This option is not supported for inter-region VPC peering.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Allow a local VPC to resolve public DNS hostnames to
    * private IP addresses when queried from instances in the peer VPC.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Allow a local VPC to communicate with a linked EC2-Classic
    * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
    * connection. This option is not supported for inter-region VPC peering.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Input[Boolean]] = js.native
}

object PeeringConnectionOptionsRequester {
  @scala.inline
  def apply(): PeeringConnectionOptionsRequester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringConnectionOptionsRequester]
  }
  @scala.inline
  implicit class PeeringConnectionOptionsRequesterOps[Self <: PeeringConnectionOptionsRequester] (val x: Self) extends AnyVal {
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

