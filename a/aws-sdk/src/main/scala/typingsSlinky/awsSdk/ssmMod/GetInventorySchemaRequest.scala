package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInventorySchemaRequest extends StObject {
  
  /**
    * Returns inventory schemas that support aggregation. For example, this call returns the AWS:InstanceInformation type, because it supports aggregation based on the PlatformName, PlatformType, and PlatformVersion attributes.
    */
  var Aggregator: js.UndefOr[AggregatorSchemaOnly] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[GetInventorySchemaMaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Returns the sub-type schema for a specified inventory type.
    */
  var SubType: js.UndefOr[IsSubTypeSchema] = js.native
  
  /**
    * The type of inventory item to return.
    */
  var TypeName: js.UndefOr[InventoryItemTypeNameFilter] = js.native
}
object GetInventorySchemaRequest {
  
  @scala.inline
  def apply(): GetInventorySchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInventorySchemaRequest]
  }
  
  @scala.inline
  implicit class GetInventorySchemaRequestMutableBuilder[Self <: GetInventorySchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregator(value: AggregatorSchemaOnly): Self = StObject.set(x, "Aggregator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatorUndefined: Self = StObject.set(x, "Aggregator", js.undefined)
    
    @scala.inline
    def setMaxResults(value: GetInventorySchemaMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSubType(value: IsSubTypeSchema): Self = StObject.set(x, "SubType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTypeUndefined: Self = StObject.set(x, "SubType", js.undefined)
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeNameFilter): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
