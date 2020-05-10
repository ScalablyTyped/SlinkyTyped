package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationExecutionTarget extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * Detailed information about the execution status.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.native
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.native
  /**
    * The location where the association details are saved.
    */
  var OutputSource: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OutputSource] = js.native
  /**
    * The resource ID, for example, the instance ID where the association ran.
    */
  var ResourceId: js.UndefOr[AssociationResourceId] = js.native
  /**
    * The resource type, for example, instance.
    */
  var ResourceType: js.UndefOr[AssociationResourceType] = js.native
  /**
    * The association execution status.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object AssociationExecutionTarget {
  @scala.inline
  def apply(): AssociationExecutionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationExecutionTarget]
  }
  @scala.inline
  implicit class AssociationExecutionTargetOps[Self <: AssociationExecutionTarget] (val x: Self) extends AnyVal {
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
    def withOutputSource(value: OutputSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSource")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: AssociationResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: AssociationResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
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

