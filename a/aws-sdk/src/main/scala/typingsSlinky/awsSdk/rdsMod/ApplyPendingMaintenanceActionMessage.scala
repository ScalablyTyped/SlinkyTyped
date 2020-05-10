package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyPendingMaintenanceActionMessage extends js.Object {
  /**
    * The pending maintenance action to apply to this resource. Valid values: system-update, db-upgrade, hardware-maintenance, ca-certificate-rotation 
    */
  var ApplyAction: String = js.native
  /**
    * A value that specifies the type of opt-in request, or undoes an opt-in request. An opt-in request of type immediate can't be undone. Valid values:    immediate - Apply the maintenance action immediately.    next-maintenance - Apply the maintenance action during the next maintenance window for the resource.    undo-opt-in - Cancel any existing next-maintenance opt-in requests.  
    */
  var OptInType: String = js.native
  /**
    * The RDS Amazon Resource Name (ARN) of the resource that the pending maintenance action applies to. For information about creating an ARN, see  Constructing an RDS Amazon Resource Name (ARN).
    */
  var ResourceIdentifier: String = js.native
}

object ApplyPendingMaintenanceActionMessage {
  @scala.inline
  def apply(ApplyAction: String, OptInType: String, ResourceIdentifier: String): ApplyPendingMaintenanceActionMessage = {
    val __obj = js.Dynamic.literal(ApplyAction = ApplyAction.asInstanceOf[js.Any], OptInType = OptInType.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPendingMaintenanceActionMessage]
  }
  @scala.inline
  implicit class ApplyPendingMaintenanceActionMessageOps[Self <: ApplyPendingMaintenanceActionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptInType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptInType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

