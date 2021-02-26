package typingsSlinky.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsResponse extends StObject {
  
  /**
    * The jobs listed by the request.
    */
  var Jobs: js.UndefOr[ListOfJobEntry] = js.native
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.NextToken] = js.native
}
object ListJobsResponse {
  
  @scala.inline
  def apply(): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResponse]
  }
  
  @scala.inline
  implicit class ListJobsResponseMutableBuilder[Self <: ListJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: ListOfJobEntry): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: JobEntry*): Self = StObject.set(x, "Jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
