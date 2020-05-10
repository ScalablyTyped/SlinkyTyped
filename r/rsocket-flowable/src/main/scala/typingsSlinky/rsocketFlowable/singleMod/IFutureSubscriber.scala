package typingsSlinky.rsocketFlowable.singleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFutureSubscriber[T] extends js.Object {
  def onComplete(value: T): Unit = js.native
  def onError(error: js.Error): Unit = js.native
  def onSubscribe(cancel: CancelCallback): Unit = js.native
}

object IFutureSubscriber {
  @scala.inline
  def apply[T](onComplete: T => Unit, onError: js.Error => Unit, onSubscribe: CancelCallback => Unit): IFutureSubscriber[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError), onSubscribe = js.Any.fromFunction1(onSubscribe))
    __obj.asInstanceOf[IFutureSubscriber[T]]
  }
  @scala.inline
  implicit class IFutureSubscriberOps[Self[t] <: IFutureSubscriber[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnComplete(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnError(value: js.Error => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSubscribe(value: CancelCallback => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

