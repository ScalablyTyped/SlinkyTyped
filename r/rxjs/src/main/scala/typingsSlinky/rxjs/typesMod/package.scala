package typingsSlinky.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FactoryOrValue[T] = T | js.Function0[T]
  type MonoTypeOperatorFunction[T] = typingsSlinky.rxjs.typesMod.OperatorFunction[T, T]
  type ObservableInput[T] = typingsSlinky.rxjs.typesMod.SubscribableOrPromise[T] | typingsSlinky.std.ArrayLike[T] | js.Iterable[T]
  type ObservableLike[T] = typingsSlinky.rxjs.typesMod.InteropObservable[T]
  type ObservedValueOf[O] = js.Any
  type ObservedValuesFromArray[X] = js.Any
  type OperatorFunction[T, R] = typingsSlinky.rxjs.typesMod.UnaryFunction[
    typingsSlinky.rxjs.internalObservableMod.Observable[T], 
    typingsSlinky.rxjs.internalObservableMod.Observable[R]
  ]
  type SubscribableOrPromise[T] = (typingsSlinky.rxjs.typesMod.Subscribable[scala.Nothing | T]) | js.Thenable[T] | typingsSlinky.rxjs.typesMod.InteropObservable[T]
  type TeardownLogic = typingsSlinky.rxjs.typesMod.Unsubscribable | js.Function | scala.Unit
  type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
}
