package typingsSlinky.atFirebaseFirestore.distSrcLocalSimpleUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.readonly
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.readwrite
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.`readonly-idempotent`
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.`readwrite-idempotent`
*/
trait SimpleDbTransactionMode extends js.Object

object SimpleDbTransactionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def readonly: typingsSlinky.atFirebaseFirestore.atFirebaseFirestoreStrings.readonly = this.cast("readonly")
  @scala.inline
  def `readonly-idempotent`: typingsSlinky.atFirebaseFirestore.atFirebaseFirestoreStrings.`readonly-idempotent` = this.cast("readonly-idempotent")
  @scala.inline
  def readwrite: typingsSlinky.atFirebaseFirestore.atFirebaseFirestoreStrings.readwrite = this.cast("readwrite")
  @scala.inline
  def `readwrite-idempotent`: typingsSlinky.atFirebaseFirestore.atFirebaseFirestoreStrings.`readwrite-idempotent` = this.cast("readwrite-idempotent")
}

