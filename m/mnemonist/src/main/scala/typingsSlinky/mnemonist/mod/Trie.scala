package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.trieMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "Trie")
@js.native
// Constructor
class Trie[T] () extends default[T] {
  def this(Token: Instantiable0[T]) = this()
}
/* static members */
@JSImport("mnemonist", "Trie")
@js.native
object Trie extends js.Object {
  
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.trieMod.Trie[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.trieMod.Trie[I] = js.native
}
