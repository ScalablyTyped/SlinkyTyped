package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTransitGatewayMulticastGroupMembersResult extends js.Object {
  /**
    * Information about the deregistered members.
    */
  var DeregisteredMulticastGroupMembers: js.UndefOr[TransitGatewayMulticastDeregisteredGroupMembers] = js.native
}

object DeregisterTransitGatewayMulticastGroupMembersResult {
  @scala.inline
  def apply(): DeregisterTransitGatewayMulticastGroupMembersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTransitGatewayMulticastGroupMembersResult]
  }
  @scala.inline
  implicit class DeregisterTransitGatewayMulticastGroupMembersResultOps[Self <: DeregisterTransitGatewayMulticastGroupMembersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeregisteredMulticastGroupMembers(value: TransitGatewayMulticastDeregisteredGroupMembers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeregisteredMulticastGroupMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeregisteredMulticastGroupMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeregisteredMulticastGroupMembers")(js.undefined)
        ret
    }
  }
  
}

