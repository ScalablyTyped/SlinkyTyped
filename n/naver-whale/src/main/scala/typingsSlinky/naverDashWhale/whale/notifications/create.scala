package typingsSlinky.naverDashWhale.whale.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.create")
@js.native
object create extends js.Object {
  def apply(notificationId: String, options: typingsSlinky.chrome.chrome.notifications.NotificationOptions): Unit = js.native
  def apply(
    notificationId: String,
    options: typingsSlinky.chrome.chrome.notifications.NotificationOptions,
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = js.native
  def apply(options: typingsSlinky.chrome.chrome.notifications.NotificationOptions): Unit = js.native
  def apply(
    options: typingsSlinky.chrome.chrome.notifications.NotificationOptions,
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = js.native
}

