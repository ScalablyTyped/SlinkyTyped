package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/race", JSImport.Namespace)
@js.native
object internalOperatorsRaceMod extends js.Object {
  def race[T](observables: (Observable[T] | js.Array[Observable[T]])*): MonoTypeOperatorFunction[T] = js.native
  def race[T](observables: js.Array[Observable[T]]): MonoTypeOperatorFunction[T] = js.native
  @JSName("race")
  def race_TR_OperatorFunction[T, R](observables: (Observable[_] | js.Array[Observable[_]])*): OperatorFunction[T, R] = js.native
  @JSName("race")
  def race_TR_OperatorFunction[T, R](observables: js.Array[Observable[T]]): OperatorFunction[T, R] = js.native
}

