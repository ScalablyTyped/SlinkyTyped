package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.fromEventMod.EventListenerOptions
import typingsSlinky.rxjs.fromEventMod.FromEventTarget
import typingsSlinky.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "fromEvent")
@js.native
object fromEvent extends js.Object {
  
  def apply[T](target: FromEventTarget[T], eventName: String): Observable[T] = js.native
  def apply[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
}
