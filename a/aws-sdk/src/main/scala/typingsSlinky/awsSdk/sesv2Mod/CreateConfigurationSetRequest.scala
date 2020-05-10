package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetRequest extends js.Object {
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: typingsSlinky.awsSdk.sesv2Mod.ConfigurationSetName = js.native
  /**
    * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
    */
  var DeliveryOptions: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.DeliveryOptions] = js.native
  /**
    * An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
    */
  var ReputationOptions: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ReputationOptions] = js.native
  /**
    * An object that defines whether or not Amazon SES can send email that you send using the configuration set.
    */
  var SendingOptions: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.SendingOptions] = js.native
  var SuppressionOptions: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.SuppressionOptions] = js.native
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the configuration set.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * An object that defines the open and click tracking options for emails that you send using the configuration set.
    */
  var TrackingOptions: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.TrackingOptions] = js.native
}

object CreateConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
  @scala.inline
  implicit class CreateConfigurationSetRequestOps[Self <: CreateConfigurationSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationSetName(value: ConfigurationSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(value.asInstanceOf[js.Any])
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
    def withSendingOptions(value: SendingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressionOptions(value: SuppressionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuppressionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuppressionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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

