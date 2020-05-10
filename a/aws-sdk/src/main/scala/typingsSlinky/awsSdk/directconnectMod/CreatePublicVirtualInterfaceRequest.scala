package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublicVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the public virtual interface.
    */
  var newPublicVirtualInterface: NewPublicVirtualInterface = js.native
}

object CreatePublicVirtualInterfaceRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, newPublicVirtualInterface: NewPublicVirtualInterface): CreatePublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPublicVirtualInterface = newPublicVirtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicVirtualInterfaceRequest]
  }
  @scala.inline
  implicit class CreatePublicVirtualInterfaceRequestOps[Self <: CreatePublicVirtualInterfaceRequest] (val x: Self) extends AnyVal {
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
    def withNewPublicVirtualInterface(value: NewPublicVirtualInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPublicVirtualInterface")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

