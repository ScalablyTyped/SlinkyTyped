package typingsSlinky.googleDashGax.googleDashGaxMod

import typingsSlinky.googleDashGax.buildSrcGaxMod.BackoffSettings
import typingsSlinky.googleDashGax.buildSrcGaxMod.CallOptions
import typingsSlinky.googleDashGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import typingsSlinky.googleDashGax.buildSrcLongRunningCallsLongrunningMod.LROOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "Operation")
@js.native
class Operation protected ()
  extends typingsSlinky.googleDashGax.buildSrcLongRunningCallsLongrunningMod.Operation {
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

@JSImport("google-gax", "operation")
@js.native
object operation extends js.Object {
  def apply(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typingsSlinky.googleDashGax.buildSrcLongRunningCallsLongrunningMod.Operation = js.native
  def apply(
    op: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ): typingsSlinky.googleDashGax.buildSrcLongRunningCallsLongrunningMod.Operation = js.native
}

