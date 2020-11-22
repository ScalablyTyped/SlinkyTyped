package typingsSlinky.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectListProjects extends js.Object {
  
  var friendlyName: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var numericId: js.UndefOr[String] = js.native
  
  var projectReference: js.UndefOr[ProjectReference] = js.native
}
object ProjectListProjects {
  
  @scala.inline
  def apply(): ProjectListProjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectListProjects]
  }
  
  @scala.inline
  implicit class ProjectListProjectsOps[Self <: ProjectListProjects] (val x: Self) extends AnyVal {
    
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
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNumericId(value: String): Self = this.set("numericId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericId: Self = this.set("numericId", js.undefined)
    
    @scala.inline
    def setProjectReference(value: ProjectReference): Self = this.set("projectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectReference: Self = this.set("projectReference", js.undefined)
  }
}
