package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineForPatchGroupResult extends js.Object {
  /**
    * The ID of the patch baseline that should be used for the patch group.
    */
  var BaselineId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The operating system rule specified for patch groups using the patch baseline.
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OperatingSystem] = js.native
  /**
    * The name of the patch group.
    */
  var PatchGroup: js.UndefOr[typingsSlinky.awsSdk.ssmMod.PatchGroup] = js.native
}

object GetPatchBaselineForPatchGroupResult {
  @scala.inline
  def apply(): GetPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupResult]
  }
  @scala.inline
  implicit class GetPatchBaselineForPatchGroupResultOps[Self <: GetPatchBaselineForPatchGroupResult] (val x: Self) extends AnyVal {
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
    def withoutBaselineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: OperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withPatchGroup(value: PatchGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatchGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchGroup")(js.undefined)
        ret
    }
  }
  
}

