package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeAttendedTransfer extends Event {
  var destination_application: String = js.native
  var destination_bridge: String = js.native
  var destination_link_first_leg: Channel = js.native
  var destination_link_second_leg: Channel = js.native
  var destination_threeway_bridge: Bridge = js.native
  var destination_threeway_channel: Channel = js.native
  var destination_type: String = js.native
  var is_external: Boolean = js.native
  var replace_channel: js.UndefOr[Channel] = js.native
  var result: String = js.native
  var transfer_target: js.UndefOr[Channel] = js.native
  var transferee: js.UndefOr[Channel] = js.native
  /* Properties */
  var transferer_first_leg: Channel = js.native
  var transferer_first_leg_bridge: Bridge = js.native
  var transferer_second_leg: Channel = js.native
  var transferer_second_leg_bridge: Bridge = js.native
}

object BridgeAttendedTransfer {
  @scala.inline
  def apply(
    application: String,
    destination_application: String,
    destination_bridge: String,
    destination_link_first_leg: Channel,
    destination_link_second_leg: Channel,
    destination_threeway_bridge: Bridge,
    destination_threeway_channel: Channel,
    destination_type: String,
    is_external: Boolean,
    result: String,
    timestamp: js.Date,
    transferer_first_leg: Channel,
    transferer_first_leg_bridge: Bridge,
    transferer_second_leg: Channel,
    transferer_second_leg_bridge: Bridge,
    `type`: String
  ): BridgeAttendedTransfer = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], destination_application = destination_application.asInstanceOf[js.Any], destination_bridge = destination_bridge.asInstanceOf[js.Any], destination_link_first_leg = destination_link_first_leg.asInstanceOf[js.Any], destination_link_second_leg = destination_link_second_leg.asInstanceOf[js.Any], destination_threeway_bridge = destination_threeway_bridge.asInstanceOf[js.Any], destination_threeway_channel = destination_threeway_channel.asInstanceOf[js.Any], destination_type = destination_type.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transferer_first_leg = transferer_first_leg.asInstanceOf[js.Any], transferer_first_leg_bridge = transferer_first_leg_bridge.asInstanceOf[js.Any], transferer_second_leg = transferer_second_leg.asInstanceOf[js.Any], transferer_second_leg_bridge = transferer_second_leg_bridge.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeAttendedTransfer]
  }
  @scala.inline
  implicit class BridgeAttendedTransferOps[Self <: BridgeAttendedTransfer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination_application(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination_bridge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_bridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination_link_first_leg(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_link_first_leg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination_link_second_leg(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_link_second_leg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination_threeway_bridge(value: Bridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_threeway_bridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination_threeway_channel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_threeway_channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_external(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferer_first_leg(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferer_first_leg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferer_first_leg_bridge(value: Bridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferer_first_leg_bridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferer_second_leg(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferer_second_leg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferer_second_leg_bridge(value: Bridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferer_second_leg_bridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplace_channel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace_channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace_channel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace_channel")(js.undefined)
        ret
    }
    @scala.inline
    def withTransfer_target(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer_target: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_target")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferee(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferee")(js.undefined)
        ret
    }
  }
  
}

