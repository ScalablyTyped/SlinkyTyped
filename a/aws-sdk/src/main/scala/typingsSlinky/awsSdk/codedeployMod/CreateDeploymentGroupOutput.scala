package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentGroupOutput extends js.Object {
  /**
    * A unique deployment group ID.
    */
  var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.native
}

object CreateDeploymentGroupOutput {
  @scala.inline
  def apply(): CreateDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentGroupOutput]
  }
  @scala.inline
  implicit class CreateDeploymentGroupOutputOps[Self <: CreateDeploymentGroupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentGroupId(value: DeploymentGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupId")(js.undefined)
        ret
    }
  }
  
}

