package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalOuterSubscriberMod.OuterSubscriber
import typingsSlinky.rxjs.internalSubscriberMod.Subscriber
import typingsSlinky.rxjs.internalSubscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeToResult", JSImport.Namespace)
@js.native
object internalUtilSubscribeToResultMod extends js.Object {
  def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any): Subscription = js.native
  def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any, outerValue: T): Subscription = js.native
  def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any, outerValue: T, outerIndex: Double): Subscription = js.native
  def subscribeToResult[T, R](
    outerSubscriber: OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T,
    outerIndex: Double,
    destination: Subscriber[_]
  ): Subscription = js.native
}

