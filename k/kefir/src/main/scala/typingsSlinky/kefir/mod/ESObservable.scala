package typingsSlinky.kefir.mod

import typingsSlinky.kefir.AnonUnsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ESObservable[T, S] extends js.Object {
  def subscribe(callbacks: ESObserver[T, S]): AnonUnsubscribe = js.native
}

object ESObservable {
  @scala.inline
  def apply[T, S](subscribe: ESObserver[T, S] => AnonUnsubscribe): ESObservable[T, S] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[ESObservable[T, S]]
  }
  @scala.inline
  implicit class ESObservableOps[Self[t, s] <: ESObservable[t, s], T, S] (val x: Self[T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, S]) with Other]
    @scala.inline
    def withSubscribe(value: ESObserver[T, S] => AnonUnsubscribe): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

