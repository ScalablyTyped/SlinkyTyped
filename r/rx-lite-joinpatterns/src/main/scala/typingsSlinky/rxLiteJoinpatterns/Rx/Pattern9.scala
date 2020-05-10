package typingsSlinky.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] extends js.Object {
  def thenDo[TR](
    selector: js.Function9[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      /* item9 */ T9, 
      TR
    ]
  ): Plan[TR] = js.native
}

object Pattern9 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    thenDo: js.Function9[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      /* item9 */ T9, 
      js.Any
    ] => Plan[js.Any]
  ): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
    val __obj = js.Dynamic.literal(thenDo = js.Any.fromFunction1(thenDo))
    __obj.asInstanceOf[Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  }
  @scala.inline
  implicit class Pattern9Ops[Self[t1, t2, t3, t4, t5, t6, t7, t8, t9] <: Pattern9[t1, t2, t3, t4, t5, t6, t7, t8, t9], T1, T2, T3, T4, T5, T6, T7, T8, T9] (val x: Self[T1, T2, T3, T4, T5, T6, T7, T8, T9]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2, T3, T4, T5, T6, T7, T8, T9] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2, T3, T4, T5, T6, T7, T8, T9]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2, T3, T4, T5, T6, T7, T8, T9]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2, T3, T4, T5, T6, T7, T8, T9]) with Other]
    @scala.inline
    def withThenDo(
      value: js.Function9[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          /* item8 */ T8, 
          /* item9 */ T9, 
          js.Any
        ] => Plan[js.Any]
    ): Self[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenDo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

