package typingsSlinky.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectList extends js.Object {
  
  var etag: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var projects: js.UndefOr[js.Array[ProjectListProjects]] = js.native
  
  var totalItems: js.UndefOr[Double] = js.native
}
object ProjectList {
  
  @scala.inline
  def apply(): ProjectList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectList]
  }
  
  @scala.inline
  implicit class ProjectListOps[Self <: ProjectList] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setProjectsVarargs(value: ProjectListProjects*): Self = this.set("projects", js.Array(value :_*))
    
    @scala.inline
    def setProjects(value: js.Array[ProjectListProjects]): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
}
