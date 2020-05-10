package typingsSlinky.phosphorAlgorithm.iterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/iter", "FnIterator")
@js.native
class FnIterator[T] protected () extends IIterator[T] {
  /**
    * Construct a new function iterator.
    *
    * @param fn - The iterator-like function of interest.
    */
  def this(fn: js.Function0[js.UndefOr[T]]) = this()
  var _fn: js.Any = js.native
}

