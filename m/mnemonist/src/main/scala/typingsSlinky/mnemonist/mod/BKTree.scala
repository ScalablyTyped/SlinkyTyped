package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.bkTreeMod.DistanceFunction
import typingsSlinky.mnemonist.bkTreeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "BKTree")
@js.native
class BKTree[T] protected () extends default[T] {
  // Constructor
  def this(distance: DistanceFunction[T]) = this()
}

/* static members */
@JSImport("mnemonist", "BKTree")
@js.native
object BKTree extends js.Object {
  def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): typingsSlinky.mnemonist.bkTreeMod.BKTree[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I], distance: DistanceFunction[I]): typingsSlinky.mnemonist.bkTreeMod.BKTree[I] = js.native
}

