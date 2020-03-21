package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timeout", JSImport.Namespace)
@js.native
object timeoutMod extends js.Object {
  def timeout[T](due: Double): MonoTypeOperatorFunction[T] = js.native
  def timeout[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def timeout[T](due: Date): MonoTypeOperatorFunction[T] = js.native
  def timeout[T](due: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

