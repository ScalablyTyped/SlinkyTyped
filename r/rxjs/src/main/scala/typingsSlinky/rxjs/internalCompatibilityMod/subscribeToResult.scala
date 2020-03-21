package typingsSlinky.rxjs.internalCompatibilityMod

import typingsSlinky.rxjs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToResult")
@js.native
object subscribeToResult extends js.Object {
  def apply[T, R](outerSubscriber: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R], result: js.Any): js.UndefOr[Subscription] = js.native
  def apply[T, R](
    outerSubscriber: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T
  ): js.UndefOr[Subscription] = js.native
  def apply[T, R](
    outerSubscriber: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T,
    outerIndex: Double
  ): js.UndefOr[Subscription] = js.native
  def apply[T, R](
    outerSubscriber: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: js.UndefOr[scala.Nothing],
    outerIndex: js.UndefOr[scala.Nothing],
    innerSubscriber: typingsSlinky.rxjs.innerSubscriberMod.InnerSubscriber[T, R]
  ): js.UndefOr[Subscription] = js.native
}

