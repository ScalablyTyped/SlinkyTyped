package typingsSlinky.electron.global.Electron

import typingsSlinky.electron.Electron.NotificationConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Notification")
@js.native
class Notification protected ()
  extends typingsSlinky.electron.Electron.Notification {
  def this(options: NotificationConstructorOptions) = this()
}

/* static members */
@JSGlobal("Electron.Notification")
@js.native
object Notification extends js.Object {
  def isSupported(): Boolean = js.native
}

