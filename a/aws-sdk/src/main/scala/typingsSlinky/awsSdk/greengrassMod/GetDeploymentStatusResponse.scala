package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentStatusResponse extends js.Object {
  /**
    * The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
    */
  var DeploymentStatus: js.UndefOr[string] = js.native
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.DeploymentType] = js.native
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.ErrorDetails] = js.native
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment status was updated.
    */
  var UpdatedAt: js.UndefOr[string] = js.native
}

object GetDeploymentStatusResponse {
  @scala.inline
  def apply(): GetDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentStatusResponse]
  }
  @scala.inline
  implicit class GetDeploymentStatusResponseOps[Self <: GetDeploymentStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUpdatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(js.undefined)
        ret
    }
  }
  
}

