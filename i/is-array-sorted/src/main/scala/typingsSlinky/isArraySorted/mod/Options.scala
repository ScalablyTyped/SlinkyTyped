package typingsSlinky.isArraySorted.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T] extends js.Object {
  /**
  		Same as [`Array#sort(comparator)`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#Description).
  		@default (a, b) => a - b
  		*/
  def comparator(left: T, right: T): Double = js.native
}

object Options {
  @scala.inline
  def apply[T](comparator: (T, T) => Double): Options[T] = {
    val __obj = js.Dynamic.literal(comparator = js.Any.fromFunction2(comparator))
    __obj.asInstanceOf[Options[T]]
  }
  @scala.inline
  implicit class OptionsOps[Self[t] <: Options[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComparator(value: (T, T) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

