package typingsSlinky.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHumanLoopsRequest extends StObject {
  
  /**
    * (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For example, 2020-02-24.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  
  /**
    * (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format. For example, 2020-02-24.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a flow definition.
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.augmentedairuntimeMod.FlowDefinitionArn = js.native
  
  /**
    * The total number of items to return. If the total number of available items is more than the value specified in MaxResults, then a NextToken is returned in the output. You can use this token to display the next page of results. 
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.MaxResults] = js.native
  
  /**
    * A token to display the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.NextToken] = js.native
  
  /**
    * Optional. The order for displaying results. Valid values: Ascending and Descending.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.SortOrder] = js.native
}
object ListHumanLoopsRequest {
  
  @scala.inline
  def apply(FlowDefinitionArn: FlowDefinitionArn): ListHumanLoopsRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanLoopsRequest]
  }
  
  @scala.inline
  implicit class ListHumanLoopsRequestMutableBuilder[Self <: ListHumanLoopsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
