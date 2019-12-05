package typingsSlinky.jsforce

import typingsSlinky.jsforce.connectionMod.Callback
import typingsSlinky.jsforce.salesforceDashObjectMod.CompactLayoutInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackClearCompactLayoutInfo extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls SObject.compactLayouts */
  def apply(): CompactLayoutInfo = js.native
  def apply(callback: Callback[CompactLayoutInfo]): CompactLayoutInfo = js.native
  def clear(): Unit = js.native
}

