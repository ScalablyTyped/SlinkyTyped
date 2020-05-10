package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentsInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.  If applicationName is specified, then deploymentGroupName must be specified. If it is not specified, then deploymentGroupName must not be specified.  
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * A time range (start and end) for returning a subset of the list of deployments.
    */
  var createTimeRange: js.UndefOr[TimeRange] = js.native
  /**
    * The name of a deployment group for the specified application.  If deploymentGroupName is specified, then applicationName must be specified. If it is not specified, then applicationName must not be specified.  
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  /**
    * A subset of deployments to list by status:   Created: Include created deployments in the resulting list.   Queued: Include queued deployments in the resulting list.   In Progress: Include in-progress deployments in the resulting list.   Succeeded: Include successful deployments in the resulting list.   Failed: Include failed deployments in the resulting list.   Stopped: Include stopped deployments in the resulting list.  
    */
  var includeOnlyStatuses: js.UndefOr[DeploymentStatusList] = js.native
  /**
    * An identifier returned from the previous list deployments call. It can be used to return the next set of deployments in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentsInput {
  @scala.inline
  def apply(): ListDeploymentsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsInput]
  }
  @scala.inline
  implicit class ListDeploymentsInputOps[Self <: ListDeploymentsInput] (val x: Self) extends AnyVal {
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
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTimeRange(value: TimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentGroupName(value: DeploymentGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeOnlyStatuses(value: DeploymentStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOnlyStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOnlyStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOnlyStatuses")(js.undefined)
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

