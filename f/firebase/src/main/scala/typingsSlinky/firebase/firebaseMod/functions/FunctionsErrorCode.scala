package typingsSlinky.firebase.firebaseMod.functions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.ok
  - typings.firebase.firebaseStrings.cancelled
  - typings.firebase.firebaseStrings.unknown
  - typings.firebase.firebaseStrings.`invalid-argument`
  - typings.firebase.firebaseStrings.`deadline-exceeded`
  - typings.firebase.firebaseStrings.`not-found`
  - typings.firebase.firebaseStrings.`already-exists`
  - typings.firebase.firebaseStrings.`permission-denied`
  - typings.firebase.firebaseStrings.`resource-exhausted`
  - typings.firebase.firebaseStrings.`failed-precondition`
  - typings.firebase.firebaseStrings.aborted
  - typings.firebase.firebaseStrings.`out-of-range`
  - typings.firebase.firebaseStrings.unimplemented
  - typings.firebase.firebaseStrings.internal
  - typings.firebase.firebaseStrings.unavailable
  - typings.firebase.firebaseStrings.`data-loss`
  - typings.firebase.firebaseStrings.unauthenticated
*/
trait FunctionsErrorCode extends js.Object

object FunctionsErrorCode {
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
  def ok: typingsSlinky.firebase.firebaseStrings.ok = this.cast("ok")
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

