package typingsSlinky.rxjs.subscribeOnObservableMod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.subscriptionMod.Subscription
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable")
@js.native
class SubscribeOnObservable[T] protected () extends Observable[T] {
  def this(source: Observable[T]) = this()
  def this(source: Observable[T], delayTime: Double) = this()
  def this(source: Observable[T], delayTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike) = this()
  def this(source: Observable[T], delayTime: Double, scheduler: SchedulerLike) = this()
  
  var delayTime: js.Any = js.native
  
  var scheduler: js.Any = js.native
  
  @JSName("source")
  var source_SubscribeOnObservable: Observable[T] = js.native
}
/* static members */
@JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable")
@js.native
object SubscribeOnObservable extends js.Object {
  
  /** @nocollapse */
  def create[T](source: Observable[T]): Observable[T] = js.native
  def create[T](source: Observable[T], delay: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[T] = js.native
  def create[T](source: Observable[T], delay: Double): Observable[T] = js.native
  def create[T](source: Observable[T], delay: Double, scheduler: SchedulerLike): Observable[T] = js.native
  
  /** @nocollapse */
  def dispatch[T](arg: DispatchArg[T]): Subscription = js.native
}
