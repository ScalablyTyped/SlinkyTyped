package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetDeploymentsResponse extends js.Object {
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.native
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.native
}

object ResetDeploymentsResponse {
  @scala.inline
  def apply(): ResetDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDeploymentsResponse]
  }
  @scala.inline
  implicit class ResetDeploymentsResponseOps[Self <: ResetDeploymentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

