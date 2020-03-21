package typingsSlinky.firebaseFirestore.coreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.pending
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.acknowledged
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.rejected
*/
trait MutationBatchState extends js.Object

object MutationBatchState {
  @scala.inline
  def acknowledged: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.acknowledged = this.cast("acknowledged")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.rejected = this.cast("rejected")
}

