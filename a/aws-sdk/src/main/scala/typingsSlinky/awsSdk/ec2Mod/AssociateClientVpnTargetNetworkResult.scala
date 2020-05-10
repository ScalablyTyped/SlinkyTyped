package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateClientVpnTargetNetworkResult extends js.Object {
  /**
    * The unique ID of the target network association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.native
}

object AssociateClientVpnTargetNetworkResult {
  @scala.inline
  def apply(): AssociateClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateClientVpnTargetNetworkResult]
  }
  @scala.inline
  implicit class AssociateClientVpnTargetNetworkResultOps[Self <: AssociateClientVpnTargetNetworkResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AssociationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

