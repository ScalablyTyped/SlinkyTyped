package typingsSlinky.openfin.apiGlobalHotkeyMod

import typingsSlinky.openfin.openfinStrings.registered
import typingsSlinky.openfin.openfinStrings.unregistered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.openfinStrings.registered
  - typingsSlinky.openfin.openfinStrings.unregistered
*/
trait nonHotkeyEvents extends js.Object

object nonHotkeyEvents {
  @scala.inline
  def REGISTERED: registered = this.cast("registered")
  @scala.inline
  def UNREGISTERED: unregistered = this.cast("unregistered")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

