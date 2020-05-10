package typingsSlinky.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accumulator[LHS, RHS] extends js.Object {
  var length: Double = js.native
  def push(diff: Diff_[LHS, RHS]): Unit = js.native
}

object Accumulator {
  @scala.inline
  def apply[LHS, RHS](length: Double, push: Diff_[LHS, RHS] => Unit): Accumulator[LHS, RHS] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Accumulator[LHS, RHS]]
  }
  @scala.inline
  implicit class AccumulatorOps[Self[lhs, rhs] <: Accumulator[lhs, rhs], LHS, RHS] (val x: Self[LHS, RHS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[LHS, RHS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[LHS, RHS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[LHS, RHS]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[LHS, RHS]) with Other]
    @scala.inline
    def withLength(value: Double): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: Diff_[LHS, RHS] => Unit): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

