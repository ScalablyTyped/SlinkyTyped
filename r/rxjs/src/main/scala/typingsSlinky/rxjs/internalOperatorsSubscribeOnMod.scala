package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/subscribeOn", JSImport.Namespace)
@js.native
object internalOperatorsSubscribeOnMod extends js.Object {
  def subscribeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def subscribeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = js.native
}

