package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAssessmentTargetRequest extends js.Object {
  
  /**
    * The ARN that specifies the assessment target that you want to delete.
    */
  var assessmentTargetArn: Arn = js.native
}
object DeleteAssessmentTargetRequest {
  
  @scala.inline
  def apply(assessmentTargetArn: Arn): DeleteAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssessmentTargetRequest]
  }
  
  @scala.inline
  implicit class DeleteAssessmentTargetRequestOps[Self <: DeleteAssessmentTargetRequest] (val x: Self) extends AnyVal {
    
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
    def setAssessmentTargetArn(value: Arn): Self = this.set("assessmentTargetArn", value.asInstanceOf[js.Any])
  }
}
