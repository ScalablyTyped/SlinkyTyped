package typingsSlinky.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern5[T1, T2, T3, T4, T5] extends js.Object {
  def and[T6](other: Observable[T6]): Pattern6[T1, T2, T3, T4, T5, T6] = js.native
  def thenDo[TR](
    selector: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, TR]
  ): Plan[TR] = js.native
}

object Pattern5 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5](
    and: Observable[js.Any] => Pattern6[T1, T2, T3, T4, T5, js.Any],
    thenDo: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, js.Any] => Plan[js.Any]
  ): Pattern5[T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
    __obj.asInstanceOf[Pattern5[T1, T2, T3, T4, T5]]
  }
  @scala.inline
  implicit class Pattern5Ops[Self[t1, t2, t3, t4, t5] <: Pattern5[t1, t2, t3, t4, t5], T1, T2, T3, T4, T5] (val x: Self[T1, T2, T3, T4, T5]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2, T3, T4, T5] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2, T3, T4, T5]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2, T3, T4, T5]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2, T3, T4, T5]) with Other]
    @scala.inline
    def withAnd(value: Observable[js.Any] => Pattern6[T1, T2, T3, T4, T5, js.Any]): Self[T1, T2, T3, T4, T5] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThenDo(
      value: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, js.Any] => Plan[js.Any]
    ): Self[T1, T2, T3, T4, T5] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenDo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

