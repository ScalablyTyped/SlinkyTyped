package typingsSlinky.jsforce.quickActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickActionDescribeInfo extends js.Object {
  /** Object type used for the action */
  var contextSobjectType: String = js.native
  /** Layout sections that comprise an action */
  var layout: js.Object = js.native
  /** Field name in the target object which refers parent(context) object record ID */
  var targetParentField: String = js.native
  /** Record type of the targeted record */
  var targetRecordTypeId: String = js.native
  /** Object type of the action to target */
  var targetSobjectType: String = js.native
}

object QuickActionDescribeInfo {
  @scala.inline
  def apply(
    contextSobjectType: String,
    layout: js.Object,
    targetParentField: String,
    targetRecordTypeId: String,
    targetSobjectType: String
  ): QuickActionDescribeInfo = {
    val __obj = js.Dynamic.literal(contextSobjectType = contextSobjectType.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], targetParentField = targetParentField.asInstanceOf[js.Any], targetRecordTypeId = targetRecordTypeId.asInstanceOf[js.Any], targetSobjectType = targetSobjectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickActionDescribeInfo]
  }
  @scala.inline
  implicit class QuickActionDescribeInfoOps[Self <: QuickActionDescribeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextSobjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSobjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetParentField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetParentField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRecordTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRecordTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetSobjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSobjectType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

