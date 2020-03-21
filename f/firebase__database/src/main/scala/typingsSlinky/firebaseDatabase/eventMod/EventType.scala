package typingsSlinky.firebaseDatabase.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.value
  - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_added
  - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_changed
  - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_moved
  - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def Spacechild_added: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_added = this.cast(" child_added")
  @scala.inline
  def Spacechild_changed: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_changed = this.cast(" child_changed")
  @scala.inline
  def Spacechild_moved: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_moved = this.cast(" child_moved")
  @scala.inline
  def Spacechild_removed: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_removed = this.cast(" child_removed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def value: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.value = this.cast("value")
}

