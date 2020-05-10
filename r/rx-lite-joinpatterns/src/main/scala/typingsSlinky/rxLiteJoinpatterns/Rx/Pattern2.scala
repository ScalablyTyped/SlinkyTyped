package typingsSlinky.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern2[T1, T2] extends js.Object {
  def and[T3](other: Observable[T3]): Pattern3[T1, T2, T3] = js.native
  def thenDo[TR](selector: js.Function2[/* item1 */ T1, /* item2 */ T2, TR]): Plan[TR] = js.native
}

object Pattern2 {
  @scala.inline
  def apply[T1, T2](
    and: Observable[js.Any] => Pattern3[T1, T2, js.Any],
    thenDo: js.Function2[/* item1 */ T1, /* item2 */ T2, js.Any] => Plan[js.Any]
  ): Pattern2[T1, T2] = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
    __obj.asInstanceOf[Pattern2[T1, T2]]
  }
  @scala.inline
  implicit class Pattern2Ops[Self[t1, t2] <: Pattern2[t1, t2], T1, T2] (val x: Self[T1, T2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2]) with Other]
    @scala.inline
    def withAnd(value: Observable[js.Any] => Pattern3[T1, T2, js.Any]): Self[T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThenDo(value: js.Function2[/* item1 */ T1, /* item2 */ T2, js.Any] => Plan[js.Any]): Self[T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenDo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

