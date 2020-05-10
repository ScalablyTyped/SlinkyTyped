package typingsSlinky.rxjs.subscribeOnObservableMod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchArg[T] extends js.Object {
  var source: Observable[T] = js.native
  var subscriber: Subscriber[T] = js.native
}

object DispatchArg {
  @scala.inline
  def apply[T](source: Observable[T], subscriber: Subscriber[T]): DispatchArg[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchArg[T]]
  }
  @scala.inline
  implicit class DispatchArgOps[Self[t] <: DispatchArg[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSource(value: Observable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriber(value: Subscriber[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

