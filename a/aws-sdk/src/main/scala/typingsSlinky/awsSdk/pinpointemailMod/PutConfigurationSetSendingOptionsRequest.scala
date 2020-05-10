package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationSetSendingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to enable or disable email sending for.
    */
  var ConfigurationSetName: typingsSlinky.awsSdk.pinpointemailMod.ConfigurationSetName = js.native
  /**
    * If true, email sending is enabled for the configuration set. If false, email sending is disabled for the configuration set.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}

object PutConfigurationSetSendingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetSendingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetSendingOptionsRequest]
  }
  @scala.inline
  implicit class PutConfigurationSetSendingOptionsRequestOps[Self <: PutConfigurationSetSendingOptionsRequest] (val x: Self) extends AnyVal {
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
    def withSendingEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingEnabled")(js.undefined)
        ret
    }
  }
  
}

