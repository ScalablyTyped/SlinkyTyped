package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.STATE_UNSPECIFIED
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.CREATING
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.READY
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.ERROR
*/
trait IndexState extends js.Object

object IndexState {
  @scala.inline
  def CREATING: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.CREATING = this.cast("CREATING")
  @scala.inline
  def ERROR: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def READY: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.READY = this.cast("READY")
  @scala.inline
  def STATE_UNSPECIFIED: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.STATE_UNSPECIFIED = this.cast("STATE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

