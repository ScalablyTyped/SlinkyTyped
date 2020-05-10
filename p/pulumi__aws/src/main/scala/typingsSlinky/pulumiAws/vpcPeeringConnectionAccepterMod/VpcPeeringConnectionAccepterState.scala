package typingsSlinky.pulumiAws.vpcPeeringConnectionAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterAccepter
import typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterRequester
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionAccepterState extends js.Object {
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: js.UndefOr[Input[VpcPeeringConnectionAccepterAccepter]] = js.native
  /**
    * Whether or not to accept the peering request. Defaults to `false`.
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AWS account ID of the owner of the requester VPC.
    */
  val peerOwnerId: js.UndefOr[Input[String]] = js.native
  /**
    * The region of the accepter VPC.
    */
  val peerRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the requester VPC.
    */
  val peerVpcId: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: js.UndefOr[Input[VpcPeeringConnectionAccepterRequester]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the accepter VPC.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The VPC Peering Connection ID to manage.
    */
  val vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.native
}

object VpcPeeringConnectionAccepterState {
  @scala.inline
  def apply(): VpcPeeringConnectionAccepterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionAccepterState]
  }
  @scala.inline
  implicit class VpcPeeringConnectionAccepterStateOps[Self <: VpcPeeringConnectionAccepterState] (val x: Self) extends AnyVal {
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
    def withAccepter(value: Input[VpcPeeringConnectionAccepterAccepter]): Self = {
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
    def withRequester(value: Input[VpcPeeringConnectionAccepterRequester]): Self = {
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
    @scala.inline
    def withVpcPeeringConnectionId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcPeeringConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcPeeringConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcPeeringConnectionId")(js.undefined)
        ret
    }
  }
  
}

