package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetsResult extends js.Object {
  /**
    * Information about the EC2 Fleets that are successfully deleted.
    */
  var SuccessfulFleetDeletions: js.UndefOr[DeleteFleetSuccessSet] = js.native
  /**
    * Information about the EC2 Fleets that are not successfully deleted.
    */
  var UnsuccessfulFleetDeletions: js.UndefOr[DeleteFleetErrorSet] = js.native
}

object DeleteFleetsResult {
  @scala.inline
  def apply(): DeleteFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetsResult]
  }
  @scala.inline
  implicit class DeleteFleetsResultOps[Self <: DeleteFleetsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccessfulFleetDeletions(value: DeleteFleetSuccessSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulFleetDeletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulFleetDeletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulFleetDeletions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsuccessfulFleetDeletions(value: DeleteFleetErrorSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsuccessfulFleetDeletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsuccessfulFleetDeletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsuccessfulFleetDeletions")(js.undefined)
        ret
    }
  }
  
}

