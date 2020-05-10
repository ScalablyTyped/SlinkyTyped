package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterPatchBaselineForPatchGroupRequest extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  var BaselineId: typingsSlinky.awsSdk.ssmMod.BaselineId = js.native
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  var PatchGroup: typingsSlinky.awsSdk.ssmMod.PatchGroup = js.native
}

object RegisterPatchBaselineForPatchGroupRequest {
  @scala.inline
  def apply(BaselineId: BaselineId, PatchGroup: PatchGroup): RegisterPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterPatchBaselineForPatchGroupRequest]
  }
  @scala.inline
  implicit class RegisterPatchBaselineForPatchGroupRequestOps[Self <: RegisterPatchBaselineForPatchGroupRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPatchGroup(value: PatchGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

