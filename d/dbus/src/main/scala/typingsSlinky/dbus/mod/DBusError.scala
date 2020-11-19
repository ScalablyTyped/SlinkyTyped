package typingsSlinky.dbus.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dbus", "DBusError")
@js.native
class DBusError protected () extends Error {
  def this(name: String, message: String) = this()
  
  val dbusName: String = js.native
}
