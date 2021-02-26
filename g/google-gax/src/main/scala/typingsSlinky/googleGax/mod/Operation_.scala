package typingsSlinky.googleGax.mod

import typingsSlinky.googleGax.gaxMod.BackoffSettings
import typingsSlinky.googleGax.gaxMod.CallOptions
import typingsSlinky.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import typingsSlinky.googleGax.longrunningMod.LROOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "Operation")
@js.native
class Operation_ protected ()
  extends typingsSlinky.googleGax.longrunningMod.Operation_ {
  /**
    * Wrapper for a google.longrunnung.Operation.
    *
    * @constructor
    *
    * @param {google.longrunning.Operation} grpcOp - The operation to be wrapped.
    * @param {LongRunningDescriptor} longrunningDescriptor - This defines the
    * operations service client and unpacking mechanisms for the operation.
    * @param {BackoffSettings} backoffSettings - The backoff settings used in
    * in polling the operation.
    * @param {CallOptions} callOptions - CallOptions used in making get operation
    * requests.
    */
  def this(
    grpcOp: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings
  ) = this()
  def this(
    grpcOp: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ) = this()
}
