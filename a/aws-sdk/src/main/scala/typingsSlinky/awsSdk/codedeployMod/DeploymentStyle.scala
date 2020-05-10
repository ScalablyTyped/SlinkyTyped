package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentStyle extends js.Object {
  /**
    * Indicates whether to route deployment traffic behind a load balancer.
    */
  var deploymentOption: js.UndefOr[DeploymentOption] = js.native
  /**
    * Indicates whether to run an in-place deployment or a blue/green deployment.
    */
  var deploymentType: js.UndefOr[DeploymentType] = js.native
}

object DeploymentStyle {
  @scala.inline
  def apply(): DeploymentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStyle]
  }
  @scala.inline
  implicit class DeploymentStyleOps[Self <: DeploymentStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentOption(value: DeploymentOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentOption")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentType(value: DeploymentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentType")(js.undefined)
        ret
    }
  }
  
}

