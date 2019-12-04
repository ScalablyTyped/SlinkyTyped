package typingsSlinky.rxjsDashCompat.notificationMod

import org.scalajs.dom.experimental.NotificationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/Notification", "Notification")
@js.native
class NotificationCls protected ()
  extends typingsSlinky.std.Notification {
  def this(title: String) = this()
  def this(title: String, options: NotificationOptions) = this()
}

