package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescableQuery[T] extends js.Object {
  def desc(): DescQuery[T] = js.native
}

object DescableQuery {
  @scala.inline
  def apply[T](desc: () => DescQuery[T]): DescableQuery[T] = {
    val __obj = js.Dynamic.literal(desc = js.Any.fromFunction0(desc))
    __obj.asInstanceOf[DescableQuery[T]]
  }
  @scala.inline
  implicit class DescableQueryOps[Self[t] <: DescableQuery[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDesc(value: () => DescQuery[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

