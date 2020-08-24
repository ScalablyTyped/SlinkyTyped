package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.passjoinIndexMod.LevenshteinDistanceFunction
import typingsSlinky.mnemonist.passjoinIndexMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "PassjoinIndex")
@js.native
class PassjoinIndex[T] protected () extends default[T] {
  // Constructor
  def this(levenshtein: LevenshteinDistanceFunction[T], k: Double) = this()
}

/* static members */
@JSImport("mnemonist", "PassjoinIndex")
@js.native
object PassjoinIndex extends js.Object {
  def from[I](iterable: StringDictionary[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): typingsSlinky.mnemonist.passjoinIndexMod.PassjoinIndex[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): typingsSlinky.mnemonist.passjoinIndexMod.PassjoinIndex[I] = js.native
}

