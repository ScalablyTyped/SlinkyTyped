package typingsSlinky.rxLite.Rx.internals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Priority Queue for Scheduling
@js.native
trait PriorityQueue[TTime] extends js.Object {
  var length: Double = js.native
  def dequeue(): ScheduledItem[TTime] = js.native
  def enqueue(item: ScheduledItem[TTime]): Unit = js.native
  def heapify(index: Double): Unit = js.native
  def isHigherPriority(left: Double, right: Double): Boolean = js.native
  def peek(): ScheduledItem[TTime] = js.native
  def percolate(index: Double): Unit = js.native
  def remove(item: ScheduledItem[TTime]): Boolean = js.native
  def removeAt(index: Double): Unit = js.native
}

object PriorityQueue {
  @scala.inline
  def apply[TTime](
    dequeue: () => ScheduledItem[TTime],
    enqueue: ScheduledItem[TTime] => Unit,
    heapify: Double => Unit,
    isHigherPriority: (Double, Double) => Boolean,
    length: Double,
    peek: () => ScheduledItem[TTime],
    percolate: Double => Unit,
    remove: ScheduledItem[TTime] => Boolean,
    removeAt: Double => Unit
  ): PriorityQueue[TTime] = {
    val __obj = js.Dynamic.literal(dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), heapify = js.Any.fromFunction1(heapify), isHigherPriority = js.Any.fromFunction2(isHigherPriority), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), percolate = js.Any.fromFunction1(percolate), remove = js.Any.fromFunction1(remove), removeAt = js.Any.fromFunction1(removeAt))
    __obj.asInstanceOf[PriorityQueue[TTime]]
  }
  @scala.inline
  implicit class PriorityQueueOps[Self[ttime] <: PriorityQueue[ttime], TTime] (val x: Self[TTime]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTime] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTime]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TTime] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TTime] with Other]
    @scala.inline
    def withDequeue(value: () => ScheduledItem[TTime]): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dequeue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnqueue(value: ScheduledItem[TTime] => Unit): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enqueue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeapify(value: Double => Unit): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsHigherPriority(value: (Double, Double) => Boolean): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHigherPriority")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeek(value: () => ScheduledItem[TTime]): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPercolate(value: Double => Unit): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percolate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: ScheduledItem[TTime] => Boolean): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveAt(value: Double => Unit): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

