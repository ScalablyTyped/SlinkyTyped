package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue[T] extends js.Object {
  var N: js.Any = js.native
  var first: js.Any = js.native
  var last: js.Any = js.native
  def dequeue(): js.UndefOr[T] = js.native
  def enqueue(item: T): Unit = js.native
  def isEmpty(): Boolean = js.native
  def size(): Double = js.native
  def toArray(): js.Array[T] = js.native
}

object Queue {
  @scala.inline
  def apply[T](
    N: js.Any,
    dequeue: () => js.UndefOr[T],
    enqueue: T => Unit,
    first: js.Any,
    isEmpty: () => Boolean,
    last: js.Any,
    size: () => Double,
    toArray: () => js.Array[T]
  ): Queue[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), first = first.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), last = last.asInstanceOf[js.Any], size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Queue[T]]
  }
  @scala.inline
  implicit class QueueOps[Self[t] <: Queue[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withN(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("N")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDequeue(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dequeue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnqueue(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enqueue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLast(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
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

