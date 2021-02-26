package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.OperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowTimeMod {
  
  @JSImport("rxjs/internal/operators/windowTime", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators/windowTime", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators/windowTime", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators/windowTime", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators/windowTime", "windowTime")
  @js.native
  def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators/windowTime", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = js.native
}
