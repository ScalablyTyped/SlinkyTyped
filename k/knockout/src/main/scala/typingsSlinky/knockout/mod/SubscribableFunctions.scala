package typingsSlinky.knockout.mod

import typingsSlinky.knockout.knockoutStrings.arrayChange
import typingsSlinky.knockout.knockoutStrings.asleep
import typingsSlinky.knockout.knockoutStrings.awake
import typingsSlinky.knockout.knockoutStrings.beforeChange
import typingsSlinky.knockout.knockoutStrings.change
import typingsSlinky.knockout.knockoutStrings.spectate
import typingsSlinky.knockout.mod.utils.ArrayChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribableFunctions[T]
  extends js.Function {
  
  def extend(requestedExtenders: ObservableExtenderOptions[T]): this.type = js.native
  @JSName("extend")
  def extend_S_Subscribable_T_S[S /* <: Subscribable_[T] */](requestedExtenders: ObservableExtenderOptions[T]): S = js.native
  
  def getSubscriptionsCount(): Double = js.native
  def getSubscriptionsCount(event: String): Double = js.native
  
  def init[S /* <: Subscribable_[_] */](instance: S): Unit = js.native
  
  def notifySubscribers(): Unit = js.native
  def notifySubscribers(valueToWrite: T): Unit = js.native
  def notifySubscribers(valueToWrite: T, event: String): Unit = js.native
  def notifySubscribers(valueToWrite: js.UndefOr[scala.Nothing], event: String): Unit = js.native
  
  def subscribe[TTarget](callback: SubscriptionCallback[T, TTarget]): Subscription = js.native
  def subscribe[TTarget](callback: SubscriptionCallback[T, TTarget], callbackTarget: TTarget): Subscription = js.native
  def subscribe[X, TTarget](callback: SubscriptionCallback[X, TTarget], callbackTarget: TTarget, event: String): Subscription = js.native
  @JSName("subscribe")
  def subscribe_arrayChange[TTarget](
    callback: SubscriptionCallback[ArrayChanges[Flatten[T]], TTarget],
    callbackTarget: TTarget,
    event: arrayChange
  ): Subscription = js.native
  @JSName("subscribe")
  def subscribe_asleep[TTarget](
    callback: SubscriptionCallback[js.UndefOr[scala.Nothing], TTarget],
    callbackTarget: TTarget,
    event: asleep
  ): Subscription = js.native
  @JSName("subscribe")
  def subscribe_awake[TTarget](callback: SubscriptionCallback[T, TTarget], callbackTarget: TTarget, event: awake): Subscription = js.native
  @JSName("subscribe")
  def subscribe_beforeChange[TTarget](callback: SubscriptionCallback[T, TTarget], callbackTarget: TTarget, event: beforeChange): Subscription = js.native
  @JSName("subscribe")
  def subscribe_change[TTarget](callback: SubscriptionCallback[T, TTarget], callbackTarget: TTarget, event: change): Subscription = js.native
  @JSName("subscribe")
  def subscribe_change[TTarget](
    callback: SubscriptionCallback[T, TTarget],
    callbackTarget: js.UndefOr[scala.Nothing],
    event: change
  ): Subscription = js.native
  @JSName("subscribe")
  def subscribe_spectate[TTarget](callback: SubscriptionCallback[T, TTarget], callbackTarget: TTarget, event: spectate): Subscription = js.native
}
