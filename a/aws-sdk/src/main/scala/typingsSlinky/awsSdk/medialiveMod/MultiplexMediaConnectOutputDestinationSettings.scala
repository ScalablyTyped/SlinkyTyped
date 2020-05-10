package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexMediaConnectOutputDestinationSettings extends js.Object {
  /**
    * The MediaConnect entitlement ARN available as a Flow source.
    */
  var EntitlementArn: js.UndefOr[stringMin1] = js.native
}

object MultiplexMediaConnectOutputDestinationSettings {
  @scala.inline
  def apply(): MultiplexMediaConnectOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexMediaConnectOutputDestinationSettings]
  }
  @scala.inline
  implicit class MultiplexMediaConnectOutputDestinationSettingsOps[Self <: MultiplexMediaConnectOutputDestinationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitlementArn(value: stringMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitlementArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlementArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitlementArn")(js.undefined)
        ret
    }
  }
  
}

