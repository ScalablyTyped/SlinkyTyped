package typingsSlinky.obliterator

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.obliterator.filterMod.PredicateFunction
import typingsSlinky.obliterator.iteratorMod.NextFunction
import typingsSlinky.obliterator.iteratorMod.default
import typingsSlinky.obliterator.mapMod.MapFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obliterator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Iterator[V] protected () extends default[V] {
    // Constructor
    def this(next: NextFunction[V]) = this()
  }
  
  def chain[T](iterators: js.Iterator[T]*): default[T] = js.native
  def combinations[T](array: js.Array[T], r: Double): default[js.Array[T]] = js.native
  def consume[T](iterator: js.Iterator[T]): Unit = js.native
  def consume[T](iterator: js.Iterator[T], steps: Double): Unit = js.native
  def filter[T](predicate: PredicateFunction[T], iterator: js.Iterator[T]): default[T] = js.native
  def forEach(iterable: js.Any, callback: js.Function2[/* item */ js.Any, /* key */ js.Any, Unit]): Unit = js.native
  def map[S, T](predicate: MapFunction[S, T], iterator: js.Iterator[S]): default[T] = js.native
  def `match`(pattern: js.RegExp, string: String): default[String] = js.native
  def permutations[T](array: js.Array[T], r: Double): default[js.Array[T]] = js.native
  def powerSet[T](array: js.Array[T]): default[js.Array[T]] = js.native
  def range(end: Double): default[Double] = js.native
  def range(start: Double, end: Double): default[Double] = js.native
  def range(start: Double, end: Double, step: Double): default[Double] = js.native
  def split(pattern: js.RegExp, string: String): default[String] = js.native
  def take[T](iterator: js.Iterator[T], n: Double): js.Array[T] = js.native
  def takeInto[T](
    ArrayClass: Instantiable1[/* arrayLength */ Double, js.Array[js.Object]],
    iterator: js.Iterator[T],
    n: Double
  ): js.Array[T] = js.native
  /* static members */
  @js.native
  object Iterator extends js.Object {
    def empty[T](): typingsSlinky.obliterator.iteratorMod.Iterator[T] = js.native
    def is(value: js.Any): Boolean = js.native
    // Static methods
    def of[T](args: T*): typingsSlinky.obliterator.iteratorMod.Iterator[T] = js.native
  }
  
}

