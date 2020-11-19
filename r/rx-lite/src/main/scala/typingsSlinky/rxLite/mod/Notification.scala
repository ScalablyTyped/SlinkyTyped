package typingsSlinky.rxLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Notifications
@JSImport("rx-lite", "Notification")
@js.native
class Notification[T] ()
  extends typingsSlinky.rxLite.Rx.Notification[T]
/* static members */
@JSImport("rx-lite", "Notification")
@js.native
object Notification extends js.Object {
  
  def createOnCompleted[T](): typingsSlinky.rxLite.Rx.Notification[T] = js.native
  
  def createOnError[T](exception: js.Any): typingsSlinky.rxLite.Rx.Notification[T] = js.native
  
  def createOnNext[T](value: T): typingsSlinky.rxLite.Rx.Notification[T] = js.native
}
