package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMailboxExportJobsResponse extends StObject {
  
  /**
    * The mailbox export job details.
    */
  var Jobs: js.UndefOr[typingsSlinky.awsSdk.workmailMod.Jobs] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.workmailMod.NextToken] = js.native
}
object ListMailboxExportJobsResponse {
  
  @scala.inline
  def apply(): ListMailboxExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMailboxExportJobsResponse]
  }
  
  @scala.inline
  implicit class ListMailboxExportJobsResponseMutableBuilder[Self <: ListMailboxExportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: Jobs): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: MailboxExportJob*): Self = StObject.set(x, "Jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
