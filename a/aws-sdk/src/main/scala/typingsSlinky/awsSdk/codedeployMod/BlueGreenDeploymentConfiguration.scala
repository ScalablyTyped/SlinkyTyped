package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlueGreenDeploymentConfiguration extends js.Object {
  /**
    * Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment.
    */
  var deploymentReadyOption: js.UndefOr[DeploymentReadyOption] = js.native
  /**
    * Information about how instances are provisioned for a replacement environment in a blue/green deployment.
    */
  var greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption] = js.native
  /**
    * Information about whether to terminate instances in the original fleet during a blue/green deployment.
    */
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption] = js.native
}

object BlueGreenDeploymentConfiguration {
  @scala.inline
  def apply(): BlueGreenDeploymentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueGreenDeploymentConfiguration]
  }
  @scala.inline
  implicit class BlueGreenDeploymentConfigurationOps[Self <: BlueGreenDeploymentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentReadyOption(value: DeploymentReadyOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentReadyOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentReadyOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentReadyOption")(js.undefined)
        ret
    }
    @scala.inline
    def withGreenFleetProvisioningOption(value: GreenFleetProvisioningOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenFleetProvisioningOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreenFleetProvisioningOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenFleetProvisioningOption")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateBlueInstancesOnDeploymentSuccess(value: BlueInstanceTerminationOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateBlueInstancesOnDeploymentSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateBlueInstancesOnDeploymentSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateBlueInstancesOnDeploymentSuccess")(js.undefined)
        ret
    }
  }
  
}

