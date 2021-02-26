package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResolverQueryLogConfigAssociationsResponse extends StObject {
  
  /**
    * If there are more than MaxResults query logging associations, you can submit another ListResolverQueryLogConfigAssociations request to get the next group of associations. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.NextToken] = js.native
  
  /**
    * A list that contains one ResolverQueryLogConfigAssociations element for each query logging association that matches the values that you specified for Filter.
    */
  var ResolverQueryLogConfigAssociations: js.UndefOr[ResolverQueryLogConfigAssociationList] = js.native
  
  /**
    * The total number of query logging associations that were created by the current account in the specified Region. This count can differ from the number of associations that are returned in a ListResolverQueryLogConfigAssociations response, depending on the values that you specify in the request.
    */
  var TotalCount: js.UndefOr[Count] = js.native
  
  /**
    * The total number of query logging associations that were created by the current account in the specified Region and that match the filters that were specified in the ListResolverQueryLogConfigAssociations request. For the total number of associations that were created by the current account in the specified Region, see TotalCount.
    */
  var TotalFilteredCount: js.UndefOr[Count] = js.native
}
object ListResolverQueryLogConfigAssociationsResponse {
  
  @scala.inline
  def apply(): ListResolverQueryLogConfigAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverQueryLogConfigAssociationsResponse]
  }
  
  @scala.inline
  implicit class ListResolverQueryLogConfigAssociationsResponseMutableBuilder[Self <: ListResolverQueryLogConfigAssociationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResolverQueryLogConfigAssociations(value: ResolverQueryLogConfigAssociationList): Self = StObject.set(x, "ResolverQueryLogConfigAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigAssociationsUndefined: Self = StObject.set(x, "ResolverQueryLogConfigAssociations", js.undefined)
    
    @scala.inline
    def setResolverQueryLogConfigAssociationsVarargs(value: ResolverQueryLogConfigAssociation*): Self = StObject.set(x, "ResolverQueryLogConfigAssociations", js.Array(value :_*))
    
    @scala.inline
    def setTotalCount(value: Count): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
    
    @scala.inline
    def setTotalFilteredCount(value: Count): Self = StObject.set(x, "TotalFilteredCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFilteredCountUndefined: Self = StObject.set(x, "TotalFilteredCount", js.undefined)
  }
}
