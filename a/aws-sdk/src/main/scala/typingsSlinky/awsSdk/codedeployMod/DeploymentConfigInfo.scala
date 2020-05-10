package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigInfo extends js.Object {
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * The time at which the deployment configuration was created.
    */
  var createTime: js.UndefOr[js.Date] = js.native
  /**
    * The deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.native
  /**
    * The deployment configuration name.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  /**
    * Information about the number or percentage of minimum healthy instance.
    */
  var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.native
  /**
    * The configuration that specifies how the deployment traffic is routed. Only deployments with a Lambda compute platform can specify this.
    */
  var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.native
}

object DeploymentConfigInfo {
  @scala.inline
  def apply(): DeploymentConfigInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigInfo]
  }
  @scala.inline
  implicit class DeploymentConfigInfoOps[Self <: DeploymentConfigInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputePlatform(value: ComputePlatform): Self = {
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
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentConfigId(value: DeploymentConfigId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentConfigName(value: DeploymentConfigName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigName")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumHealthyHosts(value: MinimumHealthyHosts): Self = {
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
    def withTrafficRoutingConfig(value: TrafficRoutingConfig): Self = {
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

