package typingsSlinky.rxLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends IObserver[T] {
  def asObserver(): Observer[T] = js.native
  def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
}

object Observer {
  @scala.inline
  def apply[T](
    asObserver: () => Observer[T],
    onCompleted: () => Unit,
    onError: js.Any => Unit,
    onNext: T => Unit,
    toNotifier: () => js.Function1[/* notification */ Notification[T], Unit]
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(asObserver = js.Any.fromFunction0(asObserver), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), toNotifier = js.Any.fromFunction0(toNotifier))
    __obj.asInstanceOf[Observer[T]]
  }
  @scala.inline
  implicit class ObserverOps[Self[t] <: Observer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAsObserver(value: () => Observer[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asObserver")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToNotifier(value: () => js.Function1[/* notification */ Notification[T], Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toNotifier")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

