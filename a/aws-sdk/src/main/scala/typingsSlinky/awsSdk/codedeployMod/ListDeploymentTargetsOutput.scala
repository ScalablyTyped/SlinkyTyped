package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentTargetsOutput extends js.Object {
  /**
    *  If a large amount of information is returned, a token identifier is also returned. It can be used in a subsequent ListDeploymentTargets call to return the next set of deployment targets in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    *  The unique IDs of deployment targets. 
    */
  var targetIds: js.UndefOr[TargetIdList] = js.native
}

object ListDeploymentTargetsOutput {
  @scala.inline
  def apply(): ListDeploymentTargetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentTargetsOutput]
  }
  @scala.inline
  implicit class ListDeploymentTargetsOutputOps[Self <: ListDeploymentTargetsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTargetIds(value: TargetIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIds")(js.undefined)
        ret
    }
  }
  
}

