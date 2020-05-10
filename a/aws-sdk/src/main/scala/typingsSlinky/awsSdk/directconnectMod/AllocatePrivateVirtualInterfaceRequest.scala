package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocatePrivateVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection on which the private virtual interface is provisioned.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the private virtual interface.
    */
  var newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation = js.native
  /**
    * The ID of the AWS account that owns the virtual private interface.
    */
  var ownerAccount: OwnerAccount = js.native
}

object AllocatePrivateVirtualInterfaceRequest {
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocatePrivateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPrivateVirtualInterfaceAllocation = newPrivateVirtualInterfaceAllocation.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocatePrivateVirtualInterfaceRequest]
  }
  @scala.inline
  implicit class AllocatePrivateVirtualInterfaceRequestOps[Self <: AllocatePrivateVirtualInterfaceRequest] (val x: Self) extends AnyVal {
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
    def withNewPrivateVirtualInterfaceAllocation(value: NewPrivateVirtualInterfaceAllocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPrivateVirtualInterfaceAllocation")(value.asInstanceOf[js.Any])
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

