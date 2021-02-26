package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanOutput extends StObject {
  
  /**
    * The capacity units consumed by the Scan operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConsumedCapacity] = js.native
  
  /**
    * The number of items in the response. If you set ScanFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count is the same as ScannedCount.
    */
  var Count: js.UndefOr[Integer] = js.native
  
  /**
    * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute name and the value for that attribute.
    */
  var Items: js.UndefOr[ItemList] = js.native
  
  /**
    * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
    */
  var LastEvaluatedKey: js.UndefOr[Key] = js.native
  
  /**
    * The number of items evaluated, before any ScanFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Scan operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
    */
  var ScannedCount: js.UndefOr[Integer] = js.native
}
object ScanOutput {
  
  @scala.inline
  def apply(): ScanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanOutput]
  }
  
  @scala.inline
  implicit class ScanOutputMutableBuilder[Self <: ScanOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    @scala.inline
    def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: AttributeMap*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setLastEvaluatedKey(value: Key): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
    
    @scala.inline
    def setScannedCount(value: Integer): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
  }
}
