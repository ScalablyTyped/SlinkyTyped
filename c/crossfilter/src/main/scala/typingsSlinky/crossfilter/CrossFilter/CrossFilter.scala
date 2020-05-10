package typingsSlinky.crossfilter.CrossFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossFilter[T] extends js.Object {
  def GroupAll(): typingsSlinky.crossfilter.CrossFilter.GroupAll[T, T] = js.native
  def add(records: js.Array[T]): typingsSlinky.crossfilter.CrossFilter.CrossFilter[T] = js.native
  def dimension[TDimension](value: js.Function1[/* data */ T, TDimension]): Dimension[T, TDimension] = js.native
  def groupAll[TValue](): GroupAll[T, TValue] = js.native
  def remove(): typingsSlinky.crossfilter.CrossFilter.CrossFilter[T] = js.native
  def size(): Double = js.native
}

object CrossFilter {
  @scala.inline
  def apply[T](
    GroupAll: () => GroupAll[T, T],
    add: js.Array[T] => typingsSlinky.crossfilter.CrossFilter.CrossFilter[T],
    dimension: js.Function1[/* data */ T, js.Any] => Dimension[T, js.Any],
    groupAll: () => GroupAll[T, js.Any],
    remove: () => typingsSlinky.crossfilter.CrossFilter.CrossFilter[T],
    size: () => Double
  ): CrossFilter[T] = {
    val __obj = js.Dynamic.literal(GroupAll = js.Any.fromFunction0(GroupAll), add = js.Any.fromFunction1(add), dimension = js.Any.fromFunction1(dimension), groupAll = js.Any.fromFunction0(groupAll), remove = js.Any.fromFunction0(remove), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[CrossFilter[T]]
  }
  @scala.inline
  implicit class CrossFilterOps[Self[t] <: typingsSlinky.crossfilter.CrossFilter.CrossFilter[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGroupAll(value: () => GroupAll[T, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAdd(value: js.Array[T] => typingsSlinky.crossfilter.CrossFilter.CrossFilter[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDimension(value: js.Function1[/* data */ T, js.Any] => Dimension[T, js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => typingsSlinky.crossfilter.CrossFilter.CrossFilter[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
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

