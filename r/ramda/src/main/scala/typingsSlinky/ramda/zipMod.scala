package typingsSlinky.ramda

import typingsSlinky.ramda.toolsMod.KeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/zip", JSImport.Namespace)
@js.native
object zipMod extends js.Object {
  
  def default[K](list1: js.Array[K]): js.Function1[/* list2 */ js.Array[_], js.Array[KeyValuePair[K, _]]] = js.native
  def default[K, V](list1: js.Array[K], list2: js.Array[V]): js.Array[KeyValuePair[K, V]] = js.native
}
