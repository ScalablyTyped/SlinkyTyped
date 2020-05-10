package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentInstancesInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
  /**
    * A subset of instances to list by status:   Pending: Include those instances with pending deployments.   InProgress: Include those instances where deployments are still in progress.   Succeeded: Include those instances with successful deployments.   Failed: Include those instances with failed deployments.   Skipped: Include those instances with skipped deployments.   Unknown: Include those instances with deployments in an unknown state.  
    */
  var instanceStatusFilter: js.UndefOr[InstanceStatusList] = js.native
  /**
    * The set of instances in a blue/green deployment, either those in the original environment ("BLUE") or those in the replacement environment ("GREEN"), for which you want to view instance information.
    */
  var instanceTypeFilter: js.UndefOr[InstanceTypeList] = js.native
  /**
    * An identifier returned from the previous list deployment instances call. It can be used to return the next set of deployment instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentInstancesInput {
  @scala.inline
  def apply(deploymentId: DeploymentId): ListDeploymentInstancesInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentInstancesInput]
  }
  @scala.inline
  implicit class ListDeploymentInstancesInputOps[Self <: ListDeploymentInstancesInput] (val x: Self) extends AnyVal {
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
    def withInstanceStatusFilter(value: InstanceStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceStatusFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceStatusFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceStatusFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTypeFilter(value: InstanceTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTypeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTypeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTypeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

