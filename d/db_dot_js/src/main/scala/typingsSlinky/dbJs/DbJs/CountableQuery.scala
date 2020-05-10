package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountableQuery[T] extends js.Object {
  def count(): ExecutableQuery[T] = js.native
}

object CountableQuery {
  @scala.inline
  def apply[T](count: () => ExecutableQuery[T]): CountableQuery[T] = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count))
    __obj.asInstanceOf[CountableQuery[T]]
  }
  @scala.inline
  implicit class CountableQueryOps[Self[t] <: CountableQuery[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCount(value: () => ExecutableQuery[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

