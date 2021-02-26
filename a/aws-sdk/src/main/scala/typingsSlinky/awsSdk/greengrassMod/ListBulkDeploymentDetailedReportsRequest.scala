package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBulkDeploymentDetailedReportsRequest extends StObject {
  
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: string = js.native
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[string] = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListBulkDeploymentDetailedReportsRequest {
  
  @scala.inline
  def apply(BulkDeploymentId: string): ListBulkDeploymentDetailedReportsRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBulkDeploymentDetailedReportsRequest]
  }
  
  @scala.inline
  implicit class ListBulkDeploymentDetailedReportsRequestMutableBuilder[Self <: ListBulkDeploymentDetailedReportsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkDeploymentId(value: string): Self = StObject.set(x, "BulkDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: string): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
