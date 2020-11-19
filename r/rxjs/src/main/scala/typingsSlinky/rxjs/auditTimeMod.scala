package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/auditTime", JSImport.Namespace)
@js.native
object auditTimeMod extends js.Object {
  
  def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}
