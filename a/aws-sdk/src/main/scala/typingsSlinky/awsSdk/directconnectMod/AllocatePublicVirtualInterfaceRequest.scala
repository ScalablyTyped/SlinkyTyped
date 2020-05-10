package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocatePublicVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection on which the public virtual interface is provisioned.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the public virtual interface.
    */
  var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation = js.native
  /**
    * The ID of the AWS account that owns the public virtual interface.
    */
  var ownerAccount: OwnerAccount = js.native
}

object AllocatePublicVirtualInterfaceRequest {
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocatePublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocatePublicVirtualInterfaceRequest]
  }
  @scala.inline
  implicit class AllocatePublicVirtualInterfaceRequestOps[Self <: AllocatePublicVirtualInterfaceRequest] (val x: Self) extends AnyVal {
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
    def withNewPublicVirtualInterfaceAllocation(value: NewPublicVirtualInterfaceAllocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPublicVirtualInterfaceAllocation")(value.asInstanceOf[js.Any])
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

