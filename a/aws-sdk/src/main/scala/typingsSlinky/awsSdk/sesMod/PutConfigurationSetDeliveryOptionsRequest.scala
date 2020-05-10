package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to specify the delivery options for.
    */
  var ConfigurationSetName: typingsSlinky.awsSdk.sesMod.ConfigurationSetName = js.native
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
    */
  var DeliveryOptions: js.UndefOr[typingsSlinky.awsSdk.sesMod.DeliveryOptions] = js.native
}

object PutConfigurationSetDeliveryOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetDeliveryOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
  }
  @scala.inline
  implicit class PutConfigurationSetDeliveryOptionsRequestOps[Self <: PutConfigurationSetDeliveryOptionsRequest] (val x: Self) extends AnyVal {
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
  }
  
}

