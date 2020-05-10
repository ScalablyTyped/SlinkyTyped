package typingsSlinky.bintrees.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeBase[T] extends js.Object {
  var size: Double = js.native
  def clear(): Unit = js.native
  def each(cb: Callback[T]): Unit = js.native
  def find(data: T): T = js.native
  def findIter(data: T): Iterator[T] = js.native
  def iterator(): Iterator[T] = js.native
  def lowerBound(item: T): Iterator[T] = js.native
  def max(): T = js.native
  def min(): T = js.native
  def reach(cb: Callback[T]): Unit = js.native
  def upperBound(item: T): Iterator[T] = js.native
}

object TreeBase {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    each: Callback[T] => Unit,
    find: T => T,
    findIter: T => Iterator[T],
    iterator: () => Iterator[T],
    lowerBound: T => Iterator[T],
    max: () => T,
    min: () => T,
    reach: Callback[T] => Unit,
    size: Double,
    upperBound: T => Iterator[T]
  ): TreeBase[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), find = js.Any.fromFunction1(find), findIter = js.Any.fromFunction1(findIter), iterator = js.Any.fromFunction0(iterator), lowerBound = js.Any.fromFunction1(lowerBound), max = js.Any.fromFunction0(max), min = js.Any.fromFunction0(min), reach = js.Any.fromFunction1(reach), size = size.asInstanceOf[js.Any], upperBound = js.Any.fromFunction1(upperBound))
    __obj.asInstanceOf[TreeBase[T]]
  }
  @scala.inline
  implicit class TreeBaseOps[Self[t] <: TreeBase[t], T] (val x: Self[T]) extends AnyVal {
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
    def withEach(value: Callback[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFind(value: T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindIter(value: T => Iterator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIterator(value: () => Iterator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLowerBound(value: T => Iterator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMax(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMin(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReach(value: Callback[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperBound(value: T => Iterator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

