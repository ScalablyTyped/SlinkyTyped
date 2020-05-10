package typingsSlinky.agGrid.baseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedFilter[T] extends js.Object {
  var condition1: T = js.native
  var condition2: T = js.native
  var operator: String = js.native
}

object CombinedFilter {
  @scala.inline
  def apply[T](condition1: T, condition2: T, operator: String): CombinedFilter[T] = {
    val __obj = js.Dynamic.literal(condition1 = condition1.asInstanceOf[js.Any], condition2 = condition2.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedFilter[T]]
  }
  @scala.inline
  implicit class CombinedFilterOps[Self[t] <: CombinedFilter[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCondition1(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition2(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

