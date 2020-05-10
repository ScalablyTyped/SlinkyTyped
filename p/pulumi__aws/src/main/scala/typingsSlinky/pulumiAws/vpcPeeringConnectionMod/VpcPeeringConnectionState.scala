package typingsSlinky.pulumiAws.vpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepter
import typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionRequester
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionState extends js.Object {
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: js.UndefOr[Input[String]] = js.native
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: js.UndefOr[Input[VpcPeeringConnectionAccepter]] = js.native
  /**
    * Accept the peering (both VPCs need to be in the same AWS account).
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AWS account ID of the owner of the peer VPC.
    * Defaults to the account ID the [AWS provider][1] is currently connected to.
    */
  val peerOwnerId: js.UndefOr[Input[String]] = js.native
  /**
    * The region of the accepter VPC of the [VPC Peering Connection]. `autoAccept` must be `false`,
    * and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
    */
  val peerRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC with which you are creating the VPC Peering Connection.
    */
  val peerVpcId: js.UndefOr[Input[String]] = js.native
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: js.UndefOr[Input[VpcPeeringConnectionRequester]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the requester VPC.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object VpcPeeringConnectionState {
  @scala.inline
  def apply(): VpcPeeringConnectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionState]
  }
  @scala.inline
  implicit class VpcPeeringConnectionStateOps[Self <: VpcPeeringConnectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withAccepter(value: Input[VpcPeeringConnectionAccepter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepter")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAccept(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAccept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerOwnerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerVpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequester(value: Input[VpcPeeringConnectionRequester]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequester: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(js.undefined)
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

