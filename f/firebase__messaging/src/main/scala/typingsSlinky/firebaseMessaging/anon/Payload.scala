package typingsSlinky.firebaseMessaging.anon

import typingsSlinky.firebaseMessaging.internalMessageMod.MessageType
import typingsSlinky.firebaseMessaging.messagePayloadMod.MessagePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  var payload: MessagePayload
  var `type`: MessageType
}

object Payload {
  @scala.inline
  def apply(payload: MessagePayload, `type`: MessageType): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

