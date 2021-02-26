package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBulkDeploymentsResponse extends StObject {
  
  /**
    * A list of bulk deployments.
    */
  var BulkDeployments: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.BulkDeployments] = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListBulkDeploymentsResponse {
  
  @scala.inline
  def apply(): ListBulkDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBulkDeploymentsResponse]
  }
  
  @scala.inline
  implicit class ListBulkDeploymentsResponseMutableBuilder[Self <: ListBulkDeploymentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkDeployments(value: BulkDeployments): Self = StObject.set(x, "BulkDeployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkDeploymentsUndefined: Self = StObject.set(x, "BulkDeployments", js.undefined)
    
    @scala.inline
    def setBulkDeploymentsVarargs(value: BulkDeployment*): Self = StObject.set(x, "BulkDeployments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
