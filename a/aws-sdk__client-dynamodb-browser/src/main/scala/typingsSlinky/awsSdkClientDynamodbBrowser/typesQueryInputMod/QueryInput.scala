package typingsSlinky.awsSdkClientDynamodbBrowser.typesQueryInputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ALL_ATTRIBUTES
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ALL_PROJECTED_ATTRIBUTES
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.AND
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.COUNT
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.INDEXES
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NONE
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.OR
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.SPECIFIC_ATTRIBUTES
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TOTAL
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typingsSlinky.awsSdkClientDynamodbBrowser.typesConditionMod.Condition
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInput extends InputTypesUnion {
  
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
  
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * <p>This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html">AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var AttributesToGet: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  
  /**
    * <p>This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html">ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ConditionalOperator: js.UndefOr[AND | OR | String] = js.native
  
  /**
    * <p>Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads.</p> <p>Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index with <code>ConsistentRead</code> set to <code>true</code>, you will receive a <code>ValidationException</code>.</p>
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>The primary key of the first item that this operation will evaluate. Use the value that was returned for <code>LastEvaluatedKey</code> in the previous operation.</p> <p>The data type for <code>ExclusiveStartKey</code> must be String, Number or Binary. No set data types are allowed.</p>
    */
  var ExclusiveStartKey: js.UndefOr[
    StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
  ] = js.native
  
  /**
    * <p>One or more substitution tokens for attribute names in an expression. The following are some use cases for using <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>To access an attribute whose name conflicts with a DynamoDB reserved word.</p> </li> <li> <p>To create a placeholder for repeating occurrences of an attribute name in an expression.</p> </li> <li> <p>To prevent special characters in an attribute name from being misinterpreted in an expression.</p> </li> </ul> <p>Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following attribute name:</p> <ul> <li> <p> <code>Percentile</code> </p> </li> </ul> <p>The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p> <code>{"#P":"Percentile"}</code> </p> </li> </ul> <p>You could then use this substitution in an expression, as in this example:</p> <ul> <li> <p> <code>#P = :val</code> </p> </li> </ul> <note> <p>Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for the actual value at runtime.</p> </note> <p>For more information on expression attribute names, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ExpressionAttributeNames: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
  
  /**
    * <p>One or more values that can be substituted in an expression.</p> <p>Use the <b>:</b> (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the <i>ProductStatus</i> attribute was one of the following: </p> <p> <code>Available | Backordered | Discontinued</code> </p> <p>You would first need to specify <code>ExpressionAttributeValues</code> as follows:</p> <p> <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code> </p> <p>You could then use these values in an expression, such as this:</p> <p> <code>ProductStatus IN (:avail, :back, :disc)</code> </p> <p>For more information on expression attribute values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ExpressionAttributeValues: js.UndefOr[
    StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
  ] = js.native
  
  /**
    * <p>A string that contains conditions that DynamoDB applies after the <code>Query</code> operation, but before the data is returned to you. Items that do not satisfy the <code>FilterExpression</code> criteria are not returned.</p> <p>A <code>FilterExpression</code> does not allow key attributes. You cannot define a filter expression based on a partition key or a sort key.</p> <note> <p>A <code>FilterExpression</code> is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.</p> </note> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults">Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var FilterExpression: js.UndefOr[String] = js.native
  
  /**
    * <p>The name of an index to query. This index can be any local secondary index or global secondary index on the table. Note that if you use the <code>IndexName</code> parameter, you must also provide <code>TableName.</code> </p>
    */
  var IndexName: js.UndefOr[String] = js.native
  
  /**
    * <p>The condition that specifies the key value(s) for items to be retrieved by the <code>Query</code> action.</p> <p>The condition must perform an equality test on a single partition key value.</p> <p>The condition can optionally perform one of several comparison tests on a single sort key value. This allows <code>Query</code> to retrieve one item with a given partition key value and sort key value, or several items that have the same partition key value but different sort key values.</p> <p>The partition key equality test is required, and must be specified in the following format:</p> <p> <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code> </p> <p>If you also want to provide a condition for the sort key, it must be combined using <code>AND</code> with the condition for the sort key. Following is an example, using the <b>=</b> comparison operator for the sort key:</p> <p> <code>partitionKeyName</code> <code>=</code> <code>:partitionkeyval</code> <code>AND</code> <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> </p> <p>Valid comparisons for the sort key condition are as follows:</p> <ul> <li> <p> <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true if the sort key value is equal to <code>:sortkeyval</code>.</p> </li> <li> <p> <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> - true if the sort key value is less than <code>:sortkeyval</code>.</p> </li> <li> <p> <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> - true if the sort key value is less than or equal to <code>:sortkeyval</code>.</p> </li> <li> <p> <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> - true if the sort key value is greater than <code>:sortkeyval</code>.</p> </li> <li> <p> <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> - true if the sort key value is greater than or equal to <code>:sortkeyval</code>.</p> </li> <li> <p> <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code> <code>AND</code> <code>:sortkeyval2</code> - true if the sort key value is greater than or equal to <code>:sortkeyval1</code>, and less than or equal to <code>:sortkeyval2</code>.</p> </li> <li> <p> <code>begins_with (</code> <code>sortKeyName</code>, <code>:sortkeyval</code> <code>)</code> - true if the sort key value begins with a particular operand. (You cannot use this function with a sort key that is of type Number.) Note that the function name <code>begins_with</code> is case-sensitive.</p> </li> </ul> <p>Use the <code>ExpressionAttributeValues</code> parameter to replace tokens such as <code>:partitionval</code> and <code>:sortval</code> with actual values at runtime.</p> <p>You can optionally use the <code>ExpressionAttributeNames</code> parameter to replace the names of the partition key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a DynamoDB reserved word. For example, the following <code>KeyConditionExpression</code> parameter causes an error because <i>Size</i> is a reserved word:</p> <ul> <li> <p> <code>Size = :myval</code> </p> </li> </ul> <p>To work around this, define a placeholder (such a <code>#S</code>) to represent the attribute name <i>Size</i>. <code>KeyConditionExpression</code> then is as follows:</p> <ul> <li> <p> <code>#S = :myval</code> </p> </li> </ul> <p>For a list of reserved words, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p> <p>For more information on <code>ExpressionAttributeNames</code> and <code>ExpressionAttributeValues</code>, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html">Using Placeholders for Attribute Names and Values</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var KeyConditionExpression: js.UndefOr[String] = js.native
  
  /**
    * <p>This is a legacy parameter. Use <code>KeyConditionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html">KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var KeyConditions: js.UndefOr[StringDictionary[Condition] | (js.Iterable[js.Tuple2[String, Condition]])] = js.native
  
  /**
    * <p>The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation to continue the operation. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var Limit: js.UndefOr[Double] = js.native
  
  /**
    * <p>A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas.</p> <p>If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ProjectionExpression: js.UndefOr[String] = js.native
  
  /**
    * <p>This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html">QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var QueryFilter: js.UndefOr[StringDictionary[Condition] | (js.Iterable[js.Tuple2[String, Condition]])] = js.native
  
  /**
    * <p>Determines the level of detail about provisioned throughput consumption that is returned in the response:</p> <ul> <li> <p> <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed.</p> <p>Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s).</p> </li> <li> <p> <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation.</p> </li> <li> <p> <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.</p> </li> </ul>
    */
  var ReturnConsumedCapacity: js.UndefOr[INDEXES | TOTAL | NONE | String] = js.native
  
  /**
    * <p>Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in ascending order; if <code>false</code>, the traversal is performed in descending order. </p> <p>Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned.</p> <p>If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which they are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the results to the client.</p>
    */
  var ScanIndexForward: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.</p> <ul> <li> <p> <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.</p> </li> <li> <p> <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying <code>ALL_ATTRIBUTES</code>.</p> </li> <li> <p> <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.</p> </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>. This return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value for <code>Select</code>.</p> <p>If you query or scan a local secondary index and request only attributes that are projected into that index, the operation will read only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency.</p> <p>If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.</p> </li> </ul> <p>If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a single request, unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)</p> <note> <p>If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.</p> </note>
    */
  var Select: js.UndefOr[ALL_ATTRIBUTES | ALL_PROJECTED_ATTRIBUTES | SPECIFIC_ATTRIBUTES | COUNT | String] = js.native
  
  /**
    * <p>The name of the table containing the requested items.</p>
    */
  var TableName: String = js.native
}
object QueryInput {
  
  @scala.inline
  def apply(TableName: String): QueryInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInput]
  }
  
  @scala.inline
  implicit class QueryInputOps[Self <: QueryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(value: BrowserHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    
    @scala.inline
    def setAttributesToGetVarargs(value: String*): Self = this.set("AttributesToGet", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToGetIterable(value: js.Iterable[String]): Self = this.set("AttributesToGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToGet(value: js.Array[String] | js.Iterable[String]): Self = this.set("AttributesToGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToGet: Self = this.set("AttributesToGet", js.undefined)
    
    @scala.inline
    def setConditionalOperator(value: AND | OR | String): Self = this.set("ConditionalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalOperator: Self = this.set("ConditionalOperator", js.undefined)
    
    @scala.inline
    def setConsistentRead(value: Boolean): Self = this.set("ConsistentRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistentRead: Self = this.set("ConsistentRead", js.undefined)
    
    @scala.inline
    def setExclusiveStartKeyIterable(value: js.Iterable[js.Tuple2[String, AttributeValue]]): Self = this.set("ExclusiveStartKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartKey(value: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])): Self = this.set("ExclusiveStartKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveStartKey: Self = this.set("ExclusiveStartKey", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNamesIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeNames(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeNames: Self = this.set("ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setExpressionAttributeValuesIterable(value: js.Iterable[js.Tuple2[String, AttributeValue]]): Self = this.set("ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeValues(value: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])): Self = this.set("ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeValues: Self = this.set("ExpressionAttributeValues", js.undefined)
    
    @scala.inline
    def setFilterExpression(value: String): Self = this.set("FilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterExpression: Self = this.set("FilterExpression", js.undefined)
    
    @scala.inline
    def setIndexName(value: String): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    
    @scala.inline
    def setKeyConditionExpression(value: String): Self = this.set("KeyConditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyConditionExpression: Self = this.set("KeyConditionExpression", js.undefined)
    
    @scala.inline
    def setKeyConditionsIterable(value: js.Iterable[js.Tuple2[String, Condition]]): Self = this.set("KeyConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyConditions(value: StringDictionary[Condition] | (js.Iterable[js.Tuple2[String, Condition]])): Self = this.set("KeyConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyConditions: Self = this.set("KeyConditions", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setProjectionExpression(value: String): Self = this.set("ProjectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectionExpression: Self = this.set("ProjectionExpression", js.undefined)
    
    @scala.inline
    def setQueryFilterIterable(value: js.Iterable[js.Tuple2[String, Condition]]): Self = this.set("QueryFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryFilter(value: StringDictionary[Condition] | (js.Iterable[js.Tuple2[String, Condition]])): Self = this.set("QueryFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryFilter: Self = this.set("QueryFilter", js.undefined)
    
    @scala.inline
    def setReturnConsumedCapacity(value: INDEXES | TOTAL | NONE | String): Self = this.set("ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnConsumedCapacity: Self = this.set("ReturnConsumedCapacity", js.undefined)
    
    @scala.inline
    def setScanIndexForward(value: Boolean): Self = this.set("ScanIndexForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanIndexForward: Self = this.set("ScanIndexForward", js.undefined)
    
    @scala.inline
    def setSelect(value: ALL_ATTRIBUTES | ALL_PROJECTED_ATTRIBUTES | SPECIFIC_ATTRIBUTES | COUNT | String): Self = this.set("Select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("Select", js.undefined)
  }
}
