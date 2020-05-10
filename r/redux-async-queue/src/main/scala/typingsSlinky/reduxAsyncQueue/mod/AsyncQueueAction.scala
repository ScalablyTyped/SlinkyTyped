package typingsSlinky.reduxAsyncQueue.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncQueueAction[T /* <: Action[_] */] extends js.Object {
  var queue: String = js.native
  def callback(next: js.Function0[Unit], dispatch: Dispatch[T]): Unit = js.native
}

object AsyncQueueAction {
  @scala.inline
  def apply[T](callback: (js.Function0[Unit], Dispatch[T]) => Unit, queue: String): AsyncQueueAction[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncQueueAction[T]]
  }
  @scala.inline
  implicit class AsyncQueueActionOps[Self[t] <: AsyncQueueAction[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCallback(value: (js.Function0[Unit], Dispatch[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQueue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

