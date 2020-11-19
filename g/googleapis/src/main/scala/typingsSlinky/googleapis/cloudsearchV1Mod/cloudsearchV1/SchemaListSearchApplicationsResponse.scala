package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListSearchApplicationsResponse extends js.Object {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  var searchApplications: js.UndefOr[js.Array[SchemaSearchApplication]] = js.native
}
object SchemaListSearchApplicationsResponse {
  
  @scala.inline
  def apply(): SchemaListSearchApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSearchApplicationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListSearchApplicationsResponseOps[Self <: SchemaListSearchApplicationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSearchApplicationsVarargs(value: SchemaSearchApplication*): Self = this.set("searchApplications", js.Array(value :_*))
    
    @scala.inline
    def setSearchApplications(value: js.Array[SchemaSearchApplication]): Self = this.set("searchApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchApplications: Self = this.set("searchApplications", js.undefined)
  }
}
