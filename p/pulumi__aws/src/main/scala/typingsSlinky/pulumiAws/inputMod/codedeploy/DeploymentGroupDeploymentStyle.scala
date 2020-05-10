package typingsSlinky.pulumiAws.inputMod.codedeploy

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupDeploymentStyle extends js.Object {
  /**
    * Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`. Default is `WITHOUT_TRAFFIC_CONTROL`.
    */
  var deploymentOption: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`. Default is `IN_PLACE`.
    */
  var deploymentType: js.UndefOr[Input[String]] = js.native
}

object DeploymentGroupDeploymentStyle {
  @scala.inline
  def apply(): DeploymentGroupDeploymentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupDeploymentStyle]
  }
  @scala.inline
  implicit class DeploymentGroupDeploymentStyleOps[Self <: DeploymentGroupDeploymentStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentOption(value: Input[String]): Self = {
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
    def withDeploymentType(value: Input[String]): Self = {
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

