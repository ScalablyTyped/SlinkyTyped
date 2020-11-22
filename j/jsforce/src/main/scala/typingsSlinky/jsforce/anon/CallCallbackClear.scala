package typingsSlinky.jsforce.anon

import typingsSlinky.jsforce.connectionMod.Callback
import typingsSlinky.jsforce.describeResultMod.DescribeSObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallCallbackClear extends js.Object {
  
  /** Returns a value from the cache if it exists, otherwise calls SObject.describe */
  def apply(): DescribeSObjectResult = js.native
  def apply(callback: Callback[DescribeSObjectResult]): DescribeSObjectResult = js.native
  
  def clear(): Unit = js.native
}
