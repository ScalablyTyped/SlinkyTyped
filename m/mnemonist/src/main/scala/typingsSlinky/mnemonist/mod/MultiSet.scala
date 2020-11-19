package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.multiSetMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "MultiSet")
@js.native
class MultiSet[K] () extends default[K]
/* static members */
@JSImport("mnemonist", "MultiSet")
@js.native
object MultiSet extends js.Object {
  
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.multiSetMod.MultiSet[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.multiSetMod.MultiSet[I] = js.native
  
  def isSubset[T](
    a: typingsSlinky.mnemonist.multiSetMod.MultiSet[T],
    b: typingsSlinky.mnemonist.multiSetMod.MultiSet[T]
  ): Boolean = js.native
  
  def isSuperset[T](
    a: typingsSlinky.mnemonist.multiSetMod.MultiSet[T],
    b: typingsSlinky.mnemonist.multiSetMod.MultiSet[T]
  ): Boolean = js.native
}
