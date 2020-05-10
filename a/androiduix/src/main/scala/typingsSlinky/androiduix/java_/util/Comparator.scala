package typingsSlinky.androiduix.java_.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comparator[T] extends js.Object {
  def compare(o1: T, o2: T): Double = js.native
}

object Comparator {
  @scala.inline
  def apply[T](compare: (T, T) => Double): Comparator[T] = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
    __obj.asInstanceOf[Comparator[T]]
  }
  @scala.inline
  implicit class ComparatorOps[Self[t] <: Comparator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCompare(value: (T, T) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

