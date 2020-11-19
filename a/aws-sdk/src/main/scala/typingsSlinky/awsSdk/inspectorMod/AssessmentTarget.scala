package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentTarget extends js.Object {
  
  /**
    * The ARN that specifies the Amazon Inspector assessment target.
    */
  var arn: Arn = js.native
  
  /**
    * The time at which the assessment target is created.
    */
  var createdAt: js.Date = js.native
  
  /**
    * The name of the Amazon Inspector assessment target.
    */
  var name: AssessmentTargetName = js.native
  
  /**
    * The ARN that specifies the resource group that is associated with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * The time at which UpdateAssessmentTarget is called.
    */
  var updatedAt: js.Date = js.native
}
object AssessmentTarget {
  
  @scala.inline
  def apply(arn: Arn, createdAt: js.Date, name: AssessmentTargetName, updatedAt: js.Date): AssessmentTarget = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTarget]
  }
  
  @scala.inline
  implicit class AssessmentTargetOps[Self <: AssessmentTarget] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AssessmentTargetName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupArn(value: Arn): Self = this.set("resourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceGroupArn: Self = this.set("resourceGroupArn", js.undefined)
  }
}
