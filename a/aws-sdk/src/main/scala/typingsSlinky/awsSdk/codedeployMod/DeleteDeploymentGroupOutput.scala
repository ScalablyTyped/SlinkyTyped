package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeploymentGroupOutput extends js.Object {
  /**
    * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group.
    */
  var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.native
}

object DeleteDeploymentGroupOutput {
  @scala.inline
  def apply(): DeleteDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeploymentGroupOutput]
  }
  @scala.inline
  implicit class DeleteDeploymentGroupOutputOps[Self <: DeleteDeploymentGroupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHooksNotCleanedUp(value: AutoScalingGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooksNotCleanedUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooksNotCleanedUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooksNotCleanedUp")(js.undefined)
        ret
    }
  }
  
}

