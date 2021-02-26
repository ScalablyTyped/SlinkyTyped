package typingsSlinky.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFargateProfilesRequest extends StObject {
  
  /**
    * The name of the Amazon EKS cluster that you would like to listFargate profiles in.
    */
  var clusterName: String = js.native
  
  /**
    * The maximum number of Fargate profile results returned by ListFargateProfiles in paginated output. When you use this parameter, ListFargateProfiles returns only maxResults results in a single page along with a nextToken response element. You can see the remaining results of the initial request by sending another ListFargateProfiles request with the returned nextToken value. This value can be between 1 and 100. If you don't use this parameter, ListFargateProfiles returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[FargateProfilesRequestMaxResults] = js.native
  
  /**
    * The nextToken value returned from a previous paginated ListFargateProfiles request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListFargateProfilesRequest {
  
  @scala.inline
  def apply(clusterName: String): ListFargateProfilesRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFargateProfilesRequest]
  }
  
  @scala.inline
  implicit class ListFargateProfilesRequestMutableBuilder[Self <: ListFargateProfilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: FargateProfilesRequestMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
