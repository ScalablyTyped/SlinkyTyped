package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteItemInput extends js.Object {
  
  /**
    * A condition that must be satisfied in order for a conditional DeleteItem to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information about condition expressions, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  var ConditionExpression: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
  
  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  var ConditionalOperator: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ConditionalOperator] = js.native
  
  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
    */
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.native
  
  /**
    * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  
  /**
    * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
  
  /**
    * A map of attribute names to AttributeValue objects, representing the primary key of the item to delete. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
    */
  var Key: typingsSlinky.awsSdk.documentClientMod.DocumentClient.Key = js.native
  
  var ReturnConsumedCapacity: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
  
  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
    */
  var ReturnItemCollectionMetrics: js.UndefOr[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReturnItemCollectionMetrics
  ] = js.native
  
  /**
    * Use ReturnValues if you want to get the item attributes as they appeared before they were deleted. For DeleteItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - The content of the old item is returned.    The ReturnValues parameter is used by several DynamoDB operations; however, DeleteItem does not recognize any values other than NONE or ALL_OLD. 
    */
  var ReturnValues: js.UndefOr[ReturnValue] = js.native
  
  /**
    * The name of the table from which to delete the item.
    */
  var TableName: typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName = js.native
}
object DeleteItemInput {
  
  @scala.inline
  def apply(Key: Key, TableName: TableName): DeleteItemInput = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteItemInput]
  }
  
  @scala.inline
  implicit class DeleteItemInputOps[Self <: DeleteItemInput] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Key): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpression(value: ConditionExpression): Self = this.set("ConditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionExpression: Self = this.set("ConditionExpression", js.undefined)
    
    @scala.inline
    def setConditionalOperator(value: ConditionalOperator): Self = this.set("ConditionalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalOperator: Self = this.set("ConditionalOperator", js.undefined)
    
    @scala.inline
    def setExpected(value: ExpectedAttributeMap): Self = this.set("Expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpected: Self = this.set("Expected", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeNames: Self = this.set("ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = this.set("ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeValues: Self = this.set("ExpressionAttributeValues", js.undefined)
    
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = this.set("ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnConsumedCapacity: Self = this.set("ReturnConsumedCapacity", js.undefined)
    
    @scala.inline
    def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = this.set("ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnItemCollectionMetrics: Self = this.set("ReturnItemCollectionMetrics", js.undefined)
    
    @scala.inline
    def setReturnValues(value: ReturnValue): Self = this.set("ReturnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValues: Self = this.set("ReturnValues", js.undefined)
  }
}
