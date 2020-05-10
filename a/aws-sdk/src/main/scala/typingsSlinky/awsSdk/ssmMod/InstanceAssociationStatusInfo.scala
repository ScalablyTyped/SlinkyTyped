package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAssociationStatusInfo extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The name of the association applied to the instance.
    */
  var AssociationName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationName] = js.native
  /**
    * The version of the association applied to the instance.
    */
  var AssociationVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * Detailed status information about the instance association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The association document versions.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * An error code returned by the request to create the association.
    */
  var ErrorCode: js.UndefOr[AgentErrorCode] = js.native
  /**
    * The date the instance association ran. 
    */
  var ExecutionDate: js.UndefOr[js.Date] = js.native
  /**
    * Summary information about association execution.
    */
  var ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.native
  /**
    * The instance ID where the association was created.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * The name of the association.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  /**
    * A URL for an Amazon S3 bucket where you want to store the results of this request.
    */
  var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.native
  /**
    * Status information about the instance association.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object InstanceAssociationStatusInfo {
  @scala.inline
  def apply(): InstanceAssociationStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationStatusInfo]
  }
  @scala.inline
  implicit class InstanceAssociationStatusInfoOps[Self <: InstanceAssociationStatusInfo] (val x: Self) extends AnyVal {
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
    def withAssociationName(value: AssociationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationName")(js.undefined)
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
    def withDocumentVersion(value: DocumentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: AgentErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionSummary(value: InstanceAssociationExecutionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: DocumentARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputUrl(value: InstanceAssociationOutputUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUrl")(js.undefined)
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

