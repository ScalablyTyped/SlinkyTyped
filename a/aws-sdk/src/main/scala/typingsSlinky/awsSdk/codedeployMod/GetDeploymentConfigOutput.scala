package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentConfigOutput extends js.Object {
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.native
}

object GetDeploymentConfigOutput {
  @scala.inline
  def apply(): GetDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentConfigOutput]
  }
  @scala.inline
  implicit class GetDeploymentConfigOutputOps[Self <: GetDeploymentConfigOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentConfigInfo(value: DeploymentConfigInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfigInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigInfo")(js.undefined)
        ret
    }
  }
  
}

