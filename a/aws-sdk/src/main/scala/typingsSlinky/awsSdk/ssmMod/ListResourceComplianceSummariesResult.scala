package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceComplianceSummariesResult extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * A summary count for specified or targeted managed instances. Summary count includes information about compliant and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that you specify. 
    */
  var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.native
}
object ListResourceComplianceSummariesResult {
  
  @scala.inline
  def apply(): ListResourceComplianceSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceComplianceSummariesResult]
  }
  
  @scala.inline
  implicit class ListResourceComplianceSummariesResultMutableBuilder[Self <: ListResourceComplianceSummariesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceComplianceSummaryItems(value: ResourceComplianceSummaryItemList): Self = StObject.set(x, "ResourceComplianceSummaryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceComplianceSummaryItemsUndefined: Self = StObject.set(x, "ResourceComplianceSummaryItems", js.undefined)
    
    @scala.inline
    def setResourceComplianceSummaryItemsVarargs(value: ResourceComplianceSummaryItem*): Self = StObject.set(x, "ResourceComplianceSummaryItems", js.Array(value :_*))
  }
}
