package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentGroupOutput extends js.Object {
  /**
    * Information about the deployment group.
    */
  var deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo] = js.native
}

object GetDeploymentGroupOutput {
  @scala.inline
  def apply(): GetDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentGroupOutput]
  }
  @scala.inline
  implicit class GetDeploymentGroupOutputOps[Self <: GetDeploymentGroupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentGroupInfo(value: DeploymentGroupInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentGroupInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupInfo")(js.undefined)
        ret
    }
  }
  
}

