package typingsSlinky.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait status extends StObject
@JSImport("grpc", "status")
@js.native
object status extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[status with Double] = js.native
  
  /**
    * The operation was aborted, typically due to a concurrency issue
    * like sequencer check failures, transaction aborts, etc.
    *
    * See litmus test above for deciding between FAILED_PRECONDITION,
    * ABORTED, and UNAVAILABLE.
    */
  @js.native
  sealed trait ABORTED extends status
  /* 10 */ val ABORTED: typingsSlinky.grpc.mod.status.ABORTED with Double = js.native
  
  /**
    * Some entity that we attempted to create (e.g., file or directory)
    * already exists.
    */
  @js.native
  sealed trait ALREADY_EXISTS extends status
  /* 6 */ val ALREADY_EXISTS: typingsSlinky.grpc.mod.status.ALREADY_EXISTS with Double = js.native
  
  /**
    * The operation was cancelled (typically by the caller).
    */
  @js.native
  sealed trait CANCELLED extends status
  /* 1 */ val CANCELLED: typingsSlinky.grpc.mod.status.CANCELLED with Double = js.native
  
  /**
    * Unrecoverable data loss or corruption.
    */
  @js.native
  sealed trait DATA_LOSS extends status
  /* 15 */ val DATA_LOSS: typingsSlinky.grpc.mod.status.DATA_LOSS with Double = js.native
  
  /**
    * Deadline expired before operation could complete.  For operations
    * that change the state of the system, this error may be returned
    * even if the operation has completed successfully.  For example, a
    * successful response from a server could have been delayed long
    * enough for the deadline to expire.
    */
  @js.native
  sealed trait DEADLINE_EXCEEDED extends status
  /* 4 */ val DEADLINE_EXCEEDED: typingsSlinky.grpc.mod.status.DEADLINE_EXCEEDED with Double = js.native
  
  /**
    * Operation was rejected because the system is not in a state
    * required for the operation's execution.  For example, directory
    * to be deleted may be non-empty, an rmdir operation is applied to
    * a non-directory, etc.
    *
    * A litmus test that may help a service implementor in deciding
    * between FAILED_PRECONDITION, ABORTED, and UNAVAILABLE:
    *
    *  - Use UNAVAILABLE if the client can retry just the failing call.
    *  - Use ABORTED if the client should retry at a higher-level
    *    (e.g., restarting a read-modify-write sequence).
    *  - Use FAILED_PRECONDITION if the client should not retry until
    *    the system state has been explicitly fixed.  E.g., if an "rmdir"
    *    fails because the directory is non-empty, FAILED_PRECONDITION
    *    should be returned since the client should not retry unless
    *    they have first fixed up the directory by deleting files from it.
    *  - Use FAILED_PRECONDITION if the client performs conditional
    *    REST Get/Update/Delete on a resource and the resource on the
    *    server does not match the condition. E.g., conflicting
    *    read-modify-write on the same resource.
    */
  @js.native
  sealed trait FAILED_PRECONDITION extends status
  /* 9 */ val FAILED_PRECONDITION: typingsSlinky.grpc.mod.status.FAILED_PRECONDITION with Double = js.native
  
  /**
    * Internal errors.  Means some invariants expected by underlying
    * system has been broken.  If you see one of these errors,
    * something is very broken.
    */
  @js.native
  sealed trait INTERNAL extends status
  /* 13 */ val INTERNAL: typingsSlinky.grpc.mod.status.INTERNAL with Double = js.native
  
  /**
    * Client specified an invalid argument.  Note that this differs
    * from FAILED_PRECONDITION.  INVALID_ARGUMENT indicates arguments
    * that are problematic regardless of the state of the system
    * (e.g., a malformed file name).
    */
  @js.native
  sealed trait INVALID_ARGUMENT extends status
  /* 3 */ val INVALID_ARGUMENT: typingsSlinky.grpc.mod.status.INVALID_ARGUMENT with Double = js.native
  
  /**
    * Some requested entity (e.g., file or directory) was not found.
    */
  @js.native
  sealed trait NOT_FOUND extends status
  /* 5 */ val NOT_FOUND: typingsSlinky.grpc.mod.status.NOT_FOUND with Double = js.native
  
  /**
    * Not an error; returned on success
    */
  @js.native
  sealed trait OK extends status
  /* 0 */ val OK: typingsSlinky.grpc.mod.status.OK with Double = js.native
  
  /**
    * Operation was attempted past the valid range.  E.g., seeking or
    * reading past end of file.
    *
    * Unlike INVALID_ARGUMENT, this error indicates a problem that may
    * be fixed if the system state changes. For example, a 32-bit file
    * system will generate INVALID_ARGUMENT if asked to read at an
    * offset that is not in the range [0,2^32-1], but it will generate
    * OUT_OF_RANGE if asked to read from an offset past the current
    * file size.
    *
    * There is a fair bit of overlap between FAILED_PRECONDITION and
    * OUT_OF_RANGE.  We recommend using OUT_OF_RANGE (the more specific
    * error) when it applies so that callers who are iterating through
    * a space can easily look for an OUT_OF_RANGE error to detect when
    * they are done.
    */
  @js.native
  sealed trait OUT_OF_RANGE extends status
  /* 11 */ val OUT_OF_RANGE: typingsSlinky.grpc.mod.status.OUT_OF_RANGE with Double = js.native
  
  /**
    * The caller does not have permission to execute the specified
    * operation.  PERMISSION_DENIED must not be used for rejections
    * caused by exhausting some resource (use RESOURCE_EXHAUSTED
    * instead for those errors).  PERMISSION_DENIED must not be
    * used if the caller can not be identified (use UNAUTHENTICATED
    * instead for those errors).
    */
  @js.native
  sealed trait PERMISSION_DENIED extends status
  /* 7 */ val PERMISSION_DENIED: typingsSlinky.grpc.mod.status.PERMISSION_DENIED with Double = js.native
  
  /**
    * Some resource has been exhausted, perhaps a per-user quota, or
    * perhaps the entire file system is out of space.
    */
  @js.native
  sealed trait RESOURCE_EXHAUSTED extends status
  /* 8 */ val RESOURCE_EXHAUSTED: typingsSlinky.grpc.mod.status.RESOURCE_EXHAUSTED with Double = js.native
  
  /**
    * The request does not have valid authentication credentials for the
    * operation.
    */
  @js.native
  sealed trait UNAUTHENTICATED extends status
  /* 16 */ val UNAUTHENTICATED: typingsSlinky.grpc.mod.status.UNAUTHENTICATED with Double = js.native
  
  /**
    * The service is currently unavailable.  This is a most likely a
    * transient condition and may be corrected by retrying with
    * a backoff.
    *
    * See litmus test above for deciding between FAILED_PRECONDITION,
    * ABORTED, and UNAVAILABLE.
    */
  @js.native
  sealed trait UNAVAILABLE extends status
  /* 14 */ val UNAVAILABLE: typingsSlinky.grpc.mod.status.UNAVAILABLE with Double = js.native
  
  /**
    * Operation is not implemented or not supported/enabled in this service.
    */
  @js.native
  sealed trait UNIMPLEMENTED extends status
  /* 12 */ val UNIMPLEMENTED: typingsSlinky.grpc.mod.status.UNIMPLEMENTED with Double = js.native
  
  /**
    * Unknown error.  An example of where this error may be returned is
    * if a status value received from another address space belongs to
    * an error-space that is not known in this address space.  Also
    * errors raised by APIs that do not return enough error information
    * may be converted to this error.
    */
  @js.native
  sealed trait UNKNOWN extends status
  /* 2 */ val UNKNOWN: typingsSlinky.grpc.mod.status.UNKNOWN with Double = js.native
}
