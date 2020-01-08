package typingsSlinky.rxjs.internalDashCompatibilityMod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalObservableSubscribeOnObservableMod.DispatchArg
import typingsSlinky.rxjs.internalSubscriptionMod.Subscription
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "SubscribeOnObservable")
@js.native
class SubscribeOnObservable[T] protected ()
  extends typingsSlinky.rxjs.internalObservableSubscribeOnObservableMod.SubscribeOnObservable[T] {
  def this(source: Observable[T]) = this()
  def this(source: Observable[T], delayTime: Double) = this()
  def this(source: Observable[T], delayTime: Double, scheduler: SchedulerLike) = this()
}

/* static members */
@JSImport("rxjs/internal-compatibility", "SubscribeOnObservable")
@js.native
object SubscribeOnObservable extends js.Object {
  /** @nocollapse */
  def create[T](source: Observable[T]): Observable[T] = js.native
  def create[T](source: Observable[T], delay: Double): Observable[T] = js.native
  def create[T](source: Observable[T], delay: Double, scheduler: SchedulerLike): Observable[T] = js.native
  /** @nocollapse */
  def dispatch[T](arg: DispatchArg[T]): Subscription = js.native
}

