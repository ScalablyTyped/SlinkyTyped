package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanInput extends js.Object {
  
  /**
    * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
    */
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.native
  
  /**
    * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  var ConditionalOperator: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConditionalOperator] = js.native
  
  /**
    * A Boolean value that determines the read consistency model during the scan:   If ConsistentRead is false, then the data returned from Scan might not contain the results from other recently completed write operations (PutItem, UpdateItem, or DeleteItem).   If ConsistentRead is true, then all of the write operations that completed before the Scan began are guaranteed to be contained in the Scan response.   The default setting for ConsistentRead is false. The ConsistentRead parameter is not supported on global secondary indexes. If you scan a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
    */
  var ConsistentRead: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConsistentRead] = js.native
  
  /**
    * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number or Binary. No set data types are allowed. In a parallel scan, a Scan request that includes ExclusiveStartKey must specify the same segment whose previous Scan returned the corresponding value of LastEvaluatedKey.
    */
  var ExclusiveStartKey: js.UndefOr[Key] = js.native
  
  /**
    * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  
  /**
    * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
  
  /**
    * A string that contains conditions that DynamoDB applies after the Scan operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
    */
  var FilterExpression: js.UndefOr[ConditionExpression] = js.native
  
  /**
    * The name of a secondary index to scan. This index can be any local secondary index or global secondary index. Note that if you use the IndexName parameter, you must also provide TableName.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.IndexName] = js.native
  
  /**
    * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed dataset size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Working with Queries in the Amazon DynamoDB Developer Guide.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  
  /**
    * A string that identifies one or more attributes to retrieve from the specified table or index. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ProjectionExpression: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ProjectionExpression] = js.native
  
  var ReturnConsumedCapacity: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.native
  
  /**
    * This is a legacy parameter. Use FilterExpression instead. For more information, see ScanFilter in the Amazon DynamoDB Developer Guide.
    */
  var ScanFilter: js.UndefOr[FilterConditionMap] = js.native
  
  /**
    * For a parallel Scan request, Segment identifies an individual segment to be scanned by an application worker. Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four application threads to scan a table or an index, then the first thread specifies a Segment value of 0, the second thread specifies 1, and so on. The value of LastEvaluatedKey returned from a parallel Scan request must be used as ExclusiveStartKey with the same segment ID in a subsequent Scan operation. The value for Segment must be greater than or equal to 0, and less than the value provided for TotalSegments. If you provide Segment, you must also provide TotalSegments.
    */
  var Segment: js.UndefOr[ScanSegment] = js.native
  
  /**
    * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index, DynamoDB fetches the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This return value is equivalent to specifying AttributesToGet without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation reads only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB fetches each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor AttributesToGet are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and AttributesToGet together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying AttributesToGet without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
    */
  var Select: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.Select] = js.native
  
  /**
    * The name of the table containing the requested items; or, if you provide IndexName, the name of the table to which that index belongs.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
  
  /**
    * For a parallel Scan request, TotalSegments represents the total number of segments into which the Scan operation will be divided. The value of TotalSegments corresponds to the number of application workers that will perform the parallel scan. For example, if you want to use four application threads to scan a table or an index, specify a TotalSegments value of 4. The value for TotalSegments must be greater than or equal to 1, and less than or equal to 1000000. If you specify a TotalSegments value of 1, the Scan operation will be sequential rather than parallel. If you specify TotalSegments, you must also specify Segment.
    */
  var TotalSegments: js.UndefOr[ScanTotalSegments] = js.native
}
object ScanInput {
  
  @scala.inline
  def apply(TableName: TableName): ScanInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanInput]
  }
  
  @scala.inline
  implicit class ScanInputOps[Self <: ScanInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToGetVarargs(value: AttributeName*): Self = this.set("AttributesToGet", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToGet(value: AttributeNameList): Self = this.set("AttributesToGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToGet: Self = this.set("AttributesToGet", js.undefined)
    
    @scala.inline
    def setConditionalOperator(value: ConditionalOperator): Self = this.set("ConditionalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalOperator: Self = this.set("ConditionalOperator", js.undefined)
    
    @scala.inline
    def setConsistentRead(value: ConsistentRead): Self = this.set("ConsistentRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistentRead: Self = this.set("ConsistentRead", js.undefined)
    
    @scala.inline
    def setExclusiveStartKey(value: Key): Self = this.set("ExclusiveStartKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveStartKey: Self = this.set("ExclusiveStartKey", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeNames: Self = this.set("ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = this.set("ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeValues: Self = this.set("ExpressionAttributeValues", js.undefined)
    
    @scala.inline
    def setFilterExpression(value: ConditionExpression): Self = this.set("FilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterExpression: Self = this.set("FilterExpression", js.undefined)
    
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveIntegerObject): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setProjectionExpression(value: ProjectionExpression): Self = this.set("ProjectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectionExpression: Self = this.set("ProjectionExpression", js.undefined)
    
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = this.set("ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnConsumedCapacity: Self = this.set("ReturnConsumedCapacity", js.undefined)
    
    @scala.inline
    def setScanFilter(value: FilterConditionMap): Self = this.set("ScanFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanFilter: Self = this.set("ScanFilter", js.undefined)
    
    @scala.inline
    def setSegment(value: ScanSegment): Self = this.set("Segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("Segment", js.undefined)
    
    @scala.inline
    def setSelect(value: Select): Self = this.set("Select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("Select", js.undefined)
    
    @scala.inline
    def setTotalSegments(value: ScanTotalSegments): Self = this.set("TotalSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSegments: Self = this.set("TotalSegments", js.undefined)
  }
}
