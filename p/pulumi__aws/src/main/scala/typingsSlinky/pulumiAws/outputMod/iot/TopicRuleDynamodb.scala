package typingsSlinky.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleDynamodb extends js.Object {
  /**
    * The hash key name.
    */
  var hashKeyField: String = js.native
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER".
    */
  var hashKeyType: js.UndefOr[String] = js.native
  /**
    * The hash key value.
    */
  var hashKeyValue: String = js.native
  /**
    * The action payload.
    */
  var payloadField: js.UndefOr[String] = js.native
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[String] = js.native
  /**
    * The range key type. Valid values are "STRING" or "NUMBER".
    */
  var rangeKeyType: js.UndefOr[String] = js.native
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[String] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String = js.native
  /**
    * The name of the DynamoDB table.
    */
  var tableName: String = js.native
}

object TopicRuleDynamodb {
  @scala.inline
  def apply(hashKeyField: String, hashKeyValue: String, roleArn: String, tableName: String): TopicRuleDynamodb = {
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
    def withHashKeyField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKeyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashKeyValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashKeyType(value: String): Self = {
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
    def withPayloadField(value: String): Self = {
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
    def withRangeKeyField(value: String): Self = {
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
    def withRangeKeyType(value: String): Self = {
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
    def withRangeKeyValue(value: String): Self = {
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

