package typingsSlinky.jsCombinatorics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGenerator[T] extends js.Object {
  /**
  		 * Returns the total number of elements to be generated. This equals the result of calling
    * `generator.toArray().length` but it is precalculated without actually generating any elements.
  		 * Handy when doing setup for a potentially long-running loop.
  		 */
  var length: Double = js.native
  /**
  		 * Returns an array of elements that return `true` for the filter function.
  		 */
  def filter(predicate: js.Function1[/* item */ T, Boolean]): js.Array[T] = js.native
  /**
  		 * Applies the callback function for each element.
  		 */
  def forEach(f: js.Function1[/* item */ T, Unit]): Unit = js.native
  /**
  		 * Returns an array that is the output of calling the callback function separately on each element.
  		 */
  def map[TResult](f: js.Function1[/* item */ T, TResult]): js.Array[TResult] = js.native
  /**
  		 * Returns the element or undefined if no more elements are available.
  		 */
  def next(): T = js.native
  /**
  		 * Returns an array of all elements.
  		 */
  def toArray(): js.Array[T] = js.native
}

object IGenerator {
  @scala.inline
  def apply[T](
    filter: js.Function1[/* item */ T, Boolean] => js.Array[T],
    forEach: js.Function1[/* item */ T, Unit] => Unit,
    length: Double,
    map: js.Function1[/* item */ T, js.Any] => js.Array[js.Any],
    next: () => T,
    toArray: () => js.Array[T]
  ): IGenerator[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), next = js.Any.fromFunction0(next), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[IGenerator[T]]
  }
  @scala.inline
  implicit class IGeneratorOps[Self[t] <: IGenerator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFilter(value: js.Function1[/* item */ T, Boolean] => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function1[/* item */ T, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: js.Function1[/* item */ T, js.Any] => js.Array[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNext(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

