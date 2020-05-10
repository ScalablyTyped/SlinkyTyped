package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Query API
@js.native
trait ExecutableQuery[T] extends js.Object {
  def execute(): js.Promise[js.Array[T]] = js.native
}

object ExecutableQuery {
  @scala.inline
  def apply[T](execute: () => js.Promise[js.Array[T]]): ExecutableQuery[T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[ExecutableQuery[T]]
  }
  @scala.inline
  implicit class ExecutableQueryOps[Self[t] <: ExecutableQuery[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExecute(value: () => js.Promise[js.Array[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

