package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexMinPQ[T] extends js.Object {
  var N: js.Any = js.native
  var compare: js.Any = js.native
  var keys: js.Any = js.native
  var pq: js.Any = js.native
  var qp: js.Any = js.native
  def containsIndex(index: Double): Boolean = js.native
  def decreaseKey(index: Double, key: T): Unit = js.native
  def delMin(): Double = js.native
  def insert(index: Double, key: T): Unit = js.native
  def isEmpty(): Boolean = js.native
  def min(): Double = js.native
  def minKey(): T | Null = js.native
  def sink(k: Double): Unit = js.native
  def size(): Double = js.native
  def swim(k: Double): Unit = js.native
}

object IndexMinPQ {
  @scala.inline
  def apply[T](
    N: js.Any,
    compare: js.Any,
    containsIndex: Double => Boolean,
    decreaseKey: (Double, T) => Unit,
    delMin: () => Double,
    insert: (Double, T) => Unit,
    isEmpty: () => Boolean,
    keys: js.Any,
    min: () => Double,
    minKey: () => T | Null,
    pq: js.Any,
    qp: js.Any,
    sink: Double => Unit,
    size: () => Double,
    swim: Double => Unit
  ): IndexMinPQ[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], containsIndex = js.Any.fromFunction1(containsIndex), decreaseKey = js.Any.fromFunction2(decreaseKey), delMin = js.Any.fromFunction0(delMin), insert = js.Any.fromFunction2(insert), isEmpty = js.Any.fromFunction0(isEmpty), keys = keys.asInstanceOf[js.Any], min = js.Any.fromFunction0(min), minKey = js.Any.fromFunction0(minKey), pq = pq.asInstanceOf[js.Any], qp = qp.asInstanceOf[js.Any], sink = js.Any.fromFunction1(sink), size = js.Any.fromFunction0(size), swim = js.Any.fromFunction1(swim))
    __obj.asInstanceOf[IndexMinPQ[T]]
  }
  @scala.inline
  implicit class IndexMinPQOps[Self[t] <: IndexMinPQ[t], T] (val x: Self[T]) extends AnyVal {
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
    def withCompare(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainsIndex(value: Double => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecreaseKey(value: (Double, T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreaseKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDelMin(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delMin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Double, T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeys(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinKey(value: () => T | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPq(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQp(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSink(value: Double => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSwim(value: Double => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swim")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

