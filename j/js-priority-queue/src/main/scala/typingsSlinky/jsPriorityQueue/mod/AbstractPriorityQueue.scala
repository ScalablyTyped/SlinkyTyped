package typingsSlinky.jsPriorityQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractPriorityQueue[T] extends js.Object {
  /**
    * Returns the number of elements in the queue
    */
  var length: Double = js.native
  /**
    * Removes all values from the queue
    */
  def clear(): Unit = js.native
  /**
    * Returns the smallest item in the queue and removes it from the queue
    */
  def dequeue(): T = js.native
  /**
    * Returns the smallest item in the queue and leaves the queue unchanged
    */
  def peek(): T = js.native
  /**
    * Inserts a new value in the queue
    */
  def queue(value: T): Unit = js.native
}

object AbstractPriorityQueue {
  @scala.inline
  def apply[T](clear: () => Unit, dequeue: () => T, length: Double, peek: () => T, queue: T => Unit): AbstractPriorityQueue[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), queue = js.Any.fromFunction1(queue))
    __obj.asInstanceOf[AbstractPriorityQueue[T]]
  }
  @scala.inline
  implicit class AbstractPriorityQueueOps[Self[t] <: AbstractPriorityQueue[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClear(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDequeue(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dequeue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeek(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueue(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

