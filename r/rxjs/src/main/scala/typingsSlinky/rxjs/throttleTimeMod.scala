package typingsSlinky.rxjs

import typingsSlinky.rxjs.throttleMod.ThrottleConfig
import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleTimeMod {
  
  @JSImport("rxjs/internal/operators/throttleTime", "throttleTime")
  @js.native
  def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/throttleTime", "throttleTime")
  @js.native
  def throttleTime[T](duration: Double, scheduler: js.UndefOr[scala.Nothing], config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/throttleTime", "throttleTime")
  @js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/throttleTime", "throttleTime")
  @js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
}
