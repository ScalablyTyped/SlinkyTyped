package typingsSlinky.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cometd.mod.BaseMessage
  - typingsSlinky.cometd.mod.HandshakeMessage
  - typingsSlinky.cometd.mod.SubscribeMessage
*/
trait Message extends js.Object

object Message {
  @scala.inline
  implicit def apply(value: BaseMessage): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: HandshakeMessage): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: SubscribeMessage): Message = value.asInstanceOf[Message]
}

