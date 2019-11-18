package typingsSlinky.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeStrings.granted
  - typings.reactDashNative.reactDashNativeStrings.denied
  - typings.reactDashNative.reactDashNativeStrings.never_ask_again
*/
trait PermissionStatus extends js.Object

object PermissionStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def denied: typingsSlinky.reactDashNative.reactDashNativeStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsSlinky.reactDashNative.reactDashNativeStrings.granted = this.cast("granted")
  @scala.inline
  def never_ask_again: typingsSlinky.reactDashNative.reactDashNativeStrings.never_ask_again = this.cast("never_ask_again")
}

