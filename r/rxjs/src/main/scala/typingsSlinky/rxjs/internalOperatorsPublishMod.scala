package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableConnectableObservableMod.ConnectableObservable
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.ObservedValueOf
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import typingsSlinky.rxjs.internalTypesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/publish", JSImport.Namespace)
@js.native
object internalOperatorsPublishMod extends js.Object {
  def publish[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  def publish[T](selector: MonoTypeOperatorFunction[T]): MonoTypeOperatorFunction[T] = js.native
  @JSName("publish")
  def publish_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
}

