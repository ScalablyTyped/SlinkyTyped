package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionDeferralInfo extends js.Object {
  /**
    * The desired next expiry time to assign to the subscription, in milliseconds since the Epoch. The given time must be later/greater than the current
    * expiry time for the subscription.
    */
  var desiredExpiryTimeMillis: js.UndefOr[String] = js.native
  /**
    * The expected expiry time for the subscription. If the current expiry time for the subscription is not the value specified here, the deferral will not
    * occur.
    */
  var expectedExpiryTimeMillis: js.UndefOr[String] = js.native
}

object SubscriptionDeferralInfo {
  @scala.inline
  def apply(): SubscriptionDeferralInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionDeferralInfo]
  }
  @scala.inline
  implicit class SubscriptionDeferralInfoOps[Self <: SubscriptionDeferralInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredExpiryTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredExpiryTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredExpiryTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredExpiryTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedExpiryTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedExpiryTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedExpiryTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedExpiryTimeMillis")(js.undefined)
        ret
    }
  }
  
}

