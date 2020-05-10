package typingsSlinky.callbackToAsyncIterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncifyOptions[T] extends js.Object {
  var buffering: Boolean = js.native
  def onClose(): Unit | T = js.native
  def onError(): js.Error = js.native
}

object AsyncifyOptions {
  @scala.inline
  def apply[T](buffering: Boolean, onClose: () => Unit | T, onError: () => js.Error): AsyncifyOptions[T] = {
    val __obj = js.Dynamic.literal(buffering = buffering.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onError = js.Any.fromFunction0(onError))
    __obj.asInstanceOf[AsyncifyOptions[T]]
  }
  @scala.inline
  implicit class AsyncifyOptionsOps[Self[t] <: AsyncifyOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBuffering(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit | T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: () => js.Error): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

