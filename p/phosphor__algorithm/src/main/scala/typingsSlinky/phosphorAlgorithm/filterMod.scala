package typingsSlinky.phosphorAlgorithm

import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import typingsSlinky.phosphorAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  @js.native
  class FilterIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new filter iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param fn - The predicate function to invoke for each value.
      */
    def this(source: IIterator[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]) = this()
    var _fn: js.Any = js.native
    var _index: js.Any = js.native
    var _source: js.Any = js.native
  }
  
  def filter[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): IIterator[T] = js.native
}

