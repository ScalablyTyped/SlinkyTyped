package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceInformationRequest extends StObject {
  
  /**
    * One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this Filters data type instead of InstanceInformationFilterList, which is deprecated.
    */
  var Filters: js.UndefOr[InstanceInformationStringFilterList] = js.native
  
  /**
    * This is a legacy method. We recommend that you don't use this method. Instead, use the Filters data type. Filters enables you to return instance information by filtering based on tags applied to managed instances.  Attempting to use InstanceInformationFilterList and Filters leads to an exception error.  
    */
  var InstanceInformationFilterList: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceInformationFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. 
    */
  var MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeInstanceInformationRequest {
  
  @scala.inline
  def apply(): DescribeInstanceInformationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceInformationRequest]
  }
  
  @scala.inline
  implicit class DescribeInstanceInformationRequestMutableBuilder[Self <: DescribeInstanceInformationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: InstanceInformationStringFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: InstanceInformationStringFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setInstanceInformationFilterList(value: InstanceInformationFilterList): Self = StObject.set(x, "InstanceInformationFilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInformationFilterListUndefined: Self = StObject.set(x, "InstanceInformationFilterList", js.undefined)
    
    @scala.inline
    def setInstanceInformationFilterListVarargs(value: InstanceInformationFilter*): Self = StObject.set(x, "InstanceInformationFilterList", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResultsEC2Compatible): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
