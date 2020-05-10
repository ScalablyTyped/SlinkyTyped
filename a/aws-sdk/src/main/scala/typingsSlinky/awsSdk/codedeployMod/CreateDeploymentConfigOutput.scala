package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentConfigOutput extends js.Object {
  /**
    * A unique deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.native
}

object CreateDeploymentConfigOutput {
  @scala.inline
  def apply(): CreateDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentConfigOutput]
  }
  @scala.inline
  implicit class CreateDeploymentConfigOutputOps[Self <: CreateDeploymentConfigOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

