package typingsSlinky.naja.anon

import org.scalajs.dom.raw.Event
import typingsSlinky.naja.mod.NajaEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[T /* <: Event */] extends NajaEventListener[T] {
  def handleEvent(event: T): js.Promise[Unit] | Unit = js.native
}

object `0` {
  @scala.inline
  def apply[T](handleEvent: T => js.Promise[Unit] | Unit): `0`[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[`0`[T]]
  }
  @scala.inline
  implicit class `0Ops`[Self[t] <: `0`[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHandleEvent(value: T => js.Promise[Unit] | Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

