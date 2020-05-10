package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateTransitVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection on which the transit virtual interface is provisioned.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the transit virtual interface.
    */
  var newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation = js.native
  /**
    * The ID of the AWS account that owns the transit virtual interface.
    */
  var ownerAccount: OwnerAccount = js.native
}

object AllocateTransitVirtualInterfaceRequest {
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocateTransitVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newTransitVirtualInterfaceAllocation = newTransitVirtualInterfaceAllocation.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateTransitVirtualInterfaceRequest]
  }
  @scala.inline
  implicit class AllocateTransitVirtualInterfaceRequestOps[Self <: AllocateTransitVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionId(value: ConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewTransitVirtualInterfaceAllocation(value: NewTransitVirtualInterfaceAllocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTransitVirtualInterfaceAllocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

