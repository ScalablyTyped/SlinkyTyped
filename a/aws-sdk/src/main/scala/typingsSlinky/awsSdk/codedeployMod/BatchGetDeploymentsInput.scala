package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentsInput extends js.Object {
  /**
    *  A list of deployment IDs, separated by spaces. The maximum number of deployment IDs you can specify is 25.
    */
  var deploymentIds: DeploymentsList = js.native
}

object BatchGetDeploymentsInput {
  @scala.inline
  def apply(deploymentIds: DeploymentsList): BatchGetDeploymentsInput = {
    val __obj = js.Dynamic.literal(deploymentIds = deploymentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentsInput]
  }
  @scala.inline
  implicit class BatchGetDeploymentsInputOps[Self <: BatchGetDeploymentsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentIds(value: DeploymentsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

