package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/sampleTime", JSImport.Namespace)
@js.native
object internalOperatorsSampleTimeMod extends js.Object {
  def sampleTime[T](period: Double): MonoTypeOperatorFunction[T] = js.native
  def sampleTime[T](period: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

