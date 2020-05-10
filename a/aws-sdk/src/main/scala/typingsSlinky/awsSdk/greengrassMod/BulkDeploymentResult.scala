package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkDeploymentResult extends js.Object {
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  /**
    * The ARN of the group deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.native
  /**
    * The ID of the group deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.native
  /**
    * The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
    */
  var DeploymentStatus: js.UndefOr[string] = js.native
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.DeploymentType] = js.native
  /**
    * Details about the error.
    */
  var ErrorDetails: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.ErrorDetails] = js.native
  /**
    * The error message for a failed deployment
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  /**
    * The ARN of the Greengrass group.
    */
  var GroupArn: js.UndefOr[string] = js.native
}

object BulkDeploymentResult {
  @scala.inline
  def apply(): BulkDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkDeploymentResult]
  }
  @scala.inline
  implicit class BulkDeploymentResultOps[Self <: BulkDeploymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentStatus(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentType(value: DeploymentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentType")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorDetails(value: ErrorDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupArn")(js.undefined)
        ret
    }
  }
  
}

