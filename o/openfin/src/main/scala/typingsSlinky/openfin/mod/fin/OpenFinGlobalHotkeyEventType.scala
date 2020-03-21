package typingsSlinky.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.openfinStrings.registered
  - typingsSlinky.openfin.openfinStrings.unregistered
*/
trait OpenFinGlobalHotkeyEventType extends js.Object

object OpenFinGlobalHotkeyEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def registered: typingsSlinky.openfin.openfinStrings.registered = this.cast("registered")
  @scala.inline
  def unregistered: typingsSlinky.openfin.openfinStrings.unregistered = this.cast("unregistered")
}

