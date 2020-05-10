package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetErrorItem extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteFleetError] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.FleetId] = js.native
}

object DeleteFleetErrorItem {
  @scala.inline
  def apply(): DeleteFleetErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetErrorItem]
  }
  @scala.inline
  implicit class DeleteFleetErrorItemOps[Self <: DeleteFleetErrorItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: DeleteFleetError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.undefined)
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
  }
  
}

