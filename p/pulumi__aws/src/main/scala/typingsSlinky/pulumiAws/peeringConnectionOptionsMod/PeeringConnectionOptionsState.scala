package typingsSlinky.pulumiAws.peeringConnectionOptionsMod

import typingsSlinky.pulumiAws.inputMod.ec2.PeeringConnectionOptionsAccepter
import typingsSlinky.pulumiAws.inputMod.ec2.PeeringConnectionOptionsRequester
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeeringConnectionOptionsState extends js.Object {
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: js.UndefOr[Input[PeeringConnectionOptionsAccepter]] = js.native
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: js.UndefOr[Input[PeeringConnectionOptionsRequester]] = js.native
  /**
    * The ID of the requester VPC peering connection.
    */
  val vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.native
}

object PeeringConnectionOptionsState {
  @scala.inline
  def apply(): PeeringConnectionOptionsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringConnectionOptionsState]
  }
  @scala.inline
  implicit class PeeringConnectionOptionsStateOps[Self <: PeeringConnectionOptionsState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepter(value: Input[PeeringConnectionOptionsAccepter]): Self = {
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
    def withRequester(value: Input[PeeringConnectionOptionsRequester]): Self = {
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

