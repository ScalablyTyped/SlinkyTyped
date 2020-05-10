package typingsSlinky.jsonquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrQueryCondition[T] extends BinaryQueryCondition[T] {
  @JSName("$or")
  var $or: js.Array[Query[T]] = js.native
}

object OrQueryCondition {
  @scala.inline
  def apply[T]($or: js.Array[Query[T]]): OrQueryCondition[T] = {
    val __obj = js.Dynamic.literal($or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrQueryCondition[T]]
  }
  @scala.inline
  implicit class OrQueryConditionOps[Self[t] <: OrQueryCondition[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$or(value: js.Array[Query[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

