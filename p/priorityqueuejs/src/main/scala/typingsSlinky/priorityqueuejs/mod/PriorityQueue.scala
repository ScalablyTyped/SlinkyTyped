package typingsSlinky.priorityqueuejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue[T] extends js.Object {
  /**
    * Dequeues the top element of the priority queue.
    * Throws an Error when the queue is empty.
    */
  def deq(): T = js.native
  /**
    * Enqueues the element at the priority queue and returns its new size.
    * @param element The element to add
    */
  def enq(element: T): Double = js.native
  /**
    * Executes fn on each element.
    * Just be careful to not modify the priorities, since the queue won't reorder itself.
    * @param fn The value to pass to an Array.forEach call
    */
  def forEach(fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
  /**
    * Returns whether the priority queue is empty or not.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Peeks at the top element of the priority queue.
    * Throws an Error when the queue is empty.
    */
  def peek(): T = js.native
  /**
    * Returns the size of the priority queue.
    */
  def size(): Double = js.native
}

object PriorityQueue {
  @scala.inline
  def apply[T](
    deq: () => T,
    enq: T => Double,
    forEach: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit] => Unit,
    isEmpty: () => Boolean,
    peek: () => T,
    size: () => Double
  ): PriorityQueue[T] = {
    val __obj = js.Dynamic.literal(deq = js.Any.fromFunction0(deq), enq = js.Any.fromFunction1(enq), forEach = js.Any.fromFunction1(forEach), isEmpty = js.Any.fromFunction0(isEmpty), peek = js.Any.fromFunction0(peek), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[PriorityQueue[T]]
  }
  @scala.inline
  implicit class PriorityQueueOps[Self[t] <: PriorityQueue[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDeq(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deq")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnq(value: T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeek(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peek")(js.Any.fromFunction0(value))
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

