package typingsSlinky.firebaseMessaging

import org.scalajs.dom.experimental.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEvent extends ExtendableEvent {
  val action: String = js.native
  val notification: Notification = js.native
}

