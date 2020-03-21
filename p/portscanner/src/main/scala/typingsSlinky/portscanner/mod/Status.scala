package typingsSlinky.portscanner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.portscanner.portscannerStrings.open
  - typingsSlinky.portscanner.portscannerStrings.closed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.portscanner.portscannerStrings.closed = this.cast("closed")
  @scala.inline
  def open: typingsSlinky.portscanner.portscannerStrings.open = this.cast("open")
}

