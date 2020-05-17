package typingsSlinky.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cometd.mod.SuccessfulHandshakeMessage
  - typingsSlinky.cometd.mod.UnsuccessfulHandshakeMessage
*/
trait HandshakeMessage extends Message

object HandshakeMessage {
  @scala.inline
  implicit def apply(value: SuccessfulHandshakeMessage): HandshakeMessage = value.asInstanceOf[HandshakeMessage]
  @scala.inline
  implicit def apply(value: UnsuccessfulHandshakeMessage): HandshakeMessage = value.asInstanceOf[HandshakeMessage]
}

