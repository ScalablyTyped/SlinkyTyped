package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage extends js.Object {
  /** Message content */
  var content: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  /** Message correlationId */
  var correlationId: js.UndefOr[String | Null] = js.undefined
  /** Message messageType */
  var messageType: js.UndefOr[MessageType | Null] = js.undefined
}

object IMessage {
  @scala.inline
  def apply(
    content: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined,
    correlationId: js.UndefOr[Null | String] = js.undefined,
    messageType: js.UndefOr[Null | MessageType] = js.undefined
  ): IMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(correlationId)) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (!js.isUndefined(messageType)) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}

