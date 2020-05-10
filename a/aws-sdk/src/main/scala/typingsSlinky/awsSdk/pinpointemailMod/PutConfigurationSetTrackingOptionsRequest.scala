package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationSetTrackingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to add a custom tracking domain to.
    */
  var ConfigurationSetName: typingsSlinky.awsSdk.pinpointemailMod.ConfigurationSetName = js.native
  /**
    * The domain that you want to use to track open and click events.
    */
  var CustomRedirectDomain: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.CustomRedirectDomain] = js.native
}

object PutConfigurationSetTrackingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetTrackingOptionsRequest]
  }
  @scala.inline
  implicit class PutConfigurationSetTrackingOptionsRequestOps[Self <: PutConfigurationSetTrackingOptionsRequest] (val x: Self) extends AnyVal {
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
    def withCustomRedirectDomain(value: CustomRedirectDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomRedirectDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRedirectDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomRedirectDomain")(js.undefined)
        ret
    }
  }
  
}

