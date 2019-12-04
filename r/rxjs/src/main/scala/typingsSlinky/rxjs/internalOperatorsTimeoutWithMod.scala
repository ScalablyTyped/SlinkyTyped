package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timeoutWith", JSImport.Namespace)
@js.native
object internalOperatorsTimeoutWithMod extends js.Object {
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
  def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
}

