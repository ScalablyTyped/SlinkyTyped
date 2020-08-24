package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.multiMapMod.default
import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "MultiMap")
@js.native
// Constructor
class MultiMap[K, V] () extends default[K, V] {
  def this(Container: ArrayConstructor) = this()
  def this(Container: SetConstructor) = this()
}

/* static members */
@JSImport("mnemonist", "MultiMap")
@js.native
object MultiMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J]): typingsSlinky.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], Container: ArrayConstructor): typingsSlinky.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], Container: SetConstructor): typingsSlinky.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  // Statics
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): typingsSlinky.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], Container: ArrayConstructor): typingsSlinky.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], Container: SetConstructor): typingsSlinky.mnemonist.multiMapMod.MultiMap[I, J] = js.native
}

