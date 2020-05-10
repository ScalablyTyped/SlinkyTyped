package typingsSlinky.rxjs.operatorMod

import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.rxjs.typesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operator[T, R] extends js.Object {
  def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
}

object Operator {
  @scala.inline
  def apply[T, R](call: (Subscriber[R], js.Any) => TeardownLogic): Operator[T, R] = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
    __obj.asInstanceOf[Operator[T, R]]
  }
  @scala.inline
  implicit class OperatorOps[Self[t, r] <: Operator[t, r], T, R] (val x: Self[T, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, R]) with Other]
    @scala.inline
    def withCall(value: (Subscriber[R], js.Any) => TeardownLogic): Self[T, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

