package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.braintreeStrings.subscription_canceled
  - typingsSlinky.braintree.braintreeStrings.subscription_charged_successfully
  - typingsSlinky.braintree.braintreeStrings.subscription_charged_unsuccessfully
  - typingsSlinky.braintree.braintreeStrings.subscription_expired
  - typingsSlinky.braintree.braintreeStrings.subscription_trial_ended
  - typingsSlinky.braintree.braintreeStrings.subscription_went_active
  - typingsSlinky.braintree.braintreeStrings.subscription_went_past_due
*/
trait SubscriptionNotificationKind extends _WebhookNotificationKind

object SubscriptionNotificationKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def subscription_canceled: typingsSlinky.braintree.braintreeStrings.subscription_canceled = this.cast("subscription_canceled")
  @scala.inline
  def subscription_charged_successfully: typingsSlinky.braintree.braintreeStrings.subscription_charged_successfully = this.cast("subscription_charged_successfully")
  @scala.inline
  def subscription_charged_unsuccessfully: typingsSlinky.braintree.braintreeStrings.subscription_charged_unsuccessfully = this.cast("subscription_charged_unsuccessfully")
  @scala.inline
  def subscription_expired: typingsSlinky.braintree.braintreeStrings.subscription_expired = this.cast("subscription_expired")
  @scala.inline
  def subscription_trial_ended: typingsSlinky.braintree.braintreeStrings.subscription_trial_ended = this.cast("subscription_trial_ended")
  @scala.inline
  def subscription_went_active: typingsSlinky.braintree.braintreeStrings.subscription_went_active = this.cast("subscription_went_active")
  @scala.inline
  def subscription_went_past_due: typingsSlinky.braintree.braintreeStrings.subscription_went_past_due = this.cast("subscription_went_past_due")
}

