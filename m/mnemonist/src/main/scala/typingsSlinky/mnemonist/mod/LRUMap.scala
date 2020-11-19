package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.lruMapMod.default
import typingsSlinky.mnemonist.typesMod.IArrayLikeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "LRUMap")
@js.native
class LRUMap[K, V] protected () extends default[K, V] {
  // Constructor
  def this(capacity: Double) = this()
  def this(KeyArrayClass: IArrayLikeConstructor, ValueArrayClass: IArrayLikeConstructor, capacity: Double) = this()
}
/* static members */
@JSImport("mnemonist", "LRUMap")
@js.native
object LRUMap extends js.Object {
  
  def from[I, J](iterable: StringDictionary[J]): typingsSlinky.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](
    iterable: StringDictionary[J],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor
  ): typingsSlinky.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](
    iterable: StringDictionary[J],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor,
    capacity: Double
  ): typingsSlinky.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], capacity: Double): typingsSlinky.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): typingsSlinky.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  // Statics
  def from[I, J](
    iterable: js.Iterable[js.Tuple2[I, J]],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor
  ): typingsSlinky.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](
    iterable: js.Iterable[js.Tuple2[I, J]],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor,
    capacity: Double
  ): typingsSlinky.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], capacity: Double): typingsSlinky.mnemonist.lruMapMod.LRUMap[I, J] = js.native
}
