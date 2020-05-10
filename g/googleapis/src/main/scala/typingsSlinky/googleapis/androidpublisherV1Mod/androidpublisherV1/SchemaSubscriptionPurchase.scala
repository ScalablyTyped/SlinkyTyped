package typingsSlinky.googleapis.androidpublisherV1Mod.androidpublisherV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SubscriptionPurchase resource indicates the status of a user&#39;s
  * subscription purchase.
  */
@js.native
trait SchemaSubscriptionPurchase extends js.Object {
  /**
    * Whether the subscription will automatically be renewed when it reaches
    * its current expiry time.
    */
  var autoRenewing: js.UndefOr[Boolean] = js.native
  /**
    * Time at which the subscription was granted, in milliseconds since the
    * Epoch.
    */
  var initiationTimestampMsec: js.UndefOr[String] = js.native
  /**
    * This kind represents a subscriptionPurchase object in the
    * androidpublisher service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Time at which the subscription will expire, in milliseconds since the
    * Epoch.
    */
  var validUntilTimestampMsec: js.UndefOr[String] = js.native
}

object SchemaSubscriptionPurchase {
  @scala.inline
  def apply(): SchemaSubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchase]
  }
  @scala.inline
  implicit class SchemaSubscriptionPurchaseOps[Self <: SchemaSubscriptionPurchase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRenewing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRenewing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRenewing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRenewing")(js.undefined)
        ret
    }
    @scala.inline
    def withInitiationTimestampMsec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiationTimestampMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiationTimestampMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiationTimestampMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUntilTimestampMsec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntilTimestampMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUntilTimestampMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntilTimestampMsec")(js.undefined)
        ret
    }
  }
  
}

