package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResolverRuleAssociationsResponse extends StObject {
  
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.MaxResults] = js.native
  
  /**
    * If more than MaxResults rule associations match the specified criteria, you can submit another ListResolverRuleAssociation request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.NextToken] = js.native
  
  /**
    * The associations that were created between Resolver rules and VPCs using the current AWS account, and that match the specified filters, if any.
    */
  var ResolverRuleAssociations: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverRuleAssociations] = js.native
}
object ListResolverRuleAssociationsResponse {
  
  @scala.inline
  def apply(): ListResolverRuleAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverRuleAssociationsResponse]
  }
  
  @scala.inline
  implicit class ListResolverRuleAssociationsResponseMutableBuilder[Self <: ListResolverRuleAssociationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResolverRuleAssociations(value: ResolverRuleAssociations): Self = StObject.set(x, "ResolverRuleAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleAssociationsUndefined: Self = StObject.set(x, "ResolverRuleAssociations", js.undefined)
    
    @scala.inline
    def setResolverRuleAssociationsVarargs(value: ResolverRuleAssociation*): Self = StObject.set(x, "ResolverRuleAssociations", js.Array(value :_*))
  }
}
