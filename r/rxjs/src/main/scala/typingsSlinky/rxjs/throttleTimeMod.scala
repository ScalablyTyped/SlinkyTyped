package typingsSlinky.rxjs

import typingsSlinky.rxjs.throttleMod.ThrottleConfig
import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/throttleTime", JSImport.Namespace)
@js.native
object throttleTimeMod extends js.Object {
  def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
}

