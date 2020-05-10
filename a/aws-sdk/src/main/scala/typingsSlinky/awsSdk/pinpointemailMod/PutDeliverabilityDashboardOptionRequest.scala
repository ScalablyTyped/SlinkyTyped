package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDeliverabilityDashboardOptionRequest extends js.Object {
  /**
    * Specifies whether to enable the Deliverability dashboard for your Amazon Pinpoint account. To enable the dashboard, set this value to true.
    */
  var DashboardEnabled: Enabled = js.native
  /**
    * An array of objects, one for each verified domain that you use to send email and enabled the Deliverability dashboard for.
    */
  var SubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.native
}

object PutDeliverabilityDashboardOptionRequest {
  @scala.inline
  def apply(DashboardEnabled: Enabled): PutDeliverabilityDashboardOptionRequest = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDeliverabilityDashboardOptionRequest]
  }
  @scala.inline
  implicit class PutDeliverabilityDashboardOptionRequestOps[Self <: PutDeliverabilityDashboardOptionRequest] (val x: Self) extends AnyVal {
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
    def withSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscribedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscribedDomains")(js.undefined)
        ret
    }
  }
  
}

