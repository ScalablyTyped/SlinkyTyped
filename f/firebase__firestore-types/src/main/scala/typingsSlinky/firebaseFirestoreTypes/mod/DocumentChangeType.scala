package typingsSlinky.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.added
  - typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.removed
  - typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.modified
*/
trait DocumentChangeType extends js.Object

object DocumentChangeType {
  @scala.inline
  def added: typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def modified: typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.modified = this.cast("modified")
  @scala.inline
  def removed: typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.removed = this.cast("removed")
}

