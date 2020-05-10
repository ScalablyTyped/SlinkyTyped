package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionRequester extends js.Object {
  /**
    * Allow a local linked EC2-Classic instance to communicate
    * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
    * to the remote VPC.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.native
  /**
    * Allow a local VPC to resolve public DNS hostnames to
    * private IP addresses when queried from instances in the peer VPC. This is
    * [not supported](https://docs.aws.amazon.com/vpc/latest/peering/modify-peering-connections.html) for
    * inter-region VPC peering.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.native
  /**
    * Allow a local VPC to communicate with a linked EC2-Classic
    * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
    * connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.native
}

object VpcPeeringConnectionRequester {
  @scala.inline
  def apply(): VpcPeeringConnectionRequester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionRequester]
  }
  @scala.inline
  implicit class VpcPeeringConnectionRequesterOps[Self <: VpcPeeringConnectionRequester] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowClassicLinkToRemoteVpc(value: Boolean): Self = {
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
    def withAllowRemoteVpcDnsResolution(value: Boolean): Self = {
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
    def withAllowVpcToRemoteClassicLink(value: Boolean): Self = {
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

