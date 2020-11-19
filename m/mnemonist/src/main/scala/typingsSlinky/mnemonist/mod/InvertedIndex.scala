package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.invertedIndexMod.Tokenizer
import typingsSlinky.mnemonist.invertedIndexMod.TokenizersTuple
import typingsSlinky.mnemonist.invertedIndexMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "InvertedIndex")
@js.native
// Constructor
class InvertedIndex[D] () extends default[D] {
  def this(tokenizers: TokenizersTuple) = this()
  def this(tokenizer: Tokenizer) = this()
}
/* static members */
@JSImport("mnemonist", "InvertedIndex")
@js.native
object InvertedIndex extends js.Object {
  
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  def from[I](iterable: StringDictionary[I], tokenizer: Tokenizer): typingsSlinky.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  def from[I](iterable: StringDictionary[I], tokenizer: TokenizersTuple): typingsSlinky.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  def from[I](iterable: js.Iterable[I], tokenizer: Tokenizer): typingsSlinky.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  def from[I](iterable: js.Iterable[I], tokenizer: TokenizersTuple): typingsSlinky.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
}
