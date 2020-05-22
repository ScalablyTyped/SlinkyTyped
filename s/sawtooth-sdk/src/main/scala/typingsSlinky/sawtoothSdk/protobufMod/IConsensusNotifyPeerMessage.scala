package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusNotifyPeerMessage extends js.Object {
  /** ConsensusNotifyPeerMessage message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.undefined
  /** ConsensusNotifyPeerMessage senderId */
  var senderId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}

object IConsensusNotifyPeerMessage {
  @scala.inline
  def apply(
    message: js.UndefOr[Null | IConsensusPeerMessage] = js.undefined,
    senderId: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined
  ): IConsensusNotifyPeerMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(senderId)) __obj.updateDynamic("senderId")(senderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyPeerMessage]
  }
}

