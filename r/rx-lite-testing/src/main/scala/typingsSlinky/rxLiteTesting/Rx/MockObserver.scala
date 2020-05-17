package typingsSlinky.rxLiteTesting.Rx

import typingsSlinky.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockObserver[T] extends Observer[T] {
  var messages: js.Array[Recorded] = js.native
}

object MockObserver {
  @scala.inline
  def apply[T](checked: () => Observer[_], messages: js.Array[Recorded]): MockObserver[T] = {
    val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked), messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockObserver[T]]
  }
  @scala.inline
  implicit class MockObserverOps[Self[t] <: MockObserver[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMessages(value: js.Array[Recorded]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

