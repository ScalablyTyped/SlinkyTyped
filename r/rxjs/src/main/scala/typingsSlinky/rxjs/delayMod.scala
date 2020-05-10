package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/delay", JSImport.Namespace)
@js.native
object delayMod extends js.Object {
  def delay[T](delay: Double): MonoTypeOperatorFunction[T] = js.native
  def delay[T](delay: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def delay[T](delay: js.Date): MonoTypeOperatorFunction[T] = js.native
  def delay[T](delay: js.Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

