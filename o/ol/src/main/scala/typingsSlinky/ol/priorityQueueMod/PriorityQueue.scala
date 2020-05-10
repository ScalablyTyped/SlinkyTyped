package typingsSlinky.ol.priorityQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue[T] extends js.Object {
  def clear(): Unit = js.native
  def dequeue(): T = js.native
  def enqueue(element: T): Boolean = js.native
  def getCount(): Double = js.native
  def isEmpty(): Boolean = js.native
  def isKeyQueued(key: String): Boolean = js.native
  def isQueued(element: T): Boolean = js.native
  def reprioritize(): Unit = js.native
}

object PriorityQueue {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    dequeue: () => T,
    enqueue: T => Boolean,
    getCount: () => Double,
    isEmpty: () => Boolean,
    isKeyQueued: String => Boolean,
    isQueued: T => Boolean,
    reprioritize: () => Unit
  ): PriorityQueue[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), getCount = js.Any.fromFunction0(getCount), isEmpty = js.Any.fromFunction0(isEmpty), isKeyQueued = js.Any.fromFunction1(isKeyQueued), isQueued = js.Any.fromFunction1(isQueued), reprioritize = js.Any.fromFunction0(reprioritize))
    __obj.asInstanceOf[PriorityQueue[T]]
  }
  @scala.inline
  implicit class PriorityQueueOps[Self[t] <: PriorityQueue[t], T] (val x: Self[T]) extends AnyVal {
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
    def withEnqueue(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enqueue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsKeyQueued(value: String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKeyQueued")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsQueued(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isQueued")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReprioritize(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprioritize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

