package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MitigationAction extends js.Object {
  /**
    * The set of parameters for this mitigation action. The parameters vary, depending on the kind of action you apply.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.native
  /**
    * A unique identifier for the mitigation action.
    */
  var id: js.UndefOr[MitigationActionId] = js.native
  /**
    * A user-friendly name for the mitigation action.
    */
  var name: js.UndefOr[MitigationActionName] = js.native
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object MitigationAction {
  @scala.inline
  def apply(): MitigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationAction]
  }
  @scala.inline
  implicit class MitigationActionOps[Self <: MitigationAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withId(value: MitigationActionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: MitigationActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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

