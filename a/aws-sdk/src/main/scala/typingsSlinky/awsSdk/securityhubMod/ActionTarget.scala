package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTarget extends js.Object {
  /**
    * The ARN for the target action.
    */
  var ActionTargetArn: NonEmptyString = js.native
  /**
    * The description of the target action.
    */
  var Description: NonEmptyString = js.native
  /**
    * The name of the action target.
    */
  var Name: NonEmptyString = js.native
}

object ActionTarget {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString, Description: NonEmptyString, Name: NonEmptyString): ActionTarget = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTarget]
  }
  @scala.inline
  implicit class ActionTargetOps[Self <: ActionTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTargetArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionTargetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

