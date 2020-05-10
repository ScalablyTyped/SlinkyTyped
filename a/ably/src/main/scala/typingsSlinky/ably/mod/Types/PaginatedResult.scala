package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginatedResult[T] extends js.Object {
  var items: js.Array[T] = js.native
  def current(results: paginatedResultCallback[T]): Unit = js.native
  def first(results: paginatedResultCallback[T]): Unit = js.native
  def hasNext(): Boolean = js.native
  def isLast(): Boolean = js.native
  def next(results: paginatedResultCallback[T]): Unit = js.native
}

object PaginatedResult {
  @scala.inline
  def apply[T](
    current: paginatedResultCallback[T] => Unit,
    first: paginatedResultCallback[T] => Unit,
    hasNext: () => Boolean,
    isLast: () => Boolean,
    items: js.Array[T],
    next: paginatedResultCallback[T] => Unit
  ): PaginatedResult[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction1(current), first = js.Any.fromFunction1(first), hasNext = js.Any.fromFunction0(hasNext), isLast = js.Any.fromFunction0(isLast), items = items.asInstanceOf[js.Any], next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[PaginatedResult[T]]
  }
  @scala.inline
  implicit class PaginatedResultOps[Self[t] <: PaginatedResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCurrent(value: paginatedResultCallback[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: paginatedResultCallback[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasNext(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLast(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: paginatedResultCallback[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

