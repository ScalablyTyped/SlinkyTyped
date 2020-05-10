package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Put extends js.Object {
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  var ConditionExpression: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConditionExpression] = js.native
  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  /**
    * One or more values that can be substituted in an expression.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
  /**
    * A map of attribute name to attribute values, representing the primary key of the item to be written by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item that are part of an index key schema for the table, their types must match the index key schema. 
    */
  var Item: PutItemInputAttributeMap = js.native
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnValuesOnConditionCheckFailure] = js.native
  /**
    * Name of the table in which to write the item.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}

object Put {
  @scala.inline
  def apply(Item: PutItemInputAttributeMap, TableName: TableName): Put = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Put]
  }
  @scala.inline
  implicit class PutOps[Self <: Put] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: PutItemInputAttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditionExpression(value: ConditionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionAttributeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeValues")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnValuesOnConditionCheckFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnValuesOnConditionCheckFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnValuesOnConditionCheckFailure")(js.undefined)
        ret
    }
  }
  
}

