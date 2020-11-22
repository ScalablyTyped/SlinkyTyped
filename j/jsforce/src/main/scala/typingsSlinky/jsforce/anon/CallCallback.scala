package typingsSlinky.jsforce.anon

import typingsSlinky.jsforce.connectionMod.Callback
import typingsSlinky.jsforce.salesforceObjectMod.CompactLayoutInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallCallback extends js.Object {
  
  /** Returns a value from the cache if it exists, otherwise calls SObject.compactLayouts */
  def apply(): CompactLayoutInfo = js.native
  def apply(callback: Callback[CompactLayoutInfo]): CompactLayoutInfo = js.native
  
  def clear(): Unit = js.native
}
