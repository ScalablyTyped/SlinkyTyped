package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  var ConditionExpression: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  /**
    * One or more values that can be substituted in an expression.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
  /**
    * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute.
    */
  var Key: typingsSlinky.awsSdk.documentClientMod.DocumentClient.Key = js.native
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
  ] = js.native
  /**
    * Name of the table for the UpdateItem request.
    */
  var TableName: typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  /**
    * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them.
    */
  var UpdateExpression: typingsSlinky.awsSdk.documentClientMod.DocumentClient.UpdateExpression = js.native
}

object Update {
  @scala.inline
  def apply(Key: Key, TableName: TableName, UpdateExpression: UpdateExpression): Update = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUpdateExpression(value: UpdateExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(value.asInstanceOf[js.Any])
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

