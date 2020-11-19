package typingsSlinky.luminoAlgorithm

import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/zip", JSImport.Namespace)
@js.native
object zipMod extends js.Object {
  
  def zip[T](objects: IterableOrArrayLike[T]*): IIterator[js.Array[T]] = js.native
  
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
}
