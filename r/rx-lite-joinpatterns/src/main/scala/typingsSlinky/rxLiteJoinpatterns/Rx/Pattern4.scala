package typingsSlinky.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern4[T1, T2, T3, T4] extends js.Object {
  def and[T5](other: Observable[T5]): Pattern5[T1, T2, T3, T4, T5] = js.native
  def thenDo[TR](selector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TR]): Plan[TR] = js.native
}

object Pattern4 {
  @scala.inline
  def apply[T1, T2, T3, T4](
    and: Observable[js.Any] => Pattern5[T1, T2, T3, T4, js.Any],
    thenDo: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, js.Any] => Plan[js.Any]
  ): Pattern4[T1, T2, T3, T4] = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
    __obj.asInstanceOf[Pattern4[T1, T2, T3, T4]]
  }
  @scala.inline
  implicit class Pattern4Ops[Self[t1, t2, t3, t4] <: Pattern4[t1, t2, t3, t4], T1, T2, T3, T4] (val x: Self[T1, T2, T3, T4]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2, T3, T4] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2, T3, T4]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2, T3, T4]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2, T3, T4]) with Other]
    @scala.inline
    def withAnd(value: Observable[js.Any] => Pattern5[T1, T2, T3, T4, js.Any]): Self[T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThenDo(
      value: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, js.Any] => Plan[js.Any]
    ): Self[T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenDo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

