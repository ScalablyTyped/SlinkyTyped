package typingsSlinky.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern1[T1] extends js.Object {
  def and[T2](other: Observable[T2]): Pattern2[T1, T2] = js.native
  def thenDo[TR](selector: js.Function1[/* item1 */ T1, TR]): Plan[TR] = js.native
}

object Pattern1 {
  @scala.inline
  def apply[T1](
    and: Observable[js.Any] => Pattern2[T1, js.Any],
    thenDo: js.Function1[/* item1 */ T1, js.Any] => Plan[js.Any]
  ): Pattern1[T1] = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
    __obj.asInstanceOf[Pattern1[T1]]
  }
  @scala.inline
  implicit class Pattern1Ops[Self[t1] <: Pattern1[t1], T1] (val x: Self[T1]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T1] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T1] with Other]
    @scala.inline
    def withAnd(value: Observable[js.Any] => Pattern2[T1, js.Any]): Self[T1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThenDo(value: js.Function1[/* item1 */ T1, js.Any] => Plan[js.Any]): Self[T1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenDo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

