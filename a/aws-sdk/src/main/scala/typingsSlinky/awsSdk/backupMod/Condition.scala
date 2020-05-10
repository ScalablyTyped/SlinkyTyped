package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * The key in a key-value pair. For example, in "ec2:ResourceTag/Department": "accounting", "ec2:ResourceTag/Department" is the key.
    */
  var ConditionKey: typingsSlinky.awsSdk.backupMod.ConditionKey = js.native
  /**
    * An operation, such as STRINGEQUALS, that is applied to a key-value pair used to filter resources in a selection.
    */
  var ConditionType: typingsSlinky.awsSdk.backupMod.ConditionType = js.native
  /**
    * The value in a key-value pair. For example, in "ec2:ResourceTag/Department": "accounting", "accounting" is the value.
    */
  var ConditionValue: typingsSlinky.awsSdk.backupMod.ConditionValue = js.native
}

object Condition {
  @scala.inline
  def apply(ConditionKey: ConditionKey, ConditionType: ConditionType, ConditionValue: ConditionValue): Condition = {
    val __obj = js.Dynamic.literal(ConditionKey = ConditionKey.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], ConditionValue = ConditionValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionKey(value: ConditionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditionType(value: ConditionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditionValue(value: ConditionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

