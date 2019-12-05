package typingsSlinky.rxDashJquery.rxDashJqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSImport("rx-jquery", "Notification")
@js.native
class Notification[T] ()
  extends typingsSlinky.rxDashLite.Rx.Notification[T]

/* static members */
@JSImport("rx-jquery", "Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): typingsSlinky.rxDashLite.Rx.Notification[T] = js.native
  def createOnError[T](exception: js.Any): typingsSlinky.rxDashLite.Rx.Notification[T] = js.native
  def createOnNext[T](value: T): typingsSlinky.rxDashLite.Rx.Notification[T] = js.native
}

