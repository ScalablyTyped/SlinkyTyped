package typingsSlinky.ringbufferjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RingBuffer[T] extends js.Object {
  var _elements: js.Array[T] = js.native
  var _first: Double = js.native
  var _last: Double = js.native
  var _size: Double = js.native
  def _evictedCb(element: T): js.Any = js.native
  def capacity(): Double = js.native
  def deq(): T = js.native
  def deqN(count: Double): js.Array[T] = js.native
  def enq(element: T): Double = js.native
  def isEmpty(): Boolean = js.native
  def isFull(): Boolean = js.native
  def peek(): T = js.native
  def peekN(count: Double): js.Array[T] = js.native
  def size(): Double = js.native
}

object RingBuffer {
  @scala.inline
  def apply[T](
    _elements: js.Array[T],
    _evictedCb: T => js.Any,
    _first: Double,
    _last: Double,
    _size: Double,
    capacity: () => Double,
    deq: () => T,
    deqN: Double => js.Array[T],
    enq: T => Double,
    isEmpty: () => Boolean,
    isFull: () => Boolean,
    peek: () => T,
    peekN: Double => js.Array[T],
    size: () => Double
  ): RingBuffer[T] = {
    val __obj = js.Dynamic.literal(_elements = _elements.asInstanceOf[js.Any], _evictedCb = js.Any.fromFunction1(_evictedCb), _first = _first.asInstanceOf[js.Any], _last = _last.asInstanceOf[js.Any], _size = _size.asInstanceOf[js.Any], capacity = js.Any.fromFunction0(capacity), deq = js.Any.fromFunction0(deq), deqN = js.Any.fromFunction1(deqN), enq = js.Any.fromFunction1(enq), isEmpty = js.Any.fromFunction0(isEmpty), isFull = js.Any.fromFunction0(isFull), peek = js.Any.fromFunction0(peek), peekN = js.Any.fromFunction1(peekN), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[RingBuffer[T]]
  }
  @scala.inline
  implicit class RingBufferOps[Self[t] <: RingBuffer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_elements(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_evictedCb(value: T => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_evictedCb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_first(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_last(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_size(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapacity(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeq(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deq")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeqN(value: Double => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deqN")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnq(value: T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFull(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeek(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeekN(value: Double => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekN")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

