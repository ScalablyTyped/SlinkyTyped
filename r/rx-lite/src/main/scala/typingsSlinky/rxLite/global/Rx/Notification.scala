package typingsSlinky.rxLite.global.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSGlobal("Rx.Notification")
@js.native
class Notification[T] ()
  extends typingsSlinky.rxLite.Rx.Notification[T]

/* static members */
@JSGlobal("Rx.Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): typingsSlinky.rxLite.Rx.Notification[T] = js.native
  def createOnError[T](exception: js.Any): typingsSlinky.rxLite.Rx.Notification[T] = js.native
  def createOnNext[T](value: T): typingsSlinky.rxLite.Rx.Notification[T] = js.native
}

