package typingsSlinky.rxjs.internalObservableSubscribeOnObservableMod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatchArg[T] extends js.Object {
  var source: Observable[T]
  var subscriber: Subscriber[T]
}

object DispatchArg {
  @scala.inline
  def apply[T](source: Observable[T], subscriber: Subscriber[T]): DispatchArg[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DispatchArg[T]]
  }
}

