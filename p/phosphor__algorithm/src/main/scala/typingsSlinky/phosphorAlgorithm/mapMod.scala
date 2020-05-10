package typingsSlinky.phosphorAlgorithm

import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import typingsSlinky.phosphorAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  @js.native
  class MapIterator[T, U] protected () extends IIterator[U] {
    /**
      * Construct a new map iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param fn - The mapping function to invoke for each value.
      */
    def this(source: IIterator[T], fn: js.Function2[/* value */ T, /* index */ Double, U]) = this()
    var _fn: js.Any = js.native
    var _index: js.Any = js.native
    var _source: js.Any = js.native
  }
  
  def map[T, U](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, U]): IIterator[U] = js.native
}

