package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyPendingMaintenanceActionMessage extends js.Object {
  /**
    * The pending maintenance action to apply to this resource.
    */
  var ApplyAction: String = js.native
  /**
    * A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in request of type immediate. Valid values:    immediate - Apply the maintenance action immediately.    next-maintenance - Apply the maintenance action during the next maintenance window for the resource.    undo-opt-in - Cancel any existing next-maintenance opt-in requests.  
    */
  var OptInType: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
    */
  var ReplicationInstanceArn: String = js.native
}

object ApplyPendingMaintenanceActionMessage {
  @scala.inline
  def apply(ApplyAction: String, OptInType: String, ReplicationInstanceArn: String): ApplyPendingMaintenanceActionMessage = {
    val __obj = js.Dynamic.literal(ApplyAction = ApplyAction.asInstanceOf[js.Any], OptInType = OptInType.asInstanceOf[js.Any], ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
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
    def withReplicationInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

