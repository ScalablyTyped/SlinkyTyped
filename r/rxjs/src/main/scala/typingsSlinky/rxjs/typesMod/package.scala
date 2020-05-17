package typingsSlinky.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type MonoTypeOperatorFunction[T] = typingsSlinky.rxjs.typesMod.OperatorFunction[T, T]
  type ObservableLike[T] = typingsSlinky.rxjs.typesMod.InteropObservable[T]
  type ObservedValueOf[O] = js.Any
  type ObservedValuesFromArray[X] = js.Any
  type OperatorFunction[T, R] = typingsSlinky.rxjs.typesMod.UnaryFunction[
    typingsSlinky.rxjs.internalObservableMod.Observable[T], 
    typingsSlinky.rxjs.internalObservableMod.Observable[R]
  ]
  type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
}
