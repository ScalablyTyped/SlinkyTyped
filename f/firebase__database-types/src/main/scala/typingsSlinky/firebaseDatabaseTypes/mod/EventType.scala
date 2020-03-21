package typingsSlinky.firebaseDatabaseTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value
  - typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added
  - typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed
  - typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved
  - typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typingsSlinky.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value = this.cast("value")
}

