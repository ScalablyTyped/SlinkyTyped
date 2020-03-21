package typingsSlinky.firebaseMessaging.internalMessageMod

import typingsSlinky.firebaseMessaging.AnonPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalMessage extends js.Object {
  var firebaseMessaging: AnonPayload
}

object InternalMessage {
  @scala.inline
  def apply(firebaseMessaging: AnonPayload): InternalMessage = {
    val __obj = js.Dynamic.literal(firebaseMessaging = firebaseMessaging.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalMessage]
  }
}

