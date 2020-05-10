package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline to delete.
    */
  var BaselineId: typingsSlinky.awsSdk.ssmMod.BaselineId = js.native
}

object DeletePatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): DeletePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePatchBaselineRequest]
  }
  @scala.inline
  implicit class DeletePatchBaselineRequestOps[Self <: DeletePatchBaselineRequest] (val x: Self) extends AnyVal {
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

