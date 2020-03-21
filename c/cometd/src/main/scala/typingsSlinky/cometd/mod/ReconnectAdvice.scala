package typingsSlinky.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cometd.cometdStrings.retry
  - typingsSlinky.cometd.cometdStrings.handshake
  - typingsSlinky.cometd.cometdStrings.none
*/
trait ReconnectAdvice extends js.Object

object ReconnectAdvice {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def handshake: typingsSlinky.cometd.cometdStrings.handshake = this.cast("handshake")
  @scala.inline
  def none: typingsSlinky.cometd.cometdStrings.none = this.cast("none")
  @scala.inline
  def retry: typingsSlinky.cometd.cometdStrings.retry = this.cast("retry")
}

