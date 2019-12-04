package typingsSlinky.rxjs.internalDashCompatibilityMod

import typingsSlinky.rxjs.internalSubscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToResult")
@js.native
object subscribeToResult extends js.Object {
  def apply[T, R](
    outerSubscriber: typingsSlinky.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any
  ): Subscription = js.native
  def apply[T, R](
    outerSubscriber: typingsSlinky.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T
  ): Subscription = js.native
  def apply[T, R](
    outerSubscriber: typingsSlinky.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T,
    outerIndex: Double
  ): Subscription = js.native
  def apply[T, R](
    outerSubscriber: typingsSlinky.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T,
    outerIndex: Double,
    destination: typingsSlinky.rxjs.internalSubscriberMod.Subscriber[_]
  ): Subscription = js.native
}

