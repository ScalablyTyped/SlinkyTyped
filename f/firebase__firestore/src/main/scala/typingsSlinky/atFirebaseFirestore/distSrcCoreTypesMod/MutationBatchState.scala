package typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.pending
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.acknowledged
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.rejected
*/
trait MutationBatchState extends js.Object

object MutationBatchState {
  @scala.inline
  def acknowledged: typingsSlinky.atFirebaseFirestore.atFirebaseFirestoreStrings.acknowledged = this.cast("acknowledged")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsSlinky.atFirebaseFirestore.atFirebaseFirestoreStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typingsSlinky.atFirebaseFirestore.atFirebaseFirestoreStrings.rejected = this.cast("rejected")
}

