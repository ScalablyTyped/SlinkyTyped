package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleDynamodb extends js.Object {
  /**
    * The hash key name.
    */
  var hashKeyField: Input[String] = js.native
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER".
    */
  var hashKeyType: js.UndefOr[Input[String]] = js.native
  /**
    * The hash key value.
    */
  var hashKeyValue: Input[String] = js.native
  /**
    * The action payload.
    */
  var payloadField: js.UndefOr[Input[String]] = js.native
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[Input[String]] = js.native
  /**
    * The range key type. Valid values are "STRING" or "NUMBER".
    */
  var rangeKeyType: js.UndefOr[Input[String]] = js.native
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String] = js.native
  /**
    * The name of the DynamoDB table.
    */
  var tableName: Input[String] = js.native
}

object TopicRuleDynamodb {
  @scala.inline
  def apply(
    hashKeyField: Input[String],
    hashKeyValue: Input[String],
    roleArn: Input[String],
    tableName: Input[String]
  ): TopicRuleDynamodb = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDynamodb]
  }
  @scala.inline
  implicit class TopicRuleDynamodbOps[Self <: TopicRuleDynamodb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashKeyField(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKeyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashKeyValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashKeyType(value: Input[String]): Self = {
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
    def withPayloadField(value: Input[String]): Self = {
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
    def withRangeKeyField(value: Input[String]): Self = {
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
    def withRangeKeyType(value: Input[String]): Self = {
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
    def withRangeKeyValue(value: Input[String]): Self = {
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

