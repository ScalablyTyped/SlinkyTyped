package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.added
  - typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.removed
  - typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.modified
*/
trait DocumentChangeType extends js.Object

object DocumentChangeType {
  @scala.inline
  def added: typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def modified: typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.modified = this.cast("modified")
  @scala.inline
  def removed: typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.removed = this.cast("removed")
}

