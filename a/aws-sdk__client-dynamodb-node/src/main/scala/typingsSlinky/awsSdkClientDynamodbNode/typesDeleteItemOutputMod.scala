package typingsSlinky.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import typingsSlinky.awsSdkClientDynamodbNode.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typingsSlinky.awsSdkClientDynamodbNode.typesItemCollectionMetricsMod.UnmarshalledItemCollectionMetrics
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteItemOutputMod {
  
  @js.native
  trait DeleteItemOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A map of attribute names to <code>AttributeValue</code> objects, representing the item as it appeared before the <code>DeleteItem</code> operation. This map appears in the response only if <code>ReturnValues</code> was specified as <code>ALL_OLD</code> in the request.</p>
      */
    var Attributes: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.native
    
    /**
      * <p>The capacity units consumed by the <code>DeleteItem</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ConsumedCapacity: js.UndefOr[UnmarshalledConsumedCapacity] = js.native
    
    /**
      * <p>Information about item collections, if any, that were affected by the <code>DeleteItem</code> operation. <code>ItemCollectionMetrics</code> is only returned if the <code>ReturnItemCollectionMetrics</code> parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response.</p> <p>Each <code>ItemCollectionMetrics</code> element consists of:</p> <ul> <li> <p> <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the partition key value of the item itself.</p> </li> <li> <p> <code>SizeEstimateRangeGB</code> - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p> </li> </ul>
      */
    var ItemCollectionMetrics: js.UndefOr[UnmarshalledItemCollectionMetrics] = js.native
  }
  object DeleteItemOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteItemOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteItemOutput]
    }
    
    @scala.inline
    implicit class DeleteItemOutputMutableBuilder[Self <: DeleteItemOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setConsumedCapacity(value: UnmarshalledConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setItemCollectionMetrics(value: UnmarshalledItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
}
