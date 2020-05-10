package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationExecution extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * The time the execution started.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * Detailed status information about the execution.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The execution ID for the association.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.native
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.native
  /**
    * An aggregate status of the resources in the execution based on the status type.
    */
  var ResourceCountByStatus: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ResourceCountByStatus] = js.native
  /**
    * The status of the association execution.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object AssociationExecution {
  @scala.inline
  def apply(): AssociationExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationExecution]
  }
  @scala.inline
  implicit class AssociationExecutionOps[Self <: AssociationExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: AssociationId): Self = {
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
    def withAssociationVersion(value: AssociationVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailedStatus(value: StatusName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailedStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailedStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionId(value: AssociationExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastExecutionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastExecutionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastExecutionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastExecutionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceCountByStatus(value: ResourceCountByStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceCountByStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceCountByStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceCountByStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StatusName): Self = {
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

