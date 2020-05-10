package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSmartHomeApplianceDiscoveryRequest extends js.Object {
  /**
    * The room where smart home appliance discovery was initiated.
    */
  var RoomArn: Arn = js.native
}

object StartSmartHomeApplianceDiscoveryRequest {
  @scala.inline
  def apply(RoomArn: Arn): StartSmartHomeApplianceDiscoveryRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSmartHomeApplianceDiscoveryRequest]
  }
  @scala.inline
  implicit class StartSmartHomeApplianceDiscoveryRequestOps[Self <: StartSmartHomeApplianceDiscoveryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoomArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

