package typingsSlinky.doubleEndedQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deque[Item] extends js.Object {
  /**
    * Amount of items currently in the queue.
    */
  val length: Double = js.native
  /**
    * Remove all items from this queue. Does not change the queue's capacity.
    */
  def clear(): Unit = js.native
  /** @see Deque#shift */
  def dequeue(): js.UndefOr[Item] = js.native
  /** @see Deque#push */
  def enqueue(items: Item*): Double = js.native
  /**
    * Returns the item that is at the given `index` of this queue without removing it.
    *
    * The index is zero-based, so `.get(0)` will return the item that is at the front, `.get(1)` will return the item that comes after and so on.
    *
    * The index can be negative to read items at the back of the queue.
    * `.get(-1)` returns the item that is at the back of the queue, `.get(-2)` will return the item that comes before and so on.
    *
    * Returns `undefined` if `index` is not a valid index into the queue.
    *
    * **Note**: Even though indexed accessor (e.g. `queue[0]`) could *appear* to return a correct value *sometimes*, this is completely unreliable.
    * The numeric slots of the deque object are internally used as an optimization and have no meaningful order or meaning to outside.
    * Always use `.get()`.
    *
    * **Note**: The implementation has O(1) random access using `.get()`.
    */
  def get(index: Double): js.UndefOr[Item] = js.native
  /** @see Deque#push */
  def insertBack(items: Item*): Double = js.native
  /** @see Deque#unshift */
  def insertFront(items: Item*): Double = js.native
  /**
    * Return `true` if this queue is empty, `false` otherwise.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Returns the item that is at the back of this queue without removing it.
    * If the queue is empty, `undefined` is returned.
    */
  def peekBack(): js.UndefOr[Item] = js.native
  /**
    * Returns the item that is at the front of this queue without removing it.
    * If the queue is empty, `undefined` is returned.
    */
  def peekFront(): js.UndefOr[Item] = js.native
  /**
    * Pop off the item at the back of this queue.
    *
    * Note: The item will be removed from the queue.
    * If you simply want to see what's at the back of the queue use `peekBack()` or `.get(-1)`.
    *
    * If the queue is empty, `undefined` is returned.
    * If you need to differentiate between `undefined` values in the queue and `pop()` return value - check the queue `.length` before popping.
    *
    * **Aliases**: `removeBack`
    */
  def pop(): js.UndefOr[Item] = js.native
  /**
    * Push items to the back of this queue.
    * Returns the amount of items currently in the queue after the operation.
    *
    * **Aliases**: `enqueue`, `insertBack`
    */
  def push(items: Item*): Double = js.native
  /** @see Deque#pop */
  def removeBack(): js.UndefOr[Item] = js.native
  /** @see Deque#shift */
  def removeFront(): js.UndefOr[Item] = js.native
  /**
    * Shifts off the item at the front of this queue.
    *
    * Note: The item will be removed from the queue.
    * If you simply want to see what's at the front of the queue use `peekFront()` or `.get(0)`.
    *
    * If the queue is empty, `undefined` is returned.
    * If you need to differentiate between `undefined` values in the queue and `shift()` return value - check the queue `.length` before shifting.
    *
    * **Aliases**: `removeFront`, `dequeue`
    */
  def shift(): js.UndefOr[Item] = js.native
  /**
    * Returns the items in the queue as an array.
    * Starting from the item in the front of the queue and ending to the item at the back of the queue.
    *
    * **Aliases**: `toJSON`
    */
  def toArray(): js.Array[Item] = js.native
  /** @see Deque#toArray */
  def toJSON(): js.Array[Item] = js.native
  /**
    * Unshift items to the front of this queue.
    * Returns the amount of items currently in the queue after the operation.
    *
    * **Ailases**: `insertFront`
    */
  def unshift(items: Item*): Double = js.native
}

object Deque {
  @scala.inline
  def apply[Item](
    clear: () => Unit,
    dequeue: () => js.UndefOr[Item],
    enqueue: /* repeated */ Item => Double,
    get: Double => js.UndefOr[Item],
    insertBack: /* repeated */ Item => Double,
    insertFront: /* repeated */ Item => Double,
    isEmpty: () => Boolean,
    length: Double,
    peekBack: () => js.UndefOr[Item],
    peekFront: () => js.UndefOr[Item],
    pop: () => js.UndefOr[Item],
    push: /* repeated */ Item => Double,
    removeBack: () => js.UndefOr[Item],
    removeFront: () => js.UndefOr[Item],
    shift: () => js.UndefOr[Item],
    toArray: () => js.Array[Item],
    toJSON: () => js.Array[Item],
    unshift: /* repeated */ Item => Double
  ): Deque[Item] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), get = js.Any.fromFunction1(get), insertBack = js.Any.fromFunction1(insertBack), insertFront = js.Any.fromFunction1(insertFront), isEmpty = js.Any.fromFunction0(isEmpty), length = length.asInstanceOf[js.Any], peekBack = js.Any.fromFunction0(peekBack), peekFront = js.Any.fromFunction0(peekFront), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), removeBack = js.Any.fromFunction0(removeBack), removeFront = js.Any.fromFunction0(removeFront), shift = js.Any.fromFunction0(shift), toArray = js.Any.fromFunction0(toArray), toJSON = js.Any.fromFunction0(toJSON), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[Deque[Item]]
  }
  @scala.inline
  implicit class DequeOps[Self[item] <: Deque[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withClear(value: () => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDequeue(value: () => js.UndefOr[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dequeue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnqueue(value: /* repeated */ Item => Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enqueue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Double => js.UndefOr[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertBack(value: /* repeated */ Item => Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertFront(value: /* repeated */ Item => Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFront")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeekBack(value: () => js.UndefOr[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeekFront(value: () => js.UndefOr[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekFront")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPop(value: () => js.UndefOr[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: /* repeated */ Item => Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveBack(value: () => js.UndefOr[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveFront(value: () => js.UndefOr[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFront")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShift(value: () => js.UndefOr[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Array[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnshift(value: /* repeated */ Item => Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

