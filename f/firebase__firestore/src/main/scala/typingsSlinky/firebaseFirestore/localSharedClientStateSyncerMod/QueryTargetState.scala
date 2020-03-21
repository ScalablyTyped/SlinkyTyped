package typingsSlinky.firebaseFirestore.localSharedClientStateSyncerMod

import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.current_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`not-current`
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.current_
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.rejected
*/
trait QueryTargetState extends js.Object

object QueryTargetState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current: current_ = this.cast("current")
  @scala.inline
  def `not-current`: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`not-current` = this.cast("not-current")
  @scala.inline
  def rejected: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.rejected = this.cast("rejected")
}

