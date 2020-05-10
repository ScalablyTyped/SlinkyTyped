package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStandardsControlRequest extends js.Object {
  /**
    * The updated status of the security standard control.
    */
  var ControlStatus: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.ControlStatus] = js.native
  /**
    * A description of the reason why you are disabling a security standard control.
    */
  var DisabledReason: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN of the security standard control to enable or disable.
    */
  var StandardsControlArn: NonEmptyString = js.native
}

object UpdateStandardsControlRequest {
  @scala.inline
  def apply(StandardsControlArn: NonEmptyString): UpdateStandardsControlRequest = {
    val __obj = js.Dynamic.literal(StandardsControlArn = StandardsControlArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStandardsControlRequest]
  }
  @scala.inline
  implicit class UpdateStandardsControlRequestOps[Self <: UpdateStandardsControlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandardsControlArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsControlArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlStatus(value: ControlStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledReason(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisabledReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisabledReason")(js.undefined)
        ret
    }
  }
  
}

