package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeploymentGroupOutput extends js.Object {
  
  /**
    * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the AWS account. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the AWS account.
    */
  var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.native
}
object UpdateDeploymentGroupOutput {
  
  @scala.inline
  def apply(): UpdateDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeploymentGroupOutput]
  }
  
  @scala.inline
  implicit class UpdateDeploymentGroupOutputOps[Self <: UpdateDeploymentGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHooksNotCleanedUpVarargs(value: AutoScalingGroup*): Self = this.set("hooksNotCleanedUp", js.Array(value :_*))
    
    @scala.inline
    def setHooksNotCleanedUp(value: AutoScalingGroupList): Self = this.set("hooksNotCleanedUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooksNotCleanedUp: Self = this.set("hooksNotCleanedUp", js.undefined)
  }
}
