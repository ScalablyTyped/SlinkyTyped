package typingsSlinky.luminoAlgorithm

import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoAlgorithm.iterMod.IterableOrArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strideMod {
  
  @JSImport("@lumino/algorithm/types/stride", "StrideIterator")
  @js.native
  class StrideIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new stride iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param step - The distance to step on each iteration. A value
      *   of less than `1` will behave the same as a value of `1`.
      */
    def this(source: IIterator[T], step: Double) = this()
    
    var _source: js.Any = js.native
    
    var _step: js.Any = js.native
  }
  
  @JSImport("@lumino/algorithm/types/stride", "stride")
  @js.native
  def stride[T](`object`: IterableOrArrayLike[T], step: Double): IIterator[T] = js.native
}
