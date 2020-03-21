package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.reactNativeStrings.notification
  - typingsSlinky.reactNative.reactNativeStrings.localNotification
  - typingsSlinky.reactNative.reactNativeStrings.register
  - typingsSlinky.reactNative.reactNativeStrings.registrationError
*/
trait PushNotificationEventName extends js.Object

object PushNotificationEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localNotification: typingsSlinky.reactNative.reactNativeStrings.localNotification = this.cast("localNotification")
  @scala.inline
  def notification: typingsSlinky.reactNative.reactNativeStrings.notification = this.cast("notification")
  @scala.inline
  def register: typingsSlinky.reactNative.reactNativeStrings.register = this.cast("register")
  @scala.inline
  def registrationError: typingsSlinky.reactNative.reactNativeStrings.registrationError = this.cast("registrationError")
}

