package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusSendToRequest extends js.Object {
  /** ConsensusSendToRequest message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.native
  /** ConsensusSendToRequest peerId */
  var peerId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}

object IConsensusSendToRequest {
  @scala.inline
  def apply(): IConsensusSendToRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSendToRequest]
  }
  @scala.inline
  implicit class IConsensusSendToRequestOps[Self <: IConsensusSendToRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: IConsensusPeerMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(null)
        ret
    }
    @scala.inline
    def withPeerId(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerId")(null)
        ret
    }
  }
  
}

