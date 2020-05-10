package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePrivateVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the private virtual interface.
    */
  var newPrivateVirtualInterface: NewPrivateVirtualInterface = js.native
}

object CreatePrivateVirtualInterfaceRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, newPrivateVirtualInterface: NewPrivateVirtualInterface): CreatePrivateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPrivateVirtualInterface = newPrivateVirtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePrivateVirtualInterfaceRequest]
  }
  @scala.inline
  implicit class CreatePrivateVirtualInterfaceRequestOps[Self <: CreatePrivateVirtualInterfaceRequest] (val x: Self) extends AnyVal {
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
    def withNewPrivateVirtualInterface(value: NewPrivateVirtualInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPrivateVirtualInterface")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

