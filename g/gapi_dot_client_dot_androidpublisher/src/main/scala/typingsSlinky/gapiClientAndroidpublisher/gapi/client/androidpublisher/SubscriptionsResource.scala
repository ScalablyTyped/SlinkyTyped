package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonSubscriptionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsResource extends js.Object {
  /** Cancels a user's subscription purchase. The subscription remains valid until its expiration time. */
  def cancel(request: AnonSubscriptionId): Request_[Unit] = js.native
  /** Defers a user's subscription purchase until a specified future expiration time. */
  def defer(request: AnonSubscriptionId): Request_[SubscriptionPurchasesDeferResponse] = js.native
  /** Checks whether a user's subscription purchase is valid and returns its expiry time. */
  def get(request: AnonSubscriptionId): Request_[SubscriptionPurchase] = js.native
  /** Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur. */
  def refund(request: AnonSubscriptionId): Request_[Unit] = js.native
  /** Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring. */
  def revoke(request: AnonSubscriptionId): Request_[Unit] = js.native
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    cancel: AnonSubscriptionId => Request_[Unit],
    defer: AnonSubscriptionId => Request_[SubscriptionPurchasesDeferResponse],
    get: AnonSubscriptionId => Request_[SubscriptionPurchase],
    refund: AnonSubscriptionId => Request_[Unit],
    revoke: AnonSubscriptionId => Request_[Unit]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), defer = js.Any.fromFunction1(defer), get = js.Any.fromFunction1(get), refund = js.Any.fromFunction1(refund), revoke = js.Any.fromFunction1(revoke))
    __obj.asInstanceOf[SubscriptionsResource]
  }
  @scala.inline
  implicit class SubscriptionsResourceOps[Self <: SubscriptionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: AnonSubscriptionId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefer(value: AnonSubscriptionId => Request_[SubscriptionPurchasesDeferResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonSubscriptionId => Request_[SubscriptionPurchase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefund(value: AnonSubscriptionId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevoke(value: AnonSubscriptionId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoke")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

