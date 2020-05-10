package typingsSlinky.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadRunIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on a quad.
    */
  def run(quad: Q, dataset: Dataset[Q, Q]): Unit = js.native
}

object QuadRunIteratee {
  @scala.inline
  def apply[Q](run: (Q, Dataset[Q, Q]) => Unit): QuadRunIteratee[Q] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[QuadRunIteratee[Q]]
  }
  @scala.inline
  implicit class QuadRunIterateeOps[Self[q] <: QuadRunIteratee[q], Q] (val x: Self[Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Q] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Q]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Q] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Q] with Other]
    @scala.inline
    def withRun(value: (Q, Dataset[Q, Q]) => Unit): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

