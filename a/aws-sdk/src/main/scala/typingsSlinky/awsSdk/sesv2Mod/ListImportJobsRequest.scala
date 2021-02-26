package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImportJobsRequest extends StObject {
  
  /**
    * The destination of the import job, which can be used to list import jobs that have a certain ImportDestinationType.
    */
  var ImportDestinationType: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ImportDestinationType] = js.native
  
  /**
    * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a subsequent call to ListImportJobs with the same parameters to retrieve the next page of import jobs.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.NextToken] = js.native
  
  /**
    * Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional import jobs exist beyond the specified limit, the NextToken element is sent in the response. Use the NextToken value in subsequent requests to retrieve additional addresses.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
}
object ListImportJobsRequest {
  
  @scala.inline
  def apply(): ListImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportJobsRequest]
  }
  
  @scala.inline
  implicit class ListImportJobsRequestMutableBuilder[Self <: ListImportJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportDestinationType(value: ImportDestinationType): Self = StObject.set(x, "ImportDestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDestinationTypeUndefined: Self = StObject.set(x, "ImportDestinationType", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
