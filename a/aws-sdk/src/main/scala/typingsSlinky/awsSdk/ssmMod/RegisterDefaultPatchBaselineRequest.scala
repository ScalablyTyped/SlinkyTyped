package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDefaultPatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline that should be the default patch baseline.
    */
  var BaselineId: typingsSlinky.awsSdk.ssmMod.BaselineId = js.native
}

object RegisterDefaultPatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): RegisterDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDefaultPatchBaselineRequest]
  }
  @scala.inline
  implicit class RegisterDefaultPatchBaselineRequestOps[Self <: RegisterDefaultPatchBaselineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineId(value: BaselineId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

