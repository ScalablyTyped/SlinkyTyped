package typingsSlinky.luminoAlgorithm.retroMod

import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/retro", "RetroArrayIterator")
@js.native
class RetroArrayIterator[T] protected () extends IIterator[T] {
  /**
    * Construct a new retro iterator.
    *
    * @param source - The array-like object of interest.
    */
  def this(source: ArrayLike[T]) = this()
  
  var _index: js.Any = js.native
  
  var _source: js.Any = js.native
}
