package typingsSlinky.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] extends js.Object {
  def and[T9](other: Observable[T9]): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def thenDo[TR](
    selector: js.Function8[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      TR
    ]
  ): Plan[TR] = js.native
}

object Pattern8 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5, T6, T7, T8](
    and: Observable[js.Any] => Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, js.Any],
    thenDo: js.Function8[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      js.Any
    ] => Plan[js.Any]
  ): Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
    __obj.asInstanceOf[Pattern8[T1, T2, T3, T4, T5, T6, T7, T8]]
  }
  @scala.inline
  implicit class Pattern8Ops[Self[t1, t2, t3, t4, t5, t6, t7, t8] <: Pattern8[t1, t2, t3, t4, t5, t6, t7, t8], T1, T2, T3, T4, T5, T6, T7, T8] (val x: Self[T1, T2, T3, T4, T5, T6, T7, T8]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2, T3, T4, T5, T6, T7, T8] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2, T3, T4, T5, T6, T7, T8]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2, T3, T4, T5, T6, T7, T8]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2, T3, T4, T5, T6, T7, T8]) with Other]
    @scala.inline
    def withAnd(value: Observable[js.Any] => Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, js.Any]): Self[T1, T2, T3, T4, T5, T6, T7, T8] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThenDo(
      value: js.Function8[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          /* item8 */ T8, 
          js.Any
        ] => Plan[js.Any]
    ): Self[T1, T2, T3, T4, T5, T6, T7, T8] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenDo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

