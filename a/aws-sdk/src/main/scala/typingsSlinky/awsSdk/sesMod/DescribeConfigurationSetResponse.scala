package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationSetResponse extends js.Object {
  /**
    * The configuration set object associated with the specified configuration set.
    */
  var ConfigurationSet: js.UndefOr[typingsSlinky.awsSdk.sesMod.ConfigurationSet] = js.native
  var DeliveryOptions: js.UndefOr[typingsSlinky.awsSdk.sesMod.DeliveryOptions] = js.native
  /**
    * A list of event destinations associated with the configuration set. 
    */
  var EventDestinations: js.UndefOr[typingsSlinky.awsSdk.sesMod.EventDestinations] = js.native
  /**
    * An object that represents the reputation settings for the configuration set. 
    */
  var ReputationOptions: js.UndefOr[typingsSlinky.awsSdk.sesMod.ReputationOptions] = js.native
  /**
    * The name of the custom open and click tracking domain associated with the configuration set.
    */
  var TrackingOptions: js.UndefOr[typingsSlinky.awsSdk.sesMod.TrackingOptions] = js.native
}

object DescribeConfigurationSetResponse {
  @scala.inline
  def apply(): DescribeConfigurationSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationSetResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationSetResponseOps[Self <: DescribeConfigurationSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationSet(value: ConfigurationSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSet")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryOptions(value: DeliveryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDestinations(value: EventDestinations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withReputationOptions(value: ReputationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReputationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReputationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReputationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingOptions(value: TrackingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackingOptions")(js.undefined)
        ret
    }
  }
  
}

