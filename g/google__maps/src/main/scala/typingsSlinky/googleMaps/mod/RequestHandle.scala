package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandle[T] extends js.Object {
  /**
    * Cancels the request.
    * The ResponseCallback will not be invoked, and promises will not be settled.
    * Use the RequestHandle#finally handler will still be called.
    */
  def cancel(): Unit = js.native
  /**
    * Registers a callback that will be called when the response is finished, either successfully, or with an error,
    * or having been cancelled. Use this to clean up resources.
    * Returns this handle, for chaining.
    */
  def `finally`(callback: js.Function0[Unit]): RequestHandle[T] = js.native
}

object RequestHandle {
  @scala.inline
  def apply[T](cancel: () => Unit, `finally`: js.Function0[Unit] => RequestHandle[T]): RequestHandle[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
    __obj.asInstanceOf[RequestHandle[T]]
  }
  @scala.inline
  implicit class RequestHandleOps[Self[t] <: RequestHandle[t], T] (val x: Self[T]) extends AnyVal {
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
    def withFinally(value: js.Function0[Unit] => RequestHandle[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finally")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

