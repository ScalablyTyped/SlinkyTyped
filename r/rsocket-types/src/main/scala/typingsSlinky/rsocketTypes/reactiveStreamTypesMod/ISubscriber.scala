package typingsSlinky.rsocketTypes.reactiveStreamTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriber[T] extends js.Object {
  def onComplete(): Unit = js.native
  def onError(error: js.Error): Unit = js.native
  def onNext(value: T): Unit = js.native
  def onSubscribe(subscription: ISubscription): Unit = js.native
}

object ISubscriber {
  @scala.inline
  def apply[T](
    onComplete: () => Unit,
    onError: js.Error => Unit,
    onNext: T => Unit,
    onSubscribe: ISubscription => Unit
  ): ISubscriber[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
    __obj.asInstanceOf[ISubscriber[T]]
  }
  @scala.inline
  implicit class ISubscriberOps[Self[t] <: ISubscriber[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnComplete(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: js.Error => Unit): Self[T] = {
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
    @scala.inline
    def withOnSubscribe(value: ISubscription => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

