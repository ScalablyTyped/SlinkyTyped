package typingsSlinky.ow

import typingsSlinky.ow.predicateMod.Predicate
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/utils/of-type", JSImport.Namespace)
@js.native
object ofTypeMod extends js.Object {
  
  def default[T](source: js.Array[T], predicate: Predicate[T]): String | Boolean = js.native
  def default[T](source: IterableIterator[T], predicate: Predicate[T]): String | Boolean = js.native
  def default[T](source: Set[T], predicate: Predicate[T]): String | Boolean = js.native
}
