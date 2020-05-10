package typingsSlinky.pFifo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PFifo[T] extends js.Object {
  def isEmpty(): Boolean = js.native
  def push(chunk: T): js.Promise[Unit] = js.native
  def shift(): js.Promise[T] = js.native
}

object PFifo {
  @scala.inline
  def apply[T](isEmpty: () => Boolean, push: T => js.Promise[Unit], shift: () => js.Promise[T]): PFifo[T] = {
    val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift))
    __obj.asInstanceOf[PFifo[T]]
  }
  @scala.inline
  implicit class PFifoOps[Self[t] <: PFifo[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: T => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShift(value: () => js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

