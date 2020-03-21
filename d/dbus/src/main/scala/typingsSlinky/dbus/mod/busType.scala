package typingsSlinky.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dbus.dbusStrings.session
  - typingsSlinky.dbus.dbusStrings.system
*/
trait busType extends js.Object

object busType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def session: typingsSlinky.dbus.dbusStrings.session = this.cast("session")
  @scala.inline
  def system: typingsSlinky.dbus.dbusStrings.system = this.cast("system")
}

