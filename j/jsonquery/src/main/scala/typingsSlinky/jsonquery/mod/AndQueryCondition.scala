package typingsSlinky.jsonquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndQueryCondition[T] extends BinaryQueryCondition[T] {
  @JSName("$and")
  var $and: js.Array[Query[T]] = js.native
}

object AndQueryCondition {
  @scala.inline
  def apply[T]($and: js.Array[Query[T]]): AndQueryCondition[T] = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndQueryCondition[T]]
  }
  @scala.inline
  implicit class AndQueryConditionOps[Self[t] <: AndQueryCondition[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$and(value: js.Array[Query[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

