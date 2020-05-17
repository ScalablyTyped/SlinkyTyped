package typingsSlinky.googleGax.mod

import typingsSlinky.googleGax.gaxMod.BackoffSettings
import typingsSlinky.googleGax.gaxMod.CallOptions
import typingsSlinky.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import typingsSlinky.googleGax.longrunningMod.LROOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "operation")
@js.native
object operation extends js.Object {
  def apply(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typingsSlinky.googleGax.longrunningMod.Operation_ = js.native
  def apply(
    op: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ): typingsSlinky.googleGax.longrunningMod.Operation_ = js.native
}

