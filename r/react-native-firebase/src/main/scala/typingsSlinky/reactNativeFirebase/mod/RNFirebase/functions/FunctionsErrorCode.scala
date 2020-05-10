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
  def aborted: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.aborted = "aborted".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.aborted]
  @scala.inline
  def `already-exists`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists` = "already-exists".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists`]
  @scala.inline
  def cancelled: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.cancelled = "cancelled".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.cancelled]
  @scala.inline
  def `data-loss`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss` = "data-loss".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss`]
  @scala.inline
  def `deadline-exceeded`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded`]
  @scala.inline
  def `failed-precondition`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition`]
  @scala.inline
  def internal: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.internal = "internal".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.internal]
  @scala.inline
  def `invalid-argument`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument`]
  @scala.inline
  def `not-found`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`not-found` = "not-found".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`not-found`]
  @scala.inline
  def ok: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ok = "ok".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ok]
  @scala.inline
  def `out-of-range`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range` = "out-of-range".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range`]
  @scala.inline
  def `permission-denied`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied`]
  @scala.inline
  def `resource-exhausted`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted`]
  @scala.inline
  def unauthenticated: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated]
  @scala.inline
  def unavailable: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unavailable = "unavailable".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unavailable]
  @scala.inline
  def unimplemented: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented = "unimplemented".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented]
  @scala.inline
  def unknown: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unknown = "unknown".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unknown]
}

