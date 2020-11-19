package typingsSlinky.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectSummary extends js.Object {
  
  /**
    * The ARN of the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.native
  
  /**
    * The date when the project was originally created, in UNIX epoch time format.
    */
  var createdDate: js.Date = js.native
  
  /**
    * The name of the project being summarized.
    */
  var projectName: ProjectName = js.native
  
  /**
    * The tags (metadata key/value pairs) associated with the project.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: js.Date = js.native
}
object ProjectSummary {
  
  @scala.inline
  def apply(createdDate: js.Date, projectName: ProjectName, updatedDate: js.Date): ProjectSummary = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSummary]
  }
  
  @scala.inline
  implicit class ProjectSummaryOps[Self <: ProjectSummary] (val x: Self) extends AnyVal {
    
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
    def setCreatedDate(value: js.Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = this.set("projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: js.Date): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: ProjectArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
