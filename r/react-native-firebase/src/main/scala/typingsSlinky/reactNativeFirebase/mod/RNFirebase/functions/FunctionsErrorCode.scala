package typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of Firebase Functions status codes. The codes are the same at the
  * ones exposed by gRPC here:
  * https://github.com/grpc/grpc/blob/master/doc/statuscodes.md
  *
  * Possible values:
  * - 'cancelled': The operation was cancelled (typically by the caller).
  * - 'unknown': Unknown error or an error from a different error domain.
  * - 'invalid-argument': Client specified an invalid argument. Note that this
  *   differs from 'failed-precondition'. 'invalid-argument' indicates
  *   arguments that are problematic regardless of the state of the system
  *   (e.g. an invalid field name).
  * - 'deadline-exceeded': Deadline expired before operation could complete.
  *   For operations that change the state of the system, this error may be
  *   returned even if the operation has completed successfully. For example,
  *   a successful response from a server could have been delayed long enough
  *   for the deadline to expire.
  * - 'not-found': Some requested document was not found.
  * - 'already-exists': Some document that we attempted to create already
  *   exists.
  * - 'permission-denied': The caller does not have permission to execute the
  *   specified operation.
  * - 'resource-exhausted': Some resource has been exhausted, perhaps a
  *   per-user quota, or perhaps the entire file system is out of space.
  * - 'failed-precondition': Operation was rejected because the system is not
  *   in a state required for the operation's execution.
  * - 'aborted': The operation was aborted, typically due to a concurrency
  *   issue like transaction aborts, etc.
  * - 'out-of-range': Operation was attempted past the valid range.
  * - 'unimplemented': Operation is not implemented or not supported/enabled.
  * - 'internal': Internal errors. Means some invariants expected by
  *   underlying system has been broken. If you see one of these errors,
  *   something is very broken.
  * - 'unavailable': The service is currently unavailable. This is most likely
  *   a transient condition and may be corrected by retrying with a backoff.
  * - 'data-loss': Unrecoverable data loss or corruption.
  * - 'unauthenticated': The request does not have valid authentication
  *   credentials for the operation.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ok
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.cancelled
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unknown
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument`
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded`
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`not-found`
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists`
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied`
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted`
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition`
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.aborted
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range`
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.internal
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unavailable
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss`
  - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated
*/
trait FunctionsErrorCode extends js.Object

object FunctionsErrorCode {
  @scala.inline
  def aborted: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.aborted = this.cast("aborted")
  @scala.inline
  def `already-exists`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists` = this.cast("already-exists")
  @scala.inline
  def cancelled: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `data-loss`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss` = this.cast("data-loss")
  @scala.inline
  def `deadline-exceeded`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded` = this.cast("deadline-exceeded")
  @scala.inline
  def `failed-precondition`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition` = this.cast("failed-precondition")
  @scala.inline
  def internal: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.internal = this.cast("internal")
  @scala.inline
  def `invalid-argument`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument` = this.cast("invalid-argument")
  @scala.inline
  def `not-found`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`not-found` = this.cast("not-found")
  @scala.inline
  def ok: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ok = this.cast("ok")
  @scala.inline
  def `out-of-range`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range` = this.cast("out-of-range")
  @scala.inline
  def `permission-denied`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied` = this.cast("permission-denied")
  @scala.inline
  def `resource-exhausted`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted` = this.cast("resource-exhausted")
  @scala.inline
  def unauthenticated: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated = this.cast("unauthenticated")
  @scala.inline
  def unavailable: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unimplemented: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented = this.cast("unimplemented")
  @scala.inline
  def unknown: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unknown = this.cast("unknown")
}

