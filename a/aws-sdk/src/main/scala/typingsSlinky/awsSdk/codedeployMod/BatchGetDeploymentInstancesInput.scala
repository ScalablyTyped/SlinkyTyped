package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentInstancesInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
  /**
    * The unique IDs of instances used in the deployment. The maximum number of instance IDs you can specify is 25.
    */
  var instanceIds: InstancesList = js.native
}

object BatchGetDeploymentInstancesInput {
  @scala.inline
  def apply(deploymentId: DeploymentId, instanceIds: InstancesList): BatchGetDeploymentInstancesInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], instanceIds = instanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentInstancesInput]
  }
  @scala.inline
  implicit class BatchGetDeploymentInstancesInputOps[Self <: BatchGetDeploymentInstancesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentId(value: DeploymentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceIds(value: InstancesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

