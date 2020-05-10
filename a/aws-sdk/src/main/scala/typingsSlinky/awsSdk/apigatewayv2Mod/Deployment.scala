package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * Specifies whether a deployment was automatically released.
    */
  var AutoDeployed: js.UndefOr[boolean] = js.native
  /**
    * The date and time when the Deployment resource was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The identifier for the deployment.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  /**
    * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
    */
  var DeploymentStatus: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.DeploymentStatus] = js.native
  /**
    * May contain additional feedback on the status of an API deployment.
    */
  var DeploymentStatusMessage: js.UndefOr[string] = js.native
  /**
    * The description for the deployment.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
}

object Deployment {
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDeployed(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeployed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDeployed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeployed")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentId(value: Id): Self = {
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
    def withDeploymentStatus(value: DeploymentStatus): Self = {
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
    def withDeploymentStatusMessage(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: StringWithLengthBetween0And1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

