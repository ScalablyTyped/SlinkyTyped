package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsByStatusResponse extends js.Object {
  
  /**
    * An array of Job objects that have the specified status.
    */
  var Jobs: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Jobs] = js.native
  
  /**
    *  A value that you use to access the second and subsequent pages of results, if any. When the jobs in the specified pipeline fit on one page or when you've reached the last page of results, the value of NextPageToken is null. 
    */
  var NextPageToken: js.UndefOr[Id] = js.native
}
object ListJobsByStatusResponse {
  
  @scala.inline
  def apply(): ListJobsByStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsByStatusResponse]
  }
  
  @scala.inline
  implicit class ListJobsByStatusResponseOps[Self <: ListJobsByStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setJobsVarargs(value: Job*): Self = this.set("Jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: Jobs): Self = this.set("Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("Jobs", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: Id): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
}
