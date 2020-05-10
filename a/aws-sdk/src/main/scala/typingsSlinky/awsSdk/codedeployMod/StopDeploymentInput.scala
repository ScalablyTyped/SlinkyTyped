package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDeploymentInput extends js.Object {
  /**
    *  Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the previous version of the application revision. 
    */
  var autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
}

object StopDeploymentInput {
  @scala.inline
  def apply(deploymentId: DeploymentId): StopDeploymentInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDeploymentInput]
  }
  @scala.inline
  implicit class StopDeploymentInputOps[Self <: StopDeploymentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentId(value: DeploymentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRollbackEnabled(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRollbackEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRollbackEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRollbackEnabled")(js.undefined)
        ret
    }
  }
  
}

