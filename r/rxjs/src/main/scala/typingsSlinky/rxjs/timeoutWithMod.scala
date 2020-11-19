package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.OperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/timeoutWith", JSImport.Namespace)
@js.native
object timeoutWithMod extends js.Object {
  
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
  def timeoutWith[T, R](due: js.Date, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  def timeoutWith[T, R](due: js.Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
}
