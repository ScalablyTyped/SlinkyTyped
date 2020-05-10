package typingsSlinky.crossfilter.CrossFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupAll[T, TValue] extends js.Object {
  def dispose(): GroupAll[T, TValue] = js.native
  def reduce[TValue](
    add: js.Function2[/* p */ TValue, /* v */ T, TValue],
    remove: js.Function2[/* p */ TValue, /* v */ T, TValue],
    initial: js.Function0[TValue]
  ): GroupAll[T, TValue] = js.native
  def reduceCount(): GroupAll[T, TValue] = js.native
  def reduceSum(value: Selector[T]): GroupAll[T, TValue] = js.native
  def value(): TValue = js.native
}

object GroupAll {
  @scala.inline
  def apply[T, TValue](
    dispose: () => GroupAll[T, TValue],
    reduce: (js.Function2[js.Any, /* v */ T, js.Any], js.Function2[js.Any, /* v */ T, js.Any], js.Function0[js.Any]) => GroupAll[T, js.Any],
    reduceCount: () => GroupAll[T, TValue],
    reduceSum: Selector[T] => GroupAll[T, TValue],
    value: () => TValue
  ): GroupAll[T, TValue] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), reduce = js.Any.fromFunction3(reduce), reduceCount = js.Any.fromFunction0(reduceCount), reduceSum = js.Any.fromFunction1(reduceSum), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[GroupAll[T, TValue]]
  }
  @scala.inline
  implicit class GroupAllOps[Self[t, tvalue] <: GroupAll[t, tvalue], T, TValue] (val x: Self[T, TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TValue]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TValue]) with Other]
    @scala.inline
    def withDispose(value: () => GroupAll[T, TValue]): Self[T, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReduce(
      value: (js.Function2[js.Any, /* v */ T, js.Any], js.Function2[js.Any, /* v */ T, js.Any], js.Function0[js.Any]) => GroupAll[T, js.Any]
    ): Self[T, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReduceCount(value: () => GroupAll[T, TValue]): Self[T, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduceCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReduceSum(value: Selector[T] => GroupAll[T, TValue]): Self[T, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduceSum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: () => TValue): Self[T, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

