package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetSuccessItem extends js.Object {
  /**
    * The current state of the EC2 Fleet.
    */
  var CurrentFleetState: js.UndefOr[FleetStateCode] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.FleetId] = js.native
  /**
    * The previous state of the EC2 Fleet.
    */
  var PreviousFleetState: js.UndefOr[FleetStateCode] = js.native
}

object DeleteFleetSuccessItem {
  @scala.inline
  def apply(): DeleteFleetSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetSuccessItem]
  }
  @scala.inline
  implicit class DeleteFleetSuccessItemOps[Self <: DeleteFleetSuccessItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentFleetState(value: FleetStateCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentFleetState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentFleetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentFleetState")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousFleetState(value: FleetStateCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousFleetState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousFleetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousFleetState")(js.undefined)
        ret
    }
  }
  
}

