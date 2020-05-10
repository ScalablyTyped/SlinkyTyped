package typingsSlinky.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadReduceIteratee[A, Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on an accumulator and quad and returns a new accumulator.
    */
  def run(accumulator: A, quad: Q, dataset: Dataset[Q, Q]): A = js.native
}

object QuadReduceIteratee {
  @scala.inline
  def apply[A, Q](run: (A, Q, Dataset[Q, Q]) => A): QuadReduceIteratee[A, Q] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
    __obj.asInstanceOf[QuadReduceIteratee[A, Q]]
  }
  @scala.inline
  implicit class QuadReduceIterateeOps[Self[a, q] <: QuadReduceIteratee[a, q], A, Q] (val x: Self[A, Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, Q] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, Q]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, Q]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, Q]) with Other]
    @scala.inline
    def withRun(value: (A, Q, Dataset[Q, Q]) => A): Self[A, Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

