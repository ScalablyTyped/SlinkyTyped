package typingsSlinky.electron.mod

import typingsSlinky.electron.Electron.NotificationConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "Notification")
@js.native
/**
  * Notification
  */
class Notification ()
  extends typingsSlinky.electron.Electron.Notification {
  def this(options: NotificationConstructorOptions) = this()
}
/* static members */
@JSImport("electron", "Notification")
@js.native
object Notification extends js.Object {
  
  /**
    * Whether or not desktop notifications are supported on the current system
    */
  def isSupported(): Boolean = js.native
}
