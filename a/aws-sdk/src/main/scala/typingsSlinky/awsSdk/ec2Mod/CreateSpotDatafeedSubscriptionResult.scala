package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSpotDatafeedSubscriptionResult extends js.Object {
  /**
    * The Spot Instance data feed subscription.
    */
  var SpotDatafeedSubscription: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.SpotDatafeedSubscription] = js.native
}

object CreateSpotDatafeedSubscriptionResult {
  @scala.inline
  def apply(): CreateSpotDatafeedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSpotDatafeedSubscriptionResult]
  }
  @scala.inline
  implicit class CreateSpotDatafeedSubscriptionResultOps[Self <: CreateSpotDatafeedSubscriptionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotDatafeedSubscription(value: SpotDatafeedSubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotDatafeedSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotDatafeedSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotDatafeedSubscription")(js.undefined)
        ret
    }
  }
  
}

