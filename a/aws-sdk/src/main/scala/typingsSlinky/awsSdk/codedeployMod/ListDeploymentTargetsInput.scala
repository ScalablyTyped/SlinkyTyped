package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentTargetsInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  A token identifier returned from the previous ListDeploymentTargets call. It can be used to return the next set of deployment targets in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    *  A key used to filter the returned targets. The two valid values are:    TargetStatus - A TargetStatus filter string can be Failed, InProgress, Pending, Ready, Skipped, Succeeded, or Unknown.     ServerInstanceLabel - A ServerInstanceLabel filter string can be Blue or Green.   
    */
  var targetFilters: js.UndefOr[TargetFilters] = js.native
}

object ListDeploymentTargetsInput {
  @scala.inline
  def apply(): ListDeploymentTargetsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentTargetsInput]
  }
  @scala.inline
  implicit class ListDeploymentTargetsInputOps[Self <: ListDeploymentTargetsInput] (val x: Self) extends AnyVal {
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
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(js.undefined)
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
    @scala.inline
    def withTargetFilters(value: TargetFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetFilters")(js.undefined)
        ret
    }
  }
  
}

