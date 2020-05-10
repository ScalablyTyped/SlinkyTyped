package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMitigationActionRequest extends js.Object {
  /**
    * A friendly name for the action. Choose a friendly name that accurately describes the action (for example, EnableLoggingAction).
    */
  var actionName: MitigationActionName = js.native
  /**
    * Defines the type of action and the parameters for that action.
    */
  var actionParams: MitigationActionParams = js.native
  /**
    * The ARN of the IAM role that is used to apply the mitigation action.
    */
  var roleArn: RoleArn = js.native
  /**
    * Metadata that can be used to manage the mitigation action.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateMitigationActionRequest {
  @scala.inline
  def apply(actionName: MitigationActionName, actionParams: MitigationActionParams, roleArn: RoleArn): CreateMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], actionParams = actionParams.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMitigationActionRequest]
  }
  @scala.inline
  implicit class CreateMitigationActionRequestOps[Self <: CreateMitigationActionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionName(value: MitigationActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionParams(value: MitigationActionParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

