package typingsSlinky.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.openfinStrings.connected
  - typingsSlinky.openfin.openfinStrings.disconnected
*/
trait OpenFinExternalApplicationEventType extends js.Object

object OpenFinExternalApplicationEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.openfin.openfinStrings.connected = this.cast("connected")
  @scala.inline
  def disconnected: typingsSlinky.openfin.openfinStrings.disconnected = this.cast("disconnected")
}

