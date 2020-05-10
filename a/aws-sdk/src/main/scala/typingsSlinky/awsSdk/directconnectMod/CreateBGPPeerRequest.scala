package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBGPPeerRequest extends js.Object {
  /**
    * Information about the BGP peer.
    */
  var newBGPPeer: js.UndefOr[NewBGPPeer] = js.native
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
}

object CreateBGPPeerRequest {
  @scala.inline
  def apply(): CreateBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBGPPeerRequest]
  }
  @scala.inline
  implicit class CreateBGPPeerRequestOps[Self <: CreateBGPPeerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewBGPPeer(value: NewBGPPeer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBGPPeer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewBGPPeer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBGPPeer")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualInterfaceId(value: VirtualInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(js.undefined)
        ret
    }
  }
  
}

