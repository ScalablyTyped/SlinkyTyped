package typingsSlinky.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlushableChannel[T] extends js.Object {
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit = js.native
}

object FlushableChannel {
  @scala.inline
  def apply[T](flush: js.Function1[/* items */ js.Array[T] | END, Unit] => Unit): FlushableChannel[T] = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush))
    __obj.asInstanceOf[FlushableChannel[T]]
  }
  @scala.inline
  implicit class FlushableChannelOps[Self[t] <: FlushableChannel[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFlush(value: js.Function1[/* items */ js.Array[T] | END, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

