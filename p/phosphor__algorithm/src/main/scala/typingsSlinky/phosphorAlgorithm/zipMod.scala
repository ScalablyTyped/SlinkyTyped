package typingsSlinky.phosphorAlgorithm

import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import typingsSlinky.phosphorAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/zip", JSImport.Namespace)
@js.native
object zipMod extends js.Object {
  @js.native
  class ZipIterator[T] protected ()
    extends IIterator[js.Array[T]] {
    /**
      * Construct a new zip iterator.
      *
      * @param source - The iterators of interest.
      */
    def this(source: js.Array[IIterator[T]]) = this()
    var _source: js.Any = js.native
  }
  
  def zip[T](objects: IterableOrArrayLike[T]*): IIterator[js.Array[T]] = js.native
}

