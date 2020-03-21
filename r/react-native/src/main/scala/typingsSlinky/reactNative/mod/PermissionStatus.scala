package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.reactNativeStrings.granted
  - typingsSlinky.reactNative.reactNativeStrings.denied
  - typingsSlinky.reactNative.reactNativeStrings.never_ask_again
*/
trait PermissionStatus extends js.Object

object PermissionStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def denied: typingsSlinky.reactNative.reactNativeStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsSlinky.reactNative.reactNativeStrings.granted = this.cast("granted")
  @scala.inline
  def never_ask_again: typingsSlinky.reactNative.reactNativeStrings.never_ask_again = this.cast("never_ask_again")
}

