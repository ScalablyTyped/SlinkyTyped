package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateActionTargetRequest extends js.Object {
  /**
    * The ARN of the custom action target to update.
    */
  var ActionTargetArn: NonEmptyString = js.native
  /**
    * The updated description for the custom action target.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The updated name of the custom action target.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}

object UpdateActionTargetRequest {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): UpdateActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionTargetRequest]
  }
  @scala.inline
  implicit class UpdateActionTargetRequestOps[Self <: UpdateActionTargetRequest] (val x: Self) extends AnyVal {
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
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

