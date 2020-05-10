package typingsSlinky.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TakeableChannel[T] extends js.Object {
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
}

object TakeableChannel {
  @scala.inline
  def apply[T](take: js.Function1[/* message */ T | END, Unit] => Unit): TakeableChannel[T] = {
    val __obj = js.Dynamic.literal(take = js.Any.fromFunction1(take))
    __obj.asInstanceOf[TakeableChannel[T]]
  }
  @scala.inline
  implicit class TakeableChannelOps[Self[t] <: TakeableChannel[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTake(value: js.Function1[/* message */ T | END, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("take")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

