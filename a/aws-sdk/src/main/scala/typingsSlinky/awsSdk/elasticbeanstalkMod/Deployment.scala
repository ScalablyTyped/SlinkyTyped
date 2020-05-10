package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * The ID of the deployment. This number increases by one each time that you deploy source code or change instance configuration settings.
    */
  var DeploymentId: js.UndefOr[NullableLong] = js.native
  /**
    * For in-progress deployments, the time that the deployment started. For completed deployments, the time that the deployment ended.
    */
  var DeploymentTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the deployment:    In Progress : The deployment is in progress.    Deployed : The deployment succeeded.    Failed : The deployment failed.  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The version label of the application version in the deployment.
    */
  var VersionLabel: js.UndefOr[String] = js.native
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
    def withDeploymentId(value: NullableLong): Self = {
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
    def withDeploymentTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
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
    @scala.inline
    def withVersionLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(js.undefined)
        ret
    }
  }
  
}

