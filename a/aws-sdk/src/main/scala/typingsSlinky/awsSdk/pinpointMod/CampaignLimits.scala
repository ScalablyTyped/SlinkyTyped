package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignLimits extends js.Object {
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The maximum value is 100.
    */
  var Daily: js.UndefOr[integer] = js.native
  /**
    * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled start time for the campaign. The minimum value is 60 seconds.
    */
  var MaximumDuration: js.UndefOr[integer] = js.native
  /**
    * The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum value is 20,000.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.native
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign. The maximum value is 100.
    */
  var Total: js.UndefOr[integer] = js.native
}

object CampaignLimits {
  @scala.inline
  def apply(): CampaignLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignLimits]
  }
  @scala.inline
  implicit class CampaignLimitsOps[Self <: CampaignLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaily(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Daily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Daily")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumDuration(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesPerSecond(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessagesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessagesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(js.undefined)
        ret
    }
  }
  
}

