package typingsSlinky.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncHandle[T] extends js.Object {
  def cancel(): Unit = js.native
  def onComplete(callback: Callback): Unit = js.native
  def onError(callback: ErrorCallback): Unit = js.native
}

object AsyncHandle {
  @scala.inline
  def apply[T](cancel: () => Unit, onComplete: Callback => Unit, onError: ErrorCallback => Unit): AsyncHandle[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[AsyncHandle[T]]
  }
  @scala.inline
  implicit class AsyncHandleOps[Self[t] <: AsyncHandle[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnComplete(value: Callback => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnError(value: ErrorCallback => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

