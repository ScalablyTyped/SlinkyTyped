package typingsSlinky.consumableStream.mod

import typingsSlinky.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consumer[T] extends js.Object {
  def next(): js.Promise[IteratorResult[T, _]] = js.native
  def `return`(): Unit = js.native
}

object Consumer {
  @scala.inline
  def apply[T](next: () => js.Promise[IteratorResult[T, _]], `return`: () => Unit): Consumer[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.updateDynamic("return")(js.Any.fromFunction0(`return`))
    __obj.asInstanceOf[Consumer[T]]
  }
  @scala.inline
  implicit class ConsumerOps[Self[t] <: Consumer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNext(value: () => js.Promise[IteratorResult[T, _]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReturn(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

