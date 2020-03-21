package typingsSlinky.expo

import typingsSlinky.expo.expoStrings.error
import typingsSlinky.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends UpdateEvent {
  var message: String
  var `type`: error
}

object AnonMessage {
  @scala.inline
  def apply(message: String, `type`: error): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

