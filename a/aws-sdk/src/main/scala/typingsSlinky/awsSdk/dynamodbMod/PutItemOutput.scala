package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutItemOutput extends StObject {
  
  /**
    * The attribute values as they appeared before the PutItem operation, but only if ReturnValues is specified as ALL_OLD in the request. Each element consists of an attribute name and an attribute value.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.native
  
  /**
    * The capacity units consumed by the PutItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Read/Write Capacity Mode in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConsumedCapacity] = js.native
  
  /**
    * Information about item collections, if any, that were affected by the PutItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
    */
  var ItemCollectionMetrics: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ItemCollectionMetrics] = js.native
}
object PutItemOutput {
  
  @scala.inline
  def apply(): PutItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutItemOutput]
  }
  
  @scala.inline
  implicit class PutItemOutputMutableBuilder[Self <: PutItemOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    @scala.inline
    def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
  }
}
