package typingsSlinky.heap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heap[T] extends js.Object {
  def copy(): Heap[T] = js.native
  // Determine whether the heap is empty.
  def empty(): Boolean = js.native
  def front(): T = js.native
  // Rebuild the heap. This method may come handy when the priority of the internal data is being modified.
  def heapify(): Unit = js.native
  def insert(item: T): Unit = js.native
  // Return the smallest item of the heap.
  def peek(): T = js.native
  // Pop the smallest item off the heap and return it.
  def pop(): T = js.native
  // Instance Methods
  // Push item onto heap.
  def push(item: T): Unit = js.native
  // Fast version of a push followed by a pop.
  def pushpop(item: T): T = js.native
  // Pop and return the current smallest value, and add the new item.
  // This is more efficient than pop() followed by push(), and can be more appropriate when using a fixed size heap.
  // Note that the value returned may be larger than item!
  def replace(item: T): T = js.native
  // Get the number of elements stored in the heap.
  def size(): Double = js.native
  // Return the array representation of the heap. (note: the array is a shallow copy of the heap's internal nodes)
  def toArray(): js.Array[T] = js.native
  def top(): T = js.native
  // Update the position of the given item in the heap. This function should be called every time the item is being modified.
  def updateItem(item: T): Unit = js.native
}

object Heap {
  @scala.inline
  def apply[T](
    copy: () => Heap[T],
    empty: () => Boolean,
    front: () => T,
    heapify: () => Unit,
    insert: T => Unit,
    peek: () => T,
    pop: () => T,
    push: T => Unit,
    pushpop: T => T,
    replace: T => T,
    size: () => Double,
    toArray: () => js.Array[T],
    top: () => T,
    updateItem: T => Unit
  ): Heap[T] = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), empty = js.Any.fromFunction0(empty), front = js.Any.fromFunction0(front), heapify = js.Any.fromFunction0(heapify), insert = js.Any.fromFunction1(insert), peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), pushpop = js.Any.fromFunction1(pushpop), replace = js.Any.fromFunction1(replace), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray), top = js.Any.fromFunction0(top), updateItem = js.Any.fromFunction1(updateItem))
    __obj.asInstanceOf[Heap[T]]
  }
  @scala.inline
  implicit class HeapOps[Self[t] <: Heap[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCopy(value: () => Heap[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFront(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeapify(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapify")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeek(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPop(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPushpop(value: T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushpop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplace(value: T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction1(value))
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
    @scala.inline
    def withTop(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateItem(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateItem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

