package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.trieMapMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "TrieMap")
@js.native
// Constructor
class TrieMap[K, V] () extends default[K, V] {
  def this(Token: Instantiable0[K]) = this()
}

/* static members */
@JSImport("mnemonist", "TrieMap")
@js.native
object TrieMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J]): typingsSlinky.mnemonist.trieMapMod.TrieMap[I, J] = js.native
  // Statics
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): typingsSlinky.mnemonist.trieMapMod.TrieMap[I, J] = js.native
}

