package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionCheck extends js.Object {
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  var ConditionExpression: typingsSlinky.awsSdk.dynamodbMod.ConditionExpression = js.native
  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  /**
    * One or more values that can be substituted in an expression.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
  /**
    * The primary key of the item to be checked. Each element consists of an attribute name and a value for that attribute.
    */
  var Key: typingsSlinky.awsSdk.dynamodbMod.Key = js.native
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the ConditionCheck condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnValuesOnConditionCheckFailure] = js.native
  /**
    * Name of the table for the check item request.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}

object ConditionCheck {
  @scala.inline
  def apply(ConditionExpression: ConditionExpression, Key: Key, TableName: TableName): ConditionCheck = {
    val __obj = js.Dynamic.literal(ConditionExpression = ConditionExpression.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionCheck]
  }
  @scala.inline
  implicit class ConditionCheckOps[Self <: ConditionCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionExpression(value: ConditionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
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

