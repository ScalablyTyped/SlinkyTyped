package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetPortSettingsInput extends js.Object {
  /**
    * A unique identifier for a fleet to update port settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: typingsSlinky.awsSdk.gameliftMod.FleetId = js.native
  /**
    * A collection of port settings to be added to the fleet record.
    */
  var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList] = js.native
  /**
    * A collection of port settings to be removed from the fleet record.
    */
  var InboundPermissionRevocations: js.UndefOr[IpPermissionsList] = js.native
}

object UpdateFleetPortSettingsInput {
  @scala.inline
  def apply(FleetId: FleetId): UpdateFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetPortSettingsInput]
  }
  @scala.inline
  implicit class UpdateFleetPortSettingsInputOps[Self <: UpdateFleetPortSettingsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundPermissionAuthorizations(value: IpPermissionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundPermissionAuthorizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundPermissionAuthorizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundPermissionAuthorizations")(js.undefined)
        ret
    }
    @scala.inline
    def withInboundPermissionRevocations(value: IpPermissionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundPermissionRevocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundPermissionRevocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundPermissionRevocations")(js.undefined)
        ret
    }
  }
  
}

