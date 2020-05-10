package typingsSlinky.bintrees.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterator[T] extends js.Object {
  def data(): T = js.native
  def next(): T = js.native
  def prev(): T = js.native
}

object Iterator {
  @scala.inline
  def apply[T](data: () => T, next: () => T, prev: () => T): Iterator[T] = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev))
    __obj.asInstanceOf[Iterator[T]]
  }
  @scala.inline
  implicit class IteratorOps[Self[t] <: Iterator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

