package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusNotifyPeerMessage extends js.Object {
  /** ConsensusNotifyPeerMessage message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.native
  /** ConsensusNotifyPeerMessage senderId */
  var senderId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}

object IConsensusNotifyPeerMessage {
  @scala.inline
  def apply(): IConsensusNotifyPeerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyPeerMessage]
  }
  @scala.inline
  implicit class IConsensusNotifyPeerMessageOps[Self <: IConsensusNotifyPeerMessage] (val x: Self) extends AnyVal {
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
    def withSenderId(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderId")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderId")(null)
        ret
    }
  }
  
}

