package typingsSlinky.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption extends js.Object {
  /**
    * The action to take on instances in the original environment after a successful blue/green deployment.
    * * `TERMINATE`: Instances are terminated after a specified wait time.
    * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
    */
  var action: js.UndefOr[String] = js.native
}

object DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption {
  @scala.inline
  def apply(): DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption]
  }
  @scala.inline
  implicit class DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionOps[Self <: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
  }
  
}

