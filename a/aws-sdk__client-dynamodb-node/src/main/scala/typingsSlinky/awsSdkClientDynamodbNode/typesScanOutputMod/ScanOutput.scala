package typingsSlinky.awsSdkClientDynamodbNode.typesScanOutputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import typingsSlinky.awsSdkClientDynamodbNode.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The capacity units consumed by the <code>Scan</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[UnmarshalledConsumedCapacity] = js.native
  /**
    * <p>The number of items in the response.</p> <p>If you set <code>ScanFilter</code> in the request, then <code>Count</code> is the number of items returned after the filter was applied, and <code>ScannedCount</code> is the number of matching items before the filter was applied.</p> <p>If you did not use a filter in the request, then <code>Count</code> is the same as <code>ScannedCount</code>.</p>
    */
  var Count: js.UndefOr[Double] = js.native
  /**
    * <p>An array of item attributes that match the scan criteria. Each element in this array consists of an attribute name and the value for that attribute.</p>
    */
  var Items: js.UndefOr[js.Array[StringDictionary[UnmarshalledAttributeValue]]] = js.native
  /**
    * <p>The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request.</p> <p>If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there is no more data to be retrieved.</p> <p>If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code> is empty.</p>
    */
  var LastEvaluatedKey: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.native
  /**
    * <p>The number of items evaluated, before any <code>ScanFilter</code> is applied. A high <code>ScannedCount</code> value with few, or no, <code>Count</code> results indicates an inefficient <code>Scan</code> operation. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p> <p>If you did not use a filter in the request, then <code>ScannedCount</code> is the same as <code>Count</code>.</p>
    */
  var ScannedCount: js.UndefOr[Double] = js.native
}

object ScanOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ScanOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanOutput]
  }
  @scala.inline
  implicit class ScanOutputOps[Self <: ScanOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumedCapacity(value: UnmarshalledConsumedCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[StringDictionary[UnmarshalledAttributeValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(js.undefined)
        ret
    }
    @scala.inline
    def withLastEvaluatedKey(value: StringDictionary[UnmarshalledAttributeValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEvaluatedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withScannedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScannedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScannedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScannedCount")(js.undefined)
        ret
    }
  }
  
}

