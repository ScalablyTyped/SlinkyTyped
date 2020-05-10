package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentGroupsInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  /**
    * The names of the deployment groups.
    */
  var deploymentGroupNames: DeploymentGroupsList = js.native
}

object BatchGetDeploymentGroupsInput {
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupNames: DeploymentGroupsList): BatchGetDeploymentGroupsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupNames = deploymentGroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentGroupsInput]
  }
  @scala.inline
  implicit class BatchGetDeploymentGroupsInputOps[Self <: BatchGetDeploymentGroupsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentGroupNames(value: DeploymentGroupsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

