package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/auditTime", JSImport.Namespace)
@js.native
object internalOperatorsAuditTimeMod extends js.Object {
  def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

