package typingsSlinky.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadMapIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on a quad and returns a quad.
    *
    * The returned quad can be the given quad or a new one.
    */
  def map(quad: Q, dataset: Dataset[Q, Q]): Q = js.native
}

object QuadMapIteratee {
  @scala.inline
  def apply[Q](map: (Q, Dataset[Q, Q]) => Q): QuadMapIteratee[Q] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[QuadMapIteratee[Q]]
  }
  @scala.inline
  implicit class QuadMapIterateeOps[Self[q] <: QuadMapIteratee[q], Q] (val x: Self[Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Q] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Q]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Q] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Q] with Other]
    @scala.inline
    def withMap(value: (Q, Dataset[Q, Q]) => Q): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

