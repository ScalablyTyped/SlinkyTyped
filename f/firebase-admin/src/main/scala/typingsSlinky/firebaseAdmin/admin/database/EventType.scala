package typingsSlinky.firebaseAdmin.admin.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseAdmin.firebaseAdminStrings.value
  - typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_added
  - typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_changed
  - typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_moved
  - typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typingsSlinky.firebaseAdmin.firebaseAdminStrings.value = this.cast("value")
}

