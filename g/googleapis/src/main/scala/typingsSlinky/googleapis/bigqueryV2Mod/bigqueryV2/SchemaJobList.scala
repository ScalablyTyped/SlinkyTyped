package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleapis.anon.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobList extends js.Object {
  
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * List of jobs that were requested.
    */
  var jobs: js.UndefOr[js.Array[Configuration]] = js.native
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaJobList {
  
  @scala.inline
  def apply(): SchemaJobList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobList]
  }
  
  @scala.inline
  implicit class SchemaJobListOps[Self <: SchemaJobList] (val x: Self) extends AnyVal {
    
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
    def setJobsVarargs(value: Configuration*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: js.Array[Configuration]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
