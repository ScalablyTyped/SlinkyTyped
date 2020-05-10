package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBAction extends js.Object {
  /**
    * The hash key name.
    */
  var hashKeyField: HashKeyField = js.native
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER"
    */
  var hashKeyType: js.UndefOr[DynamoKeyType] = js.native
  /**
    * The hash key value.
    */
  var hashKeyValue: HashKeyValue = js.native
  /**
    * The type of operation to be performed. This follows the substitution template, so it can be ${operation}, but the substitution must result in one of the following: INSERT, UPDATE, or DELETE.
    */
  var operation: js.UndefOr[DynamoOperation] = js.native
  /**
    * The action payload. This name can be customized.
    */
  var payloadField: js.UndefOr[PayloadField] = js.native
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[RangeKeyField] = js.native
  /**
    * The range key type. Valid values are "STRING" or "NUMBER"
    */
  var rangeKeyType: js.UndefOr[DynamoKeyType] = js.native
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[RangeKeyValue] = js.native
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: AwsArn = js.native
  /**
    * The name of the DynamoDB table.
    */
  var tableName: TableName = js.native
}

object DynamoDBAction {
  @scala.inline
  def apply(hashKeyField: HashKeyField, hashKeyValue: HashKeyValue, roleArn: AwsArn, tableName: TableName): DynamoDBAction = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBAction]
  }
  @scala.inline
  implicit class DynamoDBActionOps[Self <: DynamoDBAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashKeyField(value: HashKeyField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKeyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashKeyValue(value: HashKeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: AwsArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashKeyType(value: DynamoKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKeyType")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: DynamoOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadField(value: PayloadField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadField")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeKeyField(value: RangeKeyField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKeyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeKeyField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKeyField")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeKeyType(value: DynamoKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKeyType")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeKeyValue(value: RangeKeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeKeyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKeyValue")(js.undefined)
        ret
    }
  }
  
}

