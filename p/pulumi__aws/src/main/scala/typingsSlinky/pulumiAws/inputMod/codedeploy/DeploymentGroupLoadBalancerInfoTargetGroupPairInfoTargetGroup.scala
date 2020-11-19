package typingsSlinky.pulumiAws.inputMod.codedeploy

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup extends js.Object {
  
  /**
    * Name of the target group.
    */
  var name: Input[String] = js.native
}
object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup {
  
  @scala.inline
  def apply(name: Input[String]): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]
  }
  
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupOps[Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
