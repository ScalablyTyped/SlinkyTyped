package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline to retrieve.
    */
  var BaselineId: typingsSlinky.awsSdk.ssmMod.BaselineId = js.native
}

object GetPatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): GetPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineRequest]
  }
  @scala.inline
  implicit class GetPatchBaselineRequestOps[Self <: GetPatchBaselineRequest] (val x: Self) extends AnyVal {
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

