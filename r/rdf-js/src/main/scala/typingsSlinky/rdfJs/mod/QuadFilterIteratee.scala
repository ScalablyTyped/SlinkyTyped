package typingsSlinky.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadFilterIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that returns `true` if the input quad passes the test this function implements.
    */
  def test(quad: Q, dataset: Dataset[Q, Q]): Boolean = js.native
}

object QuadFilterIteratee {
  @scala.inline
  def apply[Q](test: (Q, Dataset[Q, Q]) => Boolean): QuadFilterIteratee[Q] = {
    val __obj = js.Dynamic.literal(test = js.Any.fromFunction2(test))
    __obj.asInstanceOf[QuadFilterIteratee[Q]]
  }
  @scala.inline
  implicit class QuadFilterIterateeOps[Self[q] <: QuadFilterIteratee[q], Q] (val x: Self[Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Q] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Q]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Q] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Q] with Other]
    @scala.inline
    def withTest(value: (Q, Dataset[Q, Q]) => Boolean): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

