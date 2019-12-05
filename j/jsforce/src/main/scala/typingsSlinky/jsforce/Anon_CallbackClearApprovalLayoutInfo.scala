package typingsSlinky.jsforce

import typingsSlinky.jsforce.connectionMod.Callback
import typingsSlinky.jsforce.salesforceDashObjectMod.ApprovalLayoutInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackClearApprovalLayoutInfo extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
  def apply(): ApprovalLayoutInfo = js.native
  def apply(callback: Callback[ApprovalLayoutInfo]): ApprovalLayoutInfo = js.native
  def clear(): Unit = js.native
}

