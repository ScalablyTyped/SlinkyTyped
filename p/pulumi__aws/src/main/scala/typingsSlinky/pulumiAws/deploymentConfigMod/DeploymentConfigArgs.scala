package typingsSlinky.pulumiAws.deploymentConfigMod

import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigArgs extends js.Object {
  /**
    * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
    */
  val computePlatform: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the deployment config.
    */
  val deploymentConfigName: Input[String] = js.native
  /**
    * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
    */
  val minimumHealthyHosts: js.UndefOr[Input[DeploymentConfigMinimumHealthyHosts]] = js.native
  /**
    * A trafficRoutingConfig block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfig]] = js.native
}

object DeploymentConfigArgs {
  @scala.inline
  def apply(deploymentConfigName: Input[String]): DeploymentConfigArgs = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigArgs]
  }
  @scala.inline
  implicit class DeploymentConfigArgsOps[Self <: DeploymentConfigArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentConfigName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputePlatform(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputePlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumHealthyHosts(value: Input[DeploymentConfigMinimumHealthyHosts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumHealthyHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumHealthyHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumHealthyHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficRoutingConfig(value: Input[DeploymentConfigTrafficRoutingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficRoutingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficRoutingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficRoutingConfig")(js.undefined)
        ret
    }
  }
  
}

