package typingsSlinky.androiduix.java_.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comparable[T] extends js.Object {
  def compareTo(o: T): Double = js.native
}

object Comparable {
  @scala.inline
  def apply[T](compareTo: T => Double): Comparable[T] = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo))
    __obj.asInstanceOf[Comparable[T]]
  }
  @scala.inline
  implicit class ComparableOps[Self[t] <: Comparable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCompareTo(value: T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareTo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

