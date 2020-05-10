package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchGroupPatchBaselineMapping extends js.Object {
  /**
    * The patch baseline the patch group is registered with.
    */
  var BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.native
  /**
    * The name of the patch group registered with the patch baseline.
    */
  var PatchGroup: js.UndefOr[typingsSlinky.awsSdk.ssmMod.PatchGroup] = js.native
}

object PatchGroupPatchBaselineMapping {
  @scala.inline
  def apply(): PatchGroupPatchBaselineMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchGroupPatchBaselineMapping]
  }
  @scala.inline
  implicit class PatchGroupPatchBaselineMappingOps[Self <: PatchGroupPatchBaselineMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineIdentity(value: PatchBaselineIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineIdentity")(js.undefined)
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

