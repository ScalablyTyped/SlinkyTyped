package typingsSlinky.firebaseFirestore.persistenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.readonly
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.readwrite
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary`
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`readonly-idempotent`
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`readwrite-idempotent`
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary-idempotent`
*/
trait PersistenceTransactionMode extends js.Object

object PersistenceTransactionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def readonly: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.readonly = this.cast("readonly")
  @scala.inline
  def `readonly-idempotent`: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`readonly-idempotent` = this.cast("readonly-idempotent")
  @scala.inline
  def readwrite: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.readwrite = this.cast("readwrite")
  @scala.inline
  def `readwrite-idempotent`: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`readwrite-idempotent` = this.cast("readwrite-idempotent")
  @scala.inline
  def `readwrite-primary`: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary` = this.cast("readwrite-primary")
  @scala.inline
  def `readwrite-primary-idempotent`: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary-idempotent` = this.cast("readwrite-primary-idempotent")
}

