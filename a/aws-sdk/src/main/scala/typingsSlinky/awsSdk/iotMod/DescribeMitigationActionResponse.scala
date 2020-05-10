package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMitigationActionResponse extends js.Object {
  /**
    * The ARN that identifies this migration action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  /**
    * A unique identifier for this action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.native
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.native
  /**
    * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.native
  /**
    * The type of mitigation action.
    */
  var actionType: js.UndefOr[MitigationActionType] = js.native
  /**
    * The date and time when the mitigation action was added to your AWS account.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the mitigation action was last changed.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the IAM role used to apply this action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object DescribeMitigationActionResponse {
  @scala.inline
  def apply(): DescribeMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMitigationActionResponse]
  }
  @scala.inline
  implicit class DescribeMitigationActionResponseOps[Self <: DescribeMitigationActionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionArn(value: MitigationActionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withActionId(value: MitigationActionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(js.undefined)
        ret
    }
    @scala.inline
    def withActionName(value: MitigationActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(js.undefined)
        ret
    }
    @scala.inline
    def withActionParams(value: MitigationActionParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionParams")(js.undefined)
        ret
    }
    @scala.inline
    def withActionType(value: MitigationActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}

