package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGossipConsensusMessage extends js.Object {
  /** GossipConsensusMessage message */
  var message: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  /** GossipConsensusMessage senderId */
  var senderId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  /** GossipConsensusMessage timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}

object IGossipConsensusMessage {
  @scala.inline
  def apply(
    message: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined,
    senderId: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined,
    timeToLive: js.UndefOr[Null | Double] = js.undefined
  ): IGossipConsensusMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(senderId)) __obj.updateDynamic("senderId")(senderId.asInstanceOf[js.Any])
    if (!js.isUndefined(timeToLive)) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipConsensusMessage]
  }
}

