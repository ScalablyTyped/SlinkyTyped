package typingsSlinky.awsSdkClientDynamodbNode.typesBatchGetItemOutputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import typingsSlinky.awsSdkClientDynamodbNode.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typingsSlinky.awsSdkClientDynamodbNode.typesKeysAndAttributesMod.UnmarshalledKeysAndAttributes
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetItemOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The read capacity units consumed by the entire <code>BatchGetItem</code> operation.</p> <p>Each element consists of:</p> <ul> <li> <p> <code>TableName</code> - The table that consumed the provisioned throughput.</p> </li> <li> <p> <code>CapacityUnits</code> - The total number of capacity units consumed.</p> </li> </ul>
    */
  var ConsumedCapacity: js.UndefOr[js.Array[UnmarshalledConsumedCapacity]] = js.native
  /**
    * <p>A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name, along with a map of attribute data consisting of the data type and attribute value.</p>
    */
  var Responses: js.UndefOr[StringDictionary[js.Array[StringDictionary[UnmarshalledAttributeValue]]]] = js.native
  /**
    * <p>A map of tables and their respective keys that were not processed with the current response. The <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be provided directly to a subsequent <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code> in the Request Parameters section.</p> <p>Each element consists of:</p> <ul> <li> <p> <code>Keys</code> - An array of primary key attribute values that define specific items in the table.</p> </li> <li> <p> <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.</p> </li> <li> <p> <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used; otherwise, an eventually consistent read is used.</p> </li> </ul> <p>If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code> map.</p>
    */
  var UnprocessedKeys: js.UndefOr[StringDictionary[UnmarshalledKeysAndAttributes]] = js.native
}

object BatchGetItemOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): BatchGetItemOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetItemOutput]
  }
  @scala.inline
  implicit class BatchGetItemOutputOps[Self <: BatchGetItemOutput] (val x: Self) extends AnyVal {
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
    def withConsumedCapacity(value: js.Array[UnmarshalledConsumedCapacity]): Self = {
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
    def withResponses(value: StringDictionary[js.Array[StringDictionary[UnmarshalledAttributeValue]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Responses")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedKeys(value: StringDictionary[UnmarshalledKeysAndAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedKeys")(js.undefined)
        ret
    }
  }
  
}

