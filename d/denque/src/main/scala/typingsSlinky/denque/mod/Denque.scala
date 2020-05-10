package typingsSlinky.denque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Denque[T] extends js.Object {
  var length: Double = js.native
  def clear(): Unit = js.native
  def get(index: Double): js.UndefOr[T] = js.native
  def isEmpty(): Boolean = js.native
  def peekAt(index: Double): js.UndefOr[T] = js.native
  def peekBack(): js.UndefOr[T] = js.native
  def peekFront(): js.UndefOr[T] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(item: T): Double = js.native
  def remove(index: Double, count: Double): js.Array[T] = js.native
  def removeBack(): js.UndefOr[T] = js.native
  def removeOne(index: Double): js.UndefOr[T] = js.native
  def shift(): js.UndefOr[T] = js.native
  def splice(index: Double, count: Double, item: T*): js.UndefOr[js.Array[T]] = js.native
  def toArray(): js.Array[T] = js.native
  def unshift(item: T): Double = js.native
}

object Denque {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    get: Double => js.UndefOr[T],
    isEmpty: () => Boolean,
    length: Double,
    peekAt: Double => js.UndefOr[T],
    peekBack: () => js.UndefOr[T],
    peekFront: () => js.UndefOr[T],
    pop: () => js.UndefOr[T],
    push: T => Double,
    remove: (Double, Double) => js.Array[T],
    removeBack: () => js.UndefOr[T],
    removeOne: Double => js.UndefOr[T],
    shift: () => js.UndefOr[T],
    splice: (Double, Double, /* repeated */ T) => js.UndefOr[js.Array[T]],
    toArray: () => js.Array[T],
    unshift: T => Double
  ): Denque[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), length = length.asInstanceOf[js.Any], peekAt = js.Any.fromFunction1(peekAt), peekBack = js.Any.fromFunction0(peekBack), peekFront = js.Any.fromFunction0(peekFront), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction2(remove), removeBack = js.Any.fromFunction0(removeBack), removeOne = js.Any.fromFunction1(removeOne), shift = js.Any.fromFunction0(shift), splice = js.Any.fromFunction3(splice), toArray = js.Any.fromFunction0(toArray), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[Denque[T]]
  }
  @scala.inline
  implicit class DenqueOps[Self[t] <: Denque[t], T] (val x: Self[T]) extends AnyVal {
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
    def withGet(value: Double => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeekAt(value: Double => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeekBack(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeekFront(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekFront")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPop(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: (Double, Double) => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveBack(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveOne(value: Double => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOne")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShift(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSplice(value: (Double, Double, /* repeated */ T) => js.UndefOr[js.Array[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splice")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnshift(value: T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

