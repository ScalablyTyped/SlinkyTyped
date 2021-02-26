package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.OperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeoutWithMod {
  
  @JSImport("rxjs/internal/operators/timeoutWith", "timeoutWith")
  @js.native
  def timeoutWith[T, R](due: js.Date, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators/timeoutWith", "timeoutWith")
  @js.native
  def timeoutWith[T, R](due: js.Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators/timeoutWith", "timeoutWith")
  @js.native
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators/timeoutWith", "timeoutWith")
  @js.native
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
}
