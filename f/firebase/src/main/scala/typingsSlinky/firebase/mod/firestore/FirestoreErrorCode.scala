package typingsSlinky.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebase.firebaseStrings.cancelled
  - typingsSlinky.firebase.firebaseStrings.unknown
  - typingsSlinky.firebase.firebaseStrings.`invalid-argument`
  - typingsSlinky.firebase.firebaseStrings.`deadline-exceeded`
  - typingsSlinky.firebase.firebaseStrings.`not-found`
  - typingsSlinky.firebase.firebaseStrings.`already-exists`
  - typingsSlinky.firebase.firebaseStrings.`permission-denied`
  - typingsSlinky.firebase.firebaseStrings.`resource-exhausted`
  - typingsSlinky.firebase.firebaseStrings.`failed-precondition`
  - typingsSlinky.firebase.firebaseStrings.aborted
  - typingsSlinky.firebase.firebaseStrings.`out-of-range`
  - typingsSlinky.firebase.firebaseStrings.unimplemented
  - typingsSlinky.firebase.firebaseStrings.internal
  - typingsSlinky.firebase.firebaseStrings.unavailable
  - typingsSlinky.firebase.firebaseStrings.`data-loss`
  - typingsSlinky.firebase.firebaseStrings.unauthenticated
*/
trait FirestoreErrorCode extends js.Object

object FirestoreErrorCode {
  @scala.inline
  def aborted: typingsSlinky.firebase.firebaseStrings.aborted = this.cast("aborted")
  @scala.inline
  def `already-exists`: typingsSlinky.firebase.firebaseStrings.`already-exists` = this.cast("already-exists")
  @scala.inline
  def cancelled: typingsSlinky.firebase.firebaseStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `data-loss`: typingsSlinky.firebase.firebaseStrings.`data-loss` = this.cast("data-loss")
  @scala.inline
  def `deadline-exceeded`: typingsSlinky.firebase.firebaseStrings.`deadline-exceeded` = this.cast("deadline-exceeded")
  @scala.inline
  def `failed-precondition`: typingsSlinky.firebase.firebaseStrings.`failed-precondition` = this.cast("failed-precondition")
  @scala.inline
  def internal: typingsSlinky.firebase.firebaseStrings.internal = this.cast("internal")
  @scala.inline
  def `invalid-argument`: typingsSlinky.firebase.firebaseStrings.`invalid-argument` = this.cast("invalid-argument")
  @scala.inline
  def `not-found`: typingsSlinky.firebase.firebaseStrings.`not-found` = this.cast("not-found")
  @scala.inline
  def `out-of-range`: typingsSlinky.firebase.firebaseStrings.`out-of-range` = this.cast("out-of-range")
  @scala.inline
  def `permission-denied`: typingsSlinky.firebase.firebaseStrings.`permission-denied` = this.cast("permission-denied")
  @scala.inline
  def `resource-exhausted`: typingsSlinky.firebase.firebaseStrings.`resource-exhausted` = this.cast("resource-exhausted")
  @scala.inline
  def unauthenticated: typingsSlinky.firebase.firebaseStrings.unauthenticated = this.cast("unauthenticated")
  @scala.inline
  def unavailable: typingsSlinky.firebase.firebaseStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unimplemented: typingsSlinky.firebase.firebaseStrings.unimplemented = this.cast("unimplemented")
  @scala.inline
  def unknown: typingsSlinky.firebase.firebaseStrings.unknown = this.cast("unknown")
}

