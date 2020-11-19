package typingsSlinky.pulumiAws.assessmentTargetMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentTargetArgs extends js.Object {
  
  /**
    * The name of the assessment target.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
    */
  val resourceGroupArn: js.UndefOr[Input[String]] = js.native
}
object AssessmentTargetArgs {
  
  @scala.inline
  def apply(): AssessmentTargetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentTargetArgs]
  }
  
  @scala.inline
  implicit class AssessmentTargetArgsOps[Self <: AssessmentTargetArgs] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceGroupArn(value: Input[String]): Self = this.set("resourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceGroupArn: Self = this.set("resourceGroupArn", js.undefined)
  }
}
