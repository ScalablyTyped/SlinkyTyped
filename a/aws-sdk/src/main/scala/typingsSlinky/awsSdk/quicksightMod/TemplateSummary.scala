package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSummary extends js.Object {
  
  /**
    * A summary of a template.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The last time that this template was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The last time that this template was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * A structure containing a list of version numbers for the template summary.
    */
  var LatestVersionNumber: js.UndefOr[VersionNumber] = js.native
  
  /**
    * A display name for the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
  
  /**
    * The ID of the template. This ID is unique per AWS Region for each AWS account.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
}
object TemplateSummary {
  
  @scala.inline
  def apply(): TemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSummary]
  }
  
  @scala.inline
  implicit class TemplateSummaryOps[Self <: TemplateSummary] (val x: Self) extends AnyVal {
    
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
    def setLastUpdatedTime(value: js.Date): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setLatestVersionNumber(value: VersionNumber): Self = this.set("LatestVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersionNumber: Self = this.set("LatestVersionNumber", js.undefined)
    
    @scala.inline
    def setName(value: TemplateName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("TemplateId", js.undefined)
  }
}
