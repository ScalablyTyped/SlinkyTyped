package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotDatafeedSubscription extends js.Object {
  /**
    * The Amazon S3 bucket where the Spot Instance data feed is located.
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * The fault codes for the Spot Instance request, if any.
    */
  var Fault: js.UndefOr[SpotInstanceStateFault] = js.native
  /**
    * The AWS account ID of the account.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The prefix that is prepended to data feed files.
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * The state of the Spot Instance data feed subscription.
    */
  var State: js.UndefOr[DatafeedSubscriptionState] = js.native
}

object SpotDatafeedSubscription {
  @scala.inline
  def apply(): SpotDatafeedSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotDatafeedSubscription]
  }
  @scala.inline
  implicit class SpotDatafeedSubscriptionOps[Self <: SpotDatafeedSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withFault(value: SpotInstanceStateFault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fault")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: DatafeedSubscriptionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

