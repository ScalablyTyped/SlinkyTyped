package typingsSlinky.rxLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observer
@js.native
trait IObserver[T] extends js.Object {
  def onCompleted(): Unit = js.native
  def onError(exception: js.Any): Unit = js.native
  def onNext(value: T): Unit = js.native
}

object IObserver {
  @scala.inline
  def apply[T](onCompleted: () => Unit, onError: js.Any => Unit, onNext: T => Unit): IObserver[T] = {
    val __obj = js.Dynamic.literal(onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
    __obj.asInstanceOf[IObserver[T]]
  }
  @scala.inline
  implicit class IObserverOps[Self[t] <: IObserver[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnCompleted(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: js.Any => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNext(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

