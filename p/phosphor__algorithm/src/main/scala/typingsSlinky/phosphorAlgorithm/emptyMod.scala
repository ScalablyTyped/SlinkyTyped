package typingsSlinky.phosphorAlgorithm

import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/empty", JSImport.Namespace)
@js.native
object emptyMod extends js.Object {
  @js.native
  /**
    * Construct a new empty iterator.
    */
  class EmptyIterator[T] () extends IIterator[T]
  
  def empty[T](): IIterator[T] = js.native
}

