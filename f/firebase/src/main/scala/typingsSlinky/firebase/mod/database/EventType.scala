package typingsSlinky.firebase.mod.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebase.firebaseStrings.value
  - typingsSlinky.firebase.firebaseStrings.child_added
  - typingsSlinky.firebase.firebaseStrings.child_changed
  - typingsSlinky.firebase.firebaseStrings.child_moved
  - typingsSlinky.firebase.firebaseStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typingsSlinky.firebase.firebaseStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typingsSlinky.firebase.firebaseStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typingsSlinky.firebase.firebaseStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typingsSlinky.firebase.firebaseStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typingsSlinky.firebase.firebaseStrings.value = this.cast("value")
}

