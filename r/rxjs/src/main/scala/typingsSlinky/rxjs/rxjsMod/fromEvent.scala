package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalObservableFromEventMod.EventListenerOptions
import typingsSlinky.rxjs.internalObservableFromEventMod.FromEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "fromEvent")
@js.native
object fromEvent extends js.Object {
  def apply[T](target: FromEventTarget[T], eventName: String): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
}

