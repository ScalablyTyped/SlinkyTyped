package typingsSlinky.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess extends js.Object {
  /**
    * The action to take on instances in the original environment after a successful blue/green deployment.
    * * `TERMINATE`: Instances are terminated after a specified wait time.
    * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.
    */
  var terminationWaitTimeInMinutes: js.UndefOr[Double] = js.native
}

object DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess {
  @scala.inline
  def apply(): DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess]
  }
  @scala.inline
  implicit class DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessOps[Self <: DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTerminationWaitTimeInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationWaitTimeInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationWaitTimeInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationWaitTimeInMinutes")(js.undefined)
        ret
    }
  }
  
}

