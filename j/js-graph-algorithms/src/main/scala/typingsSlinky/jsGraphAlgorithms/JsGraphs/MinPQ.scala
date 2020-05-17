package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinPQ[T] extends js.Object {
  var N: js.Any = js.native
  var compare: js.Any = js.native
  var s: js.Any = js.native
  def delMin(): js.UndefOr[T] = js.native
  def enqueue(item: T): Unit = js.native
  def isEmpty(): Boolean = js.native
  def sink(k: Double): Unit = js.native
  def size(): Double = js.native
  def swim(k: Double): Unit = js.native
}

object MinPQ {
  @scala.inline
  def apply[T](
    N: js.Any,
    compare: js.Any,
    delMin: () => js.UndefOr[T],
    enqueue: T => Unit,
    isEmpty: () => Boolean,
    s: js.Any,
    sink: Double => Unit,
    size: () => Double,
    swim: Double => Unit
  ): MinPQ[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], delMin = js.Any.fromFunction0(delMin), enqueue = js.Any.fromFunction1(enqueue), isEmpty = js.Any.fromFunction0(isEmpty), s = s.asInstanceOf[js.Any], sink = js.Any.fromFunction1(sink), size = js.Any.fromFunction0(size), swim = js.Any.fromFunction1(swim))
    __obj.asInstanceOf[MinPQ[T]]
  }
  @scala.inline
  implicit class MinPQOps[Self[t] <: MinPQ[t], T] (val x: Self[T]) extends AnyVal {
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
    def withDelMin(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delMin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnqueue(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enqueue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withS(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
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

