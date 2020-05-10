package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitableQuery[T] extends js.Object {
  def limit(n: js.Any, m: js.Any): ExecutableQuery[T] = js.native
}

object LimitableQuery {
  @scala.inline
  def apply[T](limit: (js.Any, js.Any) => ExecutableQuery[T]): LimitableQuery[T] = {
    val __obj = js.Dynamic.literal(limit = js.Any.fromFunction2(limit))
    __obj.asInstanceOf[LimitableQuery[T]]
  }
  @scala.inline
  implicit class LimitableQueryOps[Self[t] <: LimitableQuery[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withLimit(value: (js.Any, js.Any) => ExecutableQuery[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

