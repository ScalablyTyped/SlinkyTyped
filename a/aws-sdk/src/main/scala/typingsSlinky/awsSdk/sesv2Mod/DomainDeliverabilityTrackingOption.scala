package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDeliverabilityTrackingOption extends js.Object {
  /**
    * A verified domain that’s associated with your AWS account and currently has an active Deliverability dashboard subscription.
    */
  var Domain: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.Domain] = js.native
  /**
    * An object that contains information about the inbox placement data settings for the domain.
    */
  var InboxPlacementTrackingOption: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.InboxPlacementTrackingOption] = js.native
  /**
    * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
    */
  var SubscriptionStartDate: js.UndefOr[js.Date] = js.native
}

object DomainDeliverabilityTrackingOption {
  @scala.inline
  def apply(): DomainDeliverabilityTrackingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDeliverabilityTrackingOption]
  }
  @scala.inline
  implicit class DomainDeliverabilityTrackingOptionOps[Self <: DomainDeliverabilityTrackingOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: Domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(js.undefined)
        ret
    }
    @scala.inline
    def withInboxPlacementTrackingOption(value: InboxPlacementTrackingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboxPlacementTrackingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboxPlacementTrackingOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboxPlacementTrackingOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionStartDate")(js.undefined)
        ret
    }
  }
  
}

