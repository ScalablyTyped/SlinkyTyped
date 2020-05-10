package typingsSlinky.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventChannel_[T] extends js.Object {
  def close(): Unit = js.native
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit = js.native
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
}

object EventChannel_ {
  @scala.inline
  def apply[T](
    close: () => Unit,
    flush: js.Function1[/* items */ js.Array[T] | END, Unit] => Unit,
    take: js.Function1[/* message */ T | END, Unit] => Unit
  ): EventChannel_[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flush = js.Any.fromFunction1(flush), take = js.Any.fromFunction1(take))
    __obj.asInstanceOf[EventChannel_[T]]
  }
  @scala.inline
  implicit class EventChannel_Ops[Self[t] <: EventChannel_[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClose(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: js.Function1[/* items */ js.Array[T] | END, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTake(value: js.Function1[/* message */ T | END, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("take")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

