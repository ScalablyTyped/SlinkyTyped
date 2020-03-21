package typingsSlinky.reactNativeFirebase.mod.RNFirebase.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.value
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.child_added
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.child_removed
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.child_changed
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.child_moved
*/
trait QueryEventType extends js.Object

object QueryEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.value = this.cast("value")
}

