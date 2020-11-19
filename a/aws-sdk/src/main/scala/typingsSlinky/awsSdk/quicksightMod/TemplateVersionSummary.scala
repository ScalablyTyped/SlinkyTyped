package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateVersionSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the template version.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The time that this template version was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The description of the template version.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  
  /**
    * The status of the template version.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The version number of the template version.
    */
  var VersionNumber: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.VersionNumber] = js.native
}
object TemplateVersionSummary {
  
  @scala.inline
  def apply(): TemplateVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateVersionSummary]
  }
  
  @scala.inline
  implicit class TemplateVersionSummaryOps[Self <: TemplateVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: VersionDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
}
