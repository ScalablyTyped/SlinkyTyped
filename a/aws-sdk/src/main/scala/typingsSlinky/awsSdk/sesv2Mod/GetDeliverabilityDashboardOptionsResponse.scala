package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeliverabilityDashboardOptionsResponse extends js.Object {
  /**
    * The current status of your Deliverability dashboard subscription. If this value is PENDING_EXPIRATION, your subscription is scheduled to expire at the end of the current calendar month.
    */
  var AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus] = js.native
  /**
    * An array of objects, one for each verified domain that you use to send email and currently has an active Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
    */
  var ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.native
  /**
    * Specifies whether the Deliverability dashboard is enabled. If this value is true, the dashboard is enabled.
    */
  var DashboardEnabled: Enabled = js.native
  /**
    * An array of objects, one for each verified domain that you use to send email and currently has an active Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
    */
  var PendingExpirationSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.native
  /**
    * The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled to expire, if your subscription is scheduled to expire at the end of the current calendar month. This value is null if you have an active subscription that isn’t due to expire at the end of the month.
    */
  var SubscriptionExpiryDate: js.UndefOr[js.Date] = js.native
}

object GetDeliverabilityDashboardOptionsResponse {
  @scala.inline
  def apply(DashboardEnabled: Enabled): GetDeliverabilityDashboardOptionsResponse = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityDashboardOptionsResponse]
  }
  @scala.inline
  implicit class GetDeliverabilityDashboardOptionsResponseOps[Self <: GetDeliverabilityDashboardOptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashboardEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountStatus(value: DeliverabilityDashboardAccountStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveSubscribedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveSubscribedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveSubscribedDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingExpirationSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingExpirationSubscribedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingExpirationSubscribedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingExpirationSubscribedDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionExpiryDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionExpiryDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionExpiryDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionExpiryDate")(js.undefined)
        ret
    }
  }
  
}

